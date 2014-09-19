package javabeans.parametres;

import java.util.HashSet;

import javabeans.configurationProduit.Configuration;

public class Couleur {

	private String couleur;
	private HashSet<Configuration> configurations;	

	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
