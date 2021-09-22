package proyecto.pkg2;
import java.util.ArrayList;

/**
 *
 * @author Ana Romero
 */
public class Cajero {
    ArrayList cajeros = new ArrayList();
        
    public Cajero(){
        Persona persona = new Persona();
        cajeros.add(persona.AgregarPersona().toString());
    }
}
