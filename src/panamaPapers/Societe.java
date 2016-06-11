package panamaPapers;

public class Societe extends Proprietaire implements Propriete
{
	Proprietaire possesseur;
	
	public Societe(){}
	
	public Societe(String nom, Pays rési, Proprietaire own, Banque bank) 
	{
		super(nom, rési, bank);
		this.possesseur = own;
	}
	
	public Proprietaire getProprietaire()
	{
		return possesseur;
	}
}
