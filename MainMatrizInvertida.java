import java.util.Scanner;

public class MainMatrizInvertida {
    public static void main(String[] args)
    {

        MatrizInvertida cambiar = new MatrizInvertida();
        cambiar.setFila(3);
        cambiar.setColumna(3);

        cambiar.mostrarMatriz();
        cambiar.transponerMatriz();
        cambiar.mostrarMatrizFinal();
    }
}
