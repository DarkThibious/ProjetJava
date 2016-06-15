package moteurJeu;

import java.util.ArrayList;

public class Enqueteur extends Contribuable 
{
	ArrayList<Requete> infos;

	public Enqueteur(String nom, Pays resi, String anniv, Banque bank, int solde) 
	{
		super(nom, resi, anniv, bank, solde);
		if(resi.enqueteur == null)
		{
			this.residence.enqueteur = this;
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
