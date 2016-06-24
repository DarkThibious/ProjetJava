package moteurJeu;

import java.util.ArrayList;

/** Classe representant un registre Central
 * @author yasmine
 *
 */
public class RegistreCentral {
	public ArrayList<Transaction> suspects; // contiendra la liste des transactions suspectes

	/** Constructeur par defaut
	 * 
	 */
	public RegistreCentral() {
		this.suspects =  new ArrayList<Transaction>();
	}
	
	public boolean verifDenonciation(ArrayList<String> denonciation)
	{   
		return true;
	}
}
