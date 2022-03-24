package edu.cuc.archivos;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EjercicioTexto3 {

    public static void main(String[] args) {
        try {
            File texto = new File("texto.txt");            
            letras_iniciales inicial = new letras_iniciales(texto);
            File respuesta1 = inicial.archivo_de_letras();
            System.out.println("Programa finalizado, guardado en: "+respuesta1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EjercicioTexto3.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
        
    }

}
