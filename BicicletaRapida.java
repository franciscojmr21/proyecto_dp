
/**
 * Write a description of class BicicletaRapida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BicicletaRapida extends BicicletaNormal{

    private double velExtra;

    public BicicletaRapida(String modelo, Peso peso, double velExtra ) {
        super(modelo, peso);
        this.velExtra = velExtra;
    }

    public double getVelExtra() {
        return Math.round((velExtra)*100d) / 100d;
    }

    public void setVelExtra(double velExtra) {
        this.velExtra = Math.round((velExtra)*100d) / 100d;
    }

    @Override
    public double velocidadBici(Ciclista c, Etapa e) {
        return Math.round(((super.velocidadBici(c, e) + getVelExtra()))*100d) / 100d;
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<BicicletaRapida: "+super.getNombre()+"> <peso: "+super.getPeso().getTipoE()+" (valor: "+super.getPeso().getPesoE()+
        ")> <velocidad extra: "+this.getVelExtra()+"> en etapa ";
        return etapaString;
    }
}
