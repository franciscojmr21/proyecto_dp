
/**
 * Write a description of class CiclistaEstrella here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CiclistaEstrella extends Ciclista{

    private double popularidad;
    private double popularidadAnterior;

    public CiclistaEstrella(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
        this.popularidad = 6;
        this.popularidadAnterior = 0;
    }

    public double destrezaCiclista() {
        return ((getHabilidad().getHabilidadE() + 6)/140)*10;
    }

    public double getPopularidad() {
        return popularidad;
    }
    
    public void setPopularidadAnterior(double popularidad){
        this.popularidadAnterior = popularidad;
    }
    
    public double getPopularidadAnterior(){
        return this.popularidadAnterior;
    }

    public void aumentarPopularidad(Etapa e) {
        double a = this.popularidad;
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
        
        if(super.getResultado(etapa).getTiempo() > 0)
        {
            res.append("+++ " + super.getNombreC() + " termina la etapa en " + Math.round((super.getResultado(etapa).getTiempo())*100d) / 100d + " minutos +++\n");          
        }
        
        res.append("+++ La energía del ciclista "+super.getNombreC()+" tras la carrera es "+Math.round((super.getEnergia())*100d) / 100d+" +++\n");
        res.append("@@@\n");
        if(getPopularidadAnterior()<getPopularidad()){
            res.append("+++ La popularidad del ciclista ");
            res.append(super.getNombreC());
            res.append(" ha aumentado  y ahora su nivel de popularidad es de: ");
            res.append(getPopularidad());
            res.append("unidades\n");
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
