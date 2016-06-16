package moteurJeu;

/** Société est la classe représentant une société
 * @author yasmine
 *
 */
public class Societe extends Proprietaire implements Propriete
{
	Proprietaire possesseur;
	
	/** Constructeur par default de la classe societe.
	 * 
	 */
	public Societe(){}
	
	public Societe(String nom, Pays rési, Proprietaire own, Banque bank, int solde) 
	{
		super(nom, rési, bank, solde);
		this.possesseur = own;
		this.possesseur.possessions.add(this);
	}
	
	//Création d'une nouvelle banque pour le compte de la société
	public Societe(String nom, Pays rési, Proprietaire own, String bank, int soldeBank, Jeu jeu, int solde)
	{
		super(nom, rési, bank, soldeBank, jeu, solde);
		this.possesseur = own;
		this.possesseur.possessions.add(this);
	}
	
	public Proprietaire getProprietaire()
	{
		return possesseur;
	}
}
