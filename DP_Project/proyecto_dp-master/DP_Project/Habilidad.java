public enum Habilidad {
    LENTA("Lenta", 4.0),
    NORMAL("Normal", 6.0),
    BUENA("Buena", 8.0);

    private final String nHab;
    private final double habilidad;

    Habilidad(String a, double b) {
        this.nHab = a;
        this.habilidad = b;
    }
    public String getnHabE(){
        return nHab;
    }

    public double getHabilidadE(){
        return habilidad;
    }
}
