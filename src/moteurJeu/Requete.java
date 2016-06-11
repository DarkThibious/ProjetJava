package moteurJeu;

public class Requete 
{
	Enqueteur demandeur;
	Propriete demande;
	Proprietaire resultat;
	int nbJours;
	
	public Requete(Enqueteur demandeur, Propriete demande, int coop)
	{
		this.demandeur = demandeur;
		this.demande = demande;
		nbJours = coop + (int) Math.random()*10;
		resultat = this.demande.getProprietaire();
	}

	@Override
	public String toString()
	{
		return demande.toString() + " --> " + resultat.toString();
	}
}
