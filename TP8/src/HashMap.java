public class HashMap <K,T extends Comparable>{

    private HashEntity<K,T> table[];
    private int size;

    public HashMap(int size){
        this.size = size;
        table = new HashEntity[size];
    }

    public boolean put(K key,T dat) {

        int pos = inRange(key),n;
        if (table[pos] == null){
            table[pos] = new HashEntity<>(key,dat);
            System.out.println("Valor nuevo: " + dat);
            return true;
        }
        else{
            if(dat.compareTo(table[pos].getDat()) == 0){
                System.out.println("Valor repetido: " + dat);
                return false;
            }
            else{
                for(int i = pos+1; i < size+pos; i++){
                    n = i%size;
                    if (table[n] == null){
                        table[n] = new HashEntity<>(key,dat);
                        System.out.println("Valor nuevo: " + dat);
                        return true;
                    }
                }
            }
        }
        System.out.println("No se pudo ingresar " + dat);
        return false;

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
