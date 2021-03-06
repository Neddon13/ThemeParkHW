package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor7;
    Visitor visitor8;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitor7 = new Visitor(16, 163, 10);
        visitor8 = new Visitor(10, 145, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isAllowedInPlayground(){
        assertEquals(true, playground.isAllowedTo(visitor7));
    }

    @Test
    public void isNotAllowedInPlayground(){
        assertEquals(false, playground.isAllowedTo(visitor8));
    }

}
