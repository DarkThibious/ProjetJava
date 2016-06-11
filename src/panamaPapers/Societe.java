package panamaPapers;

public class Societe extends Proprietaire implements Possede
{
	Proprietaire possesseur;
	
	public Societe(String nom, Pays rési, Proprietaire own, Banque bank) 
	{
		super(nom, rési, bank);
		this.possesseur = own;
	}
	
	public Societe(String nom, Pays rési, Proprietaire own) 
	{
		super(nom, rési);
		this.possesseur = own;
	}
	
	public Proprietaire getProprietaire()
	{
		return possesseur;
	}
}
