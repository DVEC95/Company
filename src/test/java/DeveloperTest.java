import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Miles", 12345678, 20000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Miles", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(12345678, developer.getNumberNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20000.00, developer.getSalary(), 0.00);
    }

    @Test
    public void canRaise(){
        assertEquals(22000, developer.raiseSalary(0.10), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(200, developer.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        developer.setName("Herbie");
        assertEquals("Herbie", developer.getName());
    }

    @Test
    public void canNotChangeNameToNull(){
        developer.setName("");
        assertEquals("Miles", developer.getName());
    }

    @Test
    public void canNotRaiseNegative(){
        assertEquals(0, developer.raiseSalary(-5.00), 0.00);
    }

}
