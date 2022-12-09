
/**
 * Clase que ejecuta las funcionalidades de la bicicleta prototipo y almacena sus datos.
 * Esta clase extiende de BicicletaNormal ya que tiene propiedades distintas.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.5)
 */
public class BicicletaPrototipo extends BicicletaNormal{

    /**                                
     * Constructor de la clase BicicletaNormal
     * 
     * @param nombreC String nombre de la bicicleta
     * @param peso Peso enum con el peso de la bicicleta
     * 
     */
    public BicicletaPrototipo(String modelo, Peso peso) {
        super(modelo, peso);
    }

    @Override
    public double tiempoEtapa(Ciclista c, Etapa e) {
        return Math.round((e.getDistancia().getDistanciaE()/(super.velocidadBici(c,e)*c.destrezaCiclista()))*100d) / 100d;
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<BicicletaPrototipo: "+super.getNombre()+"> <peso: "+super.getPeso().getTipoE()+" (valor: "+super.getPeso().getPesoE()+")> en etapa ";
        return etapaString;
    }
}
