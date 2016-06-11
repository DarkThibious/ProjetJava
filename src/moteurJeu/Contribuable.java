package moteurJeu;

import java.util.Date;

public class Contribuable extends Proprietaire 
{
	Date birthday;
	
	public Contribuable(String nom, Pays rési, Date anniv, Banque bank) 
	{
		super(nom, rési, bank);
		this.birthday = anniv;
	}
}
