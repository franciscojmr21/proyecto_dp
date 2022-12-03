import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
public class Organizacion
{
    private ArrayList<Etapa> L_Etapas;
    private ArrayList<Equipo> L_Equipos;
    private ArrayList<Ciclista> L_CiclistasCarrera;
    private ArrayList<Ciclista> L_CiclistasCarreraAbandono;
    private Comparator<Etapa> cEtapa;
    /**
     * Constructor for objects of class Organizacion
     */
    public Organizacion(Comparator<Etapa> cEtapa)
    {
        L_Equipos = new ArrayList<>();
        L_CiclistasCarrera = new ArrayList<>();
        L_CiclistasCarreraAbandono = new ArrayList<>();
        L_Etapas = new ArrayList<>();
        this.cEtapa = cEtapa;
    }
    
    public void setEtapa(ArrayList<Etapa> L_Etapas){
        this.L_Etapas = L_Etapas;
    }
    
    public ArrayList<Etapa> getEtapa(){
        return this.L_Etapas;
    }
    
    public void addEtapa(Etapa etapa){
        L_Etapas.add(etapa);
    }

    public void setL_Equipos(ArrayList<Equipo> L_Equipos){
        this.L_Equipos = L_Equipos;
    }

    public ArrayList<Equipo> getL_Equipos(){
        return this.L_Equipos;
    }

    public void setL_CiclistasCarrera(ArrayList<Ciclista> L_CiclistasCarrera){
        this.L_CiclistasCarrera = L_CiclistasCarrera;
    }

    public ArrayList<Ciclista> getL_CiclistasCarrera(){
        return this.L_CiclistasCarrera;
    }
    
    public void addEquipo(Equipo equipo){
        L_Equipos.add(equipo);
    }

    public void addCiclista(Ciclista ciclista){
        L_CiclistasCarrera.add(ciclista);
    }

    private String informacionEtapa()
    {
        StringBuilder res = new StringBuilder();
        L_Etapas.forEach((n) -> {
            res.append(n.toString()+"\n");
        });
        return res.toString();
    }
    
    private String equiposInfo()
    {
        StringBuilder res = new StringBuilder();
        L_Equipos.forEach((n) -> {
            res.append(n.toString()+"\n");
        });
        return res.toString();
    }
    
    private void guardarTodosCiclistas(){
        ArrayList<Ciclista> lCiclistas = new ArrayList<>();
        for(Equipo equipo : L_Equipos){
            lCiclistas = equipo.getL_Ciclistas();
            for(Ciclista ciclista : lCiclistas){
                L_CiclistasCarrera.add(ciclista);
            }
        }
    }
    
    private void asignarBicisACiclistas(){
        for(Equipo e : L_Equipos){
            e.asignarBicis();
        }
    }
    
    private ArrayList<Ciclista> getL_Ciclistas()
    {
        ArrayList <Ciclista> L_CiclistasEquipo;
        ArrayList <Ciclista> L_Ciclistas = new ArrayList<>();
        int i;

        for(Equipo equipo : L_Equipos)
        {
            L_CiclistasEquipo = equipo.getL_Ciclistas();

            for(i = 0; i < L_CiclistasEquipo.size(); i++)
            {
                L_Ciclistas.add(L_CiclistasEquipo.get(i));
            }
        }

        return L_Ciclistas;
    }
    
