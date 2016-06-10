package panamaPapers;

public class CompteBancaire 
{
	int numero, solde;
	Banque hebergeur;
	Propriétaire p;

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
}
