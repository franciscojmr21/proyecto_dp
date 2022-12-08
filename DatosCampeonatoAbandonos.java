import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class DatosCampeonatoAbandonos
{
    /*
    public DatosCampeonatoAbandonos(Organizacion organizacion)
    {
        System.out.println("*********************************************************************************************************");
        System.out.println("*****************ESTA SIMULACIÓN CONCLUYE NORMALMENTE COMPLETANDOSE TODAS LAS CARRERAS PERO CON ABANDONOS*******************");
        System.out.println("*********************************************************************************************************\n");
        
        initData(organizacion);
    }
    
     private void initData(Organizacion organizacion)
    {
        //constructor de etapas pide ( String nombre, double dificultad, double distancia)
        Etapa etapa1 = new Etapa("sencilla larga", 0.9, 225);
        Etapa etapa2 = new Etapa("compleja intermedia", 1.1, 200);
        Etapa etapa3 = new Etapa("normal intermedia", 1.0, 200);
        Etapa etapa4 = new Etapa("sencilla intermedia", 0.9, 200);
        Etapa etapa5 = new Etapa("compleja larga", 1.1, 225);
        Etapa etapa6 = new Etapa("normal larga", 1.0, 225);
        organizacion.addEtapa(etapa1);
        organizacion.addEtapa(etapa2);
        organizacion.addEtapa(etapa3);
        organizacion.addEtapa(etapa4);
        organizacion.addEtapa(etapa5);
        organizacion.addEtapa(etapa6);
        

        //constructor de equipos pide (String nombre, comparador de ciclistas y si orden ascendente o descendente, comparador de bicicletas y si orden ascendente o descendente)
        Equipo movistarWomen = new Equipo("Movistar Women", Collections.reverseOrder(new HabilidadCiclistaComparador()), Collections.reverseOrder(new PesoBiciComparador()));
        Equipo dSMWomen= new Equipo("DSM Women", Collections.reverseOrder(new EnergiaCiclistaComparador()), Collections.reverseOrder(new PesoBiciComparador()));
        Equipo trekSegafredoWomen = new Equipo("Trek Segafredo Women", new HabilidadCiclistaComparador(), new PesoBiciComparador());
        
        organizacion.addEquipo(movistarWomen);
        organizacion.addEquipo(trekSegafredoWomen);
        organizacion.addEquipo(dSMWomen);
                
        //constructor de bicicletas pide ( String nombre, double peso)
        dSMWomen.insertarBicicleta(new Bicicleta("SCOTT CONTESSA ADDICT eRIDE 15",7.4)); 
        dSMWomen.insertarBicicleta(new Bicicleta("SCOTT CONTESSA ADDICT 15",7.6));
        dSMWomen.insertarBicicleta(new Bicicleta("SCOTT CONTESSA ADDICT RC 15",7.8));
        //constructor de ciclistas pide (String nombre , double habilidad , double energia, Equipo equipo)
        dSMWomen.insertarCiclista(new Ciclista("WIEBES",  4.97, 1190,dSMWomen));
        dSMWomen.insertarCiclista(new Ciclista("LIPPERT", 5.0, 1160,dSMWomen));
        dSMWomen.insertarCiclista(new Ciclista("LABOUS", 5.01, 1150,dSMWomen));
     
        //constructor de bicicletas pide ( String nombre, double peso)
        trekSegafredoWomen.insertarBicicleta(new Bicicleta("TREK Madone SLR 9 eTap Gen 7",7.35));
        trekSegafredoWomen.insertarBicicleta(new Bicicleta("TREK Emonda SLR 9 eTap",7.65));
        trekSegafredoWomen.insertarBicicleta(new Bicicleta("TREK Domane SLR 9 eTap Gen 4",7.85));
        //constructor de ciclistas pide (String nombre , double habilidad , double energia, Equipo equipo)
        trekSegafredoWomen.insertarCiclista(new Ciclista("BALSAMO", 4.98,1180,trekSegafredoWomen));
        trekSegafredoWomen.insertarCiclista(new Ciclista("LONGO-BORGHINI", 4.99,1175,trekSegafredoWomen));
        trekSegafredoWomen.insertarCiclista(new Ciclista("CORDON-RAGOT", 5.04, 1120,trekSegafredoWomen));
        
        //constructor de bicicletas pide ( String nombre, double peso)
        movistarWomen.insertarBicicleta(new Bicicleta("CANYON Ultimate CFR eTap",7.45));
        movistarWomen.insertarBicicleta(new Bicicleta("CANYON Aeroad CF SLX 8 Disc Di2",7.5));
        movistarWomen.insertarBicicleta(new Bicicleta("CANYON Endurace CF SLX 9 Di2",7.75));
        //constructor de ciclistas pide (String nombre , double habilidad , double energia, Equipo equipo)
        movistarWomen.insertarCiclista(new Ciclista("VAN VLEUTEN", 4.96,1200,movistarWomen));
        movistarWomen.insertarCiclista(new Ciclista("NORSGAARD", 5.02,1145,movistarWomen));
        movistarWomen.insertarCiclista(new Ciclista("SIERRA", 5.03, 1130,movistarWomen));    

    }*/

}
