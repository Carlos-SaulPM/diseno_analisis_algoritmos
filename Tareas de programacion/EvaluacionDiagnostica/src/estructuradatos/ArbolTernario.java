package estructuradatos;

public class ArbolTernario<T> {
    private NodoTernario<T> head;

    public ArbolTernario(T head) {
        this.head = new NodoTernario<>(head);
    }

    public NodoTernario<T> getHead() {
        return head;
    }

    @Override
    public String toString() {
        return "ArbolTernario{" +
                "head=" + head +
                '}';
    }
}
