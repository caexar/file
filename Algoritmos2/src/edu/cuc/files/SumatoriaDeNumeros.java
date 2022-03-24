
package edu.cuc.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class SumatoriaDeNumeros {
    
    private File archivo;

    public SumatoriaDeNumeros(File archivo) {
        this.archivo = archivo;
    }
    
    public int sumarNumeros() throws FileNotFoundException, IOException {
        StreamTokenizer st = new  StreamTokenizer(new FileReader(archivo));
        int sumatoria = 0;
        while (st.nextToken() != StreamTokenizer.TT_EOF) {            
            if (st.ttype != StreamTokenizer.TT_NUMBER) {
                continue;
            }
            sumatoria += (int)st.nval;
        }
        return sumatoria;
    }
}
