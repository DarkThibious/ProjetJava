package panamaPapers;

import java.util.ArrayList;

public class Propriétaire 
{
	String nom;
	Pays résidence;
	CompteBancaire compte;
	ArrayList<Société> possessions;
	
	public Propriétaire(String nom, Pays rési, Banque bank)
	{
		this.nom = nom;
		this.résidence = rési;
		this.compte = new CompteBancaire(bank, this);
	}
	
	public Propriétaire(String nom, Pays rési, String bank)
	{
		
	}
	
	
}