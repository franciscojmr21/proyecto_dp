import java.util.Comparator;
import java.util.Collections;
/**
 * Comparador de ciclistas por su tiempo de la ultima etapa realizada. Orden descendente. En caso de empate por nombre
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.12)
 */

public class TiempoCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.getResultados().get(c1.getResultados().size()-1).getTiempo() - c2.getResultados().get(c1.getResultados().size()-1).getTiempo()) <= 0.001)
        {
            return Collections.reverseOrder(new NombreCiclistaComparador()).compare(c1,c2);
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
