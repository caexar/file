
package edu.cuc.ejercicios;

final public class ProductoCongeladoPorNitrogeno extends ProductoCongelado{
    
    protected String metodoDeCongelacion;
    protected double tiempoDeExposicionAlNitrogeno;

    public ProductoCongeladoPorNitrogeno(int diaEnvasado, int mesEnvasado, int añoEnvasado,
                                         int diaCaducidad, int mesCaducidad, int añoCaducidad, 
                                         float temperaturaRecomendada, String metodoDeCongelacion, 
                                         double tiempoDeExposicionAlNitrogeno, int numeroDeLote,
                                         String paisOrigen) {
        
        super(diaEnvasado, mesEnvasado, añoEnvasado, diaCaducidad, mesCaducidad, añoCaducidad, temperaturaRecomendada, numeroDeLote, paisOrigen);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoDeExposicionAlNitrogeno = tiempoDeExposicionAlNitrogeno;
    }

    //Getters
    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }

    public double getTiempoDeExposicionAlNitrogeno() {
        return tiempoDeExposicionAlNitrogeno;
    }
    
    //Setters
    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }

    public void setTiempoDeExposicionAlNitrogeno(double tiempoDeExposicionAlNitrogeno) {
        this.tiempoDeExposicionAlNitrogeno = tiempoDeExposicionAlNitrogeno;
    }
    
    //ToString
    @Override
    public String toString() {
        return "ProductoCongeladoPorNitrogeno{" + "fechaCaducidad: " + this.verFechaCaducidad() 
                +", fechaDeEnvasado: " + this.verFechaDeEnvasado() 
                + ", temperaturaRecomendada: " + temperaturaRecomendada 
                + ", paisOrigen: " + paisOrigen + ", numeroDeLote: " 
                + numeroDeLote + ", metodoDeCongelacion: " 
                + metodoDeCongelacion + ", tiempoDeExposicionAlNitrogeno: "
                + tiempoDeExposicionAlNitrogeno + " segundos" + '}';
    }
    
}
