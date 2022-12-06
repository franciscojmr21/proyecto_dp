import java.util.Objects;

public class Etapa {
    private String nombre;
    private Dificultad dificultad;
    private Distancia distancia;

    public Etapa(String nombre, Dificultad dificultad, Distancia distancia) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.distancia = distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDificultad() {
        return dificultad.getDificultadE();
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public double getDistancia() {
        return distancia.getDistanciaE();
    }

    public void setDistancia(Distancia distancia) {
        this.distancia = distancia;
    }


    public boolean equals(Etapa etapa) {
        if (this == etapa) return true;
        if (etapa == null || getClass() != etapa.getClass()) return false;
        return this.nombre.equals(etapa.getNombre()) && this.dificultad == etapa.dificultad && this.distancia == etapa.distancia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, dificultad, distancia);
    }

    public String toString()
    {
        String etapaString = "";
        etapaString = "<etapa:"+this.nombre+"> <dificultad: "+this.dificultad+"> <distancia: "+this.distancia+")>";
        return etapaString;
    }
    
}
