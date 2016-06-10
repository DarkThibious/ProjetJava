package panamaPapers;

import java.util.Date;

public class Enqueteur extends Contribuable 
{
	

	public Enqueteur(String nom, Pays rési, Date anniv) 
	{
		super(nom, rési, anniv);
		if(rési.enqueteur == null)
		{
			this.résidence.enqueteur = this;
		}
	}

	public void declaration(Pays pays, CompteBancaire compte, Contribuable propriétaire)
	{
		
	}
}
