package panamaPapers;

public class Société extends Propriétaire 
{
	Propriétaire possesseur;
	
	public Société(String nom, Pays rési, Propriétaire own) 
	{
		super(nom, rési);
		this.possesseur = own;
	}
}
