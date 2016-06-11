package panamaPapers;

public class Requete 
{
	Enqueteur demandeur;
	Possede demandé;
	Proprietaire résultat;
	int nbJours;
	
	public Requete(Enqueteur demandeur, Possede demandé, int coop)
	{
		this.demandeur = demandeur;
		this.demandé = demandé;
		nbJours = coop + (int) Math.random()*10;
		résultat = this.demandé.getProprietaire();
	}

	@Override
	public String toString()
	{
		return demandé.toString() + " --> " + résultat.toString();
	}
}
