package model;

/**
 * Created by Ramiro on 17/8/2017.
 */
public class Lista<T> {

    private Nodo inicio;
    private int tamanio;

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public void insertar(T dato, int pos) throws Exception {

        Nodo<T> aux = inicio;
        int cont = 0;

        if(tamanio < pos){
            throw new Exception("Lista vacía");
        }

        if(pos == 0){
            Nodo nuevo = new Nodo(dato, inicio);

            inicio = nuevo;
            return;
        }

        while(cont < (pos-1) && aux != null){
            cont ++;
            aux = aux.getNext();
        }

        Nodo nuevo = new Nodo(dato, aux.getNext());
        aux.setNext(nuevo);
    }

    public T getDato(int pos) throws Exception {

        Nodo<T> aux = inicio;
        int cont = 0;

        if(pos >= tamanio){

            throw new Exception("Error");
        }
        if(aux == null){
            throw new Exception("Error");
        }

        while( cont < pos && aux != null){
            cont++;
            aux = aux.getNext();
        }
        return aux.getDato();
    }

    public void borrar(int pos) throws Exception {

        Nodo aux = inicio;

        int cont = 0;

        if(pos >= tamanio){
            throw new Exception("Error");
        }

        if(pos == 0){
            inicio = inicio.getNext();
        }

        while( cont < (pos-1) && aux != null){
            cont++;
            aux = aux.getNext();
        }

        if(aux== null){
            throw new Exception("Error");
        }

        aux.setNext((aux.getNext().getNext()));
    }
}
