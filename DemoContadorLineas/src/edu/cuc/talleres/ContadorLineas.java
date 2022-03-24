package edu.cuc.talleres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorLineas {

    private File archivoObjetivo;
    
    //Constructor
    public ContadorLineas(File archivoObjetivo) {
        this.archivoObjetivo = archivoObjetivo;
    }
    
    //Método Contar Lineas
    public int contarLineas() throws FileNotFoundException {
        //Se define una instancia Scanner para acceder al archivo
        Scanner scanner = new Scanner(archivoObjetivo);
        //Se define el contador (resultado) del proceso
        int contadorLineas = 0;
        //Se lee todo el archivo línea por línea, mientras existan líneas disponibles
        while (scanner.hasNextLine()) {            
            scanner.nextLine(); //Se hace la lectura, no se hace nada con la línea.
            contadorLineas++; //Se cuenta la línea leída.
        }
        scanner.close(); //Se cierra el scanner.
        return contadorLineas; 
    }
    
}
