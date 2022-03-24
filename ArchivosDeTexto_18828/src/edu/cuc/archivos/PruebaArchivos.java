package edu.cuc.archivos;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adelahoz6
 */
public class PruebaArchivos {
    public static void main(String[] args) {
        File miArchivo = new File("archivodeprueba.txt");
        System.out.println("Existe?: "+miArchivo.exists());
        File miArchivo1 = new File("manifest.mf");
        System.out.println("Existe?: "+miArchivo1.exists());        
        try {
            miArchivo.createNewFile();
            System.out.println("Archivo creado!!");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(PruebaArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Longitud 1: "+miArchivo1.length());
        System.out.println("Longitud 2: "+miArchivo.length());
    }
}
