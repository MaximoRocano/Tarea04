
    public class Arreglo {
        int arreglo[];
        int elementos;

        Arreglo() {
            arreglo = new int[6];

            elementos = 0;
        }

        public void setArreglo(int valor) {
            arreglo[elementos++] = valor;
        }

        public void getArreglo() {
            for (int i = 0; i < elementos; i++) {
                System.out.println(arreglo[i]);
            }
        }

        public void buscarValor(int valor) {
            int i;
            for (i = 0; i < elementos; i++) {
                if (arreglo[i] == valor) {
                    break;
                }
            }
            if (i == elementos) {
                System.out.println("No se encontro: " + valor);
            } else {
                System.out.println("Se encontro: " + valor);
            }
        }

        public void cambiarValor() {
            int valorCa = 33;
            int valorC = 71;
            boolean M;
            int i;
            for (i = 0; i < elementos; i++) {
                if (arreglo[i] == valorCa) {
                    arreglo[i] = valorC;
                    M = true;
                }
            }
            if (M = true) {
                System.out.println("Se encontro el valor: " + valorCa + " y se remplazo por " + valorC);
            } else {
                System.out.println("No se encontro: " + valorCa);
            }
        }

        public void eliminarValor(int valorEl) {
            int posicion= 0;
            boolean Ma;
            int i;
            for (i = 0; i < elementos; i++) {
                if (arreglo[i] == valorEl) {
                    posicion=i;
                    Ma = true;
                }
            }
            if (Ma = true) {
                System.out.println("Se encontro y elimino el valor: " + valorEl);
                for (i = posicion; i < elementos-1; i++) {
                    arreglo[i] = arreglo[i + 1];
                }
                for (i = 0; i < elementos-1; i++) {
                    System.out.println(arreglo[i]);
                }

            } else
        {
            System.out.println("No se encontro: " + valorEl);
        }
        }
    }

