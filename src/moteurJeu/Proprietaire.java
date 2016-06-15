package moteurJeu;

import java.util.ArrayList;

public abstract class Proprietaire 
{
	public String nom;
	public Pays residence;
	public CompteBancaire compte;
	public ArrayList<Societe> possessions;
	
	//constructeur vide
	public Proprietaire(){}
	
	// normal
	public Proprietaire(String nom, Pays resi, Banque bank, int solde)
	{
		this.nom = nom;
		this.residence = resi;
		this.compte = new CompteBancaire(bank, this, solde);
		this.possessions = new ArrayList<Societe>();
	}
	
	// propriétaire d'une nouvelle banque
	protected Proprietaire(String nom, Pays rési, String bank, int soldeBank, Jeu jeu, int solde)
	{
		this.nom = nom;
		this.residence = rési;
		this.possessions = new ArrayList<Societe>();
		Banque b = new Banque(bank, residence, this, jeu, soldeBank);
		this.compte = new CompteBancaire(b, this, solde);
	}
	
	public String toString()
	{
		String s = nom +"\n" + residence + "\n" + compte + "\n";
		s += "Possessions {";
		for(Societe p : this.possessions)
		{
			s += p.toString();
		}
		s+="}\n";
		return s;
	}
	
	
}