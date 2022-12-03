import java.util.Comparator;
/**
 * Comparador de ciclistas por su Habilidad. Orden descendente
 */

public class HabilidadCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.getHabilidad() - c2.getHabilidad()) <= 0.001)
        {
            return 0;
        }
        else if(c1.getHabilidad() < c2.getHabilidad())
        {
            return 1;
        }
        else 
        {
            return -1;
        }
    }
}
