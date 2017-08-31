package app;

import model.Pila;

import java.util.Scanner;

public class CalcuPolaca {

    public static void main (String[] args) {

        String x;
        int op = 1;
        boolean check;
        Pila pila = new Pila();
        Scanner input = new Scanner(System.in);
        int j = 0;

        System.out.println("Comenzando...\n");

        while (op != 0){

            x = input.next();

            if (!x.equals("+") && !x.equals("-") && !x.equals("*") && !x.equals("/")) {

                double y = Double.parseDouble(x);
                pila.push(y);
                pila.mostarPila();
            }

            if (x.equals("+")) {

                check = pila.isEmpty();
                if (check == true) {
                    System.out.println("La pila esta vacía\n");
                } else {
                    double a = pila.datos[pila.tope - 1];
                    double b = pila.datos[pila.tope];

                    double result = a + b;

                    pila.datos[pila.tope - 1] = result;
                    pila.pop();

                    System.out.println("\n");
                    pila.mostarPila();
                }
            }

            if (x.equals("-")) {

                check = pila.isEmpty();
                if (check == true) {
                    System.out.println("La pila esta vacía\n");
                } else {
                    double a = pila.datos[pila.tope - 1];
                    double b = pila.datos[pila.tope];

                    double result = a - b;

                    pila.datos[pila.tope - 1] = result;
                    pila.pop();

                    System.out.println("\n");
                    pila.mostarPila();
                }
            }

            if (x.equals("*")) {

                check = pila.isEmpty();
                if (check == true) {
                    System.out.println("La pila esta vacía\n");
                } else {
                    double a = pila.datos[pila.tope - 1];
                    double b = pila.datos[pila.tope];

                    double result = a * b;

                    pila.datos[pila.tope - 1] = result;
                    pila.pop();

                    System.out.println("\n");
                    pila.mostarPila();
                }
            }

            if (x.equals("/")) {

                check = pila.isEmpty();
                if (check == true) {
                    System.out.println("La pila esta vacía\n");
                } else {
                    double a = pila.datos[pila.tope - 1];
                    double b = pila.datos[pila.tope];

                    if ((a / b) % 2 != 0) {
                        System.out.println("Error");
                    } else if ((a / b) % 2 == 0) {

                        double result = a / b;
                        pila.datos[pila.tope - 1] = result;
                        pila.pop();

                        System.out.println("\n");
                        pila.mostarPila();
                    }
                }
            }

            if(x.equalsIgnoreCase("exit")){
                op = 0;
            }

        }
    }
}
