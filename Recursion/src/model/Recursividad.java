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


}
