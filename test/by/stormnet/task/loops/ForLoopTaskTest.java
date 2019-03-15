package by.stormnet.task.loops;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ForLoopTaskTest {

  private final ForLoopTask task = new ForLoopTask();

  @Test
  void calculateSum() {
    assertThat(task.calculateSum(), equalTo(1596));
  }

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, expected: {2}")
  @CsvSource({
      "0, 0, 0",
      "0, 1, 0",
      "1, 1, 0",
      "1, 2, 1",
      "1, 3, 3",
      "1, 4, 6",
      "1, 57, 1596",
      "-10, 6, -40",
      "5, 0, 15",
  })
  void calculateSum(int x, int y, int expected) {
    assertThat(task.calculateSum(x, y), equalTo(expected));
  }

  @ParameterizedTest(name = "[{index}] x: {0}, y: {1}, expected: {2}")
  @CsvSource({
      "0, 0, 0",
      "1, 1, 0",
      "0, 1, -1",
      "1, 1, 0",
      "1, 2, -1",
      "5, 1, -5",
      "-5, 1, 4"
  })
  void calculateSub(int x, int y, int expected) {
    assertThat(task.calculateSub(x, y), equalTo(expected));
  }

  @Test
  void calculateEvenMultiply() {
    assertThat(task.calculateEvenMultiply(), equalTo(8631196239733456896L));
  }

  @Test
  void sumOfMultiplicationTable() {
    assertThat(task.sumOfMultiplicationTable(), equalTo(2025));
  }
}