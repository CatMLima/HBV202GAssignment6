package is.hi.hbv202g.ass6;

import org.junit.*;

import static org.junit.Assert.*;

public class CarOwnerTest {


    public static final String NAME = "Beetle";
    public static final String OWNER = "John Doe";
    private Car car;
    private CarOwner carOwner;

    @Before
    public void setUp() throws Exception {
        car = new Car(NAME);
        carOwner = new CarOwner(OWNER, car);
    }

    @Test
    public void getName() {
        assertEquals("John Doe", carOwner.getName());
    }

}