package tallerD2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaContadorLineas {

    public static void main(String[] args) {
        
        File archivo1 = new File("conteo.txt");
        ContadorDeLineas conteoLineas = new ContadorDeLineas(archivo1);

        try {
            int nLineas = conteoLineas.contarLineas();
            System.out.println("El numero de lineas es: " + nLineas);
        } catch (IOException ex) {
            Logger.getLogger(PruebaContadorLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
