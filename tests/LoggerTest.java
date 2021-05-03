import static org.junit.Assert.*;
import org.junit.Test;

/**
 * This class implements JUnit tests for the get
 * instance method of Logger.
 *
 * @authour Ndabe Mahluza
 * @since 2021-05-03
 */

public class LoggerTest {
    /**
     * Test if Logger can only be created once.
     */
    @Test
    public void testGetInstanceException() {
        try {
            Logger testLog1 = Logger.getInstance();
            Logger testLog2 = Logger.getInstance();
            fail("Singleton violation not detected");
        } catch (RepeatException r) {
            System.out.println("A singleton violation was found.");
        } catch (Exception e) {
            System.out.println("An error was thrown.");
        }
    }

    /**
     * Test if Singleton gets created successfully.
     */
    @Test
    public void testGetInstanceNoException() {
        try {
            Logger testLog3 = Logger.getInstance();
        } catch (RepeatException r) {
            fail("The singleton failed to instantiate.");
        } catch (Exception e) {
            fail("An exception was thrown.");
        }
    }
}
