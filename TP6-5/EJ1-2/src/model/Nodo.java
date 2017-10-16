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

    public Integer contarNodos(Nodo<T> aux){

        if(aux == null){
            return 0;
        }
        else
            return 1 + contarNodos(aux.left) + contarNodos(aux.right);
    }

    /*public Integer contarNodos2(){
        int n=1;
        if(this.left != null){
            n += this.left.contarNodos2();
        }
        if(this.right != null){
            n += this.right.contarNodos2();
        }
        return n;
    }*/                     //Otra forma de hacerlo
}
