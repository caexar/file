package demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.Writer;
import java.util.ArrayList;

public class PalabrasPorCadaLetra {

    private File archivo;
    private ArrayList<Character> listaDeLetras;
    private ArrayList<Character> listaDeNumeros;

    public PalabrasPorCadaLetra(File archivo) throws IOException {
        this.archivo = archivo;
        this.listaDeLetras = this.obtenerListaDeLetras();
        this.listaDeNumeros = this.obtenerListaDeNumeros();
    }

    public ArrayList<Character> obtenerListaDeLetras() throws IOException {

        ArrayList<Character> resultado = new ArrayList<Character>();
        StreamTokenizer st = new StreamTokenizer(new FileReader(archivo));

        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            if (st.ttype != StreamTokenizer.TT_WORD) {
                continue;
            }
            if (!resultado.contains(Character.toLowerCase(st.sval.charAt(0)))) {
                resultado.add(Character.toLowerCase(st.sval.charAt(0)));
            }
        }
        return resultado;
    }

    public ArrayList<Character> obtenerListaDeNumeros() throws IOException {

        ArrayList<Character> resultado = new ArrayList<Character>();
        StreamTokenizer st = new StreamTokenizer(new FileReader(archivo));

        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            if (st.ttype != StreamTokenizer.TT_NUMBER) {
                continue;
            }

            if (!resultado.contains(Double.toString(st.nval).charAt(0))) {
                resultado.add(Double.toString(st.nval).charAt(0));
            }
        }

        return resultado;
    }

    public void generarArchivosPorCadaLetraYNumero() throws IOException {
        for (Character letra : listaDeLetras) {

            File archivoDeLetra = new File(letra + ".txt");
            archivoDeLetra.createNewFile();

            Writer writer = new FileWriter(archivoDeLetra);
            StreamTokenizer st = new StreamTokenizer(new FileReader(archivo));

            ArrayList<String> listaDePalabrasAgregadas = new ArrayList<String>();

            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                if (st.ttype != StreamTokenizer.TT_WORD) {
                    continue;
                }

                if (!listaDePalabrasAgregadas.contains(st.sval) && (st.sval.charAt(0) == letra || st.sval.charAt(0) == Character.toUpperCase(letra))) {
                    writer.write(st.sval + "\n");
                    listaDePalabrasAgregadas.add(st.sval);
                }
            }

            writer.close();
            System.out.println("Se ha generado un nuevo archivo con las palabras"
                    + " que empiezan por " + Character.toUpperCase(letra));

        }

        for (Character numero : listaDeNumeros) {

            File archivoDeNumero = new File(numero + ".txt");
            archivoDeNumero.createNewFile();

            Writer writer = new FileWriter(archivoDeNumero);
            StreamTokenizer st = new StreamTokenizer(new FileReader(archivo));

            ArrayList<String> listaDeNumerosAgregados = new ArrayList<String>();

            while (st.nextToken() != StreamTokenizer.TT_EOF) {
                if (st.ttype != StreamTokenizer.TT_NUMBER) {
                    continue;
                }
                if (!listaDeNumerosAgregados.contains(Double.toString(st.nval).charAt(0)) && Double.toString(st.nval).charAt(0) == numero) {
                    if (st.nval % 1 == 0) {
                        writer.write(Integer.toString((int) st.nval) + "\n");
                        listaDeNumerosAgregados.add(Double.toString(st.nval));
                    } else {
                        writer.write(Double.toString(st.nval) + "\n");
                        listaDeNumerosAgregados.add(Double.toString(st.nval));
                    }

                }
            }

            writer.close();
            System.out.println("Se ha generado un nuevo archivo con los números"
                    + " que empiezan por " + numero);

        }
    }
}
