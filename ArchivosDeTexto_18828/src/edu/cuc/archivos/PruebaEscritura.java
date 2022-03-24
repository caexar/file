
package edu.cuc.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adelahoz6
 */
public class PruebaEscritura {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            File miArchivo = new File("archivodeprueba1.txt");
            writer = new FileWriter(miArchivo, true);
            writer.write("Esta es la primera línea en el archivo. adas\n");
            writer.write("Segunda línea. adasaaaaa\n");
            writer.write("Final. chao");
            System.out.println("Programa terminado!");
        } catch (IOException ex) {
            Logger.getLogger(PruebaEscritura.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(PruebaEscritura.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
