
/**
 * Write a description of class CiclistaExperimentado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CiclistaExperimentado extends  Ciclista {


    public CiclistaExperimentado(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
    }

    public double destrezaCiclista() {
        return Math.round((((super.getHabilidad().getHabilidadE() + 4)/130)*10)*100d) / 100d;
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<CiclistaExperimentado:"+super.getNombreC()+"> <energía: "+super.getEnergia()+"> <habilidad:"+super.getHabilidad().getnHabE()+
        " (valor:"+super.getHabilidad().getHabilidadE()+")> <tiempo acumulado sin abandonar: "+super.tiempoTotal()+"> <abandonado:"+super.getAbandono()+">";
        return etapaString;
    }
}

