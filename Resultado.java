
/**
 * Interfaz con las funcionalidades de los resultados y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.5)
 */
public interface Resultado
{
    /**
     * Devuelve el tiempo de la etapa
     * @return nombre String
     */
    double getTiempo();

    /**
     * Método que establece el tiempo de la etapa
     * @param tiempo double
     */
    void setTiempo(double tiempo);

    /**
     * Devuelve si el ciclista ha abandonado la competicion la etapa
     * @return abandono boolean
     */
    boolean isAbandono();

    /**
     * Método que establece si ha abandonado el ciclista la competicion en la etapa
     * @param abandono boolean
     */
    void setAbandono(boolean abandono);

    /**
     * Devuelve la etapa
     * @return etapa Etapa
     */
    Etapa getEtapa();

    /**
     * Método que establece la etapa donde se obtinen los resultados
     * @param etapa Etapa
     */
    void setEtapa(Etapa etapa);

    /**
     * Devuelve la energia restante del ciclista en la etapa
     * @return energia double
     */
    double getEnergia();

    /**
     * Método que establece la energia restante del ciclista en la etapa
     * @param energia double
     */
    void setEnergia(double energia);
}
