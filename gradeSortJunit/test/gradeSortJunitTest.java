/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 *
 * @author Cristina
 */
public class gradeSortJunitTest {
    
     HashMap<String, Integer> studentGrades;
    public gradeSortJunitTest() {
       
        studentGrades.put("sally", 97);
        studentGrades.put("becky", 60);
        studentGrades.put("mary", 80);
        studentGrades.put("marc", 100);
        studentGrades.put("bob", 80);
       

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

    @Test
    public void testAssertTrue(){
      
        assertTrue("yes it contains this key" ,studentGrades.containsKey("sally"));
        assertTrue(studentGrades.containsKey("sally"));
         
    }
    @Test
    public void testAssertNotNull() {
        assertNotNull("not in here",studentGrades.containsKey("ryan"));
        
    }
    
    @Test
    public void testAssertFalse() {
         
        //HashMap studentGrades = new HashMap();
        
        assertFalse(studentGrades.containsKey("ryan"));
    }
    @Test
    public void testSize() {
        assertThat(studentGrades.size(), is(5));
    }
    
    @Test
    public void testIfEmpty() {
       boolean val= studentGrades.isEmpty();
       
       System.out.println("Is hash map empty" + val);
    }
    

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    private gradeSortJunitTest(String sally) {
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       
    }
}
