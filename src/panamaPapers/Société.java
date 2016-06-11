package panamaPapers;

public class Société extends Propriétaire implements Possédé
{
	Propriétaire possesseur;
	
	public Société(String nom, Pays rési, Propriétaire own, Banque bank) 
	{
		super(nom, rési, bank);
		this.possesseur = own;
	}
	
	public Propriétaire getPropriétaire()
	{
		return possesseur;
	}
}
