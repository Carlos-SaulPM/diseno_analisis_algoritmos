void main() {
probandoBusquedaBinaria();
//probandoBusquedaLineal();
}

static void probandoBusquedaBinaria(){
     //Prueba con 10 elementos
     int datoABuscar = 10;
     int[] data = datosDePrueba(datoABuscar);
     BusquedaBinaria.busquedaBinaria(data, datoABuscar);
     data = null;

     //Prueba con 100 elementos
     datoABuscar = 100;
     data = datosDePrueba(datoABuscar);
     BusquedaBinaria.busquedaBinaria(data, datoABuscar);
     data = null;

     //Prueba con 1,000 elementos
     datoABuscar = 1000;
     data = datosDePrueba(datoABuscar);
     BusquedaBinaria.busquedaBinaria(data, datoABuscar);
     data = null;

     //Prueba con 10,000 elementos
     datoABuscar = 10000;
     data = datosDePrueba(datoABuscar);
     BusquedaBinaria.busquedaBinaria(data, datoABuscar);
     data = null;

     //Prueba con 100,000 elementos
     datoABuscar = 100000;
     data = datosDePrueba(datoABuscar);
     BusquedaBinaria.busquedaBinaria(data, datoABuscar);
     data = null;

     //Prueba con 1,000,000 elementos
     datoABuscar = 1000000;
     data = datosDePrueba(datoABuscar);
     BusquedaBinaria.busquedaBinaria(data, datoABuscar);
     data = null;
}

static void probandoBusquedaLineal() {
     // Prueba con 10 elementos
     int datoABuscar = 10;
     int[] data = datosDePrueba(datoABuscar);
     BusquedaLineal.busquedaLineal(data, datoABuscar);
     data = null;

     // Prueba con 100 elementos
     datoABuscar = 100;
     data = datosDePrueba(datoABuscar);
     BusquedaLineal.busquedaLineal(data, datoABuscar);
     data = null;

     // Prueba con 1,000 elementos
     datoABuscar = 1000;
     data = datosDePrueba(datoABuscar);
     BusquedaLineal.busquedaLineal(data, datoABuscar);
     data = null;

     // Prueba con 10,000 elementos
     datoABuscar = 10000;
     data = datosDePrueba(datoABuscar);
     BusquedaLineal.busquedaLineal(data, datoABuscar);
     data = null;

     // Prueba con 100,000 elementos
     datoABuscar = 100000;
     data = datosDePrueba(datoABuscar);
     BusquedaLineal.busquedaLineal(data, datoABuscar);
     data = null;

     // Prueba con 1,000,000 elementos
     datoABuscar = 1000000;
     data = datosDePrueba(datoABuscar);
     BusquedaLineal.busquedaLineal(data, datoABuscar);
     data = null;
}

static int[] datosDePrueba(int tope){
     int[] data = new int[tope];
     for (int i = 0; i < tope; i++) {
          data[i] = (i+1) *5;
     }
     return data;
}


