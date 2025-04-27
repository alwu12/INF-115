import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class TriangleTypeTest {
    
    @Test
    public void testNonPositiveSides() {
        Assert.assertEquals(5, TriangleType.triangleType(-1, 2, 2));
    }
    @Test
    public void testTooLargeSides() {
        Assert.assertEquals(5, TriangleType.triangleType(1001, 2, 2));
    }
    @Test
    public void testTriangleInequalityViolation() {
        Assert.assertEquals(4, TriangleType.triangleType(1, 2, 3)); // 1 + 2 = 3
        Assert.assertEquals(4, TriangleType.triangleType(2, 3, 5)); // 2 + 3 = 5
        Assert.assertEquals(4, TriangleType.triangleType(5, 5, 10)); // 5 + 5 = 10
    }
    @Test
    public void testScaleneTriangle() {
        Assert.assertEquals(1, TriangleType.triangleType(3, 4, 5)); // Isosceles
    }
    @Test
    public void testIsoscelesTriangle() {
        Assert.assertEquals(2, TriangleType.triangleType(3, 3, 2)); // Isosceles
    }
    @Test
    public void testEquilateralTriangle() {
        Assert.assertEquals(3, TriangleType.triangleType(3, 3, 3)); // Isosceles
    }
}
