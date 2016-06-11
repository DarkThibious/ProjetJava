package moteurJeu;

public class Jeu 
{
	int tour;
	Pays[] pays;
	Banque[] banques;
	
	public Jeu()
	{
		this.tour = 0;
		this.pays = new Pays[10];
		this.banques = new Banque[10];
	}
}
