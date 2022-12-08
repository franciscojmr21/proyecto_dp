
/**
 * Write a description of interface Bicicleta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Bicicleta
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    String getNombre();

    void setNombre(String nombre);

    Peso getPeso();

    void setPeso(Peso peso);

    double velocidadBici(Ciclista c, Etapa e);

    double tiempoEtapa(Ciclista c, Etapa e);
    
    String toString();
}
