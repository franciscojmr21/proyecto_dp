import java.util.Comparator;
import java.util.Collections;
/**
 * Comparador de biciceltas por su peso. Orden descendente
 */

public class PesoBiciComparador implements Comparator<Bicicleta>
{
    public int compare(Bicicleta b1,Bicicleta b2)
    {
        if(Math.abs(b1.getPeso().getPesoE() - b2.getPeso().getPesoE()) <= 0.001)
        {
            return Collections.reverseOrder(new NombreBiciComparador()).compare(b1,b2);
        }
        else if(b1.getPeso().getPesoE() < b2.getPeso().getPesoE())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}