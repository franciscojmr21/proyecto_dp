import java.util.Comparator;
import java.util.Collections;
/**
 * Comparador de ciclistas por su tiempo. Orden ascendente
 */

public class TiempoTotalCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.tiempoTotal() - c2.tiempoTotal()) <= 0.001)
        {
            return new NombreCiclistaComparador().compare(c1,c2);
        }
        else if(c1.tiempoTotal() > c2.tiempoTotal())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
