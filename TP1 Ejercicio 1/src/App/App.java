package App;

import model.Persona;
import model.Queue;

import java.util.Scanner;

/**
 * Created by Ramiro on 10/8/2017.
 */
public class App {

    public static void main (String[] args){

        int op = 0;
        Queue queue = new Queue();
        Persona person = new Persona();
        Scanner input = new Scanner(System.in);

       do{

           System.out.println("1- Cargar una persona");
           System.out.println("2- Comprobar los turnos");
           System.out.println("0- Salir");
           op = input.nextInt();

            switch (op){

                case 1 :
                    System.out.println("Ingrese los datos de la persona: ");
                    System.out.print("Nombre: ");
                    person.setNombre(input.next());
                    System.out.print("Apelldo: ");
                    person.setApellido(input.next());
                    System.out.print("DNI: ");
                    person.setDni(input.nextInt());
                    System.out.print("Ingrese la fecha del turno: ");
                    person.setTurno(input.next());

                    queue.encolar(person);

                    System.out.println("Persona cargada\n");

                    break;

                case 2:

                    boolean check = queue.esVacia();

                    if( check == true){
                        System.out.println("La cola esta vacía");
                    }else{

                        for( int i = 0; i < queue.tamaño; i++){

                            person = (Persona) queue.datos[i];

                            System.out.println("Persona " + (i+1));
                            System.out.println("Nombre: " + person.getNombre()+"\n");
                            System.out.println("Apellido: " + person.getApellido()+"\n");
                            System.out.println("DNI: " + person.getDni()+"\n");
                            System.out.println("Fecha del turno: " + person.getTurno()+"\n\n");

                        }
                    }
                    break;
                case 0:

                    System.out.println("Saliendo...");
                    op = 0;
                    break;

            }

        } while (op != 0);
    }
}
