/**
 * Clase que ejecuta las funcionalidades de la bicicleta normal y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.7)
 */
public class BicicletaNormal implements Bicicleta {
    private String nombre;
    private Peso peso;
    
    /**                                
     * Constructor de la clase BicicletaNormal
     * 
     * @param nombreC String nombre de la bicicleta
     * @param peso Peso enum con el peso de la bicicleta
     * 
     */
    public BicicletaNormal(String nombre, Peso peso) {
        this.nombre = nombre;
        this.peso = peso;
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
    public Peso getPeso() {
        return peso;
    }

    @Override
    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    @Override
    public double velocidadBici(Ciclista c, Etapa e){
        return Math.round(((c.getHabilidad().getHabilidadE()*100)/(getPeso().getPesoE()*e.getDificultad().getDificultadE()))*100d) / 100d;
    }

    @Override
    public double tiempoEtapa(Ciclista c, Etapa e){
        return Math.round(((e.getDistancia().getDistanciaE()/velocidadBici(c,e))*60)*100d) / 100d;
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<Bicicleta: "+this.nombre+"> <peso: "+this.peso.getTipoE()+" (valor: "+this.peso.getPesoE()+")> en etapa ";
        return etapaString;
    }
}
