package controller;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

import bdbeans.Utilisateur;
import bdbeans.UtilisateurHome;
@Path("utilisateurs")
public class UtilisateurController {
	private UtilisateurHome userHome;
	public UtilisateurController()
	{
		userHome=new UtilisateurHome();
	}
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Utilisateur> getUtilisateurs()
	{
		return userHome.getAllUser();
		
	}
	@Path("{id}")
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Utilisateur getUtiliateur(@PathParam("id") int id)
	{
		return userHome.findUserByID(id);
	}
	@Path("{email}")
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Utilisateur getUtilisateurByEmail(@PathParam("email") String email)
	{
		return userHome.findIUserByEmail(email);
	}

	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void add(Utilisateur u)
	{
		 userHome.persist(u);
	}
	@Path("{idUtilisateur}")
	@DELETE
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void deleteUser(@PathParam("idUtilisateur")int iduser, Utilisateur u)
	{
		u=userHome.findUserByID(iduser);
		userHome.delete(u);
	}
	@Path("{id}")
	@PUT
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public void update(@PathParam("id") int idUtilisateur, Utilisateur u)
	{
		//u=userHome.findUserByID(idUtilisateur);
		userHome.update(u);
	}
	@Path("connexion/{email}/{password}")
	@POST
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Utilisateur connexion(@PathParam("email")String email,@PathParam("password")String password)
	{
		return userHome.connexion(password, email);
	}
	@Path("/errors")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getError()
	{
		return  "The following assertion was thrown during performLayout():\r\n"
				+ "BoxConstraints forces an infinite width.\r\n"
				+ "These invalid constraints were provided to RenderParagraph's layout() function by the       \r\n"
				+ "following\r\n"
				+ "function, which probably computed the invalid constraints in question:\r\n"
				+ "  RenderBox.layout (package:flutter/src/rendering/box.dart:2386:11)\r\n"
				+ "The offending constraints were:\r\n"
				+ "  BoxConstraints(w=Infinity, 0.0<=h<=79.3)\r\n"
				+ "\r\n"
				+ "The relevant error-causing widget was:\r\n"
				+ "  ListTile\r\n"
				+ "  ListTile:file:///C:/Users/FIS-TS/Flutter_Projects/client_covid/lib/App.dart:224:17        \r\n"
				+ "\r\n"
				+ "When the exception was thrown, this was the stack:\r\n"
				+ "";
	}

}
