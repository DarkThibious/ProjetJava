package panamaPapers;

public class CompteBancaire implements Possédé
{
	public int numero, solde;
	public Banque hebergeur;
	public Propriétaire p;

	public CompteBancaire(Banque banque, Propriétaire p)
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
	
	public Propriétaire getPropriétaire() 
	{
		return p;
	}
}
