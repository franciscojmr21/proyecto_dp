public class Bicicleta {
    private String nombre;
    private double peso;

    public Bicicleta(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double velocidadBici(Ciclista c, Etapa e){
        return (c.getHabilidad()*100)/(getPeso()*e.getDificultad());
    }

    public double tiempoEtapa(Ciclista c, Etapa e){
        return (e.getDistancia()/velocidadBici(c,e))*60;
    }
    
    public String toString()
    {
        String etapaString = "";
        etapaString = "<bicicleta: "+this.nombre+"> <peso: "+this.peso+")> en etapa ";
        return etapaString;
    }
}
