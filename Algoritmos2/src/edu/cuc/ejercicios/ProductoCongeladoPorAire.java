/*
Los productos congelados por aire deben llevar la información de la composición
del aire con que fue congelado (% de nitrógeno, % de oxígeno, % de dióxido de
carbono y % de vapor de agua).
 */
package edu.cuc.ejercicios;

final public class ProductoCongeladoPorAire extends ProductoCongelado{
    protected class Aire {
        private float cantidadDeNitrogeno;
        private float cantidadDeOxigeno;
        private float cantidadDeCO2;
        private float cantidadDeVaporDeAgua;

        public Aire(float cantidadDeNitrogeno, float cantidadDeOxigeno, float cantidadDeCO2, float cantidadDeVaporDeAgua) {
            this.cantidadDeNitrogeno = cantidadDeNitrogeno;
            this.cantidadDeOxigeno = cantidadDeOxigeno;
            this.cantidadDeCO2 = cantidadDeCO2;
            this.cantidadDeVaporDeAgua = cantidadDeVaporDeAgua;
        }

        @Override
        public String toString() {
            return "Aire{" + "cantidadDeNitrogeno: %" + cantidadDeNitrogeno 
                    + ", cantidadDeOxigeno: %" + cantidadDeOxigeno 
                    + ", cantidadDeCO2: %" + cantidadDeCO2 + ", cantidadDeVaporDeAgua: %"
                    + cantidadDeVaporDeAgua + '}';
        }

        public float getCantidadDeNitrogeno() {
            return cantidadDeNitrogeno;
        }

        public float getCantidadDeOxigeno() {
            return cantidadDeOxigeno;
        }

        public float getCantidadDeCO2() {
            return cantidadDeCO2;
        }

        public float getCantidadDeVaporDeAgua() {
            return cantidadDeVaporDeAgua;
        }
        

        public void setCantidadDeNitrogeno(float cantidadDeNitrogeno) {
            this.cantidadDeNitrogeno = cantidadDeNitrogeno;
        }

        public void setCantidadDeOxigeno(float cantidadDeOxigeno) {
            this.cantidadDeOxigeno = cantidadDeOxigeno;
        }

        public void setCantidadDeCO2(float cantidadDeCO2) {
            this.cantidadDeCO2 = cantidadDeCO2;
        }

        public void setCantidadDeVaporDeAgua(float cantidadDeVaporDeAgua) {
            this.cantidadDeVaporDeAgua = cantidadDeVaporDeAgua;
        }
        
    }
    
    protected Aire aire;

    public ProductoCongeladoPorAire(float cantidadDeNitrogeno, float cantidadDeOxigeno,
                                    float cantidadDeCO2, float cantidadDeVaporDeAgua, 
                                    int diaEnvasado, int mesEnvasado, int añoEnvasado, 
                                    int diaCaducidad, int mesCaducidad, int añoCaducidad, 
                                    float temperaturaRecomendada, 
                                    int numeroDeLote, String paisOrigen) {
        
        super(diaEnvasado, mesEnvasado, añoEnvasado, diaCaducidad, mesCaducidad, añoCaducidad, temperaturaRecomendada, numeroDeLote, paisOrigen);
        this.aire = new Aire(cantidadDeNitrogeno, cantidadDeOxigeno, cantidadDeCO2, cantidadDeVaporDeAgua);
    }
    
    //Getters
    public Aire getAire() {
        return this.aire;
    }
    
    public String verAire() {
        return this.aire.toString();
    }
    
    //Setters
    public void setAire(float cantidadDeNitrogeno, float cantidadDeOxigeno,
                        float cantidadDeCO2, float cantidadDeVaporDeAgua) {
        this.aire = new Aire(cantidadDeNitrogeno, cantidadDeOxigeno, cantidadDeCO2, cantidadDeVaporDeAgua);
    }
    
    //ToString
    @Override
    public String toString() {
        return "ProductoCongeladoPorAire{" + "fechaCaducidad: " + this.verFechaCaducidad() 
                +", fechaDeEnvasado: " + this.verFechaDeEnvasado() 
                + ", temperaturaRecomendada: " + temperaturaRecomendada 
                + ", paisOrigen: " + paisOrigen + ", numeroDeLote: " 
                + numeroDeLote + "\n"+ this.aire + '}';
    }
}
