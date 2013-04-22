package filesys;


/**
 * Classe fichier 
 * @author LUCIANI Arnaud VASSOUT Vincent
 * @version 16/04/13
 */
public class Fichier extends FileSystem
{
    private int taille;

    /**
     * Constructeur d'objets fichier
     * 
     * @param taille donné au fichier
     * @param nom du fichier
     */
    public Fichier(String nom, int taille) 
    {
        super(nom,"file");
       
        if(taille >= 0)
        	this.taille = taille;
        
    }
 
    /** 
     * 	Permet de connaître la taille
     * 
     * @return     la taille du fichier
     */
    public int taille()
    {
        return this.taille;
    }
    
    /**
     * Permet de connaître le nom du fichier
     * @see FileSystem
     * @return     le nom du fichier
     */
    public String get_nom()
    {
    	return super.get_nom();
    }

    /**
     * Permet de connaître le type du fichier
     * @return le type du fichier, ici file
     */
    public String get_type()
    {
    	return "file";
    }
}
