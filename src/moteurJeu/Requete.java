package moteurJeu;

import java.util.ArrayList;

public class Requete 
{
	public Enqueteur demandeur;
	public ArrayList<Propriete> possede;
	public Proprietaire possesseur;
	public int nbJours;
	
	public Requete(Enqueteur demandeur, Propriete demande, int coop)
	{
		this.demandeur = demandeur;
		this.possede = new ArrayList<Propriete>();
		this.possede.add(demande);
		this.nbJours = coop + (int) Math.random()*10;
		this.possesseur = this.possede.get(0).getProprietaire();
	}
	
	public Requete(Enqueteur demandeur, Proprietaire demande, int coop)
	{
		this.demandeur = demandeur;
		this.possesseur = demande;
		this.nbJours = coop + (int) Math.random()*5;
		this.possede = new ArrayList<Propriete>();
		for(Societe s : this.possesseur.possessions)
		{
			this.possede.add(s);
		}
		this.possede.add(this.possesseur.compte);
		
	}

	@Override
	public String toString()
	{
		String s = this.possesseur.toString();
		for(Propriete p : this.possede)
		{
			s += " --> " + p.toString() + "\n";
		}
		return s;
	}
}
