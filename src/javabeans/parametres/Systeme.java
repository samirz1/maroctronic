package javabeans.parametres;

import java.util.HashSet;

import javabeans.configurationProduit.Configuration;

public class Systeme {

	private Integer idSysteme;
	private String  designation;
	private Integer largeurRegistres;
	private String  configurationRecommandee;
	private HashSet<Configuration> configurations;	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getLargeurRegistres() {
		return largeurRegistres;
	}
	public void setLargeurRegistres(Integer largeurRegistres) {
		this.largeurRegistres = largeurRegistres;
	}
	public String getConfigurationRecommandee() {
		return configurationRecommandee;
	}
	public void setConfigurationRecommandee(String configurationRecommandee) {
		this.configurationRecommandee = configurationRecommandee;
	}
	public Integer getIdSysteme() {
		return idSysteme;
	}
	public void setIdSysteme(Integer idSysteme) {
		this.idSysteme = idSysteme;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
