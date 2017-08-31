package app;

import model.Lista;

import java.util.Scanner;

public class App {

    public static void main (String[] args) throws Exception {

        Lista lista1 = new Lista();
        Lista lista2 = new Lista();
        Lista listaConca = new Lista();
        Scanner input = new Scanner(System.in);
        int op = 0, op2 = 0, t = 0, pos = 0;

        do{
            System.out.println("1. Cargar Listas");
            System.out.println("2. Mostrar Listas");
            System.out.println("3. Invertir Listas");
            System.out.println("4. Merger Listas");
            System.out.println("5. Concatenar Listas 1 y 2");
            System.out.println("0. Salir");
            op = input.nextInt();

            switch(op){

                case 1:
                    do{
                        System.out.println("Seleccione la lista a cargar");
                        System.out.println("1. Lista 1");
                        System.out.println("2. Lista 2");
                        System.out.println("3. Lista concatenada");
                        System.out.println("0. Salir");
                        op2 = input.nextInt();

                        switch(op2){
                            case 1:
                                System.out.print("Ingrese dato: ");
                                t = input.nextInt();
                                System.out.println("Ingrese la posición");
                                pos = input.nextInt();
                                lista1.insertar(t,pos);
                                System.out.println("El dato " + lista1.getDato(pos) + " fue cargado");
                                break;
                            case 2:
                                System.out.print("Ingrese dato: ");
                                t = input.nextInt();
                                System.out.println("Ingrese la posición");
                                pos = input.nextInt();
                                lista2.insertar(t,pos);
                                System.out.println("El dato " + lista2.getDato(pos) + " fue cargado");
                                break;

                            case 3:
                                System.out.print("Ingrese dato: ");
                                t = input.nextInt();
                                System.out.println("Ingrese la posición");
                                pos = input.nextInt();
                                listaConca.insertar(t,pos);
                                System.out.println("El dato " + listaConca.getDato(pos) + " fue cargado");
                                break;

                            case 0:
                                System.out.println("Volviendo al menu principal...");
                                op2 = 0;
                                break;
                            default:
                                System.out.println("Comando incorrecto, intente de nuevo");
                                break;
                        }
                    }while(op2 != 0);
                    break;

                case 2:
                    do{
                        System.out.println("Seleccione la lista a mostrar");
                        System.out.println("1. Lista 1");
                        System.out.println("2. Lista 2");
                        System.out.println("3. Lista concatenada");
                        System.out.println("0. Salir");
                        op2 = input.nextInt();

                        switch(op2){
                            case 1:
                                lista1.mostrarLista(lista1);
                                break;

                            case 2:
                                lista2.mostrarLista(lista2);
                                break;

                            case 3:
                                listaConca.mostrarLista(listaConca);
                                break;

                            case 0:
                                System.out.println("Volviendo al menu principal...");
                                op2 = 0;
                                break;
                            default:
                                System.out.println("Comando incorrecto, intente de nuevo");
                                break;
                        }
                    }while(op2 != 0);
                    break;

                case 3:
                    do{
                        System.out.println("Seleccione la lista a invertir");
                        System.out.println("1. Lista 1");
                        System.out.println("2. Lista 2");
                        System.out.println("3. Lista concatenada");
                        System.out.println("0. Salir");
                        op2 = input.nextInt();

                        switch(op2){
                            case 1:
                                lista1 = lista1.fnInvierte(lista1);
                                break;

                            case 2:
                                lista2 = lista2.fnInvierte(lista2);
                                break;

                            case 3:
                                listaConca = listaConca.fnInvierte(listaConca);
                                break;

                            case 0:
                                System.out.println("Volviendo al menu principal...");
                                op2 = 0;
                                break;
                            default:
                                System.out.println("Comando incorrecto, intente de nuevo");
                                break;
                        }
                    }while(op2 != 0);
                    break;

                case 4:
                    do{
                        System.out.println("Seleccione la lista a merger");
                        System.out.println("1. Lista 1 + Lista 2");
                        System.out.println("2. Lista 2 + Lista 1");
                        System.out.println("0. Salir");
                        op2 = input.nextInt();

                        switch(op2){
                            case 1:
                                lista1 = lista1.merger(lista1, lista2);
                                break;

                            case 2:
                                lista2 = lista2.merger(lista2, lista1);
                                break;

                            case 0:
                                System.out.println("Volviendo al menu principal...");
                                op2 = 0;
                                break;
                            default:
                                System.out.println("Comando incorrecto, intente de nuevo");
                                break;
                        }
                    }while(op2 != 0);
                    break;
                case 5:
                    listaConca = listaConca.concatenar(lista1,lista2);
                    System.out.println("Lista nueva creada apartir de las listas 1 y 2...");
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    op = 0;
                    break;

                default:
                    System.out.println("Comando incorrecto, intente de nuevo");
                    break;
            }

        }while(op != 0);
    }
}