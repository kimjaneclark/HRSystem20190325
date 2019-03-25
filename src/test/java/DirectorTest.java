import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class DirectorTest {

    Director director;

    @Before
    public void setup(){
        director = new Director("Gillian", "JL98765437M", 90000.00, "Finance", 10000000.00);
    }

    @Test
    public void directorHasName(){
        assertEquals("Gillian", director.getName());
    }

    @Test
    public void managerHasNINo(){
        assertEquals("JL98765437M", director.getNiNumber());
    }

    @Test
    public void managerHasSalary(){
        assertEquals(90000.00, director.getSalary(), 0.01);
    }

    @Test
    public void directorHasDept(){
        assertEquals("Finance", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(94725.00, director.raiseSalary(5.25), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(900.00, director.payBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(10000000.00, director.getBudget(), 0.01);
    }
}
