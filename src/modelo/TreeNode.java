package modelo;

/**
 * Clase que forma el nodo  del arbol binario
 * @param <T> por Parametrizacion de clase
 */
public class TreeNode <T>{
    private TreeNode<T> left;
    private TreeNode<T> right;
    private T info;

    public TreeNode(T info) {
        this.info = info;
        left = null;
        right = null;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
