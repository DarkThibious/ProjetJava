package moteurJeu;

import java.util.ArrayList;

/** Pays est la classe regroupant les informations relatives à un pays.
 * @author yasmine
 *
 */
public class Pays
{
//	public static final int coop[][];
	public String nom;
	public Enqueteur enqueteur;
	public int nbDénonciations;
	public ArrayList<Requete> requetes;
	public ArrayList<Contribuable> contribuables;
	
	/** Contructeur de la classe Pays
	 * @param nom
	 * 			nom du pays.
	 */
	public Pays(String nom)
	{
		this.nom = nom;
		this.nbDénonciations = 0;
		this.enqueteur = null;
		this.contribuables = new ArrayList<Contribuable>();
	}
	
	/**
	 * @param enqueteur
	 *  		Chaque pays possede un et un seul enqueteur.
	 */
	public void setEnqueteur(Enqueteur enqueteur)
	{
		this.enqueteur = enqueteur;
	}
	
	/** Taite les requetes , met à jour le nombre de jours
	 * 
	 */
	public void traiteRequete() 
	{
		for(Requete r : requetes)
		{
			r.nbJours--;
			if(r.nbJours == 0)
			{
				r.demandeur.getInfos(r);
			}
		}
	}
	
	public String toString()
	{
		return nom;
	}
	
	public void nouvelleRequete(Enqueteur demandeur, Proprietaire demande)
	{
		if(demande.residence == this)
		{
			new Requete(demandeur, demande, 1);
		}
		else
		{
			new Requete(demandeur, (Proprietaire) null, 1);
		}		
	}
	
	public void nouvelleRequete(Enqueteur demandeur, Societe demande)
	{
		if(demande.residence == this)
		{
			new Requete(demandeur, (Propriete) demande, 1);
		}
		else
		{
			new Requete(demandeur, (Propriete) null, 1);
		}		
	}
}
