

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class BicicletaNormalTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BicicletaNormalTest
{
    private BicicletaNormal bici;
    private EtapaImpl etapa;
    private AbstractCiclista ciclista;
    private EquipoImpl equipo;
    /**
     * Default constructor for test class BicicletaNormalTest
     */
    public BicicletaNormalTest()
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
       ciclista = new CiclistaExperimentado("Vanilla Ice",Habilidad.NORMAL, 200, equipo);
    }
    
    @Test
    public void calcularVelocidadConCilcistaEnEtapa(){
        double esper = 90.7;
        double resul = bici.velocidadBici(ciclista, etapa);
        assertEquals(esper, resul); 
    }
    
    @Test
    public void calcularMinutosEnEtapa(){
        double esper = 99.23;
        double resul = bici.tiempoEtapa(ciclista, etapa);
        assertEquals(esper, resul);
    }
}
