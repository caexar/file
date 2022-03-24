
package edu.cuc.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.util.ArrayList;

public class NumeroDeAparcionesPorPalabra {
    
    private File archivo;
    private ArrayList<String> listaDePalabras = new ArrayList<String>();

    public NumeroDeAparcionesPorPalabra(File archivo) throws IOException {
        this.archivo = archivo;
        this.listaDePalabras = this.obtenerListaDePalabras();
    }
    
    public ArrayList<String> obtenerListaDePalabras() throws FileNotFoundException, IOException {
        ArrayList<String> resultado = new ArrayList<String>();
        StreamTokenizer st = new StreamTokenizer(new FileReader(archivo));
        
        while (st.nextToken() != StreamTokenizer.TT_EOF) {            
            if (st.ttype != StreamTokenizer.TT_WORD) {
                continue;
            }
            if (!resultado.contains(st.sval.toLowerCase())) {
                resultado.add(st.sval.toLowerCase());
            }
        }
        
        return resultado;
    }
    
    public void ContarPalabras() throws FileNotFoundException, IOException {
        File archivoContador = new File("archivoContadorPalabras.txt");
        archivoContador.createNewFile();
        Writer writer = new FileWriter(archivoContador);
        
        
        for (String palabra : listaDePalabras) {
            StreamTokenizer st = new StreamTokenizer(new FileReader(archivo));
            int nApariciones = 0;
            while (st.nextToken() != StreamTokenizer.TT_EOF) {                
                if (st.ttype != StreamTokenizer.TT_WORD) {
                    continue;
                }
                if (st.sval.equalsIgnoreCase(palabra)) {
                    nApariciones++;
                }
            }
            writer.write("Apariciones de '"+palabra+"' = "+nApariciones+"\n");
        }
        
        writer.close();
    }
    
}
