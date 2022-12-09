import java.util.ArrayList;
/**
 * Interfaz con las funcionalidades de la organizacion.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.9)
 */
public interface Organizacion
{
    /**
     * Método que establece la lista de etapas del campeonato
     * @param L_Etapas ArrayList<Etapa>
     */
    void setEtapa(ArrayList<Etapa> L_Etapas);
    
    /**
     * Devuelve una lista de etapas que posee el campeonato
     * @return l_etapas ArrayList<Etapa>
     */
    ArrayList<Etapa> getEtapa();
    
    /**
     * Método que añade una etapa al campeonato
     * @param etapa Etapa
     */
    void addEtapa(Etapa etapa);

    /**
     * Método que establece la lista de equipos del campeonato
     * @param L_Equipos ArrayList<Equipo>
     */
    void setL_Equipos(ArrayList<Equipo> L_Equipos);

    /**
     * Devuelve una lista de equipos que posee el campeonato
     * @return l_equipos ArrayList<Equipo>
     */
    ArrayList<Equipo> getL_Equipos();

    /**
     * Método que establece la lista de ciclistas del campeonato
     * @param L_CiclistasCarrera ArrayList<Ciclista>
     */
    void setL_CiclistasCarrera(ArrayList<Ciclista> L_CiclistasCarrera);

    /**
     * Devuelve una lista de ciclistas que continuan en el campeonato
     * @return l_ciclistas ArrayList<Ciclista>
     */
    ArrayList<Ciclista> getL_CiclistasCarrera();
    
    /**
     * Método que añade un equipo al campeonato
     * @param equipo Equipo
     */
    void addEquipo(Equipo equipo);

    /**
     * Método que añade un ciclista al campeonato
     * @param ciclista Ciclista
     */
    void addCiclista(Ciclista ciclista);

    /**
     * Devuelve una cadena con los datos de la etapa
     * @return datosEtapa String
     */
    String informacionEtapa();
    
    /**
     * Devuelve una cadena con los datos del equipo
     * @return datosEquipo String
     */
    String equiposInfo();
    
    /**
     * Método almacena los ciclistas del campeonato en una variable local
     */
    void guardarTodosCiclistas();
    
    /**
     * Método asigna una bicicleta a cada ciclista
     */
    void asignarBicisACiclistas();
    
    /**
     * Devuelve una lista de todos ciclistas que participan el campeonato
     * @return l_ciclistas ArrayList<Ciclista>
     */
    ArrayList<Ciclista> getL_Ciclistas();
    
    /**
     * Devuelve una cadena con los datos de la clasificacion de una etapa
     * @param L_Ciclistas ArrayList<Ciclista>
     * @param etapa Etapa
     * @return datosEquipo String
     */
    String clasificacionEtapa(ArrayList<Ciclista> L_Ciclistas, Etapa etapa);
    
    /**
     * Devuelve una cadena con los datos de ejecutar una etapa
     * @param etapa Etapa
     * @return datosEquipo String
     */
    String ejecutarEtapa(Etapa etapa);
    
    /**
     * Método ejecuta las acciones necesarias para comenzar el campeonato
     */
    void gestionarCampeonato();
}
