public enum Peso {
    LIGERA("Ligera", 7.35),
    NORMAL("Normal", 7.50),
    PESADA("Pesada", 7.85);

    private final String tipo;

    private final double peso;

    private Peso( String a, double b){

        this.tipo = a;
        this.peso = b;

    }

    public String getTipoE() {
        return tipo;
    }

    public double getPesoE() {
        return peso;
    }
}

