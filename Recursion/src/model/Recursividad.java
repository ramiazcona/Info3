package model;

public class Recursividad {

    public Integer factorial(Integer x){
        if(x == 1){
            System.out.println(x);
            return x;
        }
        System.out.print(x + "*");
        return x*factorial(x-1);
    }

    public double potencia(Integer a, Integer b){

        if(a == 0)
            return 0;
        else if(b == 1){
            System.out.println(a);
            return a;
        }
        else if(b == 0)
            return b;
        else
        {
            System.out.print(a+"*");
            return a*potencia(a,b-1);
        }
    }

    public Integer multiplicacion(Integer a, Integer b){

        if(b == 1){
            System.out.println(a);
            return a;
        }
        else if(a == 0)
            return 0;
        else if(b == 0)
            return 0;
        else{
            System.out.print(a+"+");
            return a+multiplicacion(a,b-1);
        }
    }

    public Integer division(Integer a, Integer b) throws Exception {

        if(b > a)
            return 0;
        else if (b == 0)
            throw new Exception("No se puede dividir por cero");
        else if(a == 0)
            return 0;
        else
            return division(a-b,b) + 1;
    }

    public String invertir(int[] arr, int pos){

        if(pos == 0)
            return String.valueOf(arr[0]);
        else{
            System.out.print(String.valueOf(arr[pos]) + "\t");
            return invertir(arr,pos-1);
        }
    }

    public void binario(int n){

        if(n < 2)
            System.out.print(n);
        else{
            binario(n/2);
            System.out.print(n%2);
        }
    }

    public void espacio(String n, int pos){

        if(pos == 0){
            System.out.print(n.charAt(pos) + " ");
            return;
        }
        else{
            espacio(n,pos-1);
            System.out.print(n.charAt(pos) + " ");
            return;
        }

    }
}
