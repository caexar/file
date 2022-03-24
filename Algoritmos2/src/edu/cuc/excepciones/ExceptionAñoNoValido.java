
package edu.cuc.excepciones;

public class ExceptionAñoNoValido extends Exception{

    public ExceptionAñoNoValido() {
    }

    public ExceptionAñoNoValido(String msg) {
        super(msg);
    }
    
    static void rangoAño(int año) throws ExceptionAñoNoValido {
        if (año < 1900) {
            throw new ExceptionAñoNoValido();
        }
    }
}
