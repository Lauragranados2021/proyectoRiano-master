package modelo;

/**
 * Clase que me forma los nodos de la lista circular
 * @param <T> por paramentrizacion
 */
public class NodeCircle <T>{
    private T info;
    private NodeCircle<T> next;


    public NodeCircle() {}

    public NodeCircle(T info) {
        this.info = info;
        next = null;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public NodeCircle<T> getNext() {
        return next;
    }

    public void setNext(NodeCircle<T> next) {
        this.next = next;
    }
}
