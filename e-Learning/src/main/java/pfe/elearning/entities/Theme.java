package pfe.elearning.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;

@SuppressWarnings("serial")
@Entity
public class Theme implements Serializable{
	
	//**** Attributes **** //  
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String libelle;
	
	private String description;
	
	@OneToMany(mappedBy="theme",fetch=FetchType.LAZY)
	private Collection<Module> modules;
	
	//**** Constructors **** //
	
	public Theme(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public Theme() {
		super();
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
	public Collection<Module> getModules() {
		return modules;
	}
	
	@JsonSetter
	public void setModules(Collection<Module> modules) {
		this.modules = modules;
	}
	
	
	

}
