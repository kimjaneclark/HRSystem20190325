import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void setup(){
        databaseAdmin = new DatabaseAdmin("Janet", "KJ12345689G", 45000.00);
    }

    @Test
    public void dbaHasName(){
        assertEquals("Janet", databaseAdmin.getName());
    }

    @Test
    public void dbaHasNINo(){
        assertEquals("KJ12345689G", databaseAdmin.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(45000.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(47362.50, databaseAdmin.raiseSalary(5.25), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(450.00, databaseAdmin.payBonus(), 0.01);
    }
}
