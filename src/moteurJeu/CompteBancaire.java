package moteurJeu;

/** Classe representant un compte bancaire
 * @author yasmine
 *
 */
public class CompteBancaire implements Propriete
{
	public int numero, solde;
	public Banque hebergeur;
	public Proprietaire p;

	/** Constructeur de la classe
	 * @param banque
	 * @param p
	 * @param solde
	 */
	public CompteBancaire(Banque banque, Proprietaire p, int solde)
	{
		this.hebergeur = banque;
		this.p = p;
		this.solde = solde;
		this.numero = banque.banqueNum*100 + banque.comptes.size()+1;
		this.hebergeur.comptes.add(this);
	}
	
	/** Transfere du partir courant un montant vers le compte donné en parametre
	 * @param compte2
	 * @param montant
	 */
	public void transfert(CompteBancaire compte2, int montant)
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
		return "numéro de compte : " + numero +"\n" + solde + "$";
	}
}
