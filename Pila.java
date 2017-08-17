package model;

/**
 * Created by Ramiro on 10/8/2017.
 */
public class Pila {

    public int tope;
    Object []datos;
    int capacidad;

    public Pila(){

        capacidad = 10;
        datos = new Object[capacidad];
        tope = -1;
    }

    public void push(Object o){

        if ( tope++ > capacidad){
            duplicarPila();
        }

        datos[tope] = o;
    }

    public Object pop(){

        if( tope < 0 ){
            System.out.println("Error");
        }

        return datos[tope--];
    }

    public void duplicarPila(){

        Object []aux = new Object[capacidad*2];

        for( int i = 0; i < capacidad; i++){

            aux[i] = datos[i];
        }

        capacidad *= 2;

        datos = aux;
    }
}
