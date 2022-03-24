package edu.cuc.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GuardarVectorEnArchivotxt {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        //Creacion del archivo
        File archivoVector = new File("vector.txt");
        try {
            archivoVector.createNewFile();
        } catch (IOException ex) {
            Logger.getLogger(GuardarVectorEnArchivotxt.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Pedir el vector al usuario
        System.out.print("Ingrese el tamaño del vector a guardar: ");
        int tamañoVector = entradaTeclado.nextInt();
        System.out.println("\nLLenando vector...");
        int[] vector = new int[tamañoVector];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese un numero: ");;
            vector[i] = entradaTeclado.nextInt();
        }
        System.out.println("\n" + Arrays.toString(vector));

        //Guardar el vector en el archivo
        Writer writer = null;
        try {
            writer = new FileWriter(archivoVector, true);
            writer.write(Arrays.toString(vector) + "\n");
            System.out.println("Vector guardado.");
        } catch (IOException ex) {
            Logger.getLogger(GuardarVectorEnArchivotxt.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarVectorEnArchivotxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
