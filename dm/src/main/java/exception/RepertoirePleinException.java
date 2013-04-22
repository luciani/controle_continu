package exception;

/**
 * Classe RepertoirePleinException
 *  
 * @author LUCIANI Arnaud VASSOUT Vincent
 * 
 * Empeche l'ajout d'un element à un repertoire plein
 */
public class RepertoirePleinException extends Exception{
	public RepertoirePleinException(){
		super("Impossible d'ajouter un Fichier ou un Repertoire");
	}
}