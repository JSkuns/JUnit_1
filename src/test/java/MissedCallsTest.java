import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class MissedCallsTest {

    MissedCalls sut;

    @BeforeAll
    public static void start() {
        System.out.println("Class 'MissedCalls' tests start");
    }

    @BeforeEach
    public void startTest() {
        sut = new MissedCalls();
    }

    @AfterAll
    public static void finish() {
        System.out.println("Class 'MissedCalls' tests finish");
    }

    @AfterEach
    public void finishTest() {
        sut = null;
    }

    @Test
    public void clearMissedCallsTest() {
        //
        System.out.println("Method 'clearMissedCalls' test start");

        // arrange:
        Map<LocalDateTime, String> testStorage1 = new TreeMap<>();
        testStorage1.put(LocalDateTime.now(), "+7 888 888 88 88");

        // act:
        sut.clearMissedCalls(testStorage1);

        // assert result:
        assertTrue(testStorage1.isEmpty());

        //
        System.out.println("Method 'clearMissedCalls' test finish");
    }

    @Test
    public void addMissedCallsTest() {
        //
        System.out.println("Method 'addMissedCalls' test start");

        // arrange:
        Map<LocalDateTime, String> testStorage2 = new TreeMap<>();

        // act:
        sut.addMissedCalls(testStorage2, "+7 999 999 99 99");

        // assert:
        assertFalse(testStorage2.isEmpty());

        //
        System.out.println("Method 'addMissedCalls' test finish");
    }

}
