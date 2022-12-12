

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Comparator;
import java.util.ArrayList;

/**
 * The test class EquipoImplTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EquipoImplTest
{
    private EquipoImpl equipo;
    private BicicletaNormal bici;
    private BicicletaNormal bici2;
    private Peso peso;
    private ArrayList<Ciclista> L_Ciclistas;
    private ArrayList<Bicicleta> L_Bicicletas;
    private Comparator<Ciclista> C_Ciclistas;
    private Comparator<Bicicleta> C_Bicicletas;
    private AbstractCiclista ciclista;
    private AbstractCiclista ciclista2;
    /**
     * Default constructor for test class EquipoImplTest
     */
    public EquipoImplTest()
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
        equipo = new EquipoImpl("Passione", C_Ciclistas, C_Bicicletas);
        bici = new BicicletaNormal("Speeder", Peso.LIGERA);
        bici2 = new BicicletaNormal("Spriggan", Peso.NORMAL);
        L_Ciclistas = new ArrayList<>();
        L_Bicicletas = new ArrayList<>();
        ciclista = new CiclistaNovato("Jean-Pierre Polnareff",Habilidad.NORMAL, 200, equipo);
        ciclista2 = new CiclistaNovato("Jhosep joestar",Habilidad.NORMAL, 250, equipo);
    }
    
    @Test
    public void ordenarBicicletas(){
        equipo.getL_Bicicletas().add(bici);
        equipo.getL_Bicicletas().add(bici2);
        equipo.ordenarBicicletas();
        assertEquals(7.35, equipo.getL_Bicicletas().get(0).getPeso().getPesoE());
        assertEquals(7.50, equipo.getL_Bicicletas().get(1).getPeso().getPesoE());
    }
    
    @Test
    public void ordenarCiclistas(){
        equipo.getL_Ciclistas().add(ciclista);
        equipo.getL_Ciclistas().add(ciclista2);
        equipo.ordenarCiclistas();
        assertEquals(200, equipo.getL_Ciclistas().get(0).getEnergia());
        assertEquals(250, equipo.getL_Ciclistas().get(1).getEnergia());
    }
}
