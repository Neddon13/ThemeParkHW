package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor3 = new Visitor(11, 135, 10);
        visitor4 = new Visitor(14, 156, 15);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasPriceForDogdems(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.00);
    }

    @Test
    public void getPriceForYoungerChild(){
        assertEquals(2.25, dodgems.priceFor(visitor3), 0.00);
    }

    @Test
    public void getPriceForOlderChild(){
        assertEquals(4.50, dodgems.priceFor(visitor4), 0.00);
    }
}
