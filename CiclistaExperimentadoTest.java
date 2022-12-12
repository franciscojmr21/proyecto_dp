

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

/**
 * The test class CiclistaExperimentadoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CiclistaExperimentadoTest
{
    private BicicletaNormal bici;
    private EtapaImpl etapa;
    private AbstractCiclista ciclista;
    private EquipoImpl equipo;
    private ResultadoImpl resultado;
    private HashMap<String,Resultado> resultados;
    /**
     * Default constructor for test class CiclistaExperimentadoTest
     */
    public CiclistaExperimentadoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {  
        bici = new BicicletaNormal("a", Peso.LIGERA);
        etapa = new EtapaImpl("primera",Dificultad.SENCILLA, Distancia.CORTA);
        equipo = new EquipoImpl();
        resultado = new ResultadoImpl(115, true, etapa, 75);
        resultados = new HashMap <>();
        ciclista = new CiclistaExperimentado("Vanilla Ice",Habilidad.NORMAL, 250, equipo);
        
    }
    
    @Test
    public void getDestrezaTest(){
        double esper = 0.77;
        double resul = ciclista.destrezaCiclista();
        assertEquals(esper, resul);
    }
    
     @Test
    public void getEtapaAbandono(){
        Etapa esper = etapa;
        resultados.put("resultado1", resultado);
        ciclista.setResultados(resultados);
        Etapa resul = ciclista.etapaAbandono();
        assertEquals(esper, resul);
    }
    
    @Test
    public void getResultadoEtapa(){
        Resultado esper = resultado;
        Resultado resul = ciclista.realizarEtapa(etapa);
        assertEquals(esper, resul);
    }
    
    @Test
    public void getEtapasTerminado(){
        double esper = 0;
        resultados.put("resultado1", resultado);
        double resul = ciclista.totalEtapas();
        assertEquals(esper, resul);
    }
}
