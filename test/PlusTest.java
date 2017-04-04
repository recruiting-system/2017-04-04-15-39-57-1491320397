import junit.framework.TestCase;

public class PlusTest extends TestCase{

    public void test_should_return_plus_result() throws Exception {
        assertEquals(new Plus().puls(1,1),2);
        assertEquals(new Plus().puls(2,1),3);
    }
}
