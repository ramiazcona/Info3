public class LinkedList<T> {

    private Node ini;
    private int tam;


    public Node getIni() {
        return ini;
    }

    public void setIni(Node ini) {
        this.ini = ini;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public void insertar(T dato, int pos) throws Exception {

        Node<T> aux = ini;
        int cont = 0;

        if(tam < pos){
            throw new Exception("Lista vacía");
        }

        if(pos == 0){
            Node nuevo = new Node(dato, ini);
            tam++;
            ini = nuevo;
            return;
        }

        while(cont < (pos-1) && aux != null){
            cont ++;
            aux = aux.getNext();
        }

        Node nuevo = new Node(dato, aux.getNext());
        aux.setNext(nuevo);
        tam++;
    }

    public T getDato(int pos) throws Exception {

        Node<T> aux = ini;
        int cont = 0;

        if(pos >= tam){

            throw new Exception("Error");
        }
        if(aux == null){
            throw new Exception("Error");
        }

        while( cont < pos && aux != null){
            cont++;
            aux = aux.getNext();
        }
        return aux.getDat();
    }

    /*public void borrar(int pos) throws Exception {

        Nodo aux = ini;

        int cont = 0;

        if(pos >= tam){
            throw new Exception("Error");
        }

        if(pos == 0){
            ini = ini.getNext();
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

    public Lista concatenar(Lista lista1, Lista lista2){

        Nodo<T> aux = lista1.getInicio();
        int cont = 0;

        while(aux.getNext() != null){
            aux = aux.getNext();
        }

        aux.setNext(lista2.getInicio());

        return lista1;
    }*/

    public void mostrarLista(LinkedList list){
        Node<T> aux = list.getIni();
        while(aux != null){
            System.out.print(aux.getDat() + "\t");
            aux = aux.getNext();
        }
        System.out.println();
    }

    /*public Lista fnInvierte(Lista lista){

        int i = 0, tamanio, cont = 0;
        tamanio = lista.getTamanio();
        Nodo<T> aux1 = lista.getInicio();
        Nodo<T> aux2 = lista.getInicio();

        do{
            while( i < tamanio-1) {
                aux1 = aux1.getNext();
                i++;
            }
            T t = aux1.getDato();
            aux1.setDato(aux2.getDato());
            aux2.setDato(t);
            aux2 = aux2.getNext();
            aux1 = lista.getInicio();
            tamanio -= 1;
            i = 0;
            cont++;
        }while(cont < tamanio);

        return lista;
    }

    public Lista merger(Lista lista1, Lista lista2){

        Nodo<T> aux = lista1.getInicio();

        while(aux.getNext() != null){
            aux = aux.getNext();
        }

        aux.setNext(lista2.getInicio());

        return lista1;
    }*/
}
