import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeFunctionalTest {

	@Before
	public void setUp() throws Exception {
	}

	// Iftekhar: This is a dummy test case, which you can replace.
	@Test
    public void testNonPositiveSides() {
        assertEquals(5, TriangleType.triangleType(-1, 2, 2));
    }
    @Test
    public void testTooLargeSides() {
        assertEquals(5, TriangleType.triangleType(1001, 2, 2));
    }
    @Test
    public void testTriangleInequalityViolation() {
        assertEquals(4, TriangleType.triangleType(1, 2, 3)); // 1 + 2 = 3
        assertEquals(4, TriangleType.triangleType(2, 3, 5)); // 2 + 3 = 5
        assertEquals(4, TriangleType.triangleType(5, 5, 10)); // 5 + 5 = 10
    }
    @Test
    public void testScaleneTriangle() {
        assertEquals(1, TriangleType.triangleType(3, 4, 5)); // Isosceles
    }
    @Test
    public void testIsoscelesTriangle() {
        assertEquals(2, TriangleType.triangleType(3, 3, 2)); // Isosceles
    }
    @Test
    public void testEquilateralTriangle() {
        assertEquals(3, TriangleType.triangleType(3, 3, 3)); // Isosceles
    }

}
