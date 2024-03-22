import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.doding.mvntest.Calculator;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    public void setup() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("두 수의 덧샘 결과를 검증하는 테스트")
    public void addTest() {
        int result = calc.add(10, 20);
        assertEquals(30, result); // 단정문 작성
    }

    @Test
    @DisplayName("두 수의 나눗샘 결과를 검증하는 테스트")
    public void divideTest() {
        int result = calc.divide(100, 5);
        assertEquals(20, result);
    }

    @Test
    @DisplayName("서로 반대되는 상황을 검증하는 assertions")
    public void assertionTest() {
        assertEquals(10, calc.add(10, 0));
        assertNotEquals(1, calc.add(1, 1));

        assertNotNull(calc);

        assertTrue(calc != null);
        assertFalse(calc == null);
    }

    @Test
    @DisplayName("assertSame vs assertEquals")
    public void saveVsEquals() {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        assertEquals(s1, s2);
        assertNotSame(s1, s2);
    }

    @Test
    @DisplayName("두 배열의 내용이 같은가?")
    public void assertArray() {
        char[] chars1 = "HelloJUnit".toCharArray();
        char[] chars2 = "HelloJUnit".toCharArray();

        assertNotEquals(chars1, chars2); // 배열의 주소값 비교.
        assertArrayEquals(chars1, chars2);
    }

    @Test
    @DisplayName("예외 상황에 대한 assertions")
    public void assertThrowsTest() {
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));
        assertEquals(e.getMessage(), "/ by zero");
    }

    @Test
    @DisplayName("하나의 테스트에서 여러개의 검증 처리: grouped assertions")
    public void multiAssertion1() {
        assertAll(() -> assertEquals(calc.add(10, 0), 10), () -> assertNotNull(calc), () -> assertTrue(calc != null));
    }

    @Test
    public void multiAssertion2() {
        assertEquals(calc.add(10, 0), 10);
        assertNotNull(calc);
        assertTrue(calc != null);
    }
}