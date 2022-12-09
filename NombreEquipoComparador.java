import java.util.Comparator;
/**
 * Comparador de equipo por su nombre. Orden alfabetico
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.1)
 */

public class NombreEquipoComparador implements Comparator<Equipo>
{
    public int compare(Equipo e1,Equipo e2)
    {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}
