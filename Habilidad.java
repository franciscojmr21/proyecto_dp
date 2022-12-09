
/**
 * Clase enum que almacena la habilidad del ciclista
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.1)
 */
public enum Habilidad {
    LENTA("Lenta", 4.0),
    NORMAL("Normal", 6.0),
    BUENA("Buena", 8.0);

    private final String nHab;
    private final double habilidad;
    
    /**                                
     * Constructor del enum Habilidad
     * 
     * @param a String nombre de la habilidad
     * @param b double valor de la habilidad del ciclista
     * 
     */
    Habilidad(String a, double b) {
        this.nHab = a;
        this.habilidad = b;
    }
    
    /**
     * Devuelve el nombre de la habilidad
     * @return habilidad String
     */
    public String getnHabE(){
        return nHab;
    }
    
    /**
     * Devuelve el valor de la habilidad
     * @return habilidad double
     */
    public double getHabilidadE(){
        return habilidad;
    }
}

