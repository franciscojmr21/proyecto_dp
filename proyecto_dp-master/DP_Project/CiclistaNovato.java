public class CiclistaNovato  extends Ciclista{

    public CiclistaNovato(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
    }

    @Override
    public double destrezaCiclista() {
        return ((getHabilidad() + 2)/120)*10 ;
    }

}
