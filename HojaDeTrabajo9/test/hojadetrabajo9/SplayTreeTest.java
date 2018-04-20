/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Algoritmos y estructura de datos - seccion 10
 * @author: Oscar Juarez - 17315
 * @author: Jose Alejandro Tejada - 17584
 * @version: 20.04.18
 */
package hojadetrabajo9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose Tejada
 */
public class SplayTreeTest {
    
    public SplayTreeTest() {
    }
    
    /**
     * Test of insert method, of class SplayTree.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Association<String, String> ele = null;
        SplayTree instance = new SplayTree();
        instance.insert(ele);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of search method, of class SplayTree.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        String val = "";
        SplayTree instance = new SplayTree();
        boolean expResult = false;
        boolean result = instance.search(val);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

   
    
}
