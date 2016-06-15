package moteurJeu;

public class Transaction {
	public CompteBancaire source;
	public CompteBancaire destination;
	int montant;
	
	public Transaction(CompteBancaire source, CompteBancaire destination, int montant) 
	{
		this.source = source;
		this.destination = destination;
		this.montant = montant;
		if(montant < source.solde)
		{
			this.source.solde=this.source.solde-montant;
			this.destination.solde=this.destination.solde-montant;		
		}
	}
	
	public String toString()
	{
		return  "montant transféré : "+ this.montant + ", \tnumero de compte source : " + this.source.numero
				+", \tnumero de compte destination : " + this.destination.numero;
	}
	
}
