package edu.cuc.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorDeLineasV2 {

    private File archivoObjetivo;

    public ContadorDeLineasV2(File archivoObjetivo) {
        this.archivoObjetivo = archivoObjetivo;
    }

    public int contarLineas() throws FileNotFoundException {
        
        Scanner scanner = new Scanner(archivoObjetivo);
        int contadorLineas = 0;
        
        while (scanner.hasNextLine()) {
            scanner.nextLine();
            contadorLineas++;
        }
        
        scanner.close();
        return contadorLineas;
    }

}

