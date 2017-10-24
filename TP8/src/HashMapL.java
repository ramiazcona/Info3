public class HashMapL<K,T> {

    private LinkedList<HashEntity<K,T>> []table;
    private int size;

    public HashMapL(int size){
        this.size = size;
        table = new LinkedList[size];
    }

    public boolean put(K key,T dat) throws Exception {

        int pos = inRange(key);

        if(table[pos] == null){
            HashEntity he = new HashEntity<>(key,dat);
            table[pos] = new LinkedList<>();
            table[pos].insertar(he,0);
        }
    }

    public T get(K key) throws Exception {
        int pos = inRange(key);
        if(table[pos] == null){
            throw new Exception();
        }
        else{
            return table[pos].getDat();
        }

    }

    public int hash(K key){
        return Integer.parseInt(""+key);
    }

    public int inRange(K key){
        return hash(key) % size;
    }

    public boolean remove(K key){
        int pos = inRange(key);
        if(table[pos] == null){
            return false;
        }
        table[pos] = null;
        return true;

    }


    public int isEmpty(){
        int cont = 0;
        for (int i = 0; i < size; i++){
            if(table[i] != null)
                cont++;
        }
        return cont;
    }


}
