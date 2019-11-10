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
public class EmployeeTest {
    
    Employee instance;
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Employee(null, "", "", "", "", "", "", "", "", "");
    }
    
    @After
    public void tearDown() {
        instance = null;
    }

    /**
     * Test of getId method, of class Employee.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Employee.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = 0;
        instance.setId(id);
    }

    /**
     * Test of getName method, of class Employee.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "error";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Test";
        instance.setName(name);
    }

    /**
     * Test of getFirstName method, of class Employee.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Employee.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "TestName";
        instance.setFirstName(firstName);
    }

    /**
     * Test of getTelHome method, of class Employee.
     */
    @Test
    public void testGetTelHome() {
        System.out.println("getTelHome");
        String expResult = "";
        String result = instance.getTelHome();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelHome method, of class Employee.
     */
    @Test
    public void testSetTelHome() {
        System.out.println("setTelHome");
        String telHome = "123";
        instance.setTelHome(telHome);
    }

    /**
     * Test of getTelMob method, of class Employee.
     */
    @Test
    public void testGetTelMob() {
        System.out.println("getTelMob");
        String expResult = "";
        String result = instance.getTelMob();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelMob method, of class Employee.
     */
    @Test
    public void testSetTelMob() {
        System.out.println("setTelMob");
        String telMob = "456";
        instance.setTelMob(telMob);
    }

    /**
     * Test of getTelPro method, of class Employee.
     */
    @Test
    public void testGetTelPro() {
        System.out.println("getTelPro");
        String expResult = "";
        String result = instance.getTelPro();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTelPro method, of class Employee.
     */
    @Test
    public void testSetTelPro() {
        System.out.println("setTelPro");
        String telPro = "789";
        instance.setTelPro(telPro);
    }

    /**
     * Test of getAdress method, of class Employee.
     */
    @Test
    public void testGetAdress() {
        System.out.println("getAdress");
        String expResult = "";
        String result = instance.getAdress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAdress method, of class Employee.
     */
    @Test
    public void testSetAdress() {
        System.out.println("setAdress");
        String adress = "sample address";
        instance.setAdress(adress);
    }

    /**
     * Test of getPostalCode method, of class Employee.
     */
    @Test
    public void testGetPostalCode() {
        System.out.println("getPostalCode");
        String expResult = "";
        String result = instance.getPostalCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPostalCode method, of class Employee.
     */
    @Test
    public void testSetPostalCode() {
        System.out.println("setPostalCode");
        String postalCode = "12345";
        instance.setPostalCode(postalCode);
    }

    /**
     * Test of getCity method, of class Employee.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCity method, of class Employee.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "TestCity";
        instance.setCity(city);
    }

    /**
     * Test of getEmail method, of class Employee.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Employee.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "test@domain";
        instance.setEmail(email);
    }

    /**
     * Test of hashCode method, of class Employee.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Employee.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Employee.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "m1se.project.Control.Employee[ id=null ]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
