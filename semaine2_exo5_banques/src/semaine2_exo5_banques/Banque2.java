package semaine2_exo5_banques;

public class Banque2 {

	public static void main(String[] args) {
		
		double taux1 = 0.01;
		double taux2 = 0.02;
		
		//COnstruction des deux clients
		Client c1 = new Client("Pedro","Gen�ve",taux1,1000.0,taux2,2000.0,true);
		Client c2 = new Client("Alexandra","Lausanne",taux1,3000.0,taux2,4000.0,false);
		
		
		System.out.println("Donnees avant le bouclement des comptes:");
		c1.afficher();
		c2.afficher();
		
		// BOUCLEMENT
		c1.boucler();
		c2.boucler();
		
		System.out.println("Donnees apres le bouclement des comptes:");
		c1.afficher();
		c2.afficher();
		
	}

}
