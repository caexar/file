package edu.cuc.archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class letras_iniciales {
    
    private File archivoObjetivo;
    
    //Constructor

    public letras_iniciales(File archivoObjetivo) {
        this.archivoObjetivo = archivoObjetivo;
    }
    
    public File archivo_de_letras() throws FileNotFoundException{
        Scanner scanner = new Scanner(archivoObjetivo);
        int contador = 0;
        File let = new File("letra.txt");
        String s = scanner.nextLine();
        String[] palabras = s.split(" ");
        contador += palabras.length;
        for (int i = 0; i < palabras.length; i++) {
            char letra = palabras[i].charAt(0);
            try {
                File letras = new File("letra.txt");
                FileWriter escribir = new FileWriter(letras, true);
                escribir.write(letra + " = " + palabras[i]);
                escribir.write("\n");
                escribir.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return  let;
    }
}
    
