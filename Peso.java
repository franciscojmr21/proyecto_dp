
/**
 * Clase enum que almacena el peso de la bicicleta
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.3)
 */
public enum Peso {
    LIGERA("Ligera", 7.35),
    NORMAL("Normal", 7.50),
    PESADA("Pesada", 7.85);

    private final String tipo;

    private final double peso;

    /**                                
     * Constructor del enum Peso
     * 
     * @param a String nombre del peso
     * @param b double valor del peso de la bicicleta
     * 
     */
    private Peso( String a, double b){

        this.tipo = a;
        this.peso = b;

    }

    /**
     * Devuelve el nombre del peso
     * @return peso String
     */
    public String getTipoE() {
        return tipo;
    }

    /**
     * Devuelve el valor del peso
     * @return peso double
     */
    public double getPesoE() {
        return peso;
    }
}


