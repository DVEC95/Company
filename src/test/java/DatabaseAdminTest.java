import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bud", 12345678, 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Bud", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals(12345678, databaseAdmin.getNumberNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.00, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canRaise(){
        assertEquals(27500, databaseAdmin.raiseSalary(0.10), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(), 0.00);
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Herbie");
        assertEquals("Herbie", databaseAdmin.getName());
    }

    @Test
    public void canNotChangeNameToNull(){
        databaseAdmin.setName("");
        assertEquals("Bud", databaseAdmin.getName());
    }

    @Test
    public void canNotRaiseNegative(){
        assertEquals(0, databaseAdmin.raiseSalary(-5.00), 0.00);
    }

}
