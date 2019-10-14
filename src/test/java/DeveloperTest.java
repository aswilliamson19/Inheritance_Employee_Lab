import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private static final double DELTA = 0.01;
    private Developer developer;

    @Before
    public void before(){
        developer = new Developer("Calum", "CW6787978D", 50000);
    }

    @Test
    public void canGetName(){
        assertEquals("Calum", developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("CW6787978D", developer.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000.00, developer.getSalary(), DELTA);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(50046.50, developer.raiseSalary(46.50), DELTA);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, developer.payBonus(), DELTA);
    }
}
