import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class ManagerTest {

    Manager manager;

    @Before
    public void setup(){
        manager = new Manager("John", "JL1234567M", 50000.00, "Returns");
    }

    @Test
    public void managerHasName(){
        assertEquals("John", manager.getName());
    }

    @Test
    public void managerHasNINo(){
        assertEquals("JL1234567M", manager.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(50000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void managerHasDept(){
        assertEquals("Returns", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(52625.00, manager.raiseSalary(5.25), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(500.00, manager.payBonus(), 0.01);
    }

}
