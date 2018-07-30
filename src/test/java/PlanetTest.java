import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {
    Planet planet;

    @Test
    public void hasName() {
        Planet planet = new Planet("Mars", 908973);
        assertEquals("Mars", planet.getName());
    }

    @Test
    public void hasSize() {
        Planet planet = new Planet("Mars", 908973);
        assertEquals(908973, planet.getSize());
    }

}
