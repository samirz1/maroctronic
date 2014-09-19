package javabeans;

import java.util.HashSet;

public class Memoire {

	private Integer idMemoire;
	private String designation;
	private String type;//ex: DDR2
	private String format;//ex: 16/9
	private Integer capacite;
	private Integer frequence;//en Hz
	private HashSet<Configuration> configurations;	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Integer getCapacite() {
		return capacite;
	}
	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}
	public Integer getFrequence() {
		return frequence;
	}
	public void setFrequence(Integer frequence) {
		this.frequence = frequence;
	}
	public Integer getIdMemoire() {
		return idMemoire;
	}
	public void setIdMemoire(Integer idMemoire) {
		this.idMemoire = idMemoire;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
