package panamaPapers;

public class Requete 
{
	Enqueteur demandeur;
	Possédé demandé;
	Propriétaire résultat;
	int nbJours;
	
	public Requete(Enqueteur demandeur, Possédé demandé, int coop)
	{
		this.demandeur = demandeur;
		this.demandé = demandé;
		nbJours = coop + (int) Math.random()*10;
		résultat = this.demandé.getPropriétaire();
	}

	@Override
	public String toString()
	{
		return demandé.toString() + " --> " + résultat.toString();
	}
}
