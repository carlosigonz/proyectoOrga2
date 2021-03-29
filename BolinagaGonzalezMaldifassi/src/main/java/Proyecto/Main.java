
package Proyecto;

import java.util.Scanner;

/**
 *
 * @author Nicolas Boliaga, Carlos Gonzalez, Felix Maldifassi
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean abierto = true;
        while(abierto){ 
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Bienvenido al registro de aviones de AVIOCC.");
            System.out.println("¿Qué tarea desea realizar? (inserte el número)");
            System.out.println("\n1. Insertar nuevo avión.\n"
                    + "2. Buscar avión.\n"
                    + "3. Asignar avión libre a piloto.\n"
                    + "4. Remover piloto de un avión.\n"
                    + "5. Eliminar avión.\n"
                    + "6. Cerrar programa.");        
            
            if(input.hasNextInt()){
                int select = input.nextInt();

                switch(select){
                    default:
                        System.out.println("Selección inválida.");
                        break;
                    case 1:
                        System.out.println("1. Insertar nuevo avión.");
                        break;
                    case 2:
                        System.out.println("2. Buscar avión.");
                        break;
                    case 3:
                        System.out.println("3. Asignar avión libre a piloto.");
                        break;
                    case 4:
                        System.out.println("4. Remover piloto de un avión.");
                        break;
                    case 5:
                        System.out.println("5. Eliminar avión.");
                        break;
                    case 6:
                        abierto = false;
                        System.out.println("Adios.");
                        break;
                }
            }else{
                System.out.println("Selección inválida.");
                break;
            }
            
        }
    }
}
