import org.junit.Before;

import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    public DatabaseAdmin DBadmin;

    @Before
    public void setup () {
        DBadmin = new DatabaseAdmin("Joe", "NI12345GB", 50000.0);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", DBadmin.getName());
    }

    @Test
    public void canGetNI(){
        assertEquals("NI12345GB", DBadmin.getNI());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000.0, DBadmin.getSalary(), 0.001);
    }

    @Test
    public void canRaiseSalary() {
        DBadmin.raiseSalary(2.0);
        assertEquals(100000.0, DBadmin.getSalary(), 0.001);
    }

    @Test
    public void canGetPayBonus() {
        assertEquals(500, DBadmin.payBonus(), 0.001);
    }
}
