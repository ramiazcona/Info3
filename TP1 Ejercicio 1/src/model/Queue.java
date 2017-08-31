package model;

/**
 * Created by Ramiro on 10/8/2017.
 */
public class Queue {

    public Object []datos;
    public int salida;
    public int entrada;
    public int tamaño;
    public int capacidad;

    public Queue(){

        capacidad = 10;
        datos = new Object[capacidad];
        salida = 0;
        entrada = -1;
        tamaño = 0;
    }

    public void encolar(Object o){

        if(tamaño++ > capacidad){
            duplicarQueue();
        }
        entrada = incrementar(entrada);
        datos[entrada] = o;
    }

    public int incrementar(int x){

        if( x++ >= datos.length){
            x = 0;
        }

        return x;
    }

    public void duplicarQueue(){

        Object []n = new Object[capacidad*2];
        int j = 0;
        for (int i = salida; j < datos.length; i = incrementar(i)){

            n[j] = datos[i];
            j++;
        }
        datos = n;
        salida = 0;
        entrada = tamaño -1;
        capacidad*=2;
    }

    public Object desencolar(){

        if (tamaño <= 0){
            System.out.println("Error");
        }

        Object aux = new Object[1];
        aux = datos[salida];
        salida = incrementar(salida);
        tamaño--;

        return aux;
    }

    public Boolean esVacia(){

        if( tamaño == 0){
            return true;
        }else{
            return false;
        }
    }
}
