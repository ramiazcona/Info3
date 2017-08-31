package model;

/**
 * Created by Ramiro on 16/8/2017.
 */
public class Pila {

    public Integer tope;
    public Integer []datos;
    public Integer capacidad;

    public Pila(){

        tope = -1;
        capacidad = 10;
        datos = new Integer[capacidad];
    }

    public void duplicarPila(){

        Integer []aux = new Integer[capacidad*2];

        for(int i = 0; i < capacidad; i++){
            aux[i] = datos[i];
        }

        capacidad *= 2;

        datos = aux;
    }

    public void push(Integer x){

        if(tope++ >= capacidad){
            duplicarPila();
        }

        datos[tope] = x;
    }

    public Integer pop(){

        if(tope < 0){
            System.out.println("Error");
        }

        return datos[tope--];
    }

    public boolean isEmpty(){

        boolean check = false;

        if(tope < 0){

            check = true;
        }

        return check;
    }

    public void mostarPila(){

        for(int i = 0; i <= tope; i++){

            System.out.print(datos[i] + " ");
        }
        System.out.println("\n");
    }
}
