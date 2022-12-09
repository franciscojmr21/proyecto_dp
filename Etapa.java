
/**
 * Interfaz con las funcionalidades de etapa y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.8)
 */
public interface Etapa
{
    /**
     * Devuelve el nombre de la etapa
     * @return nombre String
     */
    String getNombre();

    /**
     * Método que establece el nombre de la etapa
     * @param peso Peso
     */
    void setNombre(String nombre);

    /**
     * Devuelve la dificultad de la etapa
     * @return dificualtad Dificultad
     */
    Dificultad getDificultad();

    /**
     * Método que establece la dificultad de la etapa
     * @param dificultad Dificultad
     */
    void setDificultad(Dificultad dificultad);

    /**
     * Devuelve la distancia de la etapa
     * @return nombre String
     */
    Distancia getDistancia();

    /**
     * Método que establece la distancia de la etapa
     * @param distancia Distancia
     */
    void setDistancia(Distancia distancia);

    /**
     * Devuelve si la etapa es la misma que la introducida por parametros
     * @param etapa Etapa
     * @return igual boolean
     */
    boolean equals(Etapa etapa);

    /**
     * Devuelve hascode de la etapa
     * @return hascode int
     */
    int hashCode();

    /**
     * Devuelve una cadena con los datos de la etapa
     * @return datosEtapa String
     */
    String toString();
}
