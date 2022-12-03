import java.util.Comparator;
/**
 * Comparador de ciclistas por su energía. Orden descendente
 */

public class EnergiaCiclistaComparador implements Comparator<Ciclista>
{
    public int compare(Ciclista c1,Ciclista c2)
    {
        if(Math.abs(c1.getEnergia() - c2.getEnergia()) <= 0.001)
        {
            return new NombreCiclistaComparador().compare(c1,c2);
        }
        else if(c1.getEnergia() < c2.getEnergia())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
