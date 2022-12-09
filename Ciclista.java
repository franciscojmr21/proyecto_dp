import java.util.ArrayList;
import java.util.HashMap;
/**
 * Interfaz con las funcionalidades del ciclista y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.17)
 */
public interface Ciclista
{
    /**
     * Devuelve el nombre de la etapa actual
     * @return etapaActual String
     */
    String getEtapaActual();

    /**
     * Método que establece el nombre de la etapa actual
     * @param etapaActual String
     */
    void setEtapaActual(String etapaActual);
    
    /**
     * Devuelve si el ciclista ha abandonado el campeonato
     * @return abandono boolean
     */
    boolean getAbandono();

    /**
     * Método que establece si el ciclista ha abandonado
     * @param abandono boolean
     */
    void setAbandono(boolean abandono);
    
    /**
     * Devuelve el nombre del ciclista
     * @return nombreC String
     */
    String getNombreC();

    /**
     * Método que establece el nombre del ciclista
     * @param nombreC String
     */
    void setNombreC(String nombreC);
    
    /**
     * Devuelve la bicicleta asignada al ciclista
     * @return bici Bicileta
     */
    Bicicleta getBici();

    /**
     * Método que establece la bicicleta del ciclista
     * @param bici Bicicleta
     */
    void setBici(Bicicleta bici);
    
    /**
     * Devuelve la habilidad del ciclista
     * @return habilidad Habilidad
     */
    Habilidad getHabilidad();

    /**
     * Método que establece la habilidad del ciclista
     * @param habilidad Habilidad
     */
    void setHabilidad(Habilidad habilidad);
    
    /**
     * Devuelve la energía del ciclista
     * @return energia Double
     */
    double getEnergia();

    /**
     * Método que establece la energia del ciclista
     * @param energia double
     */
    void setEnergia(double energia);
    
    /**
     * Devuelve el HashMap con los resultados de las etapas del ciclista
     * @return resultados HashMap<String,Resultado>
     */
    HashMap<String,Resultado> getResultados();

    /**
     * Método que establece el HashMap de resultados del campeonato del ciclista
     * @param resultados HashMap<String,Resultado>
     */
    void setResultados(HashMap<String,Resultado> resultados);
    
    /**
     * Devuelve el equipo al que pertenece el ciclista
     * @return equipo Equipo
     */
    Equipo getEquipo();

    /**
     * Método que establece el equipo al que pertenece el ciclista
     * @param equipo Equipo
     */
    void setEquipo(Equipo equipo);
    
    /**
     * Devuelve la energía restante del ciclista despúes de haber corrido la etapa
     * @param Etapa e
     * @return energia Double
     */
    double energiaRestante(Etapa e);
    
    /**
     * Realiza las operaciones correspondiantes a que el ciclista corre una etapa y devuleve el resultado
     * @param Etapa e
     * @return resultado Resultado
     */
    Resultado realizarEtapa(Etapa e);
    
    /**
     * Devuelve el total de etapas realizadas por el ciclista
     * @return totalEtapas int
     */
    int totalEtapas();
    
    /**
     * Devuelve el total de etapas realizadas sin abandonar por el ciclista
     * @return etapasTermindas int
     */
    int etapasTerminadas();
    
    /**
     * Devuelve el tiempo total que el ciclista ha corrido en el campeonato
     * @return tiempoTotal double
     */
    double tiempoTotal();
    
    /**
     * Devuelve la etapa en la que el ciclista ha abandonado el campeonato
     * @return etapa Etapa
     */
    Etapa etapaAbandono();
    
    /**
     * Devuelve el resultado de una etapa específica
     * @param Etapa e
     * @return resultado Resultado
     */
    Resultado getResultado(Etapa etapa);
    
    /**
     * Devuelve una cadena en la cual se muestra los datos del ciclista en una etapa
     * @param Etapa e
     * @return datosEtapa String
     */
    String resultadosEtapa(Etapa etapa);

    /**
     * Devuelve una cadena con los datos técnicos del ciclista
     * @return datosCiclista String
     */
    String toString();
    
    /**
     * Devuelve la destreza del ciclista
     * @return destreza double
     */
    double destrezaCiclista();
}
