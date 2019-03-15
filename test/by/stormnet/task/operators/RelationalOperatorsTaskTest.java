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

public class RelationalOperatorsTaskTest {

  private final RelationalOperatorsTask task = new RelationalOperatorsTask();

  @Test
  void operators() {
    final List<String> operators = splitByComma(task.operators());
    assertThat(operators, hasSize(6));
    assertThat(operators, allOf(
        hasItem("=="),
        hasItem("!="),
        hasItem(">"),
        hasItem("<"),
        hasItem(">="),
        hasItem("<=")
    ));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "1, 1",
      "-1, -1",
      "0, 0"
  })
  void testEqual(int a, int b) {
    assertThat(task.testEqual(a, b), equalTo(true));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "1, -1",
      "-1, -2",
      "0, 3"
  })
  void testNotEqual(int a, int b) {
    assertThat(task.testNotEqual(a, b), equalTo(true));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "-1, 2",
      "-2, -1",
      "0, 3"
  })
  void testLessThan(int a, int b) {
    assertThat(task.testLessThan(a, b), equalTo(true));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "2, -1",
      "-1, -2",
      "3, 0"
  })
  void testGreaterThan(int a, int b) {
    assertThat(task.testGreaterThan(a, b), equalTo(true));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "-1, 2",
      "-1, -1",
      "-2, -1",
      "2, 2",
      "0, 0"
  })
  void testLessOrEqualThan(int a, int b) {
    assertThat(task.testLessOrEqualThan(a, b), equalTo(true));
  }

  @ParameterizedTest(name = "[{index}] a: {0}, b: {1}")
  @CsvSource({
      "2, -1",
      "-1, -1",
      "-1, -2",
      "2, 2",
      "0, 0"
  })
  void testGreaterOrEqualThan(int a, int b) {
    assertThat(task.testGreaterOrEqualThan(a, b), equalTo(true));
  }
}