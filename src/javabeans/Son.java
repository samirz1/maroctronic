package javabeans;

import java.util.HashSet;

public class Son {

	private Integer idSon;
	private String designation;
	private Boolean sansFil;
	private Integer pressionAcoustique;//en dB
	private Integer impedence;//en Ohm
	private Integer bandePassanteMin;//en Hz
	private Integer bandePassanteMax;//en Hz
	private HashSet<Configuration> configurations;	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Boolean getSansFil() {
		return sansFil;
	}
	public void setSansFil(Boolean sansFil) {
		this.sansFil = sansFil;
	}
	public Integer getPressionAcoustique() {
		return pressionAcoustique;
	}
	public void setPressionAcoustique(Integer pressionAcoustique) {
		this.pressionAcoustique = pressionAcoustique;
	}
	public Integer getImpedence() {
		return impedence;
	}
	public void setImpedence(Integer impedence) {
		this.impedence = impedence;
	}
	public Integer getBandePassanteMin() {
		return bandePassanteMin;
	}
	public void setBandePassanteMin(Integer bandePassanteMin) {
		this.bandePassanteMin = bandePassanteMin;
	}
	public Integer getBandePassanteMax() {
		return bandePassanteMax;
	}
	public void setBandePassanteMax(Integer bandePassanteMax) {
		this.bandePassanteMax = bandePassanteMax;
	}
	public Integer getIdSon() {
		return idSon;
	}
	public void setIdSon(Integer idSon) {
		this.idSon = idSon;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
