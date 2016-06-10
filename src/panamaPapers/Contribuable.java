package panamaPapers;

import java.util.Date;

public class Contribuable extends Propriétaire 
{
	Date birthday;
	
	public Contribuable(String nom, Pays rési, Date anniv) 
	{
		super(nom, rési);
		this.birthday = anniv;
		
	}
}
