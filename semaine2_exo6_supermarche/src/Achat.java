
public class Achat {

	private Article article;
	private int quantite;
	
	public Achat(Article article, int quantite) {
		
		this.article = article;
		this.quantite = quantite;
			
	}
	
	public double getPrix() {
		double rabais = 1.0;
		if(article.estEnSolde()) {
			rabais = 0.5;
		}
		
		return quantite * article.getPrixU() * rabais;
	}
	

	public void affiche() {
		
		String nom = article.getNom();
		double prixUnite = article.getPrixU();
		double prixTotal = getPrix();
		String rabais = "";
		
		if(article.estEnSolde()) {
			rabais = " (1/2 prix)";	
		}
		
		System.out.println(nom + " : " + prixUnite + " x " + quantite + " = " + prixTotal + " Frs" + rabais);
					
	}
	
		
}
