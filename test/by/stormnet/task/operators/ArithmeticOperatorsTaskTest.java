package by.stormnet.task.operators;

import static by.stormnet.TestFunctions.splitByComma;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ArithmeticOperatorsTaskTest {

  private final ArithmeticOperatorsTask task = new ArithmeticOperatorsTask();

  @Test
  void operators() {
    final List<String> operators = splitByComma(task.operators());
    assertThat(operators, hasSize(5));
    assertThat(operators, allOf(
        hasItem("+"),
        hasItem("-"),
        hasItem("*"),
        hasItem("/"),
        hasItem("%")
    ));
  }

  @Test
  void operatorsShortForm() {
    final List<String> operators = splitByComma(task.operatorsShortForm());
    assertThat(operators, hasSize(5));
    assertThat(operators, allOf(
        hasItem("+="),
        hasItem("-="),
        hasItem("*="),
        hasItem("/="),
        hasItem("%=")
    ));
  }

  // --- plus -----------------------------------------------------------------

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "1, 2, 3",
      "-1, 2, 1",
      "-1, -2, -3",
      "0, 0, 0"
  })
  void plus1(int a, int b, int sum) {
    assertThat(task.plus(a, b), equalTo(sum));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, c: {2}, expected: {3}")
  @CsvSource({
      "1, 2, 3, 6",
      "-1, 2, 1, 2",
      "-1, -2, -3, -6",
      "0, 0, 0, 0"
  })
  void plus2(int a, int b, int c, int sum) {
    assertThat(task.plus(a, b, c), equalTo(sum));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "1, 2, 3",
      "-1, 2, 1",
      "-1, -2, -3",
      "0, 0, 0"
  })
  void plusShortForm(int a, int b, int sum) {
    assertThat(task.plusShortForm(a, b), equalTo(sum));
  }

  // --- minus ----------------------------------------------------------------

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "6, 4, 2",
      "-1, 2, -3",
      "-1, -2, 1",
      "0, 0, 0"
  })
  void minus1(int a, int b, int result) {
    assertThat(task.minus(a, b), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, c: {2}, expected: {3}")
  @CsvSource({
      "6, 4, 2, 0",
      "-1, 2, -3, 0",
      "-1, -2, 5, -4",
      "0, 0, 0, 0"
  })
  void minus2(int a, int b, int c, int result) {
    assertThat(task.minus(a, b, c), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "6, 4, 2",
      "-1, 2, -3",
      "-1, -2, 1",
      "0, 0, 0"
  })
  void minusShortForm(int a, int b, int result) {
    assertThat(task.minusShortForm(a, b), equalTo(result));
  }

  // --- multiply -------------------------------------------------------------

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "6, 4, 24",
      "-1, 2, -2",
      "-1, -2, 2",
      "0, 0, 0"
  })
  void multiply1(int a, int b, int result) {
    assertThat(task.multiply(a, b), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "6, 4, 24, 576",
      "-1, 2, -2, 4",
      "-1, 2, 5, -10",
      "0, 0, 0, 0"
  })
  void multiply2(int a, int b, int c, int result) {
    assertThat(task.multiply(a, b, c), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "6, 4, 24",
      "-1, 2, -2",
      "-1, -2, 2",
      "0, 0, 0"
  })
  void multiplyShortForm(int a, int b, int result) {
    assertThat(task.multiplyShortForm(a, b), equalTo(result));
  }

  // --- divide ---------------------------------------------------------------

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "24, 4, 6",
      "-2, 1, -2",
      "-4, -2, 2",
      "21, 3, 7"
  })
  void divide1(int a, int b, int result) {
    assertThat(task.divide(a, b), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "24, 4, 6, 1",
      "-2, 1, -2, 1",
      "-4, -2, 2, 1",
      "21, 3, 7, 1"
  })
  void divide2(int a, int b, int c, int result) {
    assertThat(task.divide(a, b, c), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "24, 4, 6",
      "-2, 1, -2",
      "-4, -2, 2",
      "21, 3, 7"
  })
  void divideShortForm(int a, int b, int result) {
    assertThat(task.divideShortForm(a, b), equalTo(result));
  }

  // --- modulus --------------------------------------------------------------

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "24, 5, 4",
      "20, 5, 0",
      "13, 5, 3",
      "19, 5, 4"
  })
  void modulus(int a, int b, int result) {
    assertThat(task.modulus(a, b), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}, expected: {2}")
  @CsvSource({
      "24, 5, 4",
      "20, 5, 0",
      "13, 5, 3",
      "19, 5, 4"
  })
  void modulusShortForm(int a, int b, int result) {
    assertThat(task.modulusShortForm(a, b), equalTo(result));
  }
}