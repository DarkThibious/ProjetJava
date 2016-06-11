package panamaPapers;

import java.util.Date;

public class Contribuable extends Propriétaire 
{
	Date birthday;
	
	public Contribuable(String nom, Pays rési, Date anniv, Banque bank) 
	{
		super(nom, rési, bank);
		this.birthday = anniv;
	}
}
