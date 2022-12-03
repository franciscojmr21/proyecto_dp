public class BicicletaRapida extends Bicicleta{

    private double velExtra;

    public BicicletaRapida(String modelo, Peso peso, double velExtra ) {
        super(modelo, peso);
        this.velExtra = velExtra;
    }

    public double getVelExtra() {
        return velExtra;
    }

    public void setVelExtra(double velExtra) {
        this.velExtra = velExtra;
    }

    @Override
    public double velocidadBici(Ciclista c, Etapa e) {
        return (super.velocidadBici(c, e) + getVelExtra());
    }
}
