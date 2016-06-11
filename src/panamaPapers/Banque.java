package panamaPapers;

import java.util.ArrayList;

public class Banque extends Societe 
{
	ArrayList<CompteBancaire> comptes;
	int banqueNum;
	
	public Banque(String nom, Pays rési, Proprietaire own)
	{
		super(nom, rési, own);
		this.compte = new CompteBancaire(this, this);
	}
}
