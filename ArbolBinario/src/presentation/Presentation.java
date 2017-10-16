package presentation;

import model.ArbolBinario;

public class Presentation {

    public void presentation(){

        ArbolBinario<Integer> tree = new ArbolBinario<>();

        tree.insert(5);
        tree.insert(4);
        tree.insert(2);
        tree.insert(8);
        tree.insert(6);
        tree.insert(9);
        tree.insert(1);

        tree.inOrder();


        try{
            tree.delete(1);
            tree.delete(9);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("\nAndubo");
    }
}
