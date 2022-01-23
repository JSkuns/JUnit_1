import org.junit.jupiter.api.*;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    Main sut;

    @BeforeAll
    public static void start() {
        out.println("Class 'Main' tests start");
    }

    @BeforeEach
    public void startTest() {
        sut = new Main();
    }

    @AfterAll
    public static void finish() {
        out.println("Class 'Main' tests finish");
    }

    @AfterEach
    public void finishTest() {
        sut = null;
    }

    @Test
    public void isIntegerTest() {
        //
        out.println("Method 'isInteger' test start");

        // arrange:
        String a = "5";
        String b = "abc";
        var expectedThrow = ClassCastException.class;

        // act:
        boolean resultA = Main.isInteger(a);

        // assert:
        assertTrue(resultA);
        assertFalse(Main.isInteger(b));

        //
        out.println("Method 'isInteger' test finish");
    }

}