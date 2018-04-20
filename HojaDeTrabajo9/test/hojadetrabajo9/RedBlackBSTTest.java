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
public class RedBlackBSTTest {
    
    public RedBlackBSTTest() {
    }
    
    
    /**
     * Test of get method, of class RedBlackBST.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        String Key= "Hello";
        RedBlackBST instance = new RedBlackBST();
        instance.put(Key, "NENE");
        String resultado= "NENE";
        Object result = instance.get(Key);
        assertEquals(resultado, result);
        
    }

    
    /**
     * Test of put method, of class RedBlackBST.
     */
    @Test
    public void testPut() {
        System.out.println("put");
        String key = "Hello";
        String val = "Hola";
        RedBlackBST instance = new RedBlackBST();
        instance.put(key, val);
        
    }

    
}
