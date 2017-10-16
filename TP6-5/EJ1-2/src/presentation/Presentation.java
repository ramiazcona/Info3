package presentation;

import model.ArbolBinario;

import java.util.Scanner;

public class Presentation {

    public void presentation(){

        int n;
        ArbolBinario tree = new ArbolBinario();
        Scanner input = new Scanner(System.in);

        tree.insert(5);
        tree.insert(4);
        tree.insert(2);
        tree.insert(8);
        tree.insert(6);
        tree.insert(9);
        tree.insert(1);

        System.out.print("Ingrese el nivel a contar: ");
        n = input.nextInt();

        int cont = tree.contarPorNivel(tree.getRoot(),n);

        System.out.println("La cantidad de nodos en el nivel " + n + " es: " + cont);

        cont = tree.contarNodos(tree.getRoot());

        System.out.println("La cantidad total de nodos en el arbol es: " + cont);
    }
}
