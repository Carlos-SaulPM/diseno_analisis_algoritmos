public class BusquedaLineal {

    public static void busquedaLineal(int[] data, int enteroABuscar) {
        boolean encontrado = false;

        for (int i = 0; i < data.length; i++) {
            if (data[i] == enteroABuscar) {
                System.out.println("El numero " + enteroABuscar + " se encontro en la posicion " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("El numero " + enteroABuscar + " no se encuentro en el array");
        }
    }

}