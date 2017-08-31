package presentation;

import model.Recursividad;

import java.util.Scanner;

public class Presentation {

    public void presentation(){

        int op1 = 0, a,b;
        Scanner input = new Scanner(System.in);
        Recursividad rec = new Recursividad();

        System.out.println("1. Factorial");
        System.out.println("2. Potencia");
        System.out.println("3. Multiplicacion");
        System.out.println("4. División");
        op1 = input.nextInt();

        switch (op1){

            case 1:
                System.out.println("Ingrese un número:");
                a = input.nextInt();
                System.out.println("El factorial de " + a + " es: " + rec.factorial(a));
                break;
            case 2:
                System.out.println("Ingrese la base:");
                a = input.nextInt();
                System.out.println("Ingrese el exponente:");
                b = input.nextInt();
                System.out.println(a +" elevado a la "+ b +" es: "+ rec.potencia(a,b));
                break;
            case 3:
                System.out.println("Ingrese el primer número");
                a = input.nextInt();
                System.out.println("Ingrese el segundo número");
                b = input.nextInt();
                System.out.println(a + " multiplicado por " + b + " es: " + rec.multiplicacion(a,b));
                break;
            default:
                System.out.println("Comando incorrecto");
                break;
        }
    }
}
