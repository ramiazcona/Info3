package app;

import model.BinaryTree;

import java.util.Random;

public class Main {
    public static void main(String[] args){

        int i = 0,n;

        Random rand = new Random();
        BinaryTree tree = new BinaryTree();

        while(i < 10){
            n = rand.nextInt(25) + 0;
            //System.out.println("Se insertó: " + n);
            tree.insert(n);
            i++;
        }

        tree.inOrder();
    }
}
