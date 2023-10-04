package test;

import java.util.List;

import bdbeans.Utilisateur;
import bdbeans.UtilisateurHome;

public class Test {

	public static void main(String[] args) {
		List <Utilisateur> l=new UtilisateurHome().getAllUser();
		System.out.println(l.size());
		for (int i=0;i<l.size();i++) 
		{
			System.out.println(l.get(i).getIdUtilisateur() +" "+l.get(i).getPrenom());
		}

	}

}
