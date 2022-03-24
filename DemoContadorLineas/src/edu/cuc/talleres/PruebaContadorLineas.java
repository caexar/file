package edu.cuc.talleres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaContadorLineas {
    public static void main(String[] args) {
        //1. Crear la instancia de prueba, teniendo en cuenta que requiere una instancia File
        File archivo1 = new File("archivoejercicio01.txt");
        File archivo2 = new File("salidausuario.txt");
        ContadorLineas conteo1 = new ContadorLineas(archivo1);
        ContadorLineas conteo2 = new ContadorLineas(archivo2);
        try {
            //2. Invocar el método objetivo
            int respuesta1 = conteo1.contarLineas();
            int respuesta2 = conteo2.contarLineas();
            //3. Mostrar la respuesta
            System.out.println("El número de líneas para el archivo1 es: "+respuesta1);
            System.out.println("El número de líneas para el archivo2 es: "+respuesta2);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(PruebaContadorLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
