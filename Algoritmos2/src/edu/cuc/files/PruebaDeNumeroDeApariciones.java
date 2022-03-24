
package edu.cuc.files;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaDeNumeroDeApariciones {

    public static void main(String[] args) {
        
        File archivo = new File("conteopalabras.txt");
        try {
            NumeroDeAparcionesPorPalabra prueba1 = new NumeroDeAparcionesPorPalabra(archivo);
            prueba1.ContarPalabras();
        } catch (IOException ex) {
            Logger.getLogger(PruebaDeNumeroDeApariciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
