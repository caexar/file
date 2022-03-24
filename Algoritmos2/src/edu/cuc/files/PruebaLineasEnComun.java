package edu.cuc.files;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaLineasEnComun {

    public static void main(String[] args) {
        try {
            File texto1 = new File("texto1.txt");
            File texto2 = new File("texto2.txt");

            LineasEnComun.compararArchivos(texto1, texto2);
        } catch (IOException ex) {
            Logger.getLogger(PruebaLineasEnComun.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
