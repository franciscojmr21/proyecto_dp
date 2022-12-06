public class CiclistaExperimentado extends  Ciclista {


    public CiclistaExperimentado(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
    }

    @Override
    public double destrezaCiclista() {
        return ((getHabilidad() + 4)/130)*10;
    }
}
