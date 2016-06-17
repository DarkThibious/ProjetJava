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

/**Joueur est la classe ...
 * @author yasmine
 *
 */
public class Joueur 
{
	public Enqueteur enqueteur;
	public ArrayList<ArbrePossessions[]> infos;
	
	public Joueur()
	{
		
	}
	
	/**
	 * @param jeu
	 */
	public void faireRequete(Jeu jeu)
	{ 
		int choix;
		boolean done = false;
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
	
	/**
	 * @param jeu
	 */
	public void choisirPersonnage(Jeu jeu)
	{
		String nom,anniversaire;
		Pays pays = null;
		Banque banque = null;
		int choix = 0;
		boolean done = false;
		System.out.println("Entrer le nom de votre personnage : ");
		Scanner sc = new Scanner(System.in);
		nom = sc.next();
		System.out.println("Veuillez entrer un nombre");
		System.out.println("Choisissez un pays : ");
		int i=1;
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
			}
		}while(!done);
		pays = jeu.pays.get(choix-1);
		System.out.println("Entrez votre date de naissance : ");
		anniversaire = sc.next();
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
			}
		}while(!done);
		banque = jeu.banques.get(choix-1);
		this.enqueteur = new Enqueteur(nom, pays, anniversaire, banque, 0);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		String s = this.enqueteur.toString();
		return s;
	}
	
	/**
	 * @param jeu
	 * @param joueurs
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
	
	/**
	 * @param jeu
	 * @param joueurs
	 */
	public static void initialiserJoueurs(Jeu jeu, Joueur[] joueurs, int nbJoueurs)
	{
		int i;
		
		for(i=0 ; i<nbJoueurs ; i++)
		{
			System.out.println("Joueur "+(i+1));
			joueurs[i] = new Joueur();
			joueurs[i].choisirPersonnage(jeu);
		}
		if(nbJoueurs==1)
		{
			System.out.println("");
			System.out.println("Voici le récapitulatif du joueur crée :");
		}
		if(nbJoueurs > 1)
		{
			System.out.println("");
			System.out.println("Voici le récapitulatif des joueurs crées : ");
		}
		i=0;
		for(Joueur j : joueurs)
		{
			i++;
			System.out.println("Joueur " + i +" : "+ j);
		}
		
	}
	public static void main(String[] args) 
	{
		Jeu jeu = new Jeu();
		Joueur joueurs[];
		int nbJoueurs = 0;
		int nbTourJoueurs = 0;
		
		
		System.out.println("Offshore game");
		jeu.initPays();
		jeu.initContribuables();
		//initJoueurs
		try
		{
			InputStream stIn = new FileInputStream("test.properties");
			Properties myProp = new Properties();
			myProp.load(stIn);
			nbJoueurs = Integer.parseInt(myProp.getProperty("nbJoueurs"));
			nbTourJoueurs = Integer.parseInt(myProp.getProperty("nbTourJoueurs"));
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
		joueurs = new Joueur[nbJoueurs];
		
		System.out.println("nbJoueurs "+nbJoueurs+"nbTour "+nbTourJoueurs);
		initialiserJoueurs(jeu,joueurs, nbJoueurs);
		jeu.initSociete();
		jeu.genereTransactionsSuspectes();
	}
}
