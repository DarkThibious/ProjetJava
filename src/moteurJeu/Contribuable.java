package moteurJeu;

public class Contribuable extends Proprietaire 
{
	String birthday;
	
	public Contribuable(String nom, Pays rési, String anniv, Banque bank) 
	{
		super(nom, rési, bank);
		this.birthday = anniv;
	}
	
	public Contribuable(String nom, Pays rési, String anniv, String bank, Jeu jeu) 
	{
		super(nom, rési, bank, jeu);
		this.birthday = anniv;
	}
}