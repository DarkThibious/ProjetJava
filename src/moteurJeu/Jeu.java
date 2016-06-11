package moteurJeu;

import java.util.ArrayList;
import java.util.Date;

public class Jeu 
{
	int tour;
	ArrayList<Banque> banques;
	ArrayList<Pays> pays;
	
	public Jeu()
	{
		this.tour = 0;
		this.pays = new ArrayList<Pays>();
		this.banques = new ArrayList<Banque>();
	}
	
	public void initPays()
	{
		pays.add(new Pays("France"));
		pays.add(new Pays("Algérie"));
		pays.add(new Pays("Chine"));
		pays.add(new Pays("Quatar"));
		pays.add(new Pays("Australie"));
		pays.add(new Pays("USA"));
		pays.add(new Pays("Panama"));
		pays.add(new Pays("Caiman"));
		pays.add(new Pays("Luxembourg"));
		pays.add(new Pays("Maurice"));
		pays.add(new Pays("Bahamas"));
		pays.add(new Pays("Chypre"));
		pays.add(new Pays("Djibouti"));
		pays.add(new Pays("Malte"));
		pays.add(new Pays("Irlande"));
		pays.add(new Pays("Singapour"));
		pays.add(new Pays("Suisse"));
		pays.add(new Pays("Bemudes"));
		pays.add(new Pays("Lettonie"));
		pays.add(new Pays("Italie"));
		pays.add(new Pays("Espagne"));
		pays.add(new Pays("Allemagne"));
		pays.add(new Pays("Portugal"));
		pays.add(new Pays("Canade"));
		pays.add(new Pays("Egypte"));
		pays.add(new Pays("Dubai"));
		pays.add(new Pays("Japan"));
		pays.add(new Pays("Inde"));
		pays.add(new Pays("Roumanie"));
		pays.add(new Pays("Autriche"));
		
		System.out.println("nombre de pays = "+pays.size());
	}
	
	public static void main(String[] args) 
	{
		Jeu jeu = new Jeu();
		jeu.initPays();
		
		Contribuable c = new Contribuable("Billy", jeu.pays.get(0),new Date(0), "Thune Land", jeu);
		Societe s = new Societe("Fric Corp", jeu.pays.get(1), c, jeu.banques.get(0));


		
		System.out.println(c);
		System.out.println(s);
		

	}
}
