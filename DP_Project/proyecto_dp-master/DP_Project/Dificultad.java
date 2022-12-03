public enum Dificultad {
    SENCILLA("Sencilla" , 0.9),
    NORMAL("Normal" , 1.0),
    COMPLEJA("Compleja" , 1.1);

    private final String grado;
    private final double dificultad;

    private Dificultad( String a, double b){
        this.grado = a;
        this.dificultad = b;
    }

    public double getDificultadE() {
        return dificultad;
    }

    public String getGradoE() {
        return grado;
    }
}
