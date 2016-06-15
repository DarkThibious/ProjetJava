package moteurJeu;

public class Contribuable extends Proprietaire 
{
	String birthday;
	
	public Contribuable(String nom, Pays rési, String anniv, Banque bank, int solde) 
	{
		super(nom, rési, bank, solde);
		this.birthday = anniv;
		this.residence.contribuables.add(this);
	}
	
	public Contribuable(String nom, Pays rési, String anniv, String bank, int soldeBank, Jeu jeu, int solde) 
	{
		super(nom, rési, bank, soldeBank, jeu, solde);
		this.birthday = anniv;
		this.residence.contribuables.add(this);
	}
}