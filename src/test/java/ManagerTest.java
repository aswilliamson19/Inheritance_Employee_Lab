import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private static final double DELTA = 0.01;
    private Manager manager;

    @Before
    public void before(){
        manager = new Manager("Chris", "JL456789A", 35000.00, "Top Techs");
    }

    @Test
    public void canGetName(){
        assertEquals("Chris", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JL456789A", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000.00, manager.getSalary(), DELTA);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Top Techs", manager.getDeptName());
    }

    @Test
    public void canRaiseManagerSalary(){
        assertEquals(35055.5, manager.raiseSalary(55.5), DELTA);
    }

    @Test
    public void canPayManagerBonus(){
        assertEquals(350, manager.payBonus(), DELTA);
    }

}
