
/**
 * Write a description of class CiclistaNovato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CiclistaNovato  extends AbstractCiclista{

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
