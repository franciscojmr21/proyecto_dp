import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
/**
 * Clase que ejecuta las funcionalidades del equipo y almacena sus datos.
 * Esta clase implementa Equipo.
 * 
 * @author (Sergio Jiménez Arroyo y Francisco Javier Muñoz Ruiz) 
 * @version (1.8)
 */
public class EquipoImpl implements Equipo
{
    // instance variables - replace the example below with your own
    private ArrayList<Ciclista> L_Ciclistas;
    private ArrayList<Ciclista> L_CiclistasAbandonado;
    private ArrayList<Bicicleta> L_Bicicletas; 
    private Comparator<Ciclista> C_Ciclistas;
    private Comparator<Bicicleta> C_Bicicletas;
    private String nombre;  
    
    /**
     * Constructor por defecto de la clase Equipo
     */
    public EquipoImpl()
    {
        nombre = "";
        this.L_Ciclistas = new ArrayList<>();
        this.L_CiclistasAbandonado = new ArrayList<>();
        this.L_Bicicletas = new ArrayList<>();
    }

    /**                                
     * Constructor de la clase equipo
     * 
     * @param nombre String nombre del equipo
     * @param C_Ciclistas Comparator<Ciclista> 
     * @param C_Bicicletas Comparator<Bicicleta>
     * 
     */
    public EquipoImpl(String nombre, Comparator<Ciclista> C_Ciclistas, Comparator<Bicicleta> C_Bicicletas)
    {
        this.nombre = nombre;
        this.L_Ciclistas = new ArrayList<>();
        this.L_CiclistasAbandonado = new ArrayList<>();
        this.L_Bicicletas = new ArrayList<>();
        this.C_Bicicletas = C_Bicicletas;
        this.C_Ciclistas = C_Ciclistas;
    }
    
    @Override
    public void ordenarBicicletas(){ 
        Collections.sort(L_Bicicletas, C_Bicicletas);
    }

    @Override
    public void ordenarCiclistas(){
        Collections.sort(L_Ciclistas, C_Ciclistas);
    }
    
    @Override
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public void setL_Bicicletas(ArrayList<Bicicleta> L_Bicicletas){
        this.L_Bicicletas = L_Bicicletas;
    }
    
    @Override
    public ArrayList<Bicicleta> getL_Bicicletas(){
        return this.L_Bicicletas;
    }
    
    @Override
    public void setL_Ciclistas(ArrayList<Ciclista> L_Ciclistas){
        this.L_Ciclistas = L_Ciclistas;
    }
    
    @Override
    public ArrayList<Ciclista> getL_Ciclistas(){
        return this.L_Ciclistas;
    }
    
    @Override
    public void setC_Ciclistas(Comparator<Ciclista> C_Ciclistas){
        this.C_Ciclistas = C_Ciclistas;
    }
    
    @Override
    public Comparator<Ciclista> getC_Ciclistas(){
        return this.C_Ciclistas;
    }
    
    @Override
    public void setC_Bicicletas(Comparator<Bicicleta> C_Bicicletas){
        this.C_Bicicletas = C_Bicicletas;
    }
    
    @Override
    public Comparator<Bicicleta> getC_Bicicletas(){
        return this.C_Bicicletas;
    }
    
    @Override
    public void insertarBicicleta(Bicicleta bicicleta){
        L_Bicicletas.add(bicicleta);
    }
    
    @Override
    public void insertarCiclista(Ciclista ciclista){
        L_Ciclistas.add(ciclista);
    }
    
    @Override
    public void insertarCiclistaAbandonado(Ciclista ciclistaAbandonado){
        L_CiclistasAbandonado.add(ciclistaAbandonado);
    }
    
    @Override
    public void asignarBicis(){
        int j=0;
        while(j<L_Ciclistas.size()){
            Ciclista c = L_Ciclistas.get(j);
            if(c.getAbandono()){
                L_CiclistasAbandonado.add(c);
                L_Ciclistas.remove(c);
            }else{
                j++;
            }
        }
        
        int i=0;
        Collections.sort(L_Ciclistas, C_Ciclistas);
        Collections.sort(L_Bicicletas, C_Bicicletas);
        for(Ciclista c : L_Ciclistas){
            
            if(i < L_Bicicletas.size() && !c.getAbandono()){
                c.setBici(L_Bicicletas.get(i));
            }
            i++;
        }
    }
    
    @Override
    public double getTiempoMedioTotal(){
        double total = 0.0;
        for(Ciclista c : L_Ciclistas){
            total = total + c.tiempoTotal();
        }
        total = Math.round((total/L_Ciclistas.size())*100d) / 100d;
        return total;
    }
    
    @Override
    public double getTiempoMedioTotalSinAbandonar(){
        double total = 0.0;
        int count = 0;
        for(Ciclista c : L_Ciclistas){
            if(!c.getAbandono()){
                total = total + c.tiempoTotal();
                count++;
            }
        }
        total = Math.round((total/count)*100d) / 100d;
        return total;
    }
    
    @Override
    public double getTotalPoints()
    {
        double totalPoints;
        totalPoints = 0;
        Iterator<Ciclista> it;
        Ciclista ciclista;
        
        it = L_Ciclistas.iterator();
        while(it.hasNext())
        {
            ciclista = it.next();
            totalPoints += ciclista.tiempoTotal();
        }
        
        return totalPoints;
    }
    
    @Override
    public void ordenFinalCampeonato(){
        ArrayList<Ciclista> L_CiclistasNoAbandonos = new ArrayList<>();
        for(Ciclista c : L_Ciclistas){
            if(!c.getAbandono()){
                L_CiclistasNoAbandonos.add(c);
            }else{
                L_CiclistasAbandonado.add(c);
            }
        }
        Collections.sort(L_CiclistasNoAbandonos, C_Ciclistas);
        Collections.sort(L_CiclistasAbandonado, C_Ciclistas);
        L_Ciclistas.clear();
        for(Ciclista c : L_CiclistasNoAbandonos){
            L_Ciclistas.add(c);
        }
        for(Ciclista c : L_CiclistasAbandonado){
            L_Ciclistas.add(c);
        }
    }
    
    @Override
    public String toString()
    {
        ordenarCiclistas();
        ordenarBicicletas();
        StringBuilder res = new StringBuilder();
        res.append("%%% "+getNombre()+" %%% Media Minutos de Ciclistas sin abandonar "+getTotalPoints()+" %%%\n\n");
        L_Ciclistas.forEach((n) -> {
            res.append(n.toString()+"\n");
        });
        return res.toString();
    }
}
