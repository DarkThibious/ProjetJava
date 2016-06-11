package panamaPapers;

import java.util.ArrayList;
import java.util.Date;

public class Enqueteur extends Contribuable 
{
	ArrayList<Requete> infos;

	public Enqueteur(String nom, Pays rési, Date anniv, Banque bank) 
	{
		super(nom, rési, anniv, bank);
		if(rési.enqueteur == null)
		{
			this.résidence.enqueteur = this;
		}
	}

	public void declaration(Pays pays, CompteBancaire compte, Contribuable propriétaire)
	{
		
	}

	public void getInfos(Requete r) 
	{
		infos.add(r);
	}
}
