package semaine2_exo4_poeme;

public class Fleur {
	private String nomFleur, couleurFleur;
	
	
	public Fleur(String nomF, String couleurF) {
		
		nomFleur = nomF;
		couleurFleur = couleurF;
		
		System.out.println(nomFleur + " fraichement cueillie");
		
	}
	
	public String getnomFleur() {
		return nomFleur;
	}
	
	public String getcouleurFleur() {
		return couleurFleur;
	}
	
	public Fleur(Fleur fl) {
		
		this.nomFleur = fl.getnomFleur();
		this.couleurFleur = fl.getcouleurFleur();
		
		System.out.print("Fragile corolle taill�e ");
	}
	
	public String toString() {
		return "qu'un simple souffle";
	}
	
	public void eclore() {
		System.out.println("vein� de " + couleurFleur );
	}
	
	
}
