package moteurJeu;

import java.util.ArrayList;

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
		pays.add(new Pays("USA"));
		pays.add(new Pays("Suisse"));
		pays.add(new Pays("Maurice"));
		pays.add(new Pays("Panama"));
		pays.add(new Pays("Caiman"));
		pays.add(new Pays("Malte"));
		pays.add(new Pays("Inde"));
		pays.add(new Pays("Singapour"));
		pays.add(new Pays("Chine"));
	
		System.out.println("nombre de pays = "+pays.size());
	}
	public void initContribuables()
	{	/* France */
		pays.get(0).contribuables.add(new Contribuable("Will Smith",pays.get(0),"30/12/1980","Société générale",this));
		pays.get(0).contribuables.add(new Contribuable("Pitt Brad",pays.get(0),"12/05/1977","BNP Parisbas",this));
		pays.get(0).contribuables.add(new Contribuable("Jolie Angelina",pays.get(0),"30/12/1980",banques.get(0)));
		pays.get(0).contribuables.add(new Contribuable("Washington Denzel",pays.get(0),"30/12/1980",banques.get(1)));
		
		/* USA */
		pays.get(1).contribuables.add(new Contribuable("Harrison Ford",pays.get(1),"14/08/1974","Bank of America",this));
		pays.get(1).contribuables.add(new Contribuable("Obi-Wan Kenobi",pays.get(1),"17/02/1979","US Bank",this));
		pays.get(1).contribuables.add(new Contribuable("Michael Jackson",pays.get(1),"31/03/1981",banques.get(2)));
		pays.get(1).contribuables.add(new Contribuable("Barack Obama",pays.get(1),"22/06/1990",banques.get(3)));
		
		/* Suisse */
		pays.get(2).contribuables.add(new Contribuable("Alain Delon",pays.get(2),"15/02/1950","UBS",this));
		pays.get(2).contribuables.add(new Contribuable("Gérard Depardieu",pays.get(2),"10/01/1947","Credit Swiss",this));
		pays.get(2).contribuables.add(new Contribuable("Sean Connery",pays.get(2),"29/11/1983",banques.get(4)));
		pays.get(2).contribuables.add(new Contribuable("Johnny Deep",pays.get(2),"04/12/1991",banques.get(5)));
		
		/* Ile Maurice */
		pays.get(3).contribuables.add(new Contribuable("Léonardo DiCpario",pays.get(3),"05/01/1960","Banque de Maurice",this));
		pays.get(3).contribuables.add(new Contribuable("Robet Downey",pays.get(3),"17/05/1986","HSBC",this));
		pays.get(3).contribuables.add(new Contribuable("Katharine Hepburn",pays.get(3),"08/12/1980",banques.get(6)));
		pays.get(3).contribuables.add(new Contribuable("Michel Blanc",pays.get(3),"31/12/1984",banques.get(7)));
		
		/* Panama */
		pays.get(4).contribuables.add(new Contribuable("Gérard Jungot",pays.get(4),"25/09/1972","Global Bank",this));
		pays.get(4).contribuables.add(new Contribuable("Clint Eastwood",pays.get(4),"12/05/1994","Bank of Panama",this));
		pays.get(4).contribuables.add(new Contribuable("Ben Affleck",pays.get(4),"23/05/1974",banques.get(8)));
		pays.get(4).contribuables.add(new Contribuable("Vin Diesel",pays.get(4),"07/08/1980",banques.get(9)));
		
		/* Caiman */
		pays.get(5).contribuables.add(new Contribuable("Adam Sandler",pays.get(5),"01/10/1971","CB",this));
		pays.get(5).contribuables.add(new Contribuable("Bradley Cooper",pays.get(5),"02/07/1989","Bank of Caiman",this));
		pays.get(5).contribuables.add(new Contribuable("George Clooney",pays.get(5),"03/12/1980",banques.get(10)));
		pays.get(5).contribuables.add(new Contribuable("Jack Nicholson",pays.get(5),"09/02/1970",banques.get(11)));
		
		/* Malte */
		pays.get(6).contribuables.add(new Contribuable("Dwayne Johnson",pays.get(6),"26/02/1956","Banque de developpement Malte",this));
		pays.get(6).contribuables.add(new Contribuable("Charlie Chaplin",pays.get(6),"21/05/1985","Bank of Malte",this));
		pays.get(6).contribuables.add(new Contribuable("Tom Cruise",pays.get(6),"28/04/1955",banques.get(12)));
		pays.get(6).contribuables.add(new Contribuable("Omar Sy",pays.get(6),"03/08/1969",banques.get(13)));
		
		/* Chine */ 
		pays.get(7).contribuables.add(new Contribuable("Bernard Giraudeau",pays.get(7),"25/16/1987","DBS",this));
		pays.get(7).contribuables.add(new Contribuable("Mark Walberg",pays.get(7),"07/09/1972","Bank of Singapour",this));
		pays.get(7).contribuables.add(new Contribuable("Paul Walker",pays.get(7),"24/11/1987",banques.get(14)));
		pays.get(7).contribuables.add(new Contribuable("Homer Simpson",pays.get(7),"13/10/1984",banques.get(15)));
		
		/* Inde */
		pays.get(8).contribuables.add(new Contribuable("Robet De Niro",pays.get(8),"07/03/1950","Bank of China",this));
		pays.get(8).contribuables.add(new Contribuable("Sean Penn",pays.get(8),"12/02/1958","CIBC",this));
		pays.get(8).contribuables.add(new Contribuable("Jennifer Lawrence",pays.get(8),"09/09/1987",banques.get(16)));
		pays.get(8).contribuables.add(new Contribuable("Liam Neeson",pays.get(8),"30/12/1966",banques.get(17)));
		
		/* Singapour */ 
		pays.get(9).contribuables.add(new Contribuable("Humphrey Bogart",pays.get(9),"25/16/1987","DBS",this));
		pays.get(9).contribuables.add(new Contribuable("Colin Firth",pays.get(9),"07/09/1972","Bank of Singapour",this));
		pays.get(9).contribuables.add(new Contribuable("Ralph Fiennes",pays.get(9),"24/11/1987",banques.get(18)));
		pays.get(9).contribuables.add(new Contribuable("Tom Hanks",pays.get(9),"13/10/1984",banques.get(19)));
		

		
		
	}
	public static void main(String[] args) 
	{
		Jeu jeu = new Jeu();
		jeu.initPays();
		jeu.initContribuables();
	//	Contribuable c = new Contribuable("Billy", jeu.pays.get(0), "8/12/2484", "Thune Land", jeu);
	//	Societe s = new Societe("Fric Corp", jeu.pays.get(1), c, jeu.banques.get(0));
	}
}
