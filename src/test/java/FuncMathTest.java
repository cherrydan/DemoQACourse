import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FuncMathTest {

    private static FuncMath math;

    @BeforeAll
    public static void init() {
        math = new FuncMath();
    }

    @AfterAll
    public static void tearDown() {
        math = null;
    }

    @Test
    public void calls()  {
        math.factorial(1);
        Assertions.assertEquals(1, math.getCalls());

        math.factorial(5);
        Assertions.assertEquals(2, math.getCalls());
    }


}
