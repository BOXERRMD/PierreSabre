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
	
	public void provoquer(Yakuza adversaire) {
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (this.honneur*2 >= adversaire.getReputation()) {
			this.gagnerArgent(adversaire.perdre());
			this.honneur += 1;
			this.parler("Je t’ai eu petit yakusa!");
		}
		else {
			int argentPerdu = this.getArgent();
			adversaire.gagner(argentPerdu);
			this.perdreArgent(argentPerdu);
			this.honneur = honneur-1 >= 0 ? honneur-1 : 0;
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		}
	}
	
}
