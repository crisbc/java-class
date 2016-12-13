/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slider;

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
public class PuzzleTest {
    
    public PuzzleTest() {
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

    /**
     * Test of start method, of class Puzzle.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Puzzle instance = new Puzzle();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Puzzle.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Puzzle instance = new Puzzle();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Puzzle.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Puzzle.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of countMoves method, of class Puzzle.
     */
    @Test
    public void testCountMoves() {
        System.out.println("countMoves");
        Puzzle instance = new Puzzle();
        instance.countMoves();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of randomize method, of class Puzzle.
     */
    @Test
    public void testRandomize() {
        System.out.println("randomize");
        Puzzle instance = new Puzzle();
        instance.randomize();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of youWon method, of class Puzzle.
     */
    @Test
    public void testYouWon() {
        System.out.println("youWon");
        Puzzle instance = new Puzzle();
        instance.youWon();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
