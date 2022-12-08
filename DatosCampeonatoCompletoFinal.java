import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
public class DatosCampeonatoCompletoFinal
{
    
    public DatosCampeonatoCompletoFinal(Organizacion organizacion)
    {
        System.out.println("*********************************************************************************************************");
        System.out.println("*****************ESTA SIMULACIÓN CONCLUYE NORMALMENTE COMPLETÁNDOSE TODAS LAS CARRERAS*******************");
        System.out.println("*********************************************************************************************************\n");
        
        initData(organizacion);
    }
    
     private void initData(Organizacion organizacion)
    {
        //constructor de etapas pide ( String nombre, double dificultad, double distancia)
        Etapa etapa1 = new EtapaImpl("sencilla larga", Dificultad.SENCILLA,Distancia.LARGA);
        Etapa etapa2 = new EtapaImpl("compleja corta", Dificultad.COMPLEJA,Distancia.CORTA);
        Etapa etapa3 = new EtapaImpl("normal intermedia", Dificultad.NORMAL,Distancia.INTERMEDIA);
        Etapa etapa4 = new EtapaImpl("sencilla intermedia", Dificultad.SENCILLA, Distancia.INTERMEDIA);
        Etapa etapa5 = new EtapaImpl("compleja intermedia", Dificultad.COMPLEJA, Distancia.INTERMEDIA);
        Etapa etapa6 = new EtapaImpl("normal larga", Dificultad.NORMAL, Distancia.LARGA);
        organizacion.addEtapa(etapa1);
        organizacion.addEtapa(etapa2);
        organizacion.addEtapa(etapa3);
        organizacion.addEtapa(etapa4);
        organizacion.addEtapa(etapa5);
        organizacion.addEtapa(etapa6);
        

        //constructor de equipos pide (String nombre, comparador de ciclistas y si orden ascendente o descendente, comparador de bicicletas y si orden ascendente o descendente)
        Equipo movistarWomen = new EquipoImpl("Movistar Women", Collections.reverseOrder(new HabilidadCiclistaComparador()), Collections.reverseOrder(new PesoBiciComparador()));
        Equipo dSMWomen= new EquipoImpl("DSM Women", Collections.reverseOrder(new EnergiaCiclistaComparador()), Collections.reverseOrder(new PesoBiciComparador()));
        Equipo trekSegafredoWomen = new EquipoImpl("Trek Segafredo Women", new HabilidadCiclistaComparador(), new PesoBiciComparador());
        
        organizacion.addEquipo(movistarWomen);
        organizacion.addEquipo(trekSegafredoWomen);
        organizacion.addEquipo(dSMWomen);
        
        //constructor de bicicletas pide ( String nombre, Peso peso)
        //constructor de bicicletas rápidas pide ( String nombre, Peso peso, double velocidad extra)
        dSMWomen.insertarBicicleta(new BicicletaRapida("SCOTT CONTESSA ADDICT eRIDE 15",Peso.LIGERA, 0.3)); 
        dSMWomen.insertarBicicleta(new BicicletaPrototipo("SCOTT CONTESSA ADDICT 15",Peso.NORMAL));
        dSMWomen.insertarBicicleta(new BicicletaNormal("SCOTT CONTESSA ADDICT RC 15",Peso.PESADA));
        //constructor de ciclistas pide (String nombre , Habilidad habilidad , double energia, Equipo equipo)
        dSMWomen.insertarCiclista(new CiclistaNovato("WIEBES",  Habilidad.NORMAL, 1190, dSMWomen));
        dSMWomen.insertarCiclista(new CiclistaEstrella("LIPPERT", Habilidad.NORMAL, 1160, dSMWomen));
        dSMWomen.insertarCiclista(new CiclistaExperimentado("LABOUS", Habilidad.BUENA, 1150, dSMWomen));

        //constructor de bicicletas pide ( String nombre, Peso peso)
        //constructor de bicicletas rápidas pide ( String nombre, Peso peso, double velocidad extra)
        trekSegafredoWomen.insertarBicicleta(new BicicletaNormal("TREK Madone SLR 9 eTap Gen 7",Peso.LIGERA));
        trekSegafredoWomen.insertarBicicleta(new BicicletaRapida("TREK Emonda SLR 9 eTap",Peso.NORMAL, 0.5));
        trekSegafredoWomen.insertarBicicleta(new BicicletaPrototipo("TREK Domane SLR 9 eTap Gen 4",Peso.PESADA));
        //constructor de ciclistas pide (String nombre , Habilidad habilidad , double energia, Equipo equipo)
        trekSegafredoWomen.insertarCiclista(new CiclistaEstrella("BALSAMO", Habilidad.NORMAL,1180, trekSegafredoWomen));
        trekSegafredoWomen.insertarCiclista(new CiclistaExperimentado("LONGO-BORGHINI", Habilidad.NORMAL,1175, trekSegafredoWomen));
        trekSegafredoWomen.insertarCiclista(new CiclistaNovato("CORDON-RAGOT", Habilidad.BUENA, 1120, trekSegafredoWomen));
        
        //constructor de bicicletas pide ( String nombre, Peso peso)
        //constructor de bicicletas rápidas pide ( String nombre, Peso peso, double velocidad extra)
        movistarWomen.insertarBicicleta(new BicicletaRapida("CANYON Ultimate CFR eTap",Peso.LIGERA, 0.4));
        movistarWomen.insertarBicicleta(new BicicletaNormal("CANYON Aeroad CF SLX 8 Disc Di2",Peso.NORMAL));
        movistarWomen.insertarBicicleta(new BicicletaPrototipo("CANYON Endurace CF SLX 9 Di2",Peso.PESADA));
        //constructor de ciclistas pide (String nombre , Habilidad habilidad , double energia, Equipo equipo)
        movistarWomen.insertarCiclista(new CiclistaEstrella("VAN VLEUTEN", Habilidad.NORMAL,1200, movistarWomen));
        movistarWomen.insertarCiclista(new CiclistaExperimentado("NORSGAARD", Habilidad.NORMAL,1145, movistarWomen));
        movistarWomen.insertarCiclista(new CiclistaNovato("SIERRA", Habilidad.BUENA, 1130, movistarWomen));   

    }

}