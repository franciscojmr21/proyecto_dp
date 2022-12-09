/**
 * Clase que ejecuta las funcionalidades de los resultados y almacena sus datos.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.8)
 */
public class ResultadoImpl implements Resultado {
    private double tiempo;
    private boolean abandono;
    private Etapa etapa;
    private double energia;

    /**                                
     * Constructor de la clase Resultado
     * 
     * @param tiempo doube tiempo que se tarda en realizar la etapa
     * @param abandono boolean si ha abandonado el ciclista la etapa
     * @param etapa etapa  etapa corrida
     * @param energia double energia restante de la etapa
     * 
     */
    public ResultadoImpl(double tiempo, boolean abandono, Etapa etapa, double energia) {
        this.tiempo = tiempo;
        this.abandono = abandono;
        this.etapa = etapa;
        this.energia = energia;
    }

    @Override
    public double getTiempo() {
        return tiempo;
    }

    @Override
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean isAbandono() {
        return abandono;
    }

    @Override
    public void setAbandono(boolean abandono) {
        this.abandono = abandono;
    }

    @Override
    public Etapa getEtapa() {
        return etapa;
    }

    @Override
    public void setEtapa(Etapa etapa) {
        this.etapa = etapa;
    }

    @Override
    public double getEnergia() {
        return energia;
    }

    @Override
    public void setEnergia(double energia) {
        this.energia = energia;
    }
}