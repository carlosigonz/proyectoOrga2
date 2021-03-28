package Proyecto;

/**
 *
 * @author Nicolas Boliaga, Carlos Gonzalez, Felix Maldifassi
 */
public class Avion {
    String serial, modelo, nombre, piloto;    
    
    public Avion(String serial, String modelo, String nombre){
        this.serial = serial;
        this.modelo = modelo;
        this.nombre = nombre;
        this.piloto = null;
    }
    
    
    public boolean isLibre(Avion avion){
        return avion.piloto == null;
    }
    
    public void removerPiloto(Avion avion){
        avion.piloto = null;
    }
    
}
