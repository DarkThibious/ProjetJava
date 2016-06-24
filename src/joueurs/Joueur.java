package joueurs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Properties;
import java.util.Scanner;

import moteurJeu.*;

/** Joueur est la classe de jeu
 * @author yasmine
 *
 */
public class Joueur 
{
	public Enqueteur enqueteur;
	public ArrayList<ArbrePossessions[]> infos;
	public static int nbJoueurs;
	public static int nbActionsTour;
	public static int nbComptesSuspects;
	
	public Joueur()
	{
		
	}
	
	/**
	 * @param jeu
	 * 			partie de jeu
	 */
	public void faireRequete(Jeu jeu)
	{ 
		int choix;
		System.out.println("Veuillez choisir le compte sur lequel vous voulez enqueter :");
		Scanner sc = new Scanner(System.in);
		choix = sc.nextInt();
		/* en gros choisir un arbre puis choisir un coté, avec des ints,  
		 * if contenu.class = compte, choix d'une banque, sinon choix haut/bas, 
		 * (si on veut les propriétés ou le propriétaire) puis pays
		 * new Requete(this.enqueteur, (Proprietaire) arbreChoisi.contenu, jeu.tableCoop[this.enqueteur.résidence][paysDemande](ou 1 si banque))
		 * OU new Requete(this.enqueteur, (Propriete) arbreChoisi.contenu, jeu.tableCoop[this.enqueteur.résidence][paysDemande]
		 * */
		
		
		System.out.println("");
		
	}
	