    private String clasificacionEtapa(ArrayList<Ciclista> L_Ciclistas, Etapa etapa)
    {
        int i;
        Ciclista ciclista;
        StringBuilder res = new StringBuilder();
            
        res.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        res.append("+++++++++++++++++ Clasificación final de la carrera en "+ etapa.getNombre() + " ++++++++++++++++++\n");
        res.append("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
 
        Collections.sort(L_Ciclistas, Collections.reverseOrder(new TiempoCiclistaComparador()));
        
        for(i = 0;i < L_Ciclistas.size();i++)
        {
            ciclista = L_Ciclistas.get(i);
            if(ciclista.getEnergia() > 0)
            {
                res.append("@@@ Posición("+(i+1)+"): " + ciclista.getNombreC() + " - ");
                res.append("Tiempo: " + Math.round((ciclista.getResultado(etapa).getTiempo())*100d) / 100d + " minutos @@@\n");
            }
            else{
                L_CiclistasCarreraAbandono.add(ciclista);
                L_CiclistasCarrera.remove(i);
                i--;
            }
        }
        
        for(Ciclista c : L_CiclistasCarreraAbandono){
            res.append("¡¡¡ Ha abandonado " + c.getNombreC() + " - ");
            res.append("Tiempo: " + Math.round((c.getResultado(etapa).getTiempo())*100d) / 100d + " minutos @@@");
            res.append(" - Además ha abandonado para el resto del Campeonato !!!\n");
        }

        return res.toString();
    }
    
    private String ejecutarEtapa(Etapa etapa)
    {
        StringBuilder res = new StringBuilder();
        ArrayList <Ciclista> L_Ciclistas = getL_Ciclistas();
        Ciclista ciclista;

        int i;
        res.append("********************************************************************************************************\n");
        res.append("******************************** Ciclistas que van a competir en "+etapa.getNombre()+" *******************************\n");
        res.append("********************************************************************************************************\n");
        
        Collections.sort(L_CiclistasCarrera, Collections.reverseOrder(new NombreCiclistaComparador()));
        asignarBicisACiclistas();
        
        for(Ciclista d : L_CiclistasCarrera)
        {
            res.append(d.toString()+"\n");
        }

        res.append("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        res.append("+++++++++++++++++++++++++++++++ Comienza la carrera en "+etapa.getNombre()+" ++++++++++++++++++++++++++++++++\n");
        res.append("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        
        for(i = 0;i < L_CiclistasCarrera.size();i++)
        {
            ciclista = L_CiclistasCarrera.get(i);
            res.append("@@@ ciclista "+(i + 1)+" de " + L_CiclistasCarrera.size() + " \n");
            res.append(ciclista.toString()+" con bicicleta\n");
            res.append(ciclista.resultadosEtapa(etapa)+"\n");
        }

        res.append(clasificacionEtapa(L_CiclistasCarrera, etapa));
        return res.toString();
    }
    
    public void gestionarCampeonato(){
        
        guardarTodosCiclistas();
        
        Collections.sort(L_Etapas, cEtapa);
        
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||| ETAPAS DEL CAMPEONATO |||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        
        for(Etapa etapa: L_Etapas){
            System.out.println(etapa.toString());            
        }
        
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println("%%%%%%%% EQUIPOS DEL CAMPEONATO %%%%%%%%");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Collections.sort(L_Equipos, new NombreEquipoComparador());
        for(Equipo e : L_Equipos){
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println(e.toString());
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        }
        int i = 1;
        for(Etapa etapa: L_Etapas){
            System.out.println("********************************************************************************************************");
            System.out.println("*** CARRERA<"+i+"> EN "+etapa.toString()+" ***");
            System.out.println("********************************************************************************************************");
            System.out.println(ejecutarEtapa(etapa));
            i++;
        }
        
        System.out.println("****************************************************");
        System.out.println("**************** FIN DEL CAMPEONATO ****************");
        System.out.println("****************************************************");
        System.out.println("********** CLASIFICACIÓN FINAL DE CICLISTAS **********");
        System.out.println("****************************************************");
        
        Collections.sort(L_CiclistasCarrera, new TiempoTotalCiclistaComparador());
        int j = 1;
        for(Ciclista c : L_CiclistasCarrera){
            System.out.println("@@@ Posición("+j+"): "+c.getNombreC()+" - Tiempo Total: "+Math.round((c.tiempoTotal())*100d) / 100d+" @@@");
            for(Resultado r : c.getResultados()){
                System.out.println("Carrera("+r.getEtapa().getNombre()+") - Tiempo: "+Math.round((r.getTiempo())*100d) / 100d+" minutos");
            }
            j++;
        }
        
        if(L_CiclistasCarreraAbandono.size()>0){
            System.out.println();
            System.out.println("****************************************************");
            System.out.println("************** CICLISTAS QUE ABANDONARON **************");
            System.out.println("****************************************************");
            for(Ciclista c : L_CiclistasCarreraAbandono){
                System.out.println("--- ciclista Abandonado: "+c.getNombreC()+" - Puntos Totales Anulados: "+c.tiempoTotal()+" ---");
                for(Resultado r : c.getResultados()){
                    System.out.println("Carrera("+r.getEtapa().getNombre()+") - Tiempo: "+Math.round((r.getTiempo())*100d) / 100d+" minutos");
                }
            }
        }
        
        System.out.println();
        System.out.println("****************************************************");
        System.out.println("******** CLASIFICACIÓN FINAL DE EQUIPOS *********");
        System.out.println("****************************************************");
        
        Collections.sort(L_Equipos, new TiempoMedioTotalEquipoComparador());
        int k = 1;
        for(Equipo e : L_Equipos){
            System.out.println("@@@ Posición("+k+") "+e.getNombre()+" con "+Math.round((e.getTiempoMedioTotal())*100d) / 100d+" mimutos de media @@@");
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("%%% "+e.getNombre()+" %%% Media Minutos de Ciclistas sin abandonar "+Math.round((e.getTiempoMedioTotal())*100d) / 100d+" %%%\n");
            for(Ciclista c : e.getL_Ciclistas()){
                System.out.println(c.toString());
            }
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            k++;
        }
    }
    
}
