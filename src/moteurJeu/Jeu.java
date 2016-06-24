package moteurJeu;

import java.util.ArrayList;
import java.util.Random;

/** Jeu est la classe regroupant les informations nécessaires à une partie.
 * @author yasmine
 *
 */
public class Jeu 
{
	public int tour;
	public ArrayList<Banque> banques;
	public ArrayList<Pays> pays;
	public RegistreCentral registre;
	public ArrayList<Societe> societes;
	
	/** Contructeur de la classe jeu
	 * 
	 */
	public Jeu()
	{
		this.tour = 0;
		this.pays = new ArrayList<Pays>();
		this.banques = new ArrayList<Banque>();
		this.registre = new RegistreCentral();
		this.societes = new ArrayList<Societe>();
	}
	
	/** Initialise la liste des pays.
	 * 
	 */
	public void initPays()
	{
		pays.add(new Pays("France"));
		pays.add(new Pays("USA"));
		pays.add(new Pays("Suisse"));
		pays.add(new Pays("Maurice"));
		pays.add(new Pays("Panama"));
		pays.add(new Pays("Caiman"));
		pays.add(new Pays("Malte"));
		pays.add(new Pays("Chine"));
		pays.add(new Pays("Inde"));
		pays.add(new Pays("Singapour"));
	}
	
