/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vectortexto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gian Castro
 */
public class AlmacenarVectorEnteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    //CREAMOS EL OBJETO ARCHIVO A UTILIZAR
     File archivo01 = new File ("archivoEjercicio02.txt");
    //CREAMOS EL ARCHIVO DENTRO DE TRY CATCH
     try {
     archivo01.createNewFile();
         System.out.println("Archivo creado exitosamente!");
     } catch (IOException ex){
         System.out.println(ex.getMessage());
            Logger.getLogger(AlmacenarVectorEnteros.class.getName()).log(Level.SEVERE, null, ex);
     }
   
  
     //CREAMOS EL SCANNER PARA CAPTURAR LOS NÚMEROS
    Scanner scanner = new Scanner (System.in);
     //PEDIMOS LA CANTIDAD DE NUMEROS A INGRESAR
    System.out.println("Ingrese el tamaño del vector: ");
       int numeroElementos = scanner.nextInt();

    //CREAMOS EL VECTOR
     int [] vectorNumeros = new int [numeroElementos];
   
    //PEDIMOS LOS NÚMEROS A ALMACENAR EN EL VECTOR
       
        for (int i = 0; i < numeroElementos; i++) {
           System.out.println((i+1)+".Ingrese el digito: ");
           vectorNumeros[i] = scanner.nextInt();
      
        }
    //ESCRIBIR EL VECTOR EN EL ARCHIVO DE TEXTO 
    FileWriter writer = null;

    try { 
       writer = new FileWriter (archivo01);
       writer.write(Arrays.toString(vectorNumeros)+ "\n");
        System.out.println("Vector escrito exitosamente!");


  } catch (IOException ex){
   System.out.println(ex.getMessage());
     Logger.getLogger(AlmacenarVectorEnteros.class.getName()).log(Level.SEVERE, null, ex);

  } finally {
  try { 
    writer.close();
  } catch (IOException ex){
Logger.getLogger(AlmacenarVectorEnteros.class.getName()).log(Level.SEVERE, null, ex);
 } 


  }
        
     



    }
    
}
