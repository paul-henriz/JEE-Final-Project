/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1se.project.Model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author paul-henrizimmerlin
 */
public class LogTest {
    Log instance;
    
    /**
     * Constructor without parameter
     */
    public LogTest() {
    }
    
    /**
     * Initialize the global variable with an empty log
     */
    @Before
    public void setUp(){
        instance = new Log();
    }
    
    /**
     * Set to null the instance (free the memory)
     */
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getId method, of class Log.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Log.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 1;
        instance.setId(id);
    }

    
    
}
