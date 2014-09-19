package javabeans.parametres;

import java.util.HashSet;
import javabeans.Produit;

public class Categorie {

	private String nom;
	private HashSet<Produit> produits;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public HashSet<Produit> getProduits() {
		return produits;
	}
	public void setProduits(HashSet<Produit> produits) {
		this.produits = produits;
	}	
	
}
