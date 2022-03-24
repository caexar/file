package leer_txt_consola;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PruebaEscrituraConsola {
    
    public static void main(String[] args) {
        
        
        try {
            Scanner entrada = new Scanner (System.in);
            
            System.out.println("escriba los valores: ");
            String valores = entrada.nextLine();
            
            FileWriter fw = new FileWriter("Prueba.txt");
            
            fw.write(valores);
            
            fw.close();
        }catch (IOException e){
            System.out.println("error "+ e.getMessage());
        }
    }
    
}
