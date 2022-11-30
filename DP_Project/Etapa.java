public class Etapa {
    private String nombre;
    private double dificultad;
    private double distancia;

    public Etapa(String nombre, double dificultad, double distancia) {
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
        return dificultad;
    }

    public void setDificultad(double dificultad) {
        this.dificultad = dificultad;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
    public String toString()
    {
        String etapaString = "";
        etapaString = "<etapa:"+this.nombre+"> <dificultad: "+this.dificultad+"> <distancia: "+this.distancia+")>";
        return etapaString;
    }
    
}
