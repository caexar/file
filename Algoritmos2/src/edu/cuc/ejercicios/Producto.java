/*
Diseñar una jerarquía de clases para una empresa agroalimentaria que trabaja
con tres tipos de productos: productos frescos, productos refrigerados y
productos congelados. Todos los productos llevan esta información común:
fecha de caducidad y número de lote. 
A su vez, cada tipo de producto lleva alguna información específica. 
 */
package edu.cuc.ejercicios;

import java.util.Calendar;

public class Producto {
    
    protected Calendar fechaCaducidad;
    protected int numeroDeLote;

    public Producto(int dia, int mes, int año, int numeroDeLote) {
        Calendar fechaCaducidad = Calendar.getInstance();
        fechaCaducidad.set(año, mes, dia);
        this.fechaCaducidad = fechaCaducidad;
        this.numeroDeLote = numeroDeLote;
    }
    
    //Getters
    public Calendar getFechaCaducidad() {
        return fechaCaducidad;
    }
    
    public String verFechaCaducidad() {
        return fechaCaducidad.get(Calendar.DATE)+"/"
               +fechaCaducidad.get(Calendar.MONTH)+"/"
               +fechaCaducidad.get(Calendar.YEAR);
    }

    public int getNumeroDeLote() {
        return numeroDeLote;
    }
    
    //Setters
    public void setFechaCaducidad(int dia, int mes, int año) {
        this.fechaCaducidad.set(año, mes, dia);
    }

    public void setNumeroDeLote(int numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Producto{" + "fechaCaducidad: " + this.verFechaCaducidad() + ", numeroDeLote: " + numeroDeLote + '}';
    }
    
    
    
}
