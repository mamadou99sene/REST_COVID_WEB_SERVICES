package bdbeans;
// Generated 4 oct. 2023, 02:14:52 by Hibernate Tools 5.6.7.Final

import java.util.Date;

/**
 * Rendezvous generated by hbm2java
 */
public class Rendezvous implements java.io.Serializable {

	private int idRendezvous;
	private Structuredesante structuredesante;
	private Utilisateur utilisateur;
	private Date date;
	private Date heure;
	private String typerendezvous;
	private String status;

	public Rendezvous() {
	}

	public Rendezvous(int idRendezvous, Structuredesante structuredesante, Utilisateur utilisateur) {
		this.idRendezvous = idRendezvous;
		this.structuredesante = structuredesante;
		this.utilisateur = utilisateur;
	}

	public Rendezvous(int idRendezvous, Structuredesante structuredesante, Utilisateur utilisateur, Date date,
			Date heure, String typerendezvous, String status) {
		this.idRendezvous = idRendezvous;
		this.structuredesante = structuredesante;
		this.utilisateur = utilisateur;
		this.date = date;
		this.heure = heure;
		this.typerendezvous = typerendezvous;
		this.status = status;
	}

	public int getIdRendezvous() {
		return this.idRendezvous;
	}

	public void setIdRendezvous(int idRendezvous) {
		this.idRendezvous = idRendezvous;
	}

	public Structuredesante getStructuredesante() {
		return this.structuredesante;
	}

	public void setStructuredesante(Structuredesante structuredesante) {
		this.structuredesante = structuredesante;
	}

	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getHeure() {
		return this.heure;
	}

	public void setHeure(Date heure) {
		this.heure = heure;
	}

	public String getTyperendezvous() {
		return this.typerendezvous;
	}

	public void setTyperendezvous(String typerendezvous) {
		this.typerendezvous = typerendezvous;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}