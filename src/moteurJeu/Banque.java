package moteurJeu;

//TESTTTT
import java.util.ArrayList;

public class Banque extends Societe 
{
	ArrayList<CompteBancaire> comptes;
	int banqueNum;
	
	public Banque(String nom, Pays rési, Proprietaire own, Jeu jeu, int solde)
	{
		this.nom = nom;
		this.résidence = rési;
		this.possesseur = own;
		this.possesseur.possessions.add(this);
		this.possessions = new ArrayList<Societe>();
		this.comptes = new ArrayList<CompteBancaire>();
		this.banqueNum = jeu.banques.size()+((int)(Math.random()*25)*100); 
		jeu.banques.add(this);
		this.compte = new CompteBancaire(this, this, solde);
	}
	
	public String toString()
	{
		return super.toString() + "Numéro de la banque : " + banqueNum;
	}
}