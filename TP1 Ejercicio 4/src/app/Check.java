package app;

import model.Pila;

import java.util.Scanner;

public class Check {

    public static void main (String[] args){

        String f;
        int i;
        boolean ver = false;
        Scanner input = new Scanner(System.in);
        Pila pilaAbierto = new Pila();
        Pila pilaCerrado = new Pila();

        System.out.print("Ingrese la funcion --> ");
        f = input.next();

        for(i = 0; i < f.length(); i++){

            if('(' == f.charAt(i) || '{' == f.charAt(i) || '[' == f.charAt(i))
                pilaAbierto.push(f.charAt(i));
            else if(')' == (f.charAt(i)) || '}' == (f.charAt(i)) || ']' == (f.charAt(i)))
                pilaCerrado.push(f.charAt(i));

        }

        if(pilaAbierto.tope != pilaCerrado.tope)
            System.out.println("Error, verifique que ha escrito bien la función");
        else{
            i = 0;
            do{
                if(pilaAbierto.datos[i] == '('){
                    if(pilaCerrado.datos[i] == ')')
                        ver = true;
                    else ver = false;
                }else if(pilaAbierto.datos[i] == '{'){
                    if(pilaCerrado.datos[i] == '}')
                        ver = true;
                    else ver = false;
                }else if(pilaAbierto.datos[i] == '['){
                    if(pilaCerrado.datos[i] == ']')
                        ver = true;
                    else ver = false;
                }
            }while(i++ < pilaAbierto.tope && ver != true);
        }
        if(ver == false)
            System.out.println("Error, verifique que ha escrito bien la función");
        else
            System.out.println("La función esta bien escrita");
        System.out.println("Saliendo...");
    }
}


