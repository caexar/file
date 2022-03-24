/*
Los productos congelados deben llevar la fecha de envasado, el país de origen
y la temperatura de mantenimiento recomendada.Hay tres tipos de productos
congelados: congelados por aire, congelados por agua y congelados por nitrógeno.
 */
package edu.cuc.ejercicios;

import java.util.Calendar;

public class ProductoCongelado extends Producto{
    protected Calendar fechaDeEnvasado;
    protected String paisOrigen;
    protected float temperaturaRecomendada;

    public ProductoCongelado(int diaEnvasado, int mesEnvasado, int añoEnvasado,
                             int diaCaducidad, int mesCaducidad, int añoCaducidad,                                                            
                             float temperaturaRecomendada, 
                             int numeroDeLote,                                 
                             String paisOrigen) {
        
        super(diaCaducidad, mesCaducidad, añoCaducidad, numeroDeLote);
        Calendar fechaEnvasado = Calendar.getInstance();
        fechaEnvasado.set(añoEnvasado, mesEnvasado, diaEnvasado);
        this.fechaDeEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    //Getters
    public Calendar getFechaDeEnvasado() {
        return fechaDeEnvasado;
    }
    
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public float getTemperaturaRecomendada() {
        return temperaturaRecomendada;
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

    public void setTemperaturaRecomendada(float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }
    
    public void setFechaDeEnvasado(int diaEnvasado, int mesEnvasado, int añoEnvasado) {
        this.fechaDeEnvasado.set(añoEnvasado, mesEnvasado, diaEnvasado);
    }
    
    @Override
    public String toString() {
        return "ProductoCongelado{" + "fechaCaducidad: " + this.verFechaCaducidad() 
                +", fechaDeEnvasado: " + this.verFechaDeEnvasado() 
                + ", temperaturaRecomendada: " + temperaturaRecomendada 
                + ", paisOrigen: " + paisOrigen + ", numeroDeLote: " 
                + numeroDeLote + '}';
    }
}
