package model;

public class BinaryTree <T extends Comparable>{

    private Node<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void insert(T dat){

        if(root == null){
            root = new Node<T>(dat);
        }
        else
            root.insert(dat);
    }

    public void inOrder(){
        if(root != null){
            root.inOrder();
        }
    }

    public int depth(){
        if(root == null){
            return 0;
        }
        else{
            return root.height(root);
        }
    }

    public void delete(T dat){
        if(root != null){
            if(root.getDat().compareTo(dat) == 0){
                root = null;
            }
            else{
                root.delete(root,dat);
            }
        }
    }
}
