package estructuradatos;

public class NodoTernario<T> {
    NodoTernario<T> nodoIzquierdo;
    NodoTernario<T> nodoDerecho;
    NodoTernario<T> nodoMedio;
    private T dato;

    public NodoTernario() {
    }

    public NodoTernario(T dato) {
        this.dato = dato;
    }

    public NodoTernario<T> setNodoIzquierdo(T dato) {
        this.nodoIzquierdo = new NodoTernario<>(dato);
        return this.nodoIzquierdo;
    }

    public NodoTernario<T> setNodoDerecho(T dato) {
        this.nodoDerecho = new NodoTernario<>(dato);
        return this.nodoDerecho;
    }

    public NodoTernario<T> setNodoMedio(T dato) {
        this.nodoMedio = new NodoTernario<>(dato);
        return this.nodoMedio;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoTernario<T> getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoTernario<T> getNodoDerecho() {
        return nodoDerecho;
    }

    public NodoTernario<T> getNodoMedio() {
        return nodoMedio;
    }

    public T getDato() {
        return dato;
    }

    @Override
    public String toString() {
        return "NodoTernario{" +
                "\ndato= " + dato + " "+
                "nodoIzquierdo=" + nodoIzquierdo +
                ", nodoMedio=" + nodoMedio +
                ", nodoDerecho=" + nodoDerecho +
                "}\n\t";
    }
}
