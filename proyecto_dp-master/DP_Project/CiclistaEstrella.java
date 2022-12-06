public class CiclistaEstrella extends Ciclista{

    private double popularidad;

    public CiclistaEstrella(String nombreC, Habilidad habilidad, double energia, Equipo equipo) {
        super(nombreC, habilidad, energia, equipo);
        this.popularidad = 6;
    }

    @Override
    public double destrezaCiclista() {
        return ((getHabilidad() + 6)/140)*10;
    }

    public double getPopularidad() {
        return popularidad;
    }

    public void aumentarPopularidad(Etapa e) {
        double a = this.popularidad;
        double tiempo = bici.tiempoEtapa(this, e);
        if(tiempo < 160){
            a = a + 4;
        }
        else{
            a--;
        }
        this.popularidad = a;
    }

}
