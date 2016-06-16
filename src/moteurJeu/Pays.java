package moteurJeu;

import java.util.ArrayList;

/** Pays est la classe regroupant les informations relatives à un pays.
 * @author yasmine
 *
 */
public class Pays
{
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
	
	/** 
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
	
}
