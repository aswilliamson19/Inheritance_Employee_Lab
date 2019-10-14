import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private static final double DELTA = 0.01;
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Claire", "CS45890C", 25000);
    }

    @Test
    public void canGetName(){
        assertEquals("Claire", databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("CS45890C", databaseAdmin.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(), DELTA);
    }

    @Test
    public void canRaiseManagerSalary(){
        assertEquals(25050.50, databaseAdmin.raiseSalary(50.50), DELTA);
    }

    @Test
    public void canPayManagerBonus(){
        assertEquals(250, databaseAdmin.payBonus(), DELTA);
    }
}
