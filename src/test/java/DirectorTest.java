import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private static final double DELTA = 0.01;
    private Director director;

    @Before
    public void before(){
        director = new Director("Sharon", "JL54678S", 78000.80, "Head Management", 500);
    }

    @Test
    public void canGetName(){
        assertEquals("Sharon", director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JL54678S", director.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(78000.80, director.getSalary(), DELTA);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Head Management", director.getDeptName());
    }

    @Test
    public void canRaiseManagerSalary(){
        assertEquals(78150.80, director.raiseSalary(150), DELTA);
    }

    @Test
    public void canPayManagerBonus(){
        assertEquals(780.008, director.payBonus(), DELTA);
    }

    @Test
    public void canGetBudget(){
        assertEquals(500, director.getBudget(), DELTA);
    }

}
