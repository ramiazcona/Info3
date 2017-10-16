package model;

public class Ordenamiento <T extends Comparable<T>>{

    public void mostrar(T[] arr, int tam){
        for(T i: arr){
            System.out.print(i + "\t");
        }
    }

    public void insercion(T[] arr, int tam){

        int j;

        for(int i = 1; i < tam; i++){
            j = i;
            while(j > 0 && arr[j-1].compareTo(arr[j]) > 0){

                T temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public void shell(T[] arr,int tam){

        int gap,i,j;
        T temp;
        for (gap = tam/2; gap > 0; gap /= 2){
            for (i = gap; i < tam; i++){
                for (j = i-gap; j>=0 && arr[j].compareTo(arr[j+gap]) > 0 ;j-=gap ){
                    temp = arr[j];
                    arr[j] = arr[j+gap];
                    arr[j+gap] = temp;
                }
            }
        }
    }

    public void quicksort(T[] arr, int l,int r){

        int j=r, i=l;
        T aux;

        while(i<j){

            while(i<j && arr[j].compareTo(arr[i]) > 0){
                j--;
            }
            if(i<j){
                aux = arr[j];
                arr[j] = arr[i];
                arr[i] = aux;
                i++;
            }

            while(i<j && arr[j].compareTo(arr[i]) > 0){
                i++;
            }
            if(i<j){
                aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                j--;

            }
        }//Valor en su posición final
        if(l < j) quicksort(arr,l,j-1);
        if(i < r) quicksort(arr,i+1,r);
    }

    public void ordenamiento(T[] arr,int op,int tam){

        System.out.println("Arreglo original:");
        mostrar(arr,tam);

        switch (op){
            case 1:
                insercion(arr,tam);
                break;
            case 2:
                shell(arr,tam);
                break;
            case 3:
                quicksort(arr,tam-tam, tam-1);
                break;
            default:
                System.out.println("Comando incorrecto, intente de nuevo...");
                break;
        }
        System.out.println("\nArreglo ordenado: ");
        mostrar(arr,tam);
    }
}
