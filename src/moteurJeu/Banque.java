package moteurJeu;

import java.util.ArrayList;

public class Banque extends Societe 
{
	ArrayList<CompteBancaire> comptes;
	int banqueNum;
	
	public Banque(String nom, Pays rési, Proprietaire own, Jeu jeu)
	{
		this.nom = nom;
		this.résidence = rési;
		this.possesseur = own;
		this.possessions = new ArrayList<Societe>();
		this.comptes = new ArrayList<CompteBancaire>();
		this.banqueNum = jeu.banques.size()+(int)Math.random()*5; 
		jeu.banques.add(this);
		this.compte = new CompteBancaire(this, this);
	}
}