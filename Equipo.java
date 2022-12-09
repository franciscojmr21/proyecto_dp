import java.util.ArrayList;
import java.util.Comparator;
/**
 * Interfaz con las funcionalidades del equipo y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.4)
 */
public interface Equipo
{
    /**
     * Método que ordena la lista de bicicletas que posee el equipo, según el comparador que implementa para las bicicletas
     */
    void ordenarBicicletas();

    /**
     * Método que ordena la lista de ciclistas que posee el equipo, según el comparador que implementa para los ciclistas
     */
    void ordenarCiclistas();
    
    /**
     * Método que establece el nombre del equipo
     * @param nombre String
     */
    void setNombre(String nombre);
    
    /**
     * Devuelve el nombre del equipo
     * @return nombre String
     */
    String getNombre();
    
    /**
     * Método que establece la lista de bicicletas del equipo
     * @param L_Bicicletas ArrayList<Bicicleta>
     */
    void setL_Bicicletas(ArrayList<Bicicleta> L_Bicicletas);
    
    /**
     * Devuelve la lista de bicicletas que posee el equipo
     * @return L_Bicicletas ArrayList<Bicicleta>
     */
    ArrayList<Bicicleta> getL_Bicicletas();
    
    /**
     * Método que establece la lista de ciclistas del equipo
     * @param L_Ciclistas ArrayList<Ciclista>
     */
    void setL_Ciclistas(ArrayList<Ciclista> L_Ciclistas);
    
    /**
     * Devuelve la lista de ciclistas que posee el equipo
     * @return L_Ciclistas ArrayList<Ciclista>
     */
    ArrayList<Ciclista> getL_Ciclistas();
    
    /**
     * Método que establece comparador para ordenar los ciclistas del equipo
     * @param C_Ciclistas Comparator<Ciclista>
     */
    void setC_Ciclistas(Comparator<Ciclista> C_Ciclistas);
    
    /**
     * Devuelve el comparador que ordena los ciclistas del equipo
     * @return C_Ciclistas Comparator<Ciclista>
     */
    Comparator<Ciclista> getC_Ciclistas();
    
    /**
     * Método que establece el comparador para ordenar las bicicletas del equipo
     * @param C_Bicicletas ArrayList<Bicicletas>
     */
    void setC_Bicicletas(Comparator<Bicicleta> C_Bicicletas);
    
    /**
     * Devuelve el comparador que ordena las bicicletas del equipo
     * @return C_Bicicletas Comparator<Bicicleta>
     */
    Comparator<Bicicleta> getC_Bicicletas();
    
    /**
     * Método que inserta una bicicleta al equipo
     * @param bicicleta Bicicleta
     */
    void insertarBicicleta(Bicicleta bicicleta);
    
    /**
     * Método que inserta un ciclista al equipo
     * @param bicicleta Bicicleta
     */
    void insertarCiclista(Ciclista ciclista);

    /**
     * Método que inserta un ciclista a la lista de ciclistas que han abandonado el campeonato del equipo
     * @param ciclistaAbandonado Ciclista
     */
    void insertarCiclistaAbandonado(Ciclista ciclistaAbandonado);
    
    /**
     * Método que asiga una bicicleta a cada ciclista que no haya abandonado el campeonato.
     */
    void asignarBicis();
    
    /**
     * Devuelve tiempo total que han tardado todos los ciclistas del equipo en todas las etapas
     * @return tiempoTotal double
     */
    double getTiempoMedioTotal();
    
    /**
     * Devuelve tiempo total que han tardado todos los ciclistas que no han abandonado del equipo en todas las etapas
     * @return tiempoTotalSinAbandonar double
     */
    double getTiempoMedioTotalSinAbandonar();
    
    /**
     * Devuelve todos los puntos que poseen los ciclistas del equipo
     * @return puntosTotales double
     */
    double getTotalPoints();
    
    /**
     * Método que ordena los ciclistas según el comparador, sinedo primeros los que no hayan abandonado el campeonato
     */
    void ordenFinalCampeonato();
    
    /**
     * Devuelve una cadena con los datos recogidos del equipo
     * @return datosEquipo String
     */
    String toString();
}
