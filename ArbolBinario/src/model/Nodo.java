package model;

public class Nodo<T extends Comparable>{

    private T dat;
    private Nodo<T> left;
    private Nodo<T> right;

    public T getDat() {
        return dat;
    }

    public void setDat(T dat) {
        this.dat = dat;
    }

    public Nodo<T> getLeft() {
        return left;
    }

    public void setLeft(Nodo<T> left) {
        this.left = left;
    }

    public Nodo<T> getRight() {
        return right;
    }

    public void setRight(Nodo<T> right) {
        this.right = right;
    }

    public Nodo(T dat){
        this.dat = dat;
        this.left = null;
        this.right = null;
    }

    public void insert (T dat){

        if(this.dat.compareTo(dat) > 0){
            if(left == null)
                left = new Nodo<T>(dat);
            else
                left.insert(dat);
        }

        else{
            if(right == null)
                right = new Nodo<T>(dat);
            else
                right.insert(dat);
        }

    }

    public void insert (Nodo<T> nodo){

        if(dat.compareTo(nodo.getDat()) > 0){
            if(left == null)
                left = new Nodo<T>(dat);
            else
                left.insert(dat);
        }
        else{
            if(right == null)
                right = new Nodo<T>(dat);
            else
                right.insert(dat);
        }
    }

    public Nodo<T> delete(T dat) throws Exception {

        int comp = this.dat.compareTo(dat);

        if(comp > 0){
            if (left != null)
                left = left.delete(dat);
            else
                throw new Exception("No se encontró");
        }else if(comp < 0){
            if (right != null)
                right = right.delete(dat);
            else
                throw new Exception("No se encontró");
        }else {
            if (right != null) {
                right.insert(left);
                return right;
            } else
                return left;
        }
        return this;
    }

    public void preOrder(){

        System.out.print(dat.toString() + " ");

        if(left != null)
            left.preOrder();
        if(right != null)
            right.preOrder();
    }

    public void postOrder(){

        if(left != null)
            left.postOrder();
        if(right != null)
            right.postOrder();
        System.out.print(dat.toString() + " ");
    }

    public void inOrder(){

        if(left != null)
            left.inOrder();
        System.out.print(dat.toString() + " ");
        if(right != null)
            right.inOrder();
    }

    public void inOrderNoRec(){


    }
}
