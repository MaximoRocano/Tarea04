public class MainArreglos {

        public static void main(String argd[])
        {
            Arreglo arreglo = new Arreglo();

            arreglo.setArreglo(11);
            arreglo.setArreglo(17);
            arreglo.setArreglo(41);
            arreglo.setArreglo(13);
            arreglo.setArreglo(33);
            arreglo.setArreglo(18);

            arreglo.getArreglo();

            arreglo.buscarValor(11);
            arreglo.cambiarValor();
            arreglo.eliminarValor(17);
        }
    }
