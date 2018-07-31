import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    Planet planet;

    @Test
    public void hasName() {
        Planet planet = new Planet("Venus", 737373);
        assertEquals("Venus", planet.getName());
    }

    @Test
    public void hasSize() {
        Planet planet = new Planet("Venus", 737373);
        assertEquals(737373, planet.getSize());
    }

}
