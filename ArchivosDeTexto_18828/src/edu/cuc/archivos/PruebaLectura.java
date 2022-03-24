package edu.cuc.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adelahoz6
 */
public class PruebaLectura {

    public static void main(String[] args) {
        try {
            File miArchivo = new File("archivodeprueba1.txt");
            Scanner scanner = new Scanner(miArchivo);
            //Lectura
            while (scanner.hasNextLine()) {
                System.out.println("Linea: " + scanner.nextLine());
            }
//            System.out.println("Linea: "+scanner.nextLine());
//            System.out.println("?: "+scanner.next());
//            System.out.println("?: "+scanner.next());
            //Cierre del scanner
            scanner.close();
            System.out.println("Fin del programa!");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(PruebaLectura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
