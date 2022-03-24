
package edu.cuc.files;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaSumatoria {

    public static void main(String[] args) {
        try {
            File sumatoria = new File("sumatoria.txt");
            SumatoriaDeNumeros prueba1 = new SumatoriaDeNumeros(sumatoria);
            System.out.println(prueba1.sumarNumeros());
        } catch (IOException ex) {
            Logger.getLogger(PruebaSumatoria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
