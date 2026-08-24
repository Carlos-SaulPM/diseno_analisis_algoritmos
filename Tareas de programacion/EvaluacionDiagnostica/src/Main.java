import estructuradatos.ArbolTernario;
import estructuradatos.NodoTernario;

public class Main {
    public static void main(String[] args) {

        ArbolTernario<Integer> arbol = new ArbolTernario<>(20);
        NodoTernario<Integer> head = arbol.getHead();

//      Nodo izquierdo
        head.setNodoIzquierdo(23).setNodoMedio(57);
//      Nodo medio
        head.setNodoMedio(19).setNodoDerecho(67).setNodoMedio(99);


        System.out.println(arbol);

//      Nodo 99
        System.out.println(head.getNodoMedio().getNodoDerecho().getNodoMedio().getDato());

//      Nodo 57
        System.out.println(head.getNodoIzquierdo().getNodoMedio().getDato());



    }
}
