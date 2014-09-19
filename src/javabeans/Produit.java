package javabeans;

import java.awt.Image;
import java.util.HashSet;

import javabeans.configurationProduit.Configuration;
import javabeans.parametres.Categorie;
import javabeans.parametres.Marque;

public class Produit {

	private Integer idProduit;
	private String nom;
	private Integer quantite;
	private String description;
	private HashSet<Image> photos;
	private HashSet<Avis> avis;	
	private Categorie categorie;
	private Marque marque;
	private HashSet<Configuration> configurations;
	
	
	public Integer getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Integer getQuantite() {
		return quantite;
	}
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public HashSet<Image> getPhotos() {
		return photos;
	}
	public void setPhotos(HashSet<Image> photos) {
		this.photos = photos;
	}
	public HashSet<Avis> getAvis() {
		return avis;
	}
	public void setAvis(HashSet<Avis> avis) {
		this.avis = avis;
	}
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Marque getMarque() {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	public HashSet<Configuration> getConfigurations() {
		return configurations;
	}
	public void setConfigurations(HashSet<Configuration> configurations) {
		this.configurations = configurations;
	}
	
}
