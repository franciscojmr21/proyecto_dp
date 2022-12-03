import java.util.Comparator;
/**
 * Comparador de equipos por su tiempo total medio. Orden ascendente
 */

public class TiempoMedioTotalEquipoComparador implements Comparator<Equipo>
{
    public int compare(Equipo e1,Equipo e2)
    {
        if(Math.abs(e1.getTiempoMedioTotal() - e2.getTiempoMedioTotal()) <= 0.001)
        {
            return 0;
        }
        else if(e1.getTiempoMedioTotal() > e2.getTiempoMedioTotal())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
