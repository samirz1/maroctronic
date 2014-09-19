package javabeans;

import java.util.HashSet;

public class Processeur {
	
	private Integer idProcesseur;
	private String  designation;
	private Integer nombreCoeurs;
	private Integer frequence;
	private Integer largeurResgistres;//ex: 32bits
	private Integer tailleCache;
	private Boolean avecVentilateur;
	private String  typeUtilisation;//ex: ordinateur fixe ...
	private HashSet<Configuration> configurations;	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getNombreCoeurs() {
		return nombreCoeurs;
	}
	public void setNombreCoeurs(Integer nombreCoeurs) {
		this.nombreCoeurs = nombreCoeurs;
	}
	public Integer getFrequence() {
		return frequence;
	}
	public void setFrequence(Integer frequence) {
		this.frequence = frequence;
	}
	public Integer getLargeurResgistres() {
		return largeurResgistres;
	}
	public void setLargeurResgistres(Integer largeurResgistres) {
		this.largeurResgistres = largeurResgistres;
	}
	public Integer getTailleCache() {
		return tailleCache;
	}
	public void setTailleCache(Integer tailleCache) {
		this.tailleCache = tailleCache;
	}
	public Boolean getAvecVentilateur() {
		return avecVentilateur;
	}
	public void setAvecVentilateur(Boolean avecVentilateur) {
		this.avecVentilateur = avecVentilateur;
	}
	public String getTypeUtilisation() {
		return typeUtilisation;
	}
	public void setTypeUtilisation(String typeUtilisation) {
		this.typeUtilisation = typeUtilisation;
	}
	public Integer getIdProcesseur() {
		return idProcesseur;
	}
	public void setIdProcesseur(Integer idProcesseur) {
		this.idProcesseur = idProcesseur;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}	
	
}
