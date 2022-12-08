import java.util.ArrayList;
/**
 * Write a description of interface Ciclista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Ciclista
{
    
    /**
     * hjkhuhk
     * @param abndono 
     * @return 
     */
    boolean getAbandono();

    void setAbandono(boolean abandono);

    String getNombreC();

    void setNombreC(String nombreC);

    Bicicleta getBici();

    void setBici(Bicicleta bici);

    Habilidad getHabilidad();

    void setHabilidad(Habilidad habilidad);
    
    double getEnergia();

    void setEnergia(double energia);

    ArrayList<Resultado> getResultados();

    void setResultados(ArrayList<Resultado> resultados);

    Equipo getEquipo();

    void setEquipo(Equipo equipo);
    
    double energiaRestante(Etapa e);

    Resultado realizarEtapa(Etapa e);
    
    int totalEtapas();
    
    int etapasTerminadas();
    
    double tiempoTotal();
    
    Etapa etapaAbandono();
    
    Resultado getResultado(Etapa etapa);
    
    String resultadosEtapa(Etapa etapa);

    String toString();
    
    double destrezaCiclista();
}