	public Pays choisirPays(Jeu jeu)
	{
		int choix = 0;
		boolean done = false;
		Pays pays = null;
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez un pays : ");
		for(Pays p : jeu.pays)
		{
			if(p.enqueteur == null)
			{
				System.out.println(i +" : " + p.nom);
			}
			i++;
		}
		do
		{
			try
			{
				choix = sc.nextInt();
				if(choix > 10 || choix <1)
				{
					done = false;
					System.out.println("Veuillez entrer un nombre entre 1 et 10");
				}
				else
				{
					done = true;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Veuillez entrer un nombre entre 1 et 10");
				sc.next();
			}
		}while(!done);
		pays = jeu.pays.get(choix-1);
		return pays;	
	}
	
	public static Banque choisirBanque(Jeu jeu)
	{
		Banque banque = null;
		int i,choix = 0;
		Scanner sc = new Scanner(System.in);
		boolean done = false;
		System.out.println("Choisissez une banque : ");
		i=1;
		for(Banque b : jeu.banques)
		{
			System.out.println(i +" : " + b.nom);
			i++;
		}
		do
		{
			try
			{
				choix = sc.nextInt();
				if(choix > 20 || choix <1)
				{
					done = false;
					System.out.println("Veuillez entrer un nombre entre 1 et 20");
				}
				else
				{
					done = true;
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println("Veuillez entrer un nombre entre 1 et 20");
				sc.next();
			}
		}while(!done);
		banque = jeu.banques.get(choix-1);
		return banque;
		
	}
	/** Demande à l'utilisateur d'entrer les informations relatives aux joueurs
	 * @param jeu 
	 * 			partie de jeu
	 */
	public void choisirPersonnage(Jeu jeu)
	{
		String nom;
		String anniversaire;
		System.out.println("Entrer le nom de votre personnage : ");
		Scanner sc = new Scanner(System.in);
		nom = sc.next();
		System.out.println("Entrez votre date de naissance : ");
		anniversaire = sc.next();
		this.enqueteur = new Enqueteur(nom, choisirPays(jeu), anniversaire, choisirBanque(jeu), 0);	
	}
	
	public void updateArbre()
	{
		
	}
	
	/** Propose à l'utilisateur la liste des actions qu'il peut effectuer pour qu'il choisisse ce qu'il veut faire
	 * @param jeu
	 * 			Partie de jeu
	 * @param joueurs
	 * 			Les 3 joueurs humains
	 */
	public static void nouvelleRequete(Jeu jeu, Joueur[] joueurs)
	{
		int i,choix = 0;
		boolean done = false;
		for(i=0;i<joueurs.length;i++)
		{
			System.out.println("Joueur "+(i+1));
			System.out.println("Voici la liste d'actions que vous pouvez effectuer(tapez le numero de l'action que vous voulez effectuer) \n " +
					"1. Denoncer contribuable à pays \n " +
					"2. Demander à un enquêteur qui possède une société particulière \n " +
					"3. Demander à un enquêteur quelles sociétés sont detenues par une société ou un contribuable\n " +
					"4. Demander à une banque quelle est la société ou le contribuable deteneur d'un compte bancaire particulier ");
			Scanner sc = new Scanner(System.in);
			do
			{
				try
				{
					choix = sc.nextInt();
					if(choix > 4 || choix <1)
					{
						done = false;
						System.out.println("Veuillez entrer un nombre entre 1 et 4");
					}
					else
					{
						done = true;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println("Veuillez entrer un nombre entre 1 et 4");
					sc.next();
				}
			}while(!done);
			
			switch (choix)
			{
				case 1: System.out.println("choix= "+ 1); break;
				case 2: System.out.println("choix= "+ 2); break;
				case 3: System.out.println("choix= "+ 3); break;
				case 4: 
					System.out.println("choix= "+ 4); 
					Banque banque = choisirBanque(jeu);
					//System.out.println("vous avez choisi la banque"+ banque.nom);
					System.out.println("Entrez le numero de compte dont vous voulez recuperer le deteneur");
					int numCompte = sc.nextInt();
					i=0;
					// verifier que le numero de compte qu'il cherche existe dans la liste des transactions suspectes
					while(i<jeu.registre.suspects.size())
					{
						if(numCompte != jeu.registre.suspects.get(i).source.numero)
						{
							System.out.println("Saisie fausse! Entrez le numero de compte dont vous voulez recuperer le deteneu");
						}				
						i+=1;
					}
					
					break;
					
			}
				
		}
	}
	
	/** Demander à un pays qui est le deteneur d'une societe
	 * @param jeu
	 */
	public Proprietaire demanderDeteneurSociete(Jeu jeu, Pays pays, Societe societe)
	{
		return societe.getProprietaire();
		
	}
	public void option2(Jeu jeu)
	{
		String demande;
		System.out.println("Vous pouvez demander à un pays qui est le deteneur d'une societe");
		System.out.println("Choisissez le pays");
		Scanner sc = new Scanner(System.in);
		demande = sc.next();
		boolean done = false;
		// Verifier que le pays qu'il a saisi figure bien dans la liste des pays
		do
		{
			for(Pays p : jeu.pays)
			{
				if(p.nom.equals(demande))
				{
					done = true;
				}
				else
				{
					done = false;
					System.out.println("Choisissez le pays");
					demande = sc.next();
				}
			}
			
		}while(!done);
		System.out.println("Choisissez la societe sur laquelle vous enquetez");
		demande = sc.next();
		done = false;
		// Verifier que la societe qu'il a saisi figure bien dans la liste des societes
		Societe societeEnquete;
		do
		{
			societeEnquete = getSociete(jeu,demande) ;
			if(societeEnquete!= null)
			{
				done = true;
			}
			else 
			{
				done = false;
				System.out.println("Choisissez la societe sur laquelle vous enquetez");
				demande = sc.next();
				
			}
		}while(!done);
		//appeller le constructeur de requete avec societeEnquete
	}
	/** Prend en parametre le jeu et un nom de societe si ce nom figure dans la liste des societes retourner l'objet sinon retourner null
	 * @param jeu
	 * @param nomSociete
	 * @return
	 */
	public static Societe getSociete(Jeu jeu,String nomSociete)// throws IOException
	{
		for(Societe s : jeu.societes )
		{
			if(s.nom.equals(nomSociete))
			{ 
				return(s);
			}
		}
		//throw new IOException();
		return null;
	}
	/** Retourne la liste des proprietes d'un proprietaire
	 * @param jeu
	 * @param proprietaire
	 * @return
	 */
	public ArrayList<Propriete> demanderProprietesProprietaire(Jeu jeu, Proprietaire proprietaire)
	{
		ArrayList<Propriete> possessionsProprietaire = new ArrayList<Propriete>();
		for(Propriete p : proprietaire.possessions)
		{
			possessionsProprietaire.add(p);
		}
		return null;
		
	}
	public String toString()
	{
		String s = this.enqueteur.toString();
		return s;
	}
	
	/**
	 * @param jeu
	 * 			partie de jeu
	 * @param joueurs
	 * 			les 3 joueurs humains
	 */
	public static void initInfos(Jeu jeu, Joueur[] joueurs)
	{
		for(Joueur j : joueurs)
		{
			j.infos = new ArrayList<ArbrePossessions[]>();
			for(Transaction t : jeu.registre.suspects)
			{
				ArbrePossessions[] a = new ArbrePossessions[2];
				a[0] = new ArbrePossessions(t.source);
				a[1] = new ArbrePossessions(t.destination);
				j.infos.add(a);
			}
		}
	}
	
	/** Initialise les joueurs à partir de ce que les utilisateurs ont tapé dans la console
	 * @param jeu
	 * 			partie de jeu
	 * @param joueurs
	 * 			les 3 joueurs humains
	 */
	public static void initialiserJoueurs(Jeu jeu, Joueur[] joueurs)
	{
		int i;
		
		for(i=0 ; i<joueurs.length ; i++)
		{
			System.out.println("Joueur "+(i+1));
			joueurs[i] = new Joueur();
			joueurs[i].choisirPersonnage(jeu);
		}
		System.out.println("");
		System.out.println("Voici le récapitulatif des joueurs crées : ");

		i=0;
		for(Joueur j : joueurs)
		{
			i++;
			System.out.println("Joueur " + i +" : "+ j);
		}
	}
	/** Initialise les proprietes du jeu à partir du fichier 
	 * 
	 */
	public static void recupereProprietes()
	{
		try
		{
			InputStream stIn = new FileInputStream("proprietesJeu.properties");
			Properties myProp = new Properties();
			myProp.load(stIn);
			nbJoueurs = Integer.parseInt(myProp.getProperty("nbJoueurs"));
			nbActionsTour = Integer.parseInt(myProp.getProperty("nbActionsTour"));
			nbComptesSuspects = Integer.parseInt(myProp.getProperty("nbComptesSuspects"));
			stIn.close();
		}
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Fichier non trouvé");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Jeu jeu = new Jeu();
		Joueur joueurs[];
		
		
		System.out.println("Offshore game");
		jeu.initPays();
		jeu.initContribuables();
		//initJoueurs

		recupereProprietes();
		joueurs = new Joueur[nbJoueurs];
		initialiserJoueurs(jeu,joueurs);
		jeu.initSociete();
		jeu.genereTransactionsSuspectes();
		nouvelleRequete(jeu,joueurs);
	}
}
