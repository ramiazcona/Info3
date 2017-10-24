public class Node<T> {

    private T dat;
    private Node next;

    public Node(T dat, Node next){

        this.dat = dat;
        this.next = next;
    }

    public T getDat() {
        return dat;
    }

    public void setDat(T dat) {
        this.dat = dat;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
