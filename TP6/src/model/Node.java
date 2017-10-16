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
        else{
            if(right == null){
                right = new Node<T>(dat);
            }else{
                right.insert(dat);
            }
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
}
