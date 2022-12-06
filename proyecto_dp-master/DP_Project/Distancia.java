public enum Distancia {
    CORTA("Corta",150),
    INTERMEDIA("Intermedia",200),
    LARGA("Larga",225);

    private final String nombre;

    private final double distancia;

    private Distancia( String a, double b){
        this.nombre = a;
        this.distancia = b;
    }
    public String getNombreE(){
        return nombre;
    }

    public double getDistanciaE(){
        return distancia;
    }
}
