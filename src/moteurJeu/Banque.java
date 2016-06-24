package moteurJeu;

import java.util.ArrayList;

/** Classe representant la banque
 * @author yasmine
 *
 */
public class Banque extends Societe 
{
	ArrayList<CompteBancaire> comptes;
	public ArrayList<Requete> requetes;
	int banqueNum;
	
	/**
	 * @param nom
	 * @param rési
	 * @param own
	 * @param jeu
	 * @param solde
	 */
	public Banque(String nom, Pays rési, Proprietaire own, Jeu jeu, int solde)
	{
		this.nom = nom;
		this.residence = rési;
		this.possesseur = own;
		this.possesseur.possessions.add(this);
		this.possessions = new ArrayList<Societe>();
		this.comptes = new ArrayList<CompteBancaire>();
		this.banqueNum = jeu.banques.size()+((int)((Math.random()*25)+1)*100); 
		jeu.banques.add(this);
		this.compte = new CompteBancaire(this, this, solde);
		this.requetes = new ArrayList<Requete>();
	}
	
	/** Cree une nouvelle requete
	 * @param demandeur
	 * @param demande
	 */
	public void nouvelleRequete(Enqueteur demandeur, CompteBancaire demande)
	{
		if(demande.hebergeur == this)
		{
			new Requete(demandeur, demande, 1);
		}
		else
		{
			new Requete(demandeur, (CompteBancaire) null, 1);
		}	
	}
	
	public String toString()
	{
		return super.toString() + "Numéro de la banque : " + banqueNum;
	}
}