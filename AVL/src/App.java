public class App {
    public static void main(String[] args){

        AVLTree avlTree = new AVLTree();

        avlTree.insert(1);
        avlTree.insert(2);
        avlTree.insert(3);
        avlTree.insert(0);
        avlTree.insert(-1);
        avlTree.insert(-2);

        avlTree.preOrder();
    }
}
