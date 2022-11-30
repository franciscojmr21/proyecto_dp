import java.util.Comparator;
/**
 * Comparador de ciclistas por su nombre. Orden alfabetico
 */

public class NombreCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        return c1.getNombreC().compareTo(c2.getNombreC());
    }
}
