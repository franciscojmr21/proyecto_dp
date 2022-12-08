import java.util.Comparator;
/**
 * Comparador de ciclistas por su tiempo. Orden descendente
 */

public class TiempoCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.getResultados().get(c1.getResultados().size()-1).getTiempo() - c2.getResultados().get(c1.getResultados().size()-1).getTiempo()) <= 0.001)
        {
            return 0;
        }
        else if(c1.getResultados().get(c1.getResultados().size()-1).getTiempo() < c2.getResultados().get(c1.getResultados().size()-1).getTiempo())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
