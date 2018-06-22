package pfe.elearning.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@SuppressWarnings("serial")
@Entity
public class Module implements Serializable{
	
	//**** Attributes **** //  
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	private String description;

	@ManyToOne(cascade = {CascadeType.})
	@JoinColumn(name="id_theme")
	private Theme theme;


	
	//**** Constructors **** //
	
	public Module() {
		super();
	}

	public Module(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	
	//**** Getters & Setters ****//

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@JsonIgnore
	public Theme getTheme() {
		return theme;
	}

	@JsonSetter
	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	
	
	
	
	
}
