
/**
 * Clase que ejecuta las funcionalidades del ciclista novato y almacena sus datos.
 * Esta clase extiende de AbstractCiclista ya que tiene propiedades distintas.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.13)
 */
public class CiclistaNovato  extends AbstractCiclista{

    /**                                
     * Constructor de la clase CiclistaNovato
     * 
     * @param nombreC String nombre del ciclista
     * @param habilidad Habilidad enum con la habilidad del ciclista
     * @param energia double energía que posee el ciclista
     * @param equipo Equipo equipo al que pertenece el ciclista
     * 
     */
    public CiclistaNovato(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
    }

    @Override
    public double destrezaCiclista() {
        return Math.round((((super.getHabilidad().getHabilidadE() + 2)/120)*10)*100d) / 100d ;
    }

    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<CiclistaNovato:"+super.getNombreC()+"> <energía: "+super.getEnergia()+"> <habilidad:"+super.getHabilidad().getnHabE()+
        " (valor:"+super.getHabilidad().getHabilidadE()+")> <tiempo acumulado sin abandonar: "+super.tiempoTotal()+"> <abandonado:"+super.getAbandono()+">";
        return etapaString;
    }
}
