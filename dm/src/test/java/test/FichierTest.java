package test;

import static org.junit.Assert.*;

import org.junit.*;


import exception.*;
import filesys.Fichier;


/**
 * Classe FichierTest Test les methodes de la classe test. 
 * @author LUCIANI Arnaud VASSOUT Vincent
 * @version 16/04/13
 */
public class FichierTest {

	/**
	 * Teste la creation d'un fichier en vérifiant que le fichier a un nom.
	 * Que sa taille est positive.
	 */
	@Test
	public void testFichier(){
		try{
	        Fichier f1 = new Fichier("test1", 10);
	        assertNotNull(f1);
	        Fichier f2 = new Fichier("test2", -2);
	        
		}catch(FileSystemNullException eFile){
			System.out.println(eFile.getMessage());
		}catch(TailleFichierException eTaille){
			System.out.println(eTaille.getMessage());
		}
		
		try{
			Fichier f3 = new Fichier("", 50);
		}catch(TailleFichierException eTaille){
			System.out.println(eTaille.getMessage());
		}catch(FileSystemNullException eFile){
			System.out.println(eFile.getMessage());
		}
    }
	
	/**
	 * Teste l'affectation de la taille à un fichier
	 */
    @Test
    public void TestTaille(){
    	try{
        Fichier f1 = new Fichier("test1", 2);
        assertTrue(f1.taille() == 2);
    	}catch(FileSystemNullException eFile){
			System.out.println(eFile.getMessage());
		}catch(TailleFichierException eTaille){
			System.out.println(eTaille.getMessage());
		}
    }
}
  