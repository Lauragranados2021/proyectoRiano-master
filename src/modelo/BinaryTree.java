package modelo;

import java.util.Comparator;

public class BinaryTree<T> {
    private TreeNode<T> root;
    private Comparator<T> comparator;

    /**
     * Constructor para inicializar  comparator e inicializar la raiz como nula por buenas practicas
     * @param comparator
     */
    public BinaryTree(Comparator<T> comparator) {
        this.comparator = comparator;
        this.root = null;
    }

    /**
     * Metodo que comprueba que la raiz este vacia y por tanto no existe el arbol
     * @return boleano que me devuelve true si existe y false si no
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Metodo para agregar un nodo con ayuda del compare para decidir si van hacia la derecha o a la izquierda
     * @param info informacion por parametro que se va almacenar en el nodo del arbol
     */
    public void addNode(T info) {
        TreeNode<T> node = new TreeNode<>(info);
        if (isEmpty()) {
            root = node;
        } else {
            TreeNode<T> aux = root;
            TreeNode<T> ant = null;
            while (aux != null) {
                ant = aux;
                aux = comparator.compare(info, aux.getInfo()) < 0 ? aux.getLeft() : aux.getRight();
            }
            if (comparator.compare(info, ant.getInfo()) < 0) {
                ant.setLeft(node);
            } else {
                ant.setRight(node);
            }
        }
    }

    /**
     * Metodo que Busca con una clave dentro del arbol si existe un nodo con ese parametro
     * @param info Informacion del nodo a buscar
     * @return Apuntador del nodo que encontro ;
     */
    public TreeNode<T> findNode(T info ){
        TreeNode<T> aux=root;
        while(aux!=null){
            if(comparator.compare(info,aux.getInfo())==0){
                return aux;
            }
            aux=comparator.compare(info,aux.getInfo())<0?aux.getLeft():aux.getRight();
        }
        return null;
    }

}
