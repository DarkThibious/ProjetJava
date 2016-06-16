package joueurs;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import sun.org.mozilla.javascript.tools.shell.QuitAction;

import moteurJeu.*;

public class Joueur {
	public Enqueteur enqueteur;

	public Joueur()
	{
		
	}
	
	public void faireRequete(Jeu jeu)
	{ 
		int choix = 0;
		boolean done = false;
		Scanner sc = new Scanner(System.in);
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
		Transaction t= jeu.registre.suspects.get(choix-1);
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
				pays = jeu.pays.get(choix-1);
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
	
	public String toString()
	{
		String s = this.enqueteur.toString();
		return s;
	}
	
	/**
	 * @param jeu
	 * @param joueurs
	 */
	public static void initialiserJoueurs(Jeu jeu,ArrayList<Joueur> joueurs)
	{
		int nbJoueurs = 0,i;
		System.out.println("Entrez le nombre de joueurs (Maximum 3) : ");
		boolean done = false;
		do
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				nbJoueurs = sc.nextInt();
				if(nbJoueurs > 3)
				{
					done = false;
					System.out.println("... 3 joueurs MAX, GRRRRRR");
				}
				else
				{
					done = true;
				}
				
			}
			catch(InputMismatchException e)
			{
				System.out.println("Veuillez entrer un nombre");
			}
			
		}while(!done);
		if(nbJoueurs == 0)
		{
			System.out.println("Ah ? Bon, au revoir alors...");
			System.exit(0);
		}
		
		for(i=0 ; i<nbJoueurs ; i++)
		{
			System.out.println("Joueur "+(i+1));
			Joueur j = new Joueur();
			joueurs.add(j);
			j.choisirPersonnage(jeu);
		}
		if(nbJoueurs==1)
		{
			System.out.println("");
			System.out.println("Voici le récapitulatif du joueur crée : ");
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
		ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
		
		System.out.println("Offshore game");
		jeu.initPays();
		jeu.initContribuables();
		initialiserJoueurs(jeu,joueurs);
		jeu.initSociete();
		jeu.genereTransactionsSuspectes();

	}
}
