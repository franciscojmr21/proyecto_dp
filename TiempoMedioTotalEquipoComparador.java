import java.util.Comparator;
import java.util.Collections;
/**
 * Comparador de equipos por su tiempo total medio. Orden ascendente. En caso de coincidencia, por orden alfabético
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.1)
 */

public class TiempoMedioTotalEquipoComparador implements Comparator<Equipo>
{
    public int compare(Equipo e1,Equipo e2)
    {
        if(Math.abs(e1.getTiempoMedioTotalSinAbandonar()- e2.getTiempoMedioTotalSinAbandonar()) <= 0.001)
        {
            return Collections.reverseOrder(new NombreEquipoComparador()).compare(e1,e2);
        }
        else if(e1.getTiempoMedioTotalSinAbandonar() > e2.getTiempoMedioTotalSinAbandonar())
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
