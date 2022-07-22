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

    //Проверка на выданный функцией числовой результат
    @Test
    public void calls()  {
        math.factorial(1);
        Assertions.assertEquals(5, math.getCalls());

//        math.factorial(5);
//        Assertions.assertEquals(4, math.getCalls());
    }

    //Возвращает true если соответствует тому что мы ожидаем
    @Test
    public void factorial() {
        Assertions.assertTrue(math.factorial(0) == 1);
        Assertions.assertTrue(math.factorial(1) == 1);
        Assertions.assertTrue(math.factorial(5) == 120);
    }

    @Test
    public void factorialNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            math.factorial(-2);
        });
    }



}
