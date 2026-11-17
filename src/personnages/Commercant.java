package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent) {
		super(nom, "Thé", argent);
	}

	public int seFaireExtorquer() {
		
		int argentExtorque = this.getArgent();
		this.perdreArgent(argentExtorque);
		
		this.parler("J'ai tout perdu! Le monde est trop injuste...");
		
		return argentExtorque;
	}
	
	public void recevoir(int argent) {
		this.parler(argent + " sous ! Je te remercie généreux donateur !");
	}
	
}
