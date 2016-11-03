/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import activitat2m5uf2.CostPersonal;
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
    
    
    
    
    //Test de calculSouTreballador que devolvera el coste de los trabajadores.
    
    @Test
    public final void testCost1() {
        Treballador[] treballadors = new Treballador[3];
        
        treballadors[0] = new Treballador(1, 1000, 15);
        treballadors[1] = new Treballador(0, 2000, 15);
        treballadors[2] = new Treballador(2, 2000, 15);
        //treballadors[3] = new Treballador(3, 2000, 15); //AQUEST DONARA ERROR PERUQE NO HI HA CAP LLOC AMB EL NUMERO 3
        
        assertEquals(5300, activitat2m5uf2.CostPersonal.calculSouTreballador(treballadors), 0 );
    }
    
    
    
    
    
    
    
    
    
    
    
    
    //Se espera 1 perque es el numero que s'assigna als subdirectors.
    @Test
    public final void tipusTreballador1() {
        
       Treballador treballador = new Treballador(1, 1000, 15);
        
        
        assertEquals(1, CostPersonal.tipusTreballador(treballador));
    }
    
    
    
    
    //Se espera 0 perque es el numero que s'assigna als directors i subdirectors.
    @Test
    public final void tipusTreballador2() {
        
       Treballador treballador = new Treballador(0, 2000, 15);
        
        
        assertEquals(0, CostPersonal.tipusTreballador(treballador));
    }
    
    
    
    
    
    //Se espera 2 perque es el numero que s'assigna als treballadors normals.
    @Test
    public final void tipusTreballador3() {
        
       Treballador treballador = new Treballador(2, 2000, 15);
        
        
        assertEquals(2, CostPersonal.tipusTreballador(treballador));
    }
    
    
    
    
    /*
    //Esta prueba dara error porque no existe un puesto que sea 3
    @Test
    public final void tipusTreballador4() {
        
       Treballador treballador = new Treballador(3, 2000, 15);
        
        
        assertEquals( , CostPersonal.tipusTreballador(treballador));
    }
    */
    
    
    
    
    
    //Se espera 2300,00 perque es el numero que es calculara amb el treballador introduit.
    @Test
    public final void costFinal1() {
        
       Treballador treballador = new Treballador(2, 2000, 15);
       int num = 2;
        
        assertEquals(2300,00, CostPersonal.costFinal(treballador, num));
    }
    
    
    
    
    
    //Se espera 2000,00 perque es el numero que es calculara amb aquest treballador.
    @Test
    public final void costFinal2() {
        
       Treballador treballador = new Treballador(2, 2000, 15);
       int num = 0;
        
        assertEquals(2000,00, CostPersonal.costFinal(treballador, num));
    }
    
    
    
    /*
    //Se espera error perque el numero 3 no s'utilitza amb cap treballador.
    @Test
    public final void costFinal3() {
        
       Treballador treballador = new Treballador(2, 2000, 15);
       int num = 2;
        
        assertEquals(2300, CostPersonal.tipusTreballador(treballador));
    }*/
}
