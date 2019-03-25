import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {


    Developer developer;

    @Before
    public void setup(){
        developer = new Developer("Kim", "AB1234567L", 40000.00);
    }

    @Test
    public void developerHasName(){
        assertEquals("Kim", developer.getName());
    }

    @Test
    public void developerHasNINo(){
        assertEquals("AB1234567L", developer.getNiNumber());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(40000.00, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary(){
        assertEquals(42100.00, developer.raiseSalary(5.25), 0.01);
    }

    @Test (expected=IllegalArgumentException.class)
    public void cantDecreaseSalary(){
        assertEquals(IllegalArgumentException.class, developer.raiseSalary(-5.25));
    }

    @Test
    public void canGetBonus(){
        assertEquals(400.00, developer.payBonus(), 0.01);
    }
}
