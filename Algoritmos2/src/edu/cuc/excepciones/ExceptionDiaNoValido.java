
package edu.cuc.excepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionDiaNoValido extends Exception{

    public ExceptionDiaNoValido() {
    }
    
    public ExceptionDiaNoValido(String msg) {
        super(msg);
    }

    private static boolean anobisiesto(int año) {
        if (((año % 4 == 0) && (año % 100 != 0)) || ((año % 4 == 0)) && (año % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean diaValidoParaMesDe31(int dia) {
        if (dia <= 31 && dia >= 1) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean diaValidoParaMesDe30(int dia) {
        if (dia <= 30 && dia >= 1) {
            return true;
        } else {
            return false;
        }
    }

    static void validarFecha(int dia, int mes, int año) throws ExceptionDiaNoValido, ExceptionMesNoValido, ExceptionAñoNoValido {
        
        ExceptionAñoNoValido.rangoAño(año);
        
        switch (mes) {
            case 1:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 2:
                if (!anobisiesto(año) && (dia > 28 || dia < 1)) {
                    throw new ExceptionDiaNoValido();
                }
                if (anobisiesto(año) && (dia > 29 || dia < 1)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 3:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 4:
                if (!diaValidoParaMesDe30(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 5:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 6:
                if (!diaValidoParaMesDe30(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 7:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 8:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 9:
                if (!diaValidoParaMesDe30(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 10:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 11:
                if (!diaValidoParaMesDe30(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            case 12:
                if (!diaValidoParaMesDe31(dia)) {
                    throw new ExceptionDiaNoValido();
                }
                break;
            default:
                throw new ExceptionMesNoValido();
        }
        
    }
    
    public static void main(String[] args) {
        try {
            int dia = 1;
            int mes = 13;
            int año = 2;
            System.out.println(dia+"/"+mes+"/"+año);
            validarFecha(dia, mes, año);
        } catch (ExceptionDiaNoValido e) {
            System.out.println("Dia no valido");
        } catch (ExceptionMesNoValido ex) {
            System.out.println("Mes no valido");;
        } catch (ExceptionAñoNoValido ex) {
            System.out.println("Año no valido");;
        }
    }
}
