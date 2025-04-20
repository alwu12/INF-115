import org.junit.*;

public class AlvinWuTest{
    AlvinWu a = new AlvinWu();
    @Test
    public void test(){
        Assert.assertEquals(a.getFullName(),"Alvin Wu" );
    }

     @Test
    public void testGetFirstName() {
        Assert.assertEquals("Alvin", a.getFirstName());
    }

    @Test
    public void testGetLastName() {
        Assert.assertEquals("Wu", a.getLastName());
    }

    @Test
    public void testGetUCInetID() {
        Assert.assertEquals("alvinyw1", a.getUCInetID()); // replace with your actual UCInetID
    }

    @Test
    public void testGetStudentNumber() {
        Assert.assertEquals(82929511, a.getStudentNumber()); // replace with your actual student number
    }

    @Test
    public void testGetRotatedFullNamePositive() {
        Assert.assertEquals("vin WuAl", a.getRotatedFullName(2)); // replace expected result accordingly
    }

    @Test
    public void testGetRotatedFullNameNegative() {
        Assert.assertEquals("in WuAlv", a.getRotatedFullName(-5)); // replace expected result accordingly
    }
}