	/** Initialise la liste des contribuables,
	 *  Crée des contribuables pour tous les pays.
	 */
	public void initContribuables()
	{	/* France */
		pays.get(0).contribuables.add(new Contribuable("Will Smith",pays.get(0),"30/12/1980","Société générale", 2000000, this, 50000));
		pays.get(0).contribuables.add(new Contribuable("Pitt Brad",pays.get(0),"12/05/1977","BNP Parisbas", 21232450, this, 175000));
		pays.get(0).contribuables.add(new Contribuable("Jolie Angelina",pays.get(0),"30/12/1980", banques.get(0), 590000));
		pays.get(0).contribuables.add(new Contribuable("Washington Denzel",pays.get(0),"30/12/1980", banques.get(1), 90000));
		
		/* USA */
		pays.get(1).contribuables.add(new Contribuable("Harrison Ford",pays.get(1),"14/08/1974","Bank of America", 400000000, this, 1230));
		pays.get(1).contribuables.add(new Contribuable("Obi-Wan Kenobi",pays.get(1),"17/02/1979","US Bank", 2879000, this, 5000000));
		pays.get(1).contribuables.add(new Contribuable("Michael Jackson",pays.get(1),"31/03/1981", banques.get(2), 25000));
		pays.get(1).contribuables.add(new Contribuable("Barack Obama",pays.get(1),"22/06/1990", banques.get(3), 666666666));
		
		/* Suisse */
		pays.get(2).contribuables.add(new Contribuable("Alain Delon",pays.get(2),"15/02/1950","UBS", 23321, this, 123781238));
		pays.get(2).contribuables.add(new Contribuable("Gérard Depardieu",pays.get(2),"10/01/1947","Credit Swiss", 200000000, this, 890875));
		pays.get(2).contribuables.add(new Contribuable("Sean Connery",pays.get(2),"29/11/1983",banques.get(4), 90000));
		pays.get(2).contribuables.add(new Contribuable("Johnny Deep",pays.get(2),"04/12/1991",banques.get(5), 8782));
		
		/* Ile Maurice */
		pays.get(3).contribuables.add(new Contribuable("Léonardo DiCpario",pays.get(3),"05/01/1960","Banque de Maurice",23241222,this, 2310));
		pays.get(3).contribuables.add(new Contribuable("Robet Downey",pays.get(3),"17/05/1986","HSBC",12313, this, 82301398));
		pays.get(3).contribuables.add(new Contribuable("Katharine Hepburn",pays.get(3),"08/12/1980",banques.get(6), 67));
		pays.get(3).contribuables.add(new Contribuable("Michel Blanc",pays.get(3),"31/12/1984",banques.get(7), 5));
		
		/* Panama */
		pays.get(4).contribuables.add(new Contribuable("Gérard Jungot",pays.get(4),"25/09/1972","Global Bank", 999999, this, 6769));
		pays.get(4).contribuables.add(new Contribuable("Clint Eastwood",pays.get(4),"12/05/1994","Bank of Panama",2483, this, 320000));
		pays.get(4).contribuables.add(new Contribuable("Ben Affleck",pays.get(4),"23/05/1974",banques.get(8), 1234556));
		pays.get(4).contribuables.add(new Contribuable("Vin Diesel",pays.get(4),"07/08/1980",banques.get(9), 987211));
		
		/* Caiman */
		pays.get(5).contribuables.add(new Contribuable("Adam Sandler",pays.get(5),"01/10/1971","CB", 888888, this, 782136));
		pays.get(5).contribuables.add(new Contribuable("Bradley Cooper",pays.get(5),"02/07/1989","Bank of Caiman",20000, this, 2123512));
		pays.get(5).contribuables.add(new Contribuable("George Clooney",pays.get(5),"03/12/1980",banques.get(10), 320900));
		pays.get(5).contribuables.add(new Contribuable("Jack Nicholson",pays.get(5),"09/02/1970",banques.get(11), 100000000));
		
		/* Malte */
		pays.get(6).contribuables.add(new Contribuable("Dwayne Johnson",pays.get(6),"26/02/1956","Banque de developpement Malte",123213, this, 123201));
		pays.get(6).contribuables.add(new Contribuable("Charlie Chaplin",pays.get(6),"21/05/1985","Bank of Malte",1243903, this, 2378412));
		pays.get(6).contribuables.add(new Contribuable("Tom Cruise",pays.get(6),"28/04/1955",banques.get(12), 2792130));
		pays.get(6).contribuables.add(new Contribuable("Omar Sy",pays.get(6),"03/08/1969",banques.get(13), 28328941));
		
		/* Chine */ 
		pays.get(7).contribuables.add(new Contribuable("Bernard Giraudeau",pays.get(7),"25/16/1987","China Construction Bank",1412442, this, 532403));
		pays.get(7).contribuables.add(new Contribuable("Mark Walberg",pays.get(7),"07/09/1972","Bank of China",1231240,this, 6678698));
		pays.get(7).contribuables.add(new Contribuable("Paul Walker",pays.get(7),"24/11/1987",banques.get(14), 1236123));
		pays.get(7).contribuables.add(new Contribuable("Homer Simpson",pays.get(7),"13/10/1984",banques.get(15), 2263239));
		
		/* Inde */
		pays.get(8).contribuables.add(new Contribuable("Robet De Niro",pays.get(8),"07/03/1950","State Bank of India",122134,this, 23521));
		pays.get(8).contribuables.add(new Contribuable("Sean Penn",pays.get(8),"12/02/1958","Axis Bank",24350, this, 555272));
		pays.get(8).contribuables.add(new Contribuable("Jennifer Lawrence",pays.get(8),"09/09/1987",banques.get(16), 78902));
		pays.get(8).contribuables.add(new Contribuable("Liam Neeson",pays.get(8),"30/12/1966",banques.get(17), 66));
		
		/* Singapour */ 
		pays.get(9).contribuables.add(new Contribuable("Humphrey Bogart",pays.get(9),"25/16/1987","DBS", 1341324145,this,12123));
		pays.get(9).contribuables.add(new Contribuable("Colin Firth",pays.get(9),"07/09/1972","Bank of Singapour",12312, this, 231612));
		pays.get(9).contribuables.add(new Contribuable("Ralph Fiennes",pays.get(9),"24/11/1987",banques.get(18), 283137));
		pays.get(9).contribuables.add(new Contribuable("Tom Hanks",pays.get(9),"13/10/1984",banques.get(19), 123762198));
		
	}
	
	/** Initialise les societes des contribuables,
	 *  Crée des societés pour des contribuables aléatoirement selectionnés.
	 */
	public void initSociete()
	{
		/* D'abord selectionne aléatoirement 5 pays parmi les 10 , ils auront des contribuables  
		 * qui possederont des sociétées */
		int i=0,rand;
		ArrayList<Pays> paysChoisis = new ArrayList<Pays>(); // contiendra les 5 pays choisis
		ArrayList<Contribuable> contribuablesPS = new ArrayList<Contribuable>(); //  contiendra les 10 contibuables possedant des sociétés
		String[] nomsSocietes = {"Wayne Entreprises", "Stark Industries", "Queen Consolidated", "Palmer Technologies", "Holowan Laboratories",
				"Chantiers Navals de Kuat", "Umbrella Corporation", "General Emballages", "Soummam", "Cevital", "Sol Entreprise", "Ifri",
				"Select Line Corporation","Maruti","Vault Tech","Keysight Technologies","Egar'Tech","One Republic","Flander's Company",
				"The Daily Planet", "ACME", "Krusty Burger","Duff","Sacre Coeur","Centre nucleaire de M. Burns","International Banana Company"
				,"Boucherie Sanzot","Cyber Panda", "Czerka Corporation", "Cantina de Mos Esley", "Moe's","Chez Watto","Matina","Safina"
				,"Tapidor","Nedjma","Djezzy","Amani","Cosider","Naftal","Sonelgaz",
				"Biopharm","Elsecom"};
		
		while (i<5)
		{
			rand = (int)(Math.random()*10);
			if(paysChoisis.indexOf(pays.get(rand)) == -1) // pour verifier qu'un pays figure une seule fois dans le tableau
			{
				paysChoisis.add(pays.get(rand));
				i+=1;
			}
		}
		i = 0;
		int alea;
		/* selectionne aléatoirement les deux contribuables pour chaque pays , qui posseront des sociétés */
		while(i<5)
		{
			rand = (int)(Math.random()*4);
			alea = (int)(Math.random()*4);
			if(rand != alea)
			{
				contribuablesPS.add(paysChoisis.get(i).contribuables.get(rand));
				contribuablesPS.add(paysChoisis.get(i).contribuables.get(alea));
				i+=1;
			}
		}
		/* crée des sociétés pour tous les contribuables */

		for(i=0;i<nomsSocietes.length;i++)
		{
			creerSocieteAlea(nomsSocietes[i], contribuablesPS, this);
		}
	}
	
