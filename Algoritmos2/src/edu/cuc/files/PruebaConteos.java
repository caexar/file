package edu.cuc.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaConteos {

    public static void main(String[] args){
        File archivo1 = new File("conteo.txt");
        ContadorDeLineas conteoLineas = new ContadorDeLineas(archivo1);

        try {
            int nLineas = conteoLineas.contarLineas();
            System.out.println("El numero de lineas es: " + nLineas);
        } catch (IOException ex) {
            Logger.getLogger(PruebaConteos.class.getName()).log(Level.SEVERE, null, ex);
        }

        ContadorDePalabras conteoPalabras = new ContadorDePalabras(archivo1);

        try {
            int nPalabras = conteoPalabras.contarPalabras();
            System.out.println("El numero de palabras es: " + nPalabras);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PruebaConteos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PruebaConteos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ContadorDePalabrasV2 conteoPalabras2 = new ContadorDePalabrasV2(archivo1);
        
        try {
            int nPalabras = conteoPalabras2.contarPalabras();
            System.out.println("El numero de palabras con la version 2 es :"+nPalabras);
        } catch (IOException ex) {
            Logger.getLogger(PruebaConteos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
