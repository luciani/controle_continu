package exception;

/**
 * Classe TailleFichierException
 * 
 * @author LUCIANI Arnaud VASSOUT Vincent
 * 
 * Empeche la creation d'un fichier de taille negative
 */
public class TailleFichierException extends Exception{

	public TailleFichierException(){
		super("Impossible de creer un Fichier de taille negative");
	}
}
