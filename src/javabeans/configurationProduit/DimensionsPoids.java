package javabeans.configurationProduit;

import java.util.HashSet;

public class DimensionsPoids {

	private Integer idDimensionsPoids;
	private Integer poids;
	private Integer largeur;
	private Integer hauteur;
	private Integer profondeur;
	private HashSet<Configuration> configurations;	
	
	public Integer getPoids() {
		return poids;
	}
	public void setPoids(Integer poids) {
		this.poids = poids;
	}
	public Integer getLargeur() {
		return largeur;
	}
	public void setLargeur(Integer largeur) {
		this.largeur = largeur;
	}
	public Integer getHauteur() {
		return hauteur;
	}
	public void setHauteur(Integer hauteur) {
		this.hauteur = hauteur;
	}
	public Integer getProfondeur() {
		return profondeur;
	}
	public void setProfondeur(Integer profondeur) {
		this.profondeur = profondeur;
	}
	public Integer getIdDimensionsPoids() {
		return idDimensionsPoids;
	}
	public void setIdDimensionsPoids(Integer idDimensionsPoids) {
		this.idDimensionsPoids = idDimensionsPoids;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}	
	
}
