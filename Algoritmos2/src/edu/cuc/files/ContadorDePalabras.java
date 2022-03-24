package edu.cuc.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class ContadorDePalabras {

    private File Archivo;

    public ContadorDePalabras(File Archivo) {
        this.Archivo = Archivo;
    }

    public int contarPalabras() throws FileNotFoundException, IOException {

        StreamTokenizer st = new StreamTokenizer(new FileReader(Archivo));
        int contador = 0;

        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            if (st.ttype == StreamTokenizer.TT_WORD) {
                contador++;
            }
        }

        return contador;
    }
}
