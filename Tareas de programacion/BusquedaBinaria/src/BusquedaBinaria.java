public class BusquedaBinaria {


    public static void busquedaBinaria(int[] data, int enteroABuscar) {
        int puntieroInicio = 0;
        int punteroFin = data.length - 1;
        boolean encontrado = false;

        while (puntieroInicio <= punteroFin) {
            int punteroMedio = puntieroInicio + (punteroFin - puntieroInicio) / 2;

            if (data[punteroMedio] == enteroABuscar) {
                System.out.println("El numero " + enteroABuscar + " se encontro en la posicion " + punteroMedio);
                encontrado = true;
                break;
            } else if (data[punteroMedio] < enteroABuscar) {
                puntieroInicio = punteroMedio + 1;
            } else {
                punteroFin = punteroMedio - 1;
            }
        }

        if (!encontrado) {
            System.out.println("El numero " + enteroABuscar + " no se encontro");
        }
    }



}
