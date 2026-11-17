package personnages;

public class Ronin extends Humain {

	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		
		int argentDonner = (int)(this.getArgent()*0.1);
		this.parler(beneficiaire.getNom() + " prend ces " + argentDonner + " sous.");
		beneficiaire.recevoir(argentDonner);
		this.perdreArgent(argentDonner);
	}
	
}
