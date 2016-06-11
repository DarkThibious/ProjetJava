package moteurJeu;

import java.util.ArrayList;
import java.util.Date;

public class Jeu 
{
	int tour;
	Pays[] pays;
	ArrayList<Banque> banques;
	
	public Jeu()
	{
		this.tour = 0;
		this.pays = new Pays[10];
		this.banques = new ArrayList<Banque>();
	}
	
	public static void main(String[] args) 
	{
		Jeu jeu = new Jeu();
		jeu.pays[0] = new Pays("France");
		jeu.pays[1] = new Pays("Algérie");
		jeu.pays[2] = new Pays("Chine");
		jeu.pays[3] = new Pays("Qatar");
		jeu.pays[4] = new Pays("Australie");
		jeu.pays[5] = new Pays("USA");
		jeu.pays[6] = new Pays("Panama");
		jeu.pays[7] = new Pays("Cayman");
		jeu.pays[8] = new Pays("Luxembourg");
		jeu.pays[9] = new Pays("UK");
		
		Contribuable c = new Contribuable("Billy", jeu.pays[0], new Date(0), "Thune Land", jeu);
		Societe s = new Societe("Fric Corp", jeu.pays[1], c, jeu.banques.get(0));
		
		System.out.println(c);
	}
}
