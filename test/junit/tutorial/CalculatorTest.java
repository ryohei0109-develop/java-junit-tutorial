package junit.tutorial;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void multiplyで3と4の乗算結果が取得できる() {
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    void multiplyで5と7の乗算結果が取得できる() {
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5, 7);
        assertThat(actual, is(expected));
    }

    @Test
    void divideで3と2の除算結果が取得できる() {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }

    @Test
    void divideで5と0のときIllegalArgumentExceptionを送出する() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Calculator calc = new Calculator();
            calc.divide(5, 0);
        });
    }
}
