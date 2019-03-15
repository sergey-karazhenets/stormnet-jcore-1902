package by.stormnet.task.conditionals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SwitchTaskTest {

  private final SwitchTask task = new SwitchTask();

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, operator: {2}, expected: {3}")
  @CsvSource({
      "7, 11, +, 18",
      "7, 11, -, -4",
      "7, 11, *, 77",
      "27, 5, /, 5.4",
      "27, 5, %, 2",
      "0, 1, range_sum, 0",
      "0, 2, range_sum, 1",
      "1, 5, range_sum, 10",
      "1, 5, unknown, 10",
      "3, 5, unknown-op, 30",
  })
  void calculator(int x, int y, String operator, float expected) {
    assertThat(task.calculator(x, y, operator), equalTo(expected));
  }
}