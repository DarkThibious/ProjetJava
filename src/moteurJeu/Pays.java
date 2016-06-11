package moteurJeu;

import java.util.ArrayList;

public class Pays
{
	String nom;
	Enqueteur enqueteur;
	int nbDénonciations;
	ArrayList<Requete> requetes;
	
	public Pays(String nom)
	{
		this.nom = nom;
		this.nbDénonciations = 0;
		this.enqueteur = null;
	}
	
	public void setEnqueteur(Enqueteur enqueteur)
	{
		this.enqueteur = enqueteur;
	}
	
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
