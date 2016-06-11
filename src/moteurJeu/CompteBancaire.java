package moteurJeu;

public class CompteBancaire implements Propriete
{
	public int numero, solde;
	public Banque hebergeur;
	public Proprietaire p;

	public CompteBancaire(Banque banque, Proprietaire p)
	{
		
	}
	
	public void transaction(CompteBancaire compte2, int montant)
	{
		if(compte2 == null || (compte2.solde - montant >= 0 && this.solde + montant >= 0))
		{
			this.solde += montant;
		}
		if(compte2 != null)
		{
			compte2.solde -= montant;
		}
	}
	
	public Proprietaire getProprietaire() 
	{
		return p;
	}
}
