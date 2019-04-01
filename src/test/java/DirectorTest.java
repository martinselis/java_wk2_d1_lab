import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    public Director director;

    @Before
    public void setup() {
        director = new Director("Joe", "NI12345GB", 50000.0, "CEO", 100000.0);
    }


    @Test
    public void canGetName() {
        assertEquals("Joe", director.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("NI12345GB", director.getNI());
    }

    @Test
    public void canGetBudget() {
        assertEquals(100000.0, director.getBudget(), 0.001);
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.0, director.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(2.0);
        assertEquals(100000.0, director.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(500, director.payBonus(), 0.001);
    }

    @Test
    public void canRaiseSalaryFalse() {
        director.raiseSalary(-1.0);
        assertEquals(50000.0, director.getSalary(), 0.001);
    }

    @Test
    public void canChangeName() {
        director.changeName("Bill");
        assertEquals("Bill", director.getName());
    }

    @Test
    public void cantChangeNullName() {
        director.changeName(null);
        assertEquals("Joe", director.getName());
    }

    @Test
    public void canGetDirectorBonus() {
        assertEquals(1000, director.payBonus(), 0.001);
    }
}
