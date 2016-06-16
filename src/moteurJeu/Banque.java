package moteurJeu;

import java.util.ArrayList;

public class Banque extends Societe 
{
	ArrayList<CompteBancaire> comptes;
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
	}
	
	public String toString()
	{
		return super.toString() + "Numéro de la banque : " + banqueNum;
	}
}