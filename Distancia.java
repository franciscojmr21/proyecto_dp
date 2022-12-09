/**
 * Clase enum que almacena el la distancia de la etapa
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.3)
 */
public enum Distancia {
    CORTA("Corta",150),
    INTERMEDIA("Intermedia",200),
    LARGA("Larga",225);

    private final String nombre;

    private final double distancia;

    /**                                
     * Constructor del enum Distancia
     * 
     * @param a String nombre de la distancia
     * @param b double valor de la distancia de la etapa
     * 
     */
    private Distancia( String a, double b){
        this.nombre = a;
        this.distancia = b;
    }
    
    /**
     * Devuelve el nombre de la distancia
     * @return distancia String
     */
    public String getNombreE(){
        return nombre;
    }

    /**
     * Devuelve el valor de la distancia
     * @return distancia double
     */
    public double getDistanciaE(){
        return distancia;
    }
}
