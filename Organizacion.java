import java.util.ArrayList;
/**
 * Write a description of interface Organizacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Organizacion
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    void setEtapa(ArrayList<Etapa> L_Etapas);
    
    ArrayList<Etapa> getEtapa();
    
    void addEtapa(Etapa etapa);

    void setL_Equipos(ArrayList<Equipo> L_Equipos);

    ArrayList<Equipo> getL_Equipos();

    void setL_CiclistasCarrera(ArrayList<Ciclista> L_CiclistasCarrera);

    ArrayList<Ciclista> getL_CiclistasCarrera();
    
    void addEquipo(Equipo equipo);

    void addCiclista(Ciclista ciclista);

    String informacionEtapa();
    
    String equiposInfo();
    
    void guardarTodosCiclistas();
    
    void asignarBicisACiclistas();
    
    ArrayList<Ciclista> getL_Ciclistas();
    
    String clasificacionEtapa(ArrayList<Ciclista> L_Ciclistas, Etapa etapa);
    
    String ejecutarEtapa(Etapa etapa);
    
    void gestionarCampeonato();
}
