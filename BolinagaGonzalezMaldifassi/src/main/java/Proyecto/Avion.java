package Proyecto;

/**
 *
 * @author Nicolas Boliaga, Carlos Gonzalez, Felix Maldifassi
 */
public class Avion {
    String serial, modelo, nombre;
    Piloto piloto;
    
    public Avion(String serial, String modelo, String nombre){
        this.serial = serial;
        this.modelo = modelo;
        this.nombre = nombre;
        this.piloto = null;
    }
    
    public void crearAvion(){
        System.out.println("Inserte el serial del avion");
}
    
    public boolean isLibre(Avion avion){
        return avion.piloto == null;
    }
    
    public void removerPiloto(Avion avion){
        avion.piloto = null;
    }
    
}