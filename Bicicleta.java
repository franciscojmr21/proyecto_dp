
/**
 * Interfaz con las funcionalidades del equipo y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.4)
 */
public interface Bicicleta
{
    /**
     * Devuelve el nombre de la bicicleta
     * @return nombre String
     */
    String getNombre();

    /**
     * Método que establece el nombre de la bicicleta
     * @param nombre String
     */
    void setNombre(String nombre);

    /**
     * Devuelve el peso de la bicicleta
     * @return peso Peso
     */
    Peso getPeso();

    /**
     * Método que establece el peso de la bicicleta
     * @param peso Peso
     */
    void setPeso(Peso peso);

    /**
     * Devuelve la velocidad de la bicicleta dado un ciclista en una etapa
     * @param c Ciclista
     * @param e Etapa
     * @return velocidad double
     */
    double velocidadBici(Ciclista c, Etapa e);

    /**
     * Devuelve la tiempo que tarda una bicicleta dado un ciclista en una etapa
     * @param c Ciclista
     * @param e Etapa
     * @return tiempoEtapa double
     */
    double tiempoEtapa(Ciclista c, Etapa e);
    
    /**
     * Devuelve una cadena con los datos de la bicicleta
     * @return datosBicicleta String
     */
    String toString();
}
