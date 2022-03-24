package tallerD2;

import java.io.*;

public class Contador {
    
//3. Diseñe un programa que cuente el número de palabras que
//tienen un archivo de texto proporcionado. Se asume que las
//palabras son separadas por un espacio en blanco al menos
    
    public void contador(String nombreArchivo){
    
        try {

            FileReader file = new FileReader(nombreArchivo); // clase que usamos para leer datos de un archivo
            BufferedReader buffer = new BufferedReader(file); //clase de Java para leer el texto de una secuencia de entrada (como un archivo)
            

            String temp = "";
            int nPalabras = 0;

            while (temp != null) {

                temp = buffer.readLine(); //Para pedirle un String, se usa el método readLine(). Este método lee todos los caracteres tecleados

                String contenedor;
                contenedor = temp;

                String[] arrays = contenedor.split(" "); //El método split() divide un objeto de tipo String en un array (vector) de cadenas mediante la separación de la cadena en subcadenas.

                for (int i = 0; i < arrays.length; i++) {

                    System.out.println("" + arrays[i]); //mostrar las palabras que estan en el arrays o txt
                    nPalabras++; //cuenta las palabras

                }
                System.out.println("el numero de palabra que tiene el archivo es: " + nPalabras);

            }
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
    }
}
    
    
 