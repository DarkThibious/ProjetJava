package moteurJeu;

public class Transaction {
	CompteBancaire source;
	CompteBancaire destination;
	int montant;
	
	public Transaction(CompteBancaire source, CompteBancaire destination, int montant) 
	{
		this.source = source;
		this.destination = destination;
		this.montant = montant;
		this.source.solde=this.source.solde-montant;
		this.destination.solde=this.destination.solde-montant;
	}
	
	
	
}
