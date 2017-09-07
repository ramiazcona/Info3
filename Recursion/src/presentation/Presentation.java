package presentation;

import model.Recursividad;

import java.util.Scanner;

public class Presentation {

    public void presentation() throws Exception {

        int op1 = 0, a,b;
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Scanner input = new Scanner(System.in);
        Recursividad rec = new Recursividad();

        System.out.println("1. Factorial");
        System.out.println("2. Potencia");
        System.out.println("3. Multiplicacion");
        System.out.println("4. División");
        System.out.println("5. Invertir arreglo");
        System.out.println("6. Binario");
        System.out.println("7. Separar número");
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
            case 4:
                System.out.println("Ingrese el numerador:");
                a = input.nextInt();
                System.out.println("Ingrese el denominador: ");
                b = input.nextInt();
                System.out.println(a + " dividido " + b + " es: " + rec.division(a,b));
                break;
            case 5:
                System.out.println("Arreglo original: ");
                for(int i = 0; i < arr.length; i++){
                    System.out.print(arr[i] + "\t");
                }
                System.out.println("\nInvirtiendo...");
                System.out.println(rec.invertir(arr,9) + "\n");
                break;
            case 6:
                System.out.println("Ingrese el número:");
                a = input.nextInt();
                System.out.print("El numero " + a + " en binario es: "); rec.binario(a);
                System.out.println("\n");
                break;
            case 7:
                System.out.println("Ingrese el número:");
                a = input.nextInt();
                String n = String.valueOf(a);
                int pos = n.length()-1;
                System.out.print(a + " --> "); rec.espacio(n,pos);
                System.out.println("\n");
                break;
            default:
                System.out.println("Comando incorrecto");
                break;
        }
    }
}
