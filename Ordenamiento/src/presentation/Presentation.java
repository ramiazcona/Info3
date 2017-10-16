package presentation;

import model.Ordenamiento;

import java.util.Locale;
import java.util.Scanner;

public class Presentation <T extends Comparable<T>>{

    public void presentation(){

        int op1 = 0,op2,tam;
        Ordenamiento ordenamiento = new Ordenamiento();
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seleccione el tipo de arreglo" +
                "\n 1. Integer" +
                "\n 2. Double" +
                "\n 3. Character" +
                "\n 0. Salir");
        op1 = input.nextInt();

        System.out.println("Seleccione el tipo de ordenamiento" +
                "\n 1. Inserción" +
                "\n 2. Shell" +
                "\n 3. Quicksort");
        op2 = input.nextInt();

        switch (op1){

            case 1:
                System.out.print("Ingrese tamaño: ");
                tam = input.nextInt();
                System.out.println("Cargar datos:");
                Integer[] arr1 = new Integer[tam];
                for(int i = 0; i < tam; i++){
                    arr1[i] = input.nextInt();
                }
                ordenamiento.ordenamiento(arr1,op2,tam);
                break;

            case 2:
                System.out.print("Ingrese tamaño: ");
                tam = input.nextInt();
                System.out.println("Cargar datos:");
                Double[] arr2 = new Double[tam];
                for(int i = 0; i < tam; i++){
                    arr2[i] = input.nextDouble();
                    System.out.println(arr2[i]);
                }
                ordenamiento.ordenamiento(arr2,op2,tam);
                break;
            case 3:
                System.out.print("Ingrese tamaño: ");
                tam = input.nextInt();
                System.out.println("Cargar datos:");
                String[] arr3 = new String[tam];
                for(int i = 0; i < tam; i++){
                    arr3[i] = input.next();
                }
                ordenamiento.ordenamiento(arr3,op2,tam);
                break;
            default:
                System.out.println("Comando incorrecto, intente de nuevo...");
                break;
        }
    }
}