	/** Crée les sociétés aléatoirement
	 * @param nom 
	 *			nom de la société.		
	 * @param contribuablesPS
	 * 			liste des contribuables possedant des sociétés.
	 * @param jeu
	 * 			jeu dans lequel les sociétés sont créées.
	 */
	public void creerSocieteAlea(String nom, ArrayList<Contribuable> contribuablesPS, Jeu jeu)
	{
		Random r = new Random();
		int o = r.nextInt(contribuablesPS.size());
		Proprietaire p;
		p = contribuablesPS.get(o);
				
		o = 0;
		while(o != p.possessions.size())
		{
			o = r.nextInt(p.possessions.size()+1);
			if(o < p.possessions.size())
			{
				p = p.possessions.get(o);
			}
		}
		this.societes.add(new Societe(nom, jeu.pays.get(r.nextInt(jeu.pays.size())), p, jeu.banques.get(r.nextInt(jeu.banques.size())), r.nextInt(1000000000)));
	}
	
	/**  Genere aléatoirement la liste des transactions suspectes
	 * 	
	 */
	public void genereTransactionsSuspectes()
	{
		System.out.println("Voici la liste des transactions suspectes : "); 
		/* Selectionne aléatoirement 10 banques parmi les 20 */
		int i=0,rand;
		ArrayList<Banque> banquesChoisies = new ArrayList<Banque>(); // contiendra les 10 banques choisies
		ArrayList<CompteBancaire> comptesSuspectes = new ArrayList<CompteBancaire>(); // contiendra les 20 comptes suspectes
		while (i<10)
		{
			rand = (int)(Math.random()*10);
			if(banquesChoisies.indexOf(banques.get(rand)) == -1) // pour verifier qu'un pays figure une seule fois dans le tableau
			{
				banquesChoisies.add(banques.get(rand));
				i+=1;
			}
		}
		
		/* Selectionne aléatoirement deux comptes suspectes pour chaque banque */
		int alea;
		i=0;
		
		while(i<10)
		{
			rand = (int)(Math.random()*banquesChoisies.get(i).comptes.size());// tirer un chiffre entre 0 et le nombre de comptes
			alea = (int)(Math.random()*banquesChoisies.get(i).comptes.size());
			if(rand != alea)
			{
				comptesSuspectes.add(banquesChoisies.get(i).comptes.get(rand));
				comptesSuspectes.add(banquesChoisies.get(i).comptes.get(alea));
				i+=1;
			}
		}
		
		/* Genere les transactions suspectes */
		for(i=0;i<10;i++)
		{
			int montant= (int)(Math.random()*(comptesSuspectes.get(i).solde-1)+1);
			registre.suspects.add(new Transaction(comptesSuspectes.get(i),comptesSuspectes.get(19-i),montant));
			
		/* Affichage de la liste des transactions suspectes */
			System.out.println((i+1)+"\t"+registre.suspects.get(i)); 
		}
		System.out.println("");
	}	
	
	public CompteBancaire getCompteBancaire(int numCompte) throws IndexOutOfBoundsException
	{
		for(Banque b : banques)
		{
			if(b.banqueNum == (int)numCompte/100)
			{
				return b.comptes.get(numCompte%100-1);
			}
		}
		throw new IndexOutOfBoundsException();
	}
	
	
}
