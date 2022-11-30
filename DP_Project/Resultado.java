public class Resultado {
    private double tiempo;
    private boolean abandono;
    private Etapa etapa;
    private double energia;

    public Resultado(double tiempo, boolean abandono, Etapa etapa, double energia) {
        this.tiempo = tiempo;
        this.abandono = abandono;
        this.etapa = etapa;
        this.energia = energia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isAbandono() {
        return abandono;
    }

    public void setAbandono(boolean abandono) {
        this.abandono = abandono;
    }

    public Etapa getEtapa() {
        return etapa;
    }

    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
}