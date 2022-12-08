import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase que dedrdr
 * @author 
 * @version 
 */
public abstract class AbstractCiclista implements Ciclista {
    private String nombreC;
    private Bicicleta bici;
    private Habilidad habilidad;
    private double energia;
    private ArrayList<Resultado> resultados;
    private Equipo equipo;
    private boolean abandono;
    public AbstractCiclista(String nombreC, Habilidad habilidad, double energia,Equipo equipo) {
        this.nombreC = nombreC;
        this.habilidad = habilidad;
        this.energia = energia;
        this.equipo = equipo;
        resultados = new ArrayList<>();
        this.abandono = false;
    } 
    
    /**
     * hjkhuhk
     * @param abndono 
     * @return 
     */
    @Override
    public boolean getAbandono() {
        return abandono;
    }

    @Override
    public void setAbandono(boolean abandono) {
        this.abandono = abandono;
    }

    @Override
    public String getNombreC() {
        return nombreC;
    }

    @Override
    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    @Override
    public Bicicleta getBici() {
        return bici;
    }

    @Override
    public void setBici(Bicicleta bici) {
        this.bici = bici;
    }

    @Override
    public Habilidad getHabilidad() {
        return habilidad;
    }

    @Override
    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public double getEnergia() {
        return Math.round((energia)*100d) / 100d;
    }

    @Override
    public void setEnergia(double energia) {
        this.energia = Math.round((energia)*100d) / 100d;
    }

    @Override
    public ArrayList<Resultado> getResultados() {
        return resultados;
    }

    @Override
    public void setResultados(ArrayList<Resultado> resultados) {
        this.resultados = resultados;
    }

    @Override
    public Equipo getEquipo() {
        return equipo;
    }

    @Override
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    @Override
    public double energiaRestante(Etapa e){
        double t = bici.tiempoEtapa(this, e);
        double g = getEnergia();
        g = g - t;
        return Math.round((g)*100d) / 100d;
    }

    @Override
    public Resultado realizarEtapa(Etapa e){
        double t = bici.tiempoEtapa(this, e);
        boolean abandona = t > getEnergia();
        double g = energiaRestante(e);
        Resultado r = new Resultado(Math.round((t)*100d) / 100d, abandona, e, Math.round((g)*100d) / 100d);
        resultados.add(r);
        setEnergia(Math.round((g)*100d) / 100d);
        return r;
    }
    
    @Override
    public int totalEtapas(){
       return resultados.size();
    }
    
    @Override
    public int etapasTerminadas(){
        int a = totalEtapas();
        if(resultados.get(a-1).isAbandono()){
            a--;
        }
        return a;
    }
    
    @Override
    public double tiempoTotal(){
        double t = 0;
        for (Resultado r: resultados){
            if(!r.isAbandono()) {
                t = t + r.getTiempo();
            }
        }
        return Math.round((t)*100d) / 100d;
    }
    
    @Override
    public Etapa etapaAbandono(){
        int a = totalEtapas();
        Resultado r = resultados.get(a-1);
        if(r.isAbandono()){
            return r.getEtapa();
        }
        return null;
    }
    
    @Override
    public Resultado getResultado(Etapa etapa)
    {
        for(Resultado resultado : resultados)
        {
            if(etapa.equals(resultado.getEtapa()))
            {
                return resultado;
            }
        }
        return null;
    }
    
    @Override
    public String resultadosEtapa(Etapa etapa)
    {
        StringBuilder res = new StringBuilder();
        realizarEtapa(etapa);
        res.append(getBici().toString()+etapa.getNombre()+"\n");
        
        res.append("+++ Con estas condiciones el ciclista "+getNombreC()+" con la bicicleta "+getBici().getNombre()+" alcanza una velocidad de "+
        getBici().velocidadBici(this, etapa)+" km/hora +++\n");
        
        if(getResultado(etapa).getTiempo() > 0)
        {
            res.append("+++ " + getNombreC() + " termina la etapa en " + getResultado(etapa).getTiempo() + " minutos +++\n");          
        }
        
        res.append("+++ La energía del ciclista "+getNombreC()+" tras la carrera es "+getEnergia()+" +++\n");
        res.append("@@@\n");
        return res.toString();
    }

    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<Ciclista:"+this.nombreC+"> <energía: "+this.energia+"> <habilidad:"+this.habilidad.getnHabE()+
        " (valor:"+this.habilidad.getHabilidadE()+")> <tiempo acumulado sin abandonar: "+tiempoTotal()+"> <abandonado:"+this.abandono+">";
        return etapaString;
    }

}