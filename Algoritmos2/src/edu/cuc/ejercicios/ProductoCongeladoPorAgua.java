
package edu.cuc.ejercicios;

final public class ProductoCongeladoPorAgua extends ProductoCongelado{
    
    protected double salinidadDelAgua;

    public ProductoCongeladoPorAgua( int diaEnvasado, int mesEnvasado, int añoEnvasado,
                                     int diaCaducidad, int mesCaducidad, int añoCaducidad,
                                     float temperaturaRecomendada, double salinidadDelAgua, 
                                     int numeroDeLote, String paisOrigen) {
        
        super(diaEnvasado, mesEnvasado, añoEnvasado, diaCaducidad, mesCaducidad, añoCaducidad, temperaturaRecomendada, numeroDeLote, paisOrigen);
        this.salinidadDelAgua = salinidadDelAgua;
    }
    
    //Getters
    public double getSalinidadDelAgua() {
        return salinidadDelAgua;
    }
    
    //Setters
    public void setSalinidadDelAgua(double salinidadDelAgua) {
        this.salinidadDelAgua = salinidadDelAgua;
    }

    @Override
    public String toString() {
        return "ProductoCongeladoPorAgua{" + "fechaCaducidad: " + this.verFechaCaducidad() 
                +", fechaDeEnvasado: " + this.verFechaDeEnvasado() 
                + ", temperaturaRecomendada: " + temperaturaRecomendada 
                + ", paisOrigen: " + paisOrigen + ", numeroDeLote: " 
                + numeroDeLote + ", salinidadDelAgua: " 
                + salinidadDelAgua + " g de sal / L de agua" + '}';
    }
    
    
    
}
