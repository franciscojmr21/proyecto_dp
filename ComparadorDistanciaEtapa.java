import java.util.Comparator;
/**
 * Comparador de etapas por su distancia. Orden ascendente. En caso de igualdad por nombre
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.2)
 */

public class ComparadorDistanciaEtapa implements Comparator<Etapa>
{
    public int compare(Etapa e1,Etapa e2)
    {
        if(Math.abs(e1.getDistancia().getDistanciaE() - e2.getDistancia().getDistanciaE()) <= 0.001)
        {
            return new ComparadorNombreEtapa().compare(e1,e2);
        }
        else if(e1.getDistancia().getDistanciaE() < e2.getDistancia().getDistanciaE())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
