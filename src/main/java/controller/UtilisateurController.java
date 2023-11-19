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
	@Path("/error")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getError()
	{
		return " This happens because you used a `BuildContext` that does not include the \r\n"
				+ "provider\r\n"
				+ "E/flutter (31982): of your choice. There are a few common scenarios:\r\n"
				+ "E/flutter (31982):\r\n"
				+ "E/flutter (31982): - You added a new provider in your `main.dart` and performed a hot-reload.\r\n"
				+ "E/flutter (31982):   To fix, perform a hot-restart.\r\n"
				+ "E/flutter (31982):\r\n"
				+ "E/flutter (31982): - The provider you are trying to read is in a different route.\r\n"
				+ "E/flutter (31982): \r\n"
				+ "E/flutter (31982):   Providers are \"scoped\". So if you insert of provider inside a route, then\r\n"
				+ "E/flutter (31982):   other routes will not be able to access that provider.\r\n"
				+ "E/flutter (31982): \r\n"
				+ "E/flutter (31982): - You used a `BuildContext` that is an ancestor of the provider you are trying to read.\r\n"
				+ "E/flutter (31982): \r\n"
				+ "E/flutter (31982):   Make sure that loginPage is under your MultiProvider/Provider<ProviderCovid>.\r\n"
				+ "E/flutter (31982):   This usually happens when you are creating a provider and trying to read it immediately.\r\n"
				+ "E/flutter (31982): \r\n"
				+ "E/flutter (31982):   For example, instead of:\r\n"
				+ "E/flutter (31982): \r\n"
				+ "E/flutter (31982):   ```\r\n"
				+ "E/flutter (31982):   Widget build(BuildContext context) {\r\n"
				+ "E/flutter (31982):     return Provider<Example>(\r\n"
				+ "E/flutter (31982):       create: (_) => Example(),\r\n"
				+ "E/flutter (31982):       // Will throw a ProviderNotFoundError, because `context` is associated\r\n"
				+ "E/flutter (31982):       // to the widget that is the parent of `Provider<Example>`\r\n"
				+ "E/flutter (31982):       child: Text(context.watch<Example>().toString()),\r\n"
				+ "E/flutter (31982):     );\r\n"
				+ "E/flutter (31982):   }\r\n"
				+ "E/flutter (31982):   ```\r\n"
				+ "E/flutter (31982):\r\n"
				+ "E/flutter (31982):   consider using `builder` like so:\r\n"
				+ "E/flutter (31982):\r\n"
				+ "E/flutter (31982):   ```\r\n"
				+ "E/flutter (31982):   Widget build(BuildContext context) {\r\n"
				+ "E/flutter (31982):     return Provider<Example>(\r\n"
				+ "E/flutter (31982):       create: (_) => Example(),\r\n"
				+ "E/flutter (31982):       // we use `builder` to obtain a new `BuildContext` that has access \r\n"
				+ "to the provider\r\n"
				+ "E/flutter (31982):       builder: (context, child) {\r\n"
				+ "E/flutter (31982):         // No longer throws\r\n"
				+ "E/flutter (31982):         return Text(context.watch<Example>().toString());\r\n"
				+ "E/flutter (31982):       }\r\n"
				+ "E/flutter (31982):     );\r\n"
				+ "E/flutter (31982):   }\r\n"
				+ "E/flutter (31982):   ```\r\n"
				+ "E/flutter (31982):\r\n"
				+ "E/flutter (31982): If none of these solutions work, consider asking for help on StackOverflow:\r\n"
				+ "E/flutter (31982): https://stackoverflow.com/questions/tagged/flutter\r\n"
				+ "E/flutter (31982):\r\n"
				+ "E/flutter (31982): #0      Provider._inheritedElementOf (package:provider/src/provider.dart:343:7)\r\n"
				+ "E/flutter (31982): #1      Provider.of (package:provider/src/provider.dart:293:30)\r\n"
				+ "E/flutter (31982): #2      loginPage.build.<anonymous closure> (package:client_covid/pages/LoginPage.dart:129:32)\r\n"
				+ "E/flutter (31982): <asynchronous suspension>";
	}

}
