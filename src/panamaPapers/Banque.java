package panamaPapers;

import java.util.ArrayList;

public class Banque extends Société 
{
	ArrayList<CompteBancaire> comptes;
	int banqueNum;
	
	public Banque(String nom, Pays rési, Propriétaire own)
	{
		super(nom, rési, own);
	}
}
