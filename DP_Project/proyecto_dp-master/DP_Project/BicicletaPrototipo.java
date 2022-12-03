public class BicicletaPrototipo extends Bicicleta{

    public BicicletaPrototipo(String modelo, Peso peso) {
        super(modelo, peso);
    }

    @Override
    public double tiempoEtapa(Ciclista c, Etapa e) {
        return e.getDistancia()/velocidadBici(c,e)*c.getHabilidad();
    }
}
