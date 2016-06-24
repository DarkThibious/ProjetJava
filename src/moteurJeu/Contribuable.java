package moteurJeu;

/** Classe represantant un contribuable qui est une sous classe de Proprietaire
 * @author yasmine
 *
 */
public class Contribuable extends Proprietaire 
{
	String birthday;
	
	/** Constructeur de la classe pour un contribuable ordinaire
	 * @param nom
	 * @param rési
	 * @param anniv
	 * @param bank
	 * @param solde
	 */
	public Contribuable(String nom, Pays rési, String anniv, Banque bank, int solde) 
	{
		super(nom, rési, bank, solde);
		this.birthday = anniv;
		this.residence.contribuables.add(this);
	}
	
	/** Constructeur de la classe pour un contribuable qui sera le pdg de la banque
	 * @param nom
	 * @param rési
	 * @param anniv
	 * @param bank
	 * @param soldeBank
	 * @param jeu
	 * @param solde
	 */
	public Contribuable(String nom, Pays rési, String anniv, String bank, int soldeBank, Jeu jeu, int solde) 
	{
		super(nom, rési, bank, soldeBank, jeu, solde);
		this.birthday = anniv;
		this.residence.contribuables.add(this);
	}
}