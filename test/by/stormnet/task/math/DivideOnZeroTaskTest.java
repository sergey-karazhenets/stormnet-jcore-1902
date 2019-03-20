package by.stormnet.task.math;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DivideOnZeroTaskTest {

  private final DivideOnZeroTask task = new DivideOnZeroTask();

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, expected: {2}")
  @CsvSource({
      "5, 2, 2.5",
      "6, 2, 3",
      "34, 0, 1",
      "-12, 0, -1",
      "0, 0, 0",
  })
  void floatDivide(float x, float y, float expected) {
    assertThat(task.floatDivide(x, y), equalTo(expected));
  }

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, expected: {2}")
  @CsvSource({
      "5, 2, 2.5",
      "6, 2, 3",
      "34, 0, 1",
      "-12, 0, -1",
      "0, 0, 0",
  })
  void doubleDivide(double x, double y, double expected) {
    assertThat(task.doubleDivide(x, y), equalTo(expected));
  }
}