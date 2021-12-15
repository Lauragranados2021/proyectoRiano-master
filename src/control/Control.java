package control;

import modelo.BinaryTree;
import modelo.LinkedCircle;

import java.util.ArrayList;

/**
 * Clase donde entrelazamos la lista circular con los arboles binarios para poder generar la cuestion. Tambien validamos las preconcidiciones
 */
public class Control {
    LinkedCircle<Integer> lista = new LinkedCircle<>();
    BinaryTree<Integer> arbol = new BinaryTree<Integer>((numeOne, numeTwo) -> Integer.compare(numeOne, numeTwo));

    /**
     * Sirve para agregar los nodos a la lista circular le llega un objeto de tipo entero que es la informacion que contiene el dato
     * Como precondicion verifica que el dato agregar en el arbol no se encuentre repetido
     * @param dato entero que contiene la informacion del nodo
     */
    public void addLista(int dato) {
        if(arbol.findNode(dato)==null){
            lista.addNode(dato);
        }
    }

    /**
     * Este metodo sirve para pasar los nodos de la lista circular al arbol binario
     * Como precondicion la lista no debe estar vacia
     */
    public void addArbol(){
if(lista.isEmpy()!=true) {
    for (int i = lista.getLinkedCircle().size() - 1; i >= 0; i--) {

        arbol.addNode(lista.getLinkedCircle().get(i));
    }
}
    }

    /**
     * Este es el metodo que usamos para buscar por la clave que pasamos por parametro
     * Precondicion debe existir el nodo a buscar con el parametro enviado
     * @param prueba valor entero que contiene la informacion del nodo a buscar
     * @return  la informacion del nodo encontrado en el arbol
     */
    public String findArbol(int prueba){
        if(arbol.findNode(prueba)!=null) {

            if (arbol.findNode(prueba) != null) {

                return arbol.findNode(prueba).getInfo().toString();
            }
        }
        return null;
    }

    /**
     * Muestra los datos de la lista en forma de cola es el unico metodo para mostrar
     * Precondicion la lista no debe estar vacia para mostrarla
     * @return La lista circular con la informacion de los nodos
     */
    public ArrayList<Integer> mostrar(){
        if(lista.isEmpy()!=true) {
            return lista.getLinkedCircle();
        }
        return null;
    }

    /**
     * Metodo implementado para cumplir las listas circulares por el cual recorremos la lista a partir de un nodo dado
     * Para Recorrer la lista, esta no debe estar vacia
     * @param dato Le llega un string con la informacion del nodo que se convertira en la cabeza de la lista circular
     * @return Un string en el caso de que encuentre el nodo a convertirse en cabeza y si no me retornara nulo
     */
    public String recorrerApartirDe(String dato){
        if(lista.isEmpy()!=true) {

            System.out.println("Dato a buscar: " + dato);

            for (int i = lista.roamLinked(lista.findNode(dato)).size() - 1; i >= 0; i--) {

                System.out.println(lista.roamLinked(lista.findNode(dato)).get(i));

            }
            return "esta funcionando";
        }
        else{
            return null;
        }


/**}
 * Metodo precondicion para verificar que no exista el mismo nodo en la lista
 *
 */
    }
    public boolean nodeExist(String id) {
        if(lista.findNode(id)==null) {
            return false;
        }
        return true;
    }


}
