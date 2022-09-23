

public class MatrizInvertida {

        int fila;
        int columna;
        public void setFila(int numFila) {fila = numFila;}
        public double getFila() {return fila;}
        public void setColumna(int numColumna) {columna = numColumna;}
        public double getColumna() {return columna;};

        int matriz [][]= {{1,2,3},{4,5,6},{7,8,9}};

            public void mostrarMatriz(){

                System.out.println("mostrando matriz");
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < columna; j++) {
                        System.out.print(matriz[i][j] + "");
                    }
                    System.out.println();
                }
            }
            public void transponerMatriz() {

                System.out.println("transponiendo matriz");
                int aux;
                for (int i = 0; i < fila; i++) {
                    for (int j = 0; j < i; j++) {
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[j][i];
                        matriz[j][i] = aux;
                    }
                }
            }
            public void mostrarMatrizFinal(){

        System.out.println("mostrando matriz transpuesta");
        for (int i=0;i<fila;i++){
            for (int j=0;j<columna;j++){
                System.out.print(matriz[i][j]+"");
            }
            System.out.println();
        }
    }
}

