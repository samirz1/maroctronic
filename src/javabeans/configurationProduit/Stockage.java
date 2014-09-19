package javabeans.configurationProduit;

import java.util.HashSet;

public class Stockage {

	private Integer idStockage;
	private String designation;
	private String connexion;//ex: USB 3.0
	private Integer capacite;
	private Integer vitesseRotation;//en tour/min
	private String type;//ex: SSD
	private HashSet<Configuration> configurations;	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getConnexion() {
		return connexion;
	}
	public void setConnexion(String connexion) {
		this.connexion = connexion;
	}
	public Integer getCapacite() {
		return capacite;
	}
	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}
	public Integer getVitesseRotation() {
		return vitesseRotation;
	}
	public void setVitesseRotation(Integer vitesseRotation) {
		this.vitesseRotation = vitesseRotation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getIdStockage() {
		return idStockage;
	}
	public void setIdStockage(Integer idStockage) {
		this.idStockage = idStockage;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
