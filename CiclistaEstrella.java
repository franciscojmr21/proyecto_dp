
/**
 * Clase que ejecuta las funcionalidades del ciclista estrella y almacena sus datos.
 * Esta clase extiende de AbstractCiclista ya que tiene propiedades distintas.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.2)
 */
public class CiclistaEstrella extends AbstractCiclista{

    private int popularidad;
    private int popularidadAnterior;
    
    /**                                
     * Constructor de la clase CiclistaEstrella
     * 
     * @param nombreC String nombre del ciclista
     * @param habilidad Habilidad enum con la habilidad del ciclista
     * @param energia double energía que posee el ciclista
     * @param equipo Equipo equipo al que pertenece el ciclista
     * 
     */
    public CiclistaEstrella(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
        this.popularidad = 6;
        this.popularidadAnterior = 0;
    }

    @Override
    public double destrezaCiclista() {
        return Math.round((((getHabilidad().getHabilidadE() + 6)/140)*10)*100d) / 100d;
    }

    /**
     * Devuelve la popularidad del CiclistaEstrella
     * @return popularidad int
     */
    public int getPopularidad() {
        return popularidad;
    }
    
    /**
     * Método que establece la popularidad que tenía el ciclistaEstrella en la anterior etapa
     * @param popularidad int
     */
    public void setPopularidadAnterior(int popularidad){
        this.popularidadAnterior = popularidad;
    }
    
    /**
     * Devuelve la popularidad anterior a la etapa realizada del CiclistaEstrella
     * @return popularidadAnterior int
     */
    public int getPopularidadAnterior(){
        return this.popularidadAnterior;
    }

    /**
     * Método que calcula la popularidad que obtiene el ciclistaEstrella al relizar la etapa
     * @param e Etapa
     */
    public void aumentarPopularidad(Etapa e) {
        int a = this.popularidad;
        setPopularidadAnterior(this.popularidad);
        double tiempo = super.getBici().tiempoEtapa(this, e);
        if(tiempo < 160){
            a = a + 4;
        }
        else{
            a--;
        }
        this.popularidad = a;
    }
    
    @Override
    public String resultadosEtapa(Etapa etapa)
    {
        StringBuilder res = new StringBuilder();
        super.realizarEtapa(etapa);
        aumentarPopularidad(etapa);
        res.append(super.getBici().toString()+etapa.getNombre()+"\n");
        
        res.append("+++ Con estas condiciones el ciclista "+super.getNombreC()+" con la bicicleta "+super.getBici().getNombre()+" alcanza una velocidad de "+
        Math.round((super.getBici().velocidadBici(this, etapa))*100d) / 100d+" km/hora +++\n");
        
        if(getEnergia()>0)
        {
            res.append("+++ " + getNombreC() + " termina la etapa en " + getResultado(etapa).getTiempo() + " minutos +++\n");
        }
        else{
            res.append("¡¡¡ El ciclista "+getNombreC()+" se quedó sin energia a falta de "+Math.abs(getEnergia())+" minutos para terminar !!!\n");
            res.append("¡¡¡ En el momento de quedarse sin energia llevaba en carrera "+Math.round(((getResultado(etapa).getTiempo()+getEnergia()))*100d) / 100d+" minutos !!!\n");
        }
        
        res.append("+++ La energía del ciclista "+super.getNombreC()+" tras la carrera es "+Math.round((super.getEnergia())*100d) / 100d+" +++\n");
        res.append("@@@\n");
        if(getPopularidadAnterior()<getPopularidad()){
            res.append("+++ La popularidad del ciclista ");
            res.append(super.getNombreC());
            res.append(" ha aumentado  y ahora su nivel de popularidad es de: ");
            res.append(getPopularidad());
            res.append(" unidades\n");
            res.append("@@@\n");
        }
        if(getPopularidadAnterior()>getPopularidad()){
            res.append("--- La popularidad del ciclista ");
            res.append(super.getNombreC());
            res.append(" ha disminuido  y ahora su nivel de popularidad es de: ");
            res.append(getPopularidad());
            res.append("unidades\n");
            res.append("@@@\n");
        }
        return res.toString();
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<CiclistaEstrella:"+super.getNombreC()+"> <energía: "+Math.round((super.getEnergia())*100d) / 100d+"> <habilidad:"+super.getHabilidad().getnHabE()+
        " (valor:"+super.getHabilidad().getHabilidadE()+")> <tiempo acumulado sin abandonar: "+Math.round((super.tiempoTotal())*100d) / 100d+"> <abandonado:"+super.getAbandono()+
        "> <popularidad: "+getPopularidad()+">";
        return etapaString;
    }

}
