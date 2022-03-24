
package edu.cuc.excepciones;

public class ExceptionMesNoValido extends Exception{

    public ExceptionMesNoValido() {
    }

    public ExceptionMesNoValido(String msg) {
        super(msg);
    }
    
    static void rangoMes(int numero) throws ExceptionMesNoValido{
        if (numero < 1 || numero > 12) {
            throw new ExceptionMesNoValido();
        }
    }
}
