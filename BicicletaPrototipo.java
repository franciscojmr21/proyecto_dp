
/**
 * Write a description of class BicicletaPrototipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BicicletaPrototipo extends Bicicleta{

    public BicicletaPrototipo(String modelo, Peso peso) {
        super(modelo, peso);
    }

    @Override
    public double tiempoEtapa(Ciclista c, Etapa e) {
        return Math.round((e.getDistancia().getDistanciaE()/super.velocidadBici(c,e)*c.getHabilidad().getHabilidadE())*100d) / 100d;
    }
    
    @Override
    public String toString()
    {
        String etapaString = "";
        etapaString = "<BicicletaPrototipo: "+super.getNombre()+"> <peso: "+super.getPeso().getTipoE()+" (valor: "+super.getPeso().getPesoE()+")> en etapa ";
        return etapaString;
    }
}
