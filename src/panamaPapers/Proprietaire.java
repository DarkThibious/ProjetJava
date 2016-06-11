package panamaPapers;

import java.util.ArrayList;

public class Proprietaire 
{
	String nom;
	Pays résidence;
	CompteBancaire compte;
	ArrayList<Societe> possessions;
	
	//constructeur vide
	public Proprietaire(){}
	
	// normal
	public Proprietaire(String nom, Pays rési, Banque bank)
	{
		this.nom = nom;
		this.résidence = rési;
		this.compte = new CompteBancaire(bank, this);
		this.possessions = new ArrayList<Societe>();
	}
	
	// propriétaire d'une nouvelle banque
	public Proprietaire(String nom, Pays rési, String bank)
	{
		this.nom = nom;
		this.résidence = rési;
		this.possessions = new ArrayList<Societe>();
		Banque b = new Banque(nom, résidence, this);
		this.compte = new CompteBancaire(b, this);
	}
	
	
}