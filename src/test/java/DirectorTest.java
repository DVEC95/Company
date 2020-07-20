import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Art", 12345678, 80000.00, "Logistics", 1250000.00);
    }

    @Test
    public void hasName(){
        assertEquals("Art", director.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(12345678, director.getNumberNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(80000.00, director.getSalary(), 0.00);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Logistics", director.getDeptName());
    }

    @Test
    public void canRaise(){
        assertEquals(96000.00, director.raiseSalary(0.20), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1600.00, director.payBonus(), 0.00);
    }

    @Test
    public void canGetBudget(){
        assertEquals(1250000, director.getBudget(), 0.00);
    }

    @Test
    public void canChangeName(){
        director.setName("Herbie");
        assertEquals("Herbie", director.getName());
    }

    @Test
    public void canNotChangeNameToNull(){
        director.setName("");
        assertEquals("Art", director.getName());
    }

    @Test
    public void canNotRaiseNegative(){
        assertEquals(0, director.raiseSalary(-5.00), 0.00);
    }

}
