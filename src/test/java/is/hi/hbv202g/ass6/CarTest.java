package is.hi.hbv202g.ass6;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CarTest {

    public static final String NAME = "Beetle";
    private Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(NAME);
    }

    @Test
    public void getNameOfCar() {
        assertEquals("Beetle", car.getName());
    }

}
