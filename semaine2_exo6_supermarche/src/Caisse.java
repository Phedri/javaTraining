import java.util.Date;
import java.text.SimpleDateFormat;


public class Caisse {
	private int numero;
	private double total;
	
	
	public Caisse(int numero, double total) {
		this.numero = numero;
		this.total = total;
	}
	
	public void totalCaisse() {
		System.out.print("La caisse numero " + numero ); 
		System.out.printf(" a encaisse %.2f Frs aujourd'hui\n",total);
	}
	
	public void scanner(Caddie caddie) {
		System.out.println("===========================================================");
		
		Date dateCourante = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yy");
		
		System.out.println(formatDate.format(dateCourante));
		System.out.println("Caisse num�ro: " + numero +"\n");
		
		int nbAchat = caddie.getNbAchats();
		double montantTotal = 0;
		
		
		for(int i=0; i < nbAchat ; i++) {
			Achat achat = caddie.getAchat(i);
			double prix = achat.getPrix();
			achat.affiche();
			montantTotal += prix;
			total +=prix;
			
		}
		
		System.out.println();
		System.out.println("Montant � payer : " + montantTotal + " Frs");
		System.out.println("===========================================================");
		
	}
	
	
}
