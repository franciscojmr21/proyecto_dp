import java.util.Comparator;
/**
 * Comparador de ciclistas por su tiempo. Orden ascendente
 */

public class TiempoTotalCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.tiempoTotal() - c2.tiempoTotal()) <= 0.001)
        {
            return 0;
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
