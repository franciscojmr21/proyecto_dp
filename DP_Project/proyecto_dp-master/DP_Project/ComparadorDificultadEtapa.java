import java.util.Comparator;
/**
 * Comparador de etapas por su dificultad. Orden ascendente
 */

public class ComparadorDificultadEtapa implements Comparator<Etapa>
{
    public int compare(Etapa e1,Etapa e2)
    {
        if(Math.abs(e1.getDificultad() - e2.getDificultad()) <= 0.001)
        {
            return new ComparadorDistanciaEtapa().compare(e1,e2);
        }
        else if(e1.getDificultad() < e2.getDificultad())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
