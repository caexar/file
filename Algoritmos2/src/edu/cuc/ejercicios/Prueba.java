/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.ejercicios;

/**
 *
 * @author Ludwing
 */
public class Prueba {
    public static void main(String[] args) {
        Producto obj1 = new Producto(28, 9, 2003, 3);
        System.out.println(obj1+"\n");
        
        ProductoFresco obj2 = new ProductoFresco(01, 1, 2022, 30, 3, 2022, 1, "Polombia");
        System.out.println(obj2+"\n");
        
        ProductoRefrigerado obj3 = new ProductoRefrigerado(02, 1, 2022, 30, 9, 2023, 111, 8.5f, 2, "SoledadGOD");
        System.out.println(obj3+"\n");
        
        ProductoCongelado obj4 = new ProductoCongelado(03, 5, 2022, 15, 11, 2022, 8.5f, 3, "FranciaGOD");
        System.out.println(obj4+"\n");
        
        ProductoCongeladoPorAire obj5 = new ProductoCongeladoPorAire(25, 25, 25, 25, 03, 02, 2022, 06, 07, 2022, 8.5f, 3, "Russia");
        System.out.println(obj5+"\n");
        
        ProductoCongeladoPorAgua obj6 = new ProductoCongeladoPorAgua(17, 8, 2022, 04, 03, 2023, -2.0f, 120, 4, "PeruSIMP");
        System.out.println(obj6+"\n");
        
        ProductoCongeladoPorNitrogeno obj7 = new ProductoCongeladoPorNitrogeno(22, 9, 2022, 11, 2, 2023, -10, "Criogenico", 35, 5, "DisneyLand");
        System.out.println(obj7);
    }

}
