/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8a_group1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reena
 */
public class LaibrarianTest {
    
    public LaibrarianTest() {
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
     * Test of addBook method, of class Laibrarian.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String title = "And Then There Were None";
        String author = "Agatha Christie";
        int year = 1939;
        double price = 41.0;
        Book instance = new Book(title, author, year, price);
        String result = instance.toString();
        String expResult = "Book Title: And Then There Were None Book Author: Agatha Christie Publish Year: 1939 Price: 41.0";
        
        assertEquals(expResult, result);
    }

    /**
     * Test of deleteBook method, of class Laibrarian.
     */
    @Test
    public void testDeleteBook() throws Exception {
        System.out.println("deleteBook");
        String title = "And Then There Were None";
        String author = "Agatha Christie";
        int year = 1939;
        double price = 41.0;
        Book instance = new Book(title, author, year, price);        
        Object result = Laibrarian.deleteBook(0);;
        Object expResult = null;
        assertEquals(expResult, result);
    }
    
}
