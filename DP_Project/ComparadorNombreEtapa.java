import java.util.Comparator;
/**
 * Comparador de etapas por su dificultad. Orden descendente
 */

public class ComparadorNombreEtapa implements Comparator<Etapa>
{
    public int compare(Etapa e1,Etapa e2)
    {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}
