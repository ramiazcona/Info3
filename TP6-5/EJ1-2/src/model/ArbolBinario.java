package model;

public class ArbolBinario <T extends Comparable>{

    private Nodo root;


    public ArbolBinario(){
        root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public void insert (T dat){
        if(root == null)
            root = new Nodo<T>(dat);
        else
            root.insert(dat);
    }

    public Integer contarPorNivel(Nodo<T> aux, int n){

        if( aux == null)
            return 0;
        if( n == 0)
            return 1;
        return contarPorNivel(aux.getLeft(), n -1) + contarPorNivel(aux.getRight(), n-1);

    }

    public Integer contarNodos(Nodo<T> aux){
        int n = 0;
        if(aux != null){
            n = aux.contarNodos(aux);
        }
        return n;
    }

}
