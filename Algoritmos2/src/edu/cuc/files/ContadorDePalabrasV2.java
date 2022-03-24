package edu.cuc.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ContadorDePalabrasV2 {

    private File Archivo;

    public ContadorDePalabrasV2(File Archivo) {
        this.Archivo = Archivo;
    }

    public int contarPalabras() throws FileNotFoundException, IOException {

        Scanner scanner = new Scanner(Archivo);
        String lineActual = scanner.nextLine();
        int contador = 0;

        while (lineActual != null) {
            StringTokenizer st = new StringTokenizer(lineActual);
            contador += st.countTokens();
            if (!scanner.hasNextLine()) {
                break;
            }
            lineActual = scanner.nextLine();
        }
        
        scanner.close();
        return contador;

    }
}
