import java.util.Comparator;
import java.util.Collections;
/**
 * Comparador de ciclistas por su Habilidad. Orden descendente
 */

public class HabilidadCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.getHabilidad().getHabilidadE() - c2.getHabilidad().getHabilidadE()) <= 0.001)
        {
            return Collections.reverseOrder(new NombreCiclistaComparador()).compare(c1,c2);
        }
        else if(c1.getHabilidad().getHabilidadE() < c2.getHabilidad().getHabilidadE())
        {
            return 1;
        }
        else 
        {
            return -1;
        }
    }
}
