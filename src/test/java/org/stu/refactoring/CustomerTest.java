package org.stu.refactoring;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Customer Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>10/30/2019</pre>
 */
public class CustomerTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addRental(Rental rental)
     */
    @Test
    public void testAddRental() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getName()
     */
    @Test
    public void testGetName() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: statement()
     */
    @Test
    public void testStatement() throws Exception {
        String expected = "Rental Record for jack" + "\n";
        expected += "\tTitanic\t2.0" + "\n";
        expected += "\tThe Avengers 10\t15.0" + "\n";
        expected += "Amount owed is 17.0\n";
        expected += "You earned 3 frequent renter points";
        Customer jack = new Customer("jack");
        Movie classicMovie = new Movie("Titanic", Movie.REGULAR);
        Rental classicRental = new Rental(classicMovie, 1);
        Movie newReleaseMovie = new Movie("The Avengers 10", Movie.NEW_RELEASE);
        Rental newReleaseRental = new Rental(newReleaseMovie, 5);
        jack.addRental(classicRental);
        jack.addRental(newReleaseRental);
        String statement = jack.statement();
        System.out.println(statement);
        Assert.assertEquals(expected, statement);
    }

    @Test
    public void testHtmlStatement() throws Exception {
        Customer jack = new Customer("jack");
        Movie classicMovie = new Movie("Titanic", Movie.REGULAR);
        Rental classicRental = new Rental(classicMovie, 1);
        Movie newReleaseMovie = new Movie("The Avengers 10", Movie.NEW_RELEASE);
        Rental newReleaseRental = new Rental(newReleaseMovie, 5);
        jack.addRental(classicRental);
        jack.addRental(newReleaseRental);
        String statement = jack.htmlStatement();
        System.out.println(statement);
    }
}
