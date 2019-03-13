package by.stormnet.task.conditionals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class IfElseTaskTest {

  private final IfElseTask task = new IfElseTask();

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, expected: {2}")
  @CsvSource({
      "2, 6, 42",
      "3, 6, 42",
      "2, 4, -2",
      "4, 2, 2",
      "5, 2, 3"
  })
  void ifElse(int x, int y, int expected) {
    assertThat(task.ifElse(x, y), equalTo(expected));
  }

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, expected: {2}")
  @CsvSource({
      "6, 2, 6",
      "7, 2, 6",
      "10, 4, 6",
      "11, 6, 3",
      "14, 6, 6",
      "15, 17, 0",
      "47, 17, 8"
  })
  void ifElseIf(float x, float y, int expected) {
    assertThat(task.ifElseIf(x, y), equalTo(expected));
  }

  @ParameterizedTest(name = "[{index}] x: {0}, expected: {1}")
  @CsvSource({
      "2, 4",
      "6, 12",
      "3, 9",
      "9, 27",
      "1, 1",
      "5, 5"
  })
  void ifElseIfElse(int x, int expected) {
    assertThat(task.ifElseIfElse(x), equalTo(expected));
  }
}