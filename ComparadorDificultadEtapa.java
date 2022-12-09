import java.util.Comparator;
/**
 * Comparador de etapas por su dificultad. Orden ascendente. En caso de igualdad por distancia
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.2)
 */

public class ComparadorDificultadEtapa implements Comparator<Etapa>
{
    public int compare(Etapa e1,Etapa e2)
    {
        if(Math.abs(e1.getDificultad().getDificultadE() - e2.getDificultad().getDificultadE()) <= 0.001)
        {
            return new ComparadorDistanciaEtapa().compare(e1,e2);
        }
        else if(e1.getDificultad().getDificultadE() < e2.getDificultad().getDificultadE())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
