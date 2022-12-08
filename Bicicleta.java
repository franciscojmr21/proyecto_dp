public class Bicicleta {
    private String nombre;
    private Peso peso;

    public Bicicleta(String nombre, Peso peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }

    public Peso getPeso() {
        return peso;
    }

    public void setPeso(Peso peso) {
        this.peso = peso;
    }

    public double velocidadBici(Ciclista c, Etapa e){
        return Math.round(((c.getHabilidad().getHabilidadE()*100)/(getPeso().getPesoE()*e.getDificultad().getDificultadE()))*100d) / 100d;
    }

    public double tiempoEtapa(Ciclista c, Etapa e){
        return Math.round(((e.getDistancia().getDistanciaE()/velocidadBici(c,e))*60)*100d) / 100d;
    }
    
    public String toString()
    {
        String etapaString = "";
        etapaString = "<Bicicleta: "+this.nombre+"> <peso: "+this.peso.getTipoE()+" (valor: "+this.peso.getPesoE()+")> en etapa ";
        return etapaString;
    }
}
