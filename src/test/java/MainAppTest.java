import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jayesh Chandrapal.
 * @date 1/15/16
 */
public class MainAppTest {
    MainApp app;

    @Before
    public void setUp() throws Exception {
        app =  new MainApp();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void testGreet() throws Exception {
        assertEquals( "Hello Jay", app.greet( "Jay" ) );
    }
}