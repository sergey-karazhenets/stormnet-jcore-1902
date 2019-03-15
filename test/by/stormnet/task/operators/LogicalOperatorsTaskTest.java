package by.stormnet.task.operators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class LogicalOperatorsTaskTest {

  private final LogicalOperatorsTask task = new LogicalOperatorsTask();

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "0, 3, false",
      "0, 4, false",
      "1, 3, false",
      "-1, 5, true"
  })
  void testAndOperator(int a, int b, boolean result) {
    assertThat(task.testAndOperator(a, b), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "1, 3, false",
      "1, 4, true",
      "0, 3, true",
      "0, 4, true"
  })
  void testOrOperator(int a, int b, boolean result) {
    assertThat(task.testOrOperator(a, b), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "0, 1, 2, 0",
      "-1, 3, 4, 0",
      "1, 5, 6, 11",
      "3, -1, 5, 4"
  })
  void testTernaryOperator(int value, int a, int b, int sum) {
    assertThat(task.testTernaryOperator(value, a, b), equalTo(sum));
  }
}