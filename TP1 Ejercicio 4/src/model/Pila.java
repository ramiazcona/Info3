package model;

public class Pila {

    public Integer tope;
    public char []datos;
    public Integer capacidad;

    public Pila(){

        tope = -1;
        capacidad = 10;
        datos = new char[capacidad];
    }

    public void duplicarPila(){

        char []aux = new char[capacidad*2];

        for(int i = 0; i < capacidad; i++){
            aux[i] = datos[i];
        }

        capacidad *= 2;

        datos = aux;
    }

    public void push(char x){

        if(tope++ >= capacidad){
            duplicarPila();
        }

        datos[tope] = x;
    }

    public char pop(){

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
