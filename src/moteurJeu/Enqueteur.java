package moteurJeu;

import java.util.ArrayList;

public class Enqueteur extends Contribuable 
{
	ArrayList<Requete> infos;

	public Enqueteur(String nom, Pays rési, String anniv, Banque bank, int solde) 
	{
		super(nom, rési, anniv, bank, solde);
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
