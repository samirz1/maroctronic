package javabeans;

public class liaisonProduits {

	private Integer idLiaisonProduits;
	private Produit produitParent;
	private Produit produitFils;
	
	
	public Integer getIdLiaisonProduits() {
		return idLiaisonProduits;
	}
	public void setIdLiaisonProduits(Integer idLiaisonProduits) {
		this.idLiaisonProduits = idLiaisonProduits;
	}
	public Produit getProduitParent() {
		return produitParent;
	}
	public void setProduitParent(Produit produitParent) {
		this.produitParent = produitParent;
	}
	public Produit getProduitFils() {
		return produitFils;
	}
	public void setProduitFils(Produit produitFils) {
		this.produitFils = produitFils;
	}
	
}
