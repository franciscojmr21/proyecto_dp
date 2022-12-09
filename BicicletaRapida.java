
/**
 * Clase que ejecuta las funcionalidades de la bicicleta rapida y almacena sus datos.
 * Esta clase extiende de BicicletaNormal ya que tiene propiedades distintas.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.9)
 */
public class BicicletaRapida extends BicicletaNormal{

    private double velExtra;

    /**                                
     * Constructor de la clase BicicletaNormal
     * 
     * @param nombreC String nombre de la bicicleta
     * @param peso Peso enum con el peso de la bicicleta
     * @param velExtra double velocidad extra de la bicicleta
     * 
     */
    public BicicletaRapida(String modelo, Peso peso, double velExtra ) {
        super(modelo, peso);
        this.velExtra = velExtra;
    }

    /**
     * Devuelve la velocidad extra de la bicicleta
     * @return velocidadExtra double
     */
    public double getVelExtra() {
        return Math.round((velExtra)*100d) / 100d;
    }

    /**
     * Método que establece la velocidad extra de la bicicleta
     * @param velExtra double
     */
    public void setVelExtra(double velExtra) {
        this.velExtra = Math.round((velExtra)*100d) / 100d;
    }

    @Override
    public double velocidadBici(Ciclista c, Etapa e) {
        return Math.round(((super.velocidadBici(c, e) + getVelExtra()))*100d) / 100d;
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<BicicletaRapida: "+super.getNombre()+"> <peso: "+super.getPeso().getTipoE()+" (valor: "+super.getPeso().getPesoE()+
        ")> <velocidad extra: "+this.getVelExtra()+"> en etapa ";
        return etapaString;
    }
}
