/*******************************************
 * Completez le programme a partir d'ici.
 *******************************************/
class Patient {
	private double masse, hauteur;
	
	public void init(double p, double h) {
		if(p>0 && h>0) {
			masse = p;
			hauteur = h;
		}	
		else {
			masse = 0;
			hauteur = 0;
		}
			
		
		
	}
	
	public void afficher() {	
		System.out.printf("Patient : %.1f kg pour %.1f m", masse, hauteur);
		System.out.println("");
	}
	
	public double poids() {
		return masse;
	}
	
	public double taille() {
		return hauteur;
	}
	
	public double imc() {
		if(taille() != 0)
		{
			return poids() / (taille()*taille());
		}
		else 
			return 0.0;
	}
	

	
}
/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/
class Imc {
    public static void main(String[] args) {

        Patient quidam = new Patient();
        quidam.init(74.5, 1.75);
        quidam.afficher();
        System.out.println("IMC : " + quidam.imc());
        quidam.init( -2.0, 4.5);
        quidam.afficher();
    }
}
