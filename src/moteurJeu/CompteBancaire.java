package moteurJeu;

public class CompteBancaire implements Propriete
{
	public int numero, solde;
	public Banque hebergeur;
	public Proprietaire p;

	public CompteBancaire(Banque banque, Proprietaire p)
	{
		this.hebergeur = banque;
		this.p = p;
		this.solde = 0;
		this.numero = banque.banqueNum*5 + banque.comptes.size()+1;
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
	
	public String toString()
	{
		return "num : " + numero +"\n" + solde + "$\n";
	}
}
