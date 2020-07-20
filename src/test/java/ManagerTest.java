import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Charlie", 12345678, 40000.00, "Logistics");
    }

    @Test
    public void hasName(){
        assertEquals("Charlie", manager.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals(12345678, manager.getNumberNI());
    }

    @Test
    public void hasSalary(){
        assertEquals(40000.00, manager.getSalary(), 0.00);
    }

    @Test
    public void hasDepartmentName(){
        assertEquals("Logistics", manager.getDeptName());
    }

    @Test
    public void canRaise(){
        assertEquals(42000.00, manager.raiseSalary(0.05), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400.00, manager.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        manager.setName("Herbie");
        assertEquals("Herbie", manager.getName());
    }

    @Test
    public void canNotChangeNameToNull(){
        manager.setName("");
        assertEquals("Charlie", manager.getName());
    }

    @Test
    public void canNotRaiseNegative(){
        assertEquals(0, manager.raiseSalary(-5.00), 0.00);
    }

}
