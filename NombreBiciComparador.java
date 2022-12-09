import java.util.Comparator;
/**
 * Comparador de bicicletas por su nombre. Orden alfabetico
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.1)
 */

public class NombreBiciComparador implements Comparator<Bicicleta>
{
    public int compare(Bicicleta b1,Bicicleta b2)
    {
        return b1.getNombre().compareTo(b2.getNombre());
    }
}