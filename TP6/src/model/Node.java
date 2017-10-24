package model;

public class Node <T extends Comparable>{

    private T dat;
    private Node<T> left;
    private Node<T> right;

    public Node(T dat){
        this.dat = dat;
        this.left = null;
        this.right = null;
    }
    public Node(Node<T> node){
        this.dat = node.getDat();
        this.left = node.getLeft();
        this.right = node.getRight();
    }

    public T getDat() {
        return dat;
    }

    public void setDat(T dat) {
        this.dat = dat;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void insert(T dat){

        if(this.dat.compareTo(dat) > 0){
            if(left == null){
                left = new Node<T>(dat);
            }else{
                left.insert(dat);
            }
        }
        else if (this.dat.compareTo(dat) < 0){
            if(right == null){
                right = new Node<T>(dat);
            }else{
                right.insert(dat);
            }
        }else{
            this.dat = dat;
        }
    }

    public void insert (Node<T> aux){

        if(dat.compareTo(aux.getDat()) > 0){
            if(left == null){
                left = new Node<T>(aux);
            }
            else
                left.insert(aux);
        }
        else{
            if(right == null){
                right = new Node<T>(aux);
            }
            else
                right.insert(aux);
        }
    }

    public void inOrder(){

        if(left != null){
            left.inOrder();
        }
        System.out.print(dat.toString() + " ");
        if(right != null){
            right.inOrder();
        }
    }

    public int height(Node<T> aux){

        if(aux == null){
            return -1;
        }
        else{
            return 1 + Math.max(height(aux.left),height(aux.right));
        }
    }

    public void delete(Node<T> aux, T dat){

        if(aux.dat.compareTo(dat) > 0){
            if(aux.left != null){
                delete(aux.left,dat);
            }
        }
        else if(aux.dat.compareTo(dat) < 0){
            if(aux.right != null){
                delete(aux.right,dat);
            }
        }
        else{
            if(aux.left != null){
                aux.left.insert(aux.right);
                aux = aux.left;
            }
            else if(aux.right != null){
                aux = aux.right;
            }
            else{
                aux = null;
            }
        }
    }
}
