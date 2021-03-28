package Proyecto;

import java.util.Scanner;

/**
 *
 * @author Nicolas Boliaga, Carlos Gonzalez, Felix Maldifassi
 */
public class Hashing {
    
    
    public void crearAvion(){
        Scanner inSerial = new Scanner(System.in);
        Scanner inModelo = new Scanner(System.in);
        Scanner inNombre = new Scanner(System.in);
        System.out.println("Inserte el serial del avion: ");
        String newSerial = inSerial.next();
        System.out.println("Inserte el modelo del avion: ");
        String newModelo = inModelo.next();
        System.out.println("Inserte el nombre del avion: ");
        String newNombre = inNombre.next();
        
        Avion avion = new Avion(newSerial,newModelo,newNombre);
       
        System.out.println("Avión creado!");
}
    
    public void liberarAvion(Avion avion){
        avion.removerPiloto(avion);
    }
    
    
    
}
