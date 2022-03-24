package demo;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaPalabrasPorCadaLetra {

    public static void main(String[] args) {
        File archivo = new File("conteo.txt");
        try {
            PalabrasPorCadaLetra prueba1 = new PalabrasPorCadaLetra(archivo);
            System.out.println(prueba1.obtenerListaDeLetras());
            System.out.println(prueba1.obtenerListaDeNumeros());
            prueba1.generarArchivosPorCadaLetraYNumero();
        } catch (IOException ex) {
            Logger.getLogger(PruebaPalabrasPorCadaLetra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
