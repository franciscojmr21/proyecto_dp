import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Iterator;
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
     * Constructor parametrizado de la clase Equipo 
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
    
    public void ordenarBicicletas(){ 
        Collections.sort(L_Bicicletas, C_Bicicletas);
    }

    public void ordenarCiclistas(){
        Collections.sort(L_Ciclistas, C_Ciclistas);
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setL_Bicicletas(ArrayList<Bicicleta> L_Bicicletas){
        this.L_Bicicletas = L_Bicicletas;
    }
    
    public ArrayList<Bicicleta> getL_Bicicletas(){
        return this.L_Bicicletas;
    }
    
    public void setL_Ciclistas(ArrayList<Ciclista> L_Ciclistas){
        this.L_Ciclistas = L_Ciclistas;
    }
    
    public ArrayList<Ciclista> getL_Ciclistas(){
        return this.L_Ciclistas;
    }
    
    public void setC_Ciclistas(Comparator<Ciclista> C_Ciclistas){
        this.C_Ciclistas = C_Ciclistas;
    }
    
    public Comparator<Ciclista> getC_Ciclistas(){
        return this.C_Ciclistas;
    }
    
    public void setC_Bicicletas(Comparator<Bicicleta> C_Bicicletas){
        this.C_Bicicletas = C_Bicicletas;
    }
    
    public Comparator<Bicicleta> getC_Bicicletas(){
        return this.C_Bicicletas;
    }
    
    public void insertarBicicleta(Bicicleta bicicleta){
        L_Bicicletas.add(bicicleta);
    }
    
    public void insertarCiclista(Ciclista ciclista){
        L_Ciclistas.add(ciclista);
    }
    
    public void insertarCiclistaAbandonado(Ciclista ciclistaAbandonado){
        L_CiclistasAbandonado.add(ciclistaAbandonado);
    }
    
    public void asignarBicis(){
        int i=0;
        Collections.sort(L_Ciclistas, C_Ciclistas);
        Collections.sort(L_Bicicletas, C_Bicicletas);
        for(Ciclista c : L_Ciclistas){
            if(i < L_Bicicletas.size()){
                c.setBici(L_Bicicletas.get(i));
            }else{
                insertarCiclistaAbandonado(c);
            }
            i++;
        }
    }
    
    public double getTiempoMedioTotal(){
        double total = 0.0;
        for(Ciclista c : L_Ciclistas){
            total = total + c.tiempoTotal();
        }
        total = Math.round((total/L_Ciclistas.size())*100d) / 100d;
        return total;
    }
    
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
