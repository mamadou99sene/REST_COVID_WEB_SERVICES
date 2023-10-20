package test;

import java.util.Date;
import java.util.List;

import bdbeans.Rendezvous;
import bdbeans.RendezvousHome;
import bdbeans.Utilisateur;
import bdbeans.UtilisateurHome;

public class Test {

	public static void main(String[] args) {
		/*List <Utilisateur> l=new UtilisateurHome().getAllUser();
		System.out.println(l.size());
		for (int i=0;i<l.size();i++) 
		{
			System.out.println(l.get(i).getIdUtilisateur() +" "+l.get(i).getPrenom());
		}*/
		/*
		Utilisateur u=new UtilisateurHome().findUserByID(2);
		List<Rendezvous> rv=new RendezvousHome().findRvByUtilisateur(u);
		for (int i=0;i<rv.size();i++)
		{
			System.out.println(rv.get(i).getTyperendezvous());
		}*/
		Rendezvous rv= new RendezvousHome().getRendezvousById(1);
		System.out.println(rv.getUtilisateur().getPrenom());
		new RendezvousHome().update(rv);
		
	}

}
