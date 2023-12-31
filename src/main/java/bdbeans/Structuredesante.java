package bdbeans;
// Generated 4 oct. 2023, 02:14:52 by Hibernate Tools 5.6.7.Final

import java.util.HashSet;
import java.util.Set;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonSetter;

import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

/**
 * Structuredesante generated by hbm2java
 */
@XmlRootElement
@JsonIgnoreProperties({"rendezvouses"})
public class Structuredesante implements java.io.Serializable {

	private int idStructuresante;
	private String localisation;
	private Integer capacite;
	private String typeTraitement;
	private String email;
	private String telephone;
	private String typetest;
	private Set rendezvouses = new HashSet(0);

	public Structuredesante() {
	}

	public Structuredesante(int idStructuresante) {
		this.idStructuresante = idStructuresante;
	}

	public Structuredesante(int idStructuresante, String localisation, Integer capacite, String typeTraitement,
			String email, String telephone, String typetest, Set rendezvouses) {
		this.idStructuresante = idStructuresante;
		this.localisation = localisation;
		this.capacite = capacite;
		this.typeTraitement = typeTraitement;
		this.email = email;
		this.telephone = telephone;
		this.typetest = typetest;
		this.rendezvouses = rendezvouses;
	}

	public int getIdStructuresante() {
		return this.idStructuresante;
	}

	public void setIdStructuresante(int idStructuresante) {
		this.idStructuresante = idStructuresante;
	}

	public String getLocalisation() {
		return this.localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public Integer getCapacite() {
		return this.capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public String getTypeTraitement() {
		return this.typeTraitement;
	}

	public void setTypeTraitement(String typeTraitement) {
		this.typeTraitement = typeTraitement;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getTypetest() {
		return this.typetest;
	}

	public void setTypetest(String typetest) {
		this.typetest = typetest;
	}
	@XmlTransient

	//faut pas utilis� a la fois les annotations xmlTransient et jsonIngore car jaxRS scanne a a la 
	//les annotations jaxB. Donc xmlTransient suffit pour ne pas diffuser une proprit�; sinon, on pourrait
	//supprimer l'annotation xmlRootElement et conserver seulement JsonIgnore dans le ca ou on veut 
	//seulement repondre en json et ne pas exposer les rendez vous 

	public Set getRendezvouses() {
		return this.rendezvouses;
		
	}
@JsonSetter
	public void setRendezvouses(Set rendezvouses) {
		this.rendezvouses = rendezvouses;
	}

}
