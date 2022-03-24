package tallerD2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GuardarArrayenTxt {
    
    
    public static void main(String[] args) {
//        int cantNumeros;
        
        //crear el archivo
        File archiVector = new File("ArchivoVector.txt");
        
        try { 
            archiVector.createNewFile();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(GuardarArrayenTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        //vector
        Scanner scanner = new Scanner(System.in);
//       cantNumeros = Integer.parseInt(JOptionPane.showInputDialog("ingrese el tamaño del vector: "));
        System.out.println("ingrese el tamaño del vecotr");
        int cantNumeros = scanner.nextInt();
        
       int vectorNum [] = new int [cantNumeros];
        for (int i = 0; i < cantNumeros; i++) {
            int num;
//            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero ["+(i+1)+"]: "));
            System.out.println("ingrese el numero ["+(i+1)+"]: ");
            num = scanner.nextInt();
            vectorNum[i]=num;
        } 
        //escribir en el archivo e.e.e
        FileWriter escribir = null;
        
        try {
            escribir = new FileWriter(archiVector);
            escribir.write(Arrays.toString(vectorNum)+"\n");
            System.out.println("gg");
        } catch (IOException ex) { 
            java.util.logging.Logger.getLogger(GuardarArrayenTxt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }finally{
            try {
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(GuardarArrayenTxt.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //lectura de prueba
        
            
        try {
            Scanner lector = new Scanner(archiVector);
            while (lector.hasNext()){
                System.out.println("la linea es: "+ lector.nextLine());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GuardarArrayenTxt.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
        
    }
    
}
