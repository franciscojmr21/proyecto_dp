import java.util.Comparator;
/**
 * Comparador de etapas por su distancia. Orden ascendente
 */

public class ComparadorDistanciaEtapa implements Comparator<Etapa>
{
    public int compare(Etapa e1,Etapa e2)
    {
        if(Math.abs(e1.getDistancia() - e2.getDistancia()) <= 0.001)
        {
            return new ComparadorNombreEtapa().compare(e1,e2);
        }
        else if(e1.getDistancia() < e2.getDistancia())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
