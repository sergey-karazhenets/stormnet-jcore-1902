package by.stormnet.task.operators;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class IncrementDecrementOperatorsTaskTest {

  private final IncrementDecrementOperatorsTask task = new IncrementDecrementOperatorsTask();

  @ParameterizedTest(name = "[{index}] val: {0}, expected: {1}")
  @CsvSource({
      "1, 2",
      "-1, 0"
  })
  void incrementPrefixForm(int val, int result) {
    assertThat(task.incrementPrefixForm(val), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] val: {0}, expected: {1}")
  @CsvSource({
      "1, 1",
      "-1, -1"
  })
  void incrementPostfixForm(int val, int result) {
    assertThat(task.incrementPostfixForm(val), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] val: {0}, expected: {1}")
  @CsvSource({
      "1, 0",
      "-1, -2"
  })
  void decrementPrefixForm(int val, int result) {
    assertThat(task.decrementPrefixForm(val), equalTo(result));
  }

  @ParameterizedTest(name = "[{index}] val: {0}, expected: {1}")
  @CsvSource({
      "1, 1",
      "-1, -1"
  })
  void decrementPostfixForm(int val, int result) {
    assertThat(task.decrementPostfixForm(val), equalTo(result));
  }
}