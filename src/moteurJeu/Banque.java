package moteurJeu;

import java.util.ArrayList;

public class Banque extends Societe 
{
	ArrayList<CompteBancaire> comptes;
	int banqueNum;
	
	public Banque(String nom, Pays rési, Proprietaire own)
	{
		this.nom = nom;
		this.résidence = rési;
		this.possesseur = own;
		this.compte = new CompteBancaire(this, this);
		this.possessions = new ArrayList<Societe>();
		this.comptes = new ArrayList<CompteBancaire>();
	}
}
/*juste testerrrrrr*/