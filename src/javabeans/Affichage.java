package javabeans;

import java.util.HashSet;

public class Affichage {

	private Integer idAffichage;
	private String designation;
	private Integer nombrePouces;
	private String format;//ex: 16/9, ...
	private String resolution;//en pixels
	private Integer tempsReponse;
	private String technologie;//ex: LCD, LED, ...
	private Boolean estTactile;
	private Boolean est3D;
	private HashSet<Configuration> configurations;	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getNombrePouces() {
		return nombrePouces;
	}
	public void setNombrePouces(Integer nombrePouces) {
		this.nombrePouces = nombrePouces;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	public Integer getTempsReponse() {
		return tempsReponse;
	}
	public void setTempsReponse(Integer tempsReponse) {
		this.tempsReponse = tempsReponse;
	}
	public String getTechnologie() {
		return technologie;
	}
	public void setTechnologie(String technologie) {
		this.technologie = technologie;
	}
	public Boolean getEstTactile() {
		return estTactile;
	}
	public void setEstTactile(Boolean estTactile) {
		this.estTactile = estTactile;
	}
	public Boolean getEst3D() {
		return est3D;
	}
	public void setEst3D(Boolean est3d) {
		est3D = est3d;
	}
	public Integer getIdAffichage() {
		return idAffichage;
	}
	public void setIdAffichage(Integer idAffichage) {
		this.idAffichage = idAffichage;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
