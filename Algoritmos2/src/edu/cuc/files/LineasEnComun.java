package edu.cuc.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class LineasEnComun {

    static void compararArchivos(File archivo1, File archivo2) throws FileNotFoundException, IOException {
        FileReader fileReader1 = new FileReader(archivo1);
        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

        String lineaActualArchivo1;
        String lineaActualArchivo2;
        File archivo3 = new File("archivoConLineasEnComun.txt");
        archivo3.createNewFile();

        while ((lineaActualArchivo1 = bufferedReader1.readLine()) != null) {
            FileReader fileReader2 = new FileReader(archivo2);
            BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

            while ((lineaActualArchivo2 = bufferedReader2.readLine()) != null) {
                if (lineaActualArchivo1.equals(lineaActualArchivo2)) {

                    Writer writer = new FileWriter(archivo3, true);
                    writer.write(lineaActualArchivo1 + "\n");
                    writer.close();
                }
            }
        }
    }
}
