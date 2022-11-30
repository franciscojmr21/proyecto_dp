import java.util.Comparator;
/**
 * Comparador de biciceltas por su peso. Orden descendente
 */

public class PesoBiciComparador implements Comparator<Bicicleta>
{
    public int compare(Bicicleta b1,Bicicleta b2)
    {
        if(Math.abs(b1.getPeso() - b2.getPeso()) <= 0.001)
        {
            return 0;
        }
        else if(b1.getPeso() < b2.getPeso())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}