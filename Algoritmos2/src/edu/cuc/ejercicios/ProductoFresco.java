/*
 Los productos frescos deben llevar la fecha de envasado y el país de origen. 
 */
package edu.cuc.ejercicios;

import java.util.Calendar;

final public class ProductoFresco extends Producto{
    protected Calendar fechaDeEnvasado;
    protected String paisOrigen;

    public ProductoFresco(int diaEnvasado, int mesEnvasado, int añoEnvasado, 
                          int diaCaducidad, int mesCaducidad, int añoCaducidad,
                          int numeroDeLote, 
                          String paisOrigen) {
        
        super(diaCaducidad, mesCaducidad, añoCaducidad, numeroDeLote);
        Calendar fechaEnvasado = Calendar.getInstance();
        fechaEnvasado.set(añoEnvasado, mesEnvasado, diaEnvasado);
        this.fechaDeEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    //Getters
    public Calendar getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }
    
    public String getPaisOrigen() {
        return paisOrigen;
    }
    
    public String verFechaDeEnvasado() {
        return fechaDeEnvasado.get(Calendar.DATE)+"/"
               +fechaDeEnvasado.get(Calendar.MONTH)+"/"
               +fechaDeEnvasado.get(Calendar.YEAR);
    }
    
    //Setters
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    public void setFechaDeEnvasado(int diaEnvasado, int mesEnvasado, int añoEnvasado) {
        this.fechaDeEnvasado.set(añoEnvasado, mesEnvasado, diaEnvasado);
    }

    @Override
    public String toString() {
        return "ProductoFresco{" + "fechaCaducidad: " + this.verFechaCaducidad() 
                +", fechaDeEnvasado: " + this.verFechaDeEnvasado() 
                + ", paisOrigen: " + paisOrigen + ", numeroDeLote: " 
                + numeroDeLote + '}';
    }
    
    
    
}
