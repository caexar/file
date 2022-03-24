package edu.cuc.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ContadorDeLineas {

    private File Archivo;

    public ContadorDeLineas(File Archivo) {
        this.Archivo = Archivo;
    }

    public int contarLineas() throws FileNotFoundException, IOException {

        BufferedReader archivoLeido = new BufferedReader(new FileReader(Archivo));
        int contador = 0;

        String lineaActual;
        while ((lineaActual = archivoLeido.readLine()) != null) {
            contador++;
        }

        archivoLeido.close();
        return contador;
    }

}
