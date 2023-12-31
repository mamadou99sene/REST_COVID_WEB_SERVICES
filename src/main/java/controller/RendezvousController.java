package controller;

import java.util.List;

import bdbeans.Rendezvous;
import bdbeans.RendezvousHome;
import bdbeans.Utilisateur;
import bdbeans.UtilisateurHome;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("rendezvous")
public class RendezvousController {
	private RendezvousHome rvHome;
	public RendezvousController()
	{
		rvHome=new RendezvousHome();
	}
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Rendezvous> getRendezvous()
	{
		return rvHome.getAllRendezVous();
	}
	@Path("{idRv}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Rendezvous getOneRendezvous(@PathParam("idRv")int idRv)
	{
		return rvHome.findRendezVousByID(idRv);
	}
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void add(Rendezvous rv)
	{
		rvHome.persist(rv);
	}
	@Path("{id}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void delete(@PathParam("id")int id,Rendezvous rv)
	{
		//rv=rvHome.findRendezVousByID(id);
		rvHome.delete(rv);
	}
	@Path("{idRv}")
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void update(@PathParam("idRv")int idRv,Rendezvous rv)
	{
		//rv=rvHome.findRendezVousByID(idRv);
		rvHome.update(rv);
	}
	@Path("{emailUtilisateur}")
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Rendezvous> getOneRendezvous(@PathParam("emailUtilisateur")String emailUser)
	{
		Utilisateur u=new UtilisateurHome().findIUserByEmail(emailUser);
		return rvHome.findRvByUtilisateur(u);
	}

}
