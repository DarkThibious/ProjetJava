package moteurJeu;

import java.util.ArrayList;

/** Propritaire est la classe abstraite regroupant les informations relatives aux contribuables et aux sociétés,
 * @author yasmine
 *
 */
public abstract class Proprietaire 
{
	public String nom;
	public Pays residence;
	public CompteBancaire compte;
	public ArrayList<Societe> possessions;
	
	/**Contructeur par défaut de la classe Proprietaire
	 *  Il est utilisé lorsque aucune information sur l'instance à créer
	 *   n'est disponible à la création
	 */
	public Proprietaire(){}
	
	
	/**Contructeur de la classe Proprietaire, sera utilisé pour la création d'un proprietaire d'un nouveau compte
	 * @param nom
	 * 			nom du proprietaire
	 * @param resi
	 * 			pays de residence unique du proprietaire
	 * @param bank
	 * 			banque qui va heberger le compte bancaire du proprietaire
	 * @param solde
	 * 			solde initial du compte bancaire crée dans "bank"
	 */
	public Proprietaire(String nom, Pays resi, Banque bank, int solde)
	{
		this.nom = nom;
		this.residence = resi;
		this.compte = new CompteBancaire(bank, this, solde);
		this.possessions = new ArrayList<Societe>();
	}
	
	// propriétaire d'une nouvelle banque
	/**Contructeur de la classe Proprietaire, sera utilisé pour la création d'un proprietaire d'une nouvelle banque
	 * @param nom
	 * 			nom du proprietaire de la banque et du compte
	 * @param rési
	 * 			pays de residence unique du proprietaire
	 * @param bank
	 * 			nom de la banque créee par le proprietaire
	 * @param soldeBank
	 * 			solde de la banque créee par le proprietaire
	 * @param jeu
	 * 			jeu dans lequel le proprietaire est crée
	 * @param solde
	 * 			solde initial du compte bancaire crée dans sa banque
	 */
	protected Proprietaire(String nom, Pays rési, String bank, int soldeBank, Jeu jeu, int solde)
	{
		this.nom = nom;
		this.residence = rési;
		this.possessions = new ArrayList<Societe>();
		Banque b = new Banque(bank, residence, this, jeu, soldeBank);
		this.compte = new CompteBancaire(b, this, solde);
	}
	
	public String toString()
	{
		String s = nom +"\n" + residence + "\n" + compte + "\n";
		s += "Possessions {";
		for(Societe p : this.possessions)
		{
			s += p.toString();
		}
		s+="}\n";
		return s;
	}
	
	
}