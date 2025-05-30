import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TriangleTypeStructuralTest {
	private TriangleType triangle;
	@Before
	public void setUp() throws Exception {
		triangle = new TriangleType();
	}

	// Test for Scalene triangle (already covered, returns 1)
    @Test
    public void testScaleneTriangle() {
        assertEquals(1, TriangleType.triangleType(2, 3, 4));
    }

    // Test for Equilateral triangle (returns 3)
    @Test
    public void testEquilateralTriangle() {
        assertEquals(3, TriangleType.triangleType(5, 5, 5));
    }

    // Test for Isosceles triangle (SIDE1 == SIDE2, returns 2) - Covers lines 53-54
    @Test
    public void testIsoscelesTriangleSide1EqualsSide2() {
        assertEquals(2, TriangleType.triangleType(5, 5, 3));
    }

    // Test for Isosceles triangle (SIDE1 == SIDE3, returns 2) - Covers lines 55-56
    @Test
    public void testIsoscelesTriangleSide1EqualsSide3() {
        assertEquals(2, TriangleType.triangleType(5, 3, 5));
    }

    // Test for Isosceles triangle (SIDE2 == SIDE3, returns 2) - Covers lines 57-58
    @Test
    public void testIsoscelesTriangleSide2EqualsSide3() {
        assertEquals(2, TriangleType.triangleType(3, 5, 5));
    }

    // Test for invalid inputs (side <= 0, returns 4) - Covers lines 19-20
    @Test
    public void testInvalidSideLessThanOrEqualToZero() {
        assertEquals(4, TriangleType.triangleType(0, 5, 5));
    }

    // Test for out-of-bounds inputs (side > 1000, returns 5) - Covers lines 24-25
    @Test
    public void testOutOfBoundsSideGreaterThan1000() {
        assertEquals(5, TriangleType.triangleType(1001, 5, 5));
    }

	@Test
    public void testOutOfBoundsSideGreaterThan1000_2() {
        assertEquals(5, TriangleType.triangleType(1000, 1001, 1000));
    }

	@Test
    public void testOutOfBoundsSideGreaterThan1000_3() {
        assertEquals(5, TriangleType.triangleType(1000, 1000, 1001));
    }
    // Test for invalid triangle (triangle inequality fails, returns 4) - Covers line 42
    @Test
    public void testInvalidTriangle() {
        assertEquals(4, TriangleType.triangleType(1, 1, 3));
    }
    @Test
    public void testInvalidTriangle2() {
        assertEquals(4, TriangleType.triangleType(1, 3, 1));
    }
    @Test
    public void testInvalidTriangle3() {
        assertEquals(4, TriangleType.triangleType(3, 1, 1));
    }

	@Test
	public void testNonPositiveSides1() {
        assertEquals(4, TriangleType.triangleType(-1, -1, -2));
    }
	@Test
	public void testNonPositiveSides2() {
        assertEquals(4, TriangleType.triangleType(1, -1, -2));
    }
	@Test
	public void testNonPositiveSides3() {
        assertEquals(4, TriangleType.triangleType(1, 1, -2));
    }
	@Test
    public void testSide1PlusSide2LessThanOrEqualToSide3() {
        assertEquals(4, TriangleType.triangleType(1, 2, 5)); // 1 + 2 <= 5
    }

    // Test for Side2 + Side3 <= Side1 (invalid triangle)
    @Test
    public void testSide2PlusSide3LessThanOrEqualToSide1() {
        assertEquals(4, TriangleType.triangleType(5, 2, 2)); // 2 + 2 <= 5
    }

    // Test for Side1 + Side3 <= Side2 (invalid triangle)
    @Test
    public void testSide1PlusSide3LessThanOrEqualToSide2() {
        assertEquals(4, TriangleType.triangleType(3, 5, 1)); // 3 + 1 <= 5
    }

	@Test
	public void testTriOutEquals2AndSide1PlusSide3GreaterThanSide2() {
		// Set triOut = 2 by passing two equal sides, making it isosceles
		// Ensure Side1 + Side3 > Side2
		assertEquals(2, TriangleType.triangleType(5, 3, 5)); // 5 + 5 > 3 (valid condition for triOut == 2)
	}



}
