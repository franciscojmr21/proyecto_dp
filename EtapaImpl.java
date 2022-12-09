import java.util.Objects;
/**
 * Clase que ejecuta las funcionalidades de la etapa y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.8)
 */
public class EtapaImpl implements Etapa{
    private String nombre;
    private Dificultad dificultad;
    private Distancia distancia;

    /**                                
     * Constructor de la clase EtapaImpl
     * 
     * @param nombreC String nombre de la etapa
     * @param dificultad Dificultad enum con la dificultad de la etapa
     * @param distancia Distancia enum con la distancia de la etapa
     * 
     */
    public EtapaImpl(String nombre, Dificultad dificultad, Distancia distancia) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.distancia = distancia;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Dificultad getDificultad() {
        return dificultad;
    }

    @Override
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public Distancia getDistancia() {
        return distancia;
    }

    @Override
    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }

    @Override
    public boolean equals(Etapa etapa) {
        if (this == etapa) return true;
        if (etapa == null || getClass() != etapa.getClass()) return false;
        return this.nombre.equals(etapa.getNombre()) && this.dificultad == etapa.getDificultad() && this.distancia == etapa.getDistancia();
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dificultad, distancia);
    }

    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<etapa:"+this.nombre+"> <dificultad:"+this.dificultad.getGradoE()+" (valor:"+this.dificultad.getDificultadE()+
        ")> <distancia:"+this.distancia.getNombreE()+" (valor:"+this.distancia.getDistanciaE()+")>";
        return etapaString;
    }
    
}
