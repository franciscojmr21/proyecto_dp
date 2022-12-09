
/**
 * Clase enum que almacena el la dificultad de la etapa
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.3)
 */
public enum Dificultad {
    SENCILLA("Sencilla" , 0.9),
    NORMAL("Normal" , 1.0),
    COMPLEJA("Compleja" , 1.1);

    private final String grado;
    private final double dificultad;

    /**                                
     * Constructor del enum Dificultad
     * 
     * @param a String nombre de la dificultad
     * @param b double valor de la dificultad de la etapa
     * 
     */
    private Dificultad( String a, double b){
        this.grado = a;
        this.dificultad = b;
    }

    /**
     * Devuelve el nombre de la dificultad
     * @return dificultad String
     */
    public double getDificultadE() {
        return dificultad;
    }

    /**
     * Devuelve el valor de la dificultad
     * @return dificultad double
     */
    public String getGradoE() {
        return grado;
    }
}
