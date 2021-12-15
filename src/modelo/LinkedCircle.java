package modelo;

import java.util.ArrayList;
//import java.util.Comparator;

public class LinkedCircle <T>{
    private NodeCircle<T> head;
    //private Comparator<T> comparator;

    /**
     * Metodo que comprueba que la lista esta vacia
     * @return booleano : true si esta vacio  y false si contiene algo la cabeza
     */
    public boolean isEmpy(){
        if (head == null){
            return true;
        }
        return false;
    }

    /**
     * Metodo que agrega nodos a la lista circular
     * @param info informacion del nodo a agregar
     */
    public void addNode(T info){
        NodeCircle<T> nodeNew= new NodeCircle<>(info);
        //BinaryTree<T> tor = new BinaryTree<>((numeOne, numeTwo) -> comparator.compare(numeOne, numeTwo));
        if (isEmpy()){
            head = nodeNew;
            head.setNext(nodeNew);
            //tor.addNode(nodeNew.getInfo());
        } else {
            nodeNew.setNext(head.getNext());
            //tor.addNode(nodeNew.getInfo());
            head.setNext(nodeNew);
        }
    }

    /**
     * Obtiene el arrayList con los datos de la lista
     * @return Todos los datos que agregue en la lista (formato cola)
     */
    public ArrayList<T> getLinkedCircle(){
        ArrayList<T> out = new ArrayList<>();
        NodeCircle<T> aux = new NodeCircle<>();
        aux = head;
        do {
            out.add(aux.getNext().getInfo());
            aux = aux.getNext();
        }while (aux != head);
        return out;
    }

    /**
     * Metodo que me permite elegir la cabeza de la lista y recorrer desde ese punto
     * @param node La informacion desde donde inicia el recorrido
     * @return la Lista con los respectivos datos
     */
    public ArrayList<T> roamLinked( NodeCircle<T> node){
        ArrayList<T> out = new ArrayList<>();
        head = node;
        NodeCircle<T> aux = new NodeCircle<>();
        aux = head;
        do {
            out.add(aux.getNext().getInfo());
            aux = aux.getNext();
        }while (aux != head);
        return out;

    }

    /**
     * Busca un nodo a partir de su respectiva clave
     * @param id Clave por la que se identifica el nodo
     * @return El apuntado del nodo
     */
    public NodeCircle<T> findNode(String id){
        NodeCircle<T> aux = head;
        do {
            if (id.equals(aux.getNext().getInfo().toString())){
                return aux.getNext();
            }
            aux = aux.getNext();
        }while (aux != head);
        return null;
    }



}
