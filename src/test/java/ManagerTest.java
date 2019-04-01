import org.junit.Before;

import management.Manager;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    public Manager manager;

    @Before
    public void setup() {
        manager = new Manager("Joe", "NI12345GB", 50000.0, "back office");
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", manager.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("NI12345GB", manager.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.0, manager.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(2.0);
        assertEquals(100000.0, manager.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(500, manager.payBonus(), 0.001);
    }
}
