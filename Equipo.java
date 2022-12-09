import java.util.ArrayList;
import java.util.Comparator;
/**
 * Write a description of interface Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Equipo
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    void ordenarBicicletas();

    void ordenarCiclistas();
    
    void setNombre(String nombre);
    
    String getNombre();
    
    void setL_Bicicletas(ArrayList<Bicicleta> L_Bicicletas);
    
    ArrayList<Bicicleta> getL_Bicicletas();
    
    void setL_Ciclistas(ArrayList<Ciclista> L_Ciclistas);
    
    ArrayList<Ciclista> getL_Ciclistas();
    
    void setC_Ciclistas(Comparator<Ciclista> C_Ciclistas);
    
    Comparator<Ciclista> getC_Ciclistas();
    
    void setC_Bicicletas(Comparator<Bicicleta> C_Bicicletas);
    
    Comparator<Bicicleta> getC_Bicicletas();
    
    void insertarBicicleta(Bicicleta bicicleta);
    
    void insertarCiclista(Ciclista ciclista);
    
    void insertarCiclistaAbandonado(Ciclista ciclistaAbandonado);
    
    void asignarBicis();
    
    double getTiempoMedioTotal();
    
    double getTiempoMedioTotalSinAbandonar();
    
    double getTotalPoints();
    
    void ordenFinalCampeonato();
    
    String toString();
}
