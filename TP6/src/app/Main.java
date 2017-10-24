package app;

import model.BinaryTree;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int i = 0,n;
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        BinaryTree tree = new BinaryTree();

        while(i < 10){
            n = rand.nextInt(25) + 0;
            //System.out.println("Se insertó: " + n);
            tree.insert(n);
            i++;
        }

        System.out.println("Arbol ordenado:");
        tree.inOrder();
        System.out.print("\nCantidad de niveles: " + tree.depth());
        System.out.println("\nIngrese el nodo a eliminar: ");
        n = input.nextInt();
        tree.delete(n);
        System.out.println("Arbol ordenado sin " + n + ":");
        tree.inOrder();
    }
}
