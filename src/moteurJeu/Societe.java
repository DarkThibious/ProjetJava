package moteurJeu;

public class Societe extends Proprietaire implements Propriete
{
	Proprietaire possesseur;
	
	public Societe(){}
	
	public Societe(String nom, Pays rési, Proprietaire own, Banque bank) 
	{
		super(nom, rési, bank);
		this.possesseur = own;
	}
	
	//Création d'une nouvelle banque pour le compte de la société
	public Societe(String nom, Pays rési, Proprietaire own, String bank, Jeu jeu)
	{
		super(nom, rési, bank, jeu);
		this.possesseur = own;
	}
	
	public Proprietaire getProprietaire()
	{
		return possesseur;
	}
	
	public String toString()
	{
		return super.toString()+"Propriétaire {\n" + possesseur+ "}\n";
	}
}
