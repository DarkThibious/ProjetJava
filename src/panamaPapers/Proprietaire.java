package panamaPapers;

import java.util.ArrayList;

public class Proprietaire 
{
	String nom;
	Pays résidence;
	CompteBancaire compte;
	ArrayList<Societe> possessions;
	
	public Proprietaire(String nom, Pays rési, Banque bank)
	{
		this.nom = nom;
		this.résidence = rési;
		this.compte = new CompteBancaire(bank, this);
		this.possessions = new ArrayList<Societe>();
	}
	
	public Proprietaire(String nom, Pays rési)
	{
		this.nom = nom;
		this.résidence = rési;
		this.possessions = new ArrayList<Societe>();
	}
	
	public Proprietaire(String nom, Pays rési, String bank)
	{
		this.nom = nom;
		this.résidence = rési;
	}
	
	
}