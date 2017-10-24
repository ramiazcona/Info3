public class HashEntity <K,T>{

    private K key;
    private T dat;

    public HashEntity(K key,T dat){
        this.key = key;
        this.dat = dat;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public T getDat() {
        return dat;
    }

    public void setDat(T dat) {
        this.dat = dat;
    }
}
