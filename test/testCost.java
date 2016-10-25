/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import activitat2m5uf2.Treballador;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ALUMNEDAM
 */
public class testCost {
    
    public testCost() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    
    //Test de calculSouTreballador que devolvera el coste de ese trabajador.
    @Test
    public final void testCost1() {
        Treballador[] treballadors = new Treballador[5];
        
        for (int i = 0; i < 2; i++) {
            treballadors[i] = new Treballador("TRABAJADOR", 1000, 15);
        }
        
        treballadors[2] = new Treballador("DIRECTOR", 2000, 15);
        treballadors[3] = new Treballador("SUBDIRECTOR", 2000, 15);
        treballadors[4] = new Treballador("DIRECTOR", 2000, 15);
        
        assertEquals(8000, activitat2m5uf2.CostPersonal.calculSouTreballador(treballadors), 0 );
    }
}
