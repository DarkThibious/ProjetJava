package joueurs;

import java.util.ArrayList;

public class ArbrePossessions 
{
	ArbrePossessions possesseur;
	ArrayList<ArbrePossessions> possede;
	Object contenu;
	
	public ArbrePossessions(Object cont)
	{
		contenu = cont;
		possede = new ArrayList<ArbrePossessions>();
		possesseur = null;
	}
	
	public static ArbrePossessions getRacine(ArbrePossessions arbre)
	{
		while(arbre != null)
		{
			arbre = arbre.possesseur;
		}
		return arbre;
	}
}
