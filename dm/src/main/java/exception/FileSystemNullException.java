package exception;

/**
 * Classe FileSystemNullException 
 * 
 * @author LUCIANI Arnaud VASSOUT Vincent
 * 
 * Empeche la creation d'un file systeme avec un nom vide
 */
public class FileSystemNullException extends Exception{
	public FileSystemNullException(){
		super("Impossible de creer un Fichier ou un Repertoire sans nom");
	}
}
