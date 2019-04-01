import org.junit.Before;

import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    public Developer developer;

    @Before
    public void setup () {
        developer = new Developer("Joe", "NI12345GB", 50000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("NI12345GB", developer.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.0, developer.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(2.0);
        assertEquals(100000.0, developer.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(500, developer.payBonus(), 0.001);
    }
}
