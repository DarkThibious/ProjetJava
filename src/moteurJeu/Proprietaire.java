package moteurJeu;

import java.util.ArrayList;

public abstract class Proprietaire 
{
	String nom;
	Pays résidence;
	CompteBancaire compte;
	ArrayList<Societe> possessions;
	
	//constructeur vide
	public Proprietaire(){}
	
	// normal
	public Proprietaire(String nom, Pays rési, Banque bank, int solde)
	{
		this.nom = nom;
		this.résidence = rési;
		this.compte = new CompteBancaire(bank, this, solde);
		this.possessions = new ArrayList<Societe>();
	}
	
	// propriétaire d'une nouvelle banque
	protected Proprietaire(String nom, Pays rési, String bank, int soldeBank, Jeu jeu, int solde)
	{
		this.nom = nom;
		this.résidence = rési;
		this.possessions = new ArrayList<Societe>();
		Banque b = new Banque(bank, résidence, this, jeu, soldeBank);
		this.compte = new CompteBancaire(b, this, solde);
	}
	
	public String toString()
	{
		String s = nom +"\n" + résidence + "\n" + compte + "\n";
		s += "Possessions {";
		for(Societe p : this.possessions)
		{
			s += p.toString();
		}
		s+="}\n";
		return s;
	}
	
	
}