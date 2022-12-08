
/**
 * Write a description of interface Etapa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Etapa
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public String getNombre();

    public void setNombre(String nombre);

    public Dificultad getDificultad();

    public void setDificultad(Dificultad dificultad);

    public Distancia getDistancia();

    public void setDistancia(Distancia distancia);

    public boolean equals(Etapa etapa);

    public int hashCode();

    public String toString();
}
