import org.junit.jupiter.api.*;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @BeforeAll
    public static void start() {
        out.println("Class 'Main' tests start");
    }

    @AfterAll
    public static void finish() {
        out.println("Class 'Main' tests finish");
    }

    @Test
    public void isIntegerTrueTest() {
        //
        out.println("Method 'isInteger' test for Integer start");

        // arrange:
        String a = "5";

        // act:
        boolean resultA = Main.isInteger(a);

        // assert:
        assertTrue(resultA);

        //
        out.println("Method 'isInteger' test for Integer finish");
    }

    @Test
    public void isIntegerFalseTest() {
        //
        out.println("Method 'isInteger' test for String start");

        // arrange:
        String b = "abc";

        // act:
        // assert:
        assertFalse(Main.isInteger(b));

        //
        out.println("Method 'isInteger' test for String finish");
    }

}
