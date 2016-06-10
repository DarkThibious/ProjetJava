package panamaPapers;

import java.util.ArrayList;

public class Banque extends Société 
{
	ArrayList<CompteBancaire> comptes;
	
	public Banque(String nom, Pays rési, Propriétaire own)
	{
		super(nom, rési, own);
	}
}
