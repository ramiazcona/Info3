package model;

public class ArbolBinario <T extends Comparable>{

    private Nodo root;

    public ArbolBinario(){
        root = null;
    }

    public void insert (T dat){
        if(root == null)
            root = new Nodo<T>(dat);
        else
            root.insert(dat);
    }

    public void delete (T dat) throws Exception {
        if(root != null)
            root.delete(dat);
    }

    public void preOrder (){
        if(root != null)
            root.preOrder();
    }

    public void inOrder (){
        if(root != null)
            root.inOrder();
    }

    public void postOrder (){
        if(root != null)
            root.postOrder();
    }
}
