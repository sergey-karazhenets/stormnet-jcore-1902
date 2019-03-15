package by.stormnet.task.arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class ArraysTaskTest {

  private final ArraysTask task = new ArraysTask();

  @ParameterizedTest(name = "[{index}] values: {0}, expected length: {1}")
  @MethodSource(value = "arrayLengthArgs")
  void arrayLength(int[] values, int length) {
    assertThat(task.arrayLength(values), equalTo(length));
  }

  static Collection<Arguments> arrayLengthArgs() {
    return Arrays.asList(
        Arguments.of(new int[0], 0),
        Arguments.of(new int[] { 1 }, 1),
        Arguments.of(new int[] { 1, 2, 3 }, 3),
        Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 5)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected element: {1}")
  @MethodSource(value = "firstElementArgs")
  void firstElement(int[] values, int firstElement) {
    assertThat(task.firstElement(values), equalTo(firstElement));
  }

  static Collection<Arguments> firstElementArgs() {
    return Arrays.asList(
        Arguments.of(new int[] { 1, 4 }, 1),
        Arguments.of(new int[] { 7, 4, 3 }, 7),
        Arguments.of(new int[] { 3, 5, 6, 4, 8 }, 3)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected element: {1}")
  @MethodSource(value = "lastElementArgs")
  void lastElement(int[] values, int lastElement) {
    assertThat(task.lastElement(values), equalTo(lastElement));
  }

  static Collection<Arguments> lastElementArgs() {
    return Arrays.asList(
        Arguments.of(new int[] { 1, 4 }, 4),
        Arguments.of(new int[] { 7, 4, 3 }, 3),
        Arguments.of(new int[] { 3, 5, 6, 4, 8 }, 8)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "elementsSumArgs")
  void elementsSum(int[] values, int expectedSum) {
    assertThat(task.elementsSum(values), equalTo(expectedSum));
  }

  static Collection<Arguments> elementsSumArgs() {
    return Arrays.asList(
        Arguments.of(new int[] { 1, 4, 3, 5, 6, 9, 1, 4, 5 }, 25),
        Arguments.of(new int[] { 6, 2, 8, -5, 8, 1, 1, 4 }, 9)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "selectElementsArgs")
  void selectElements(int[] values, int[] expected) {
    assertThat(task.selectElements(values), equalTo(expected));
  }

  static Collection<Arguments> selectElementsArgs() {
    return Arrays.asList(
        Arguments.of(
            new int[] { 1, 4, 3, 5, 6, 9, 1, 4, 5 },
            new int[] { 5, 9, 1, 4 }
        ),
        Arguments.of(
            new int[] { 6, 2, 8, -5, 8, 1, 1, 4 },
            new int[] { -5, 1, 1, 4 }
        )
    );
  }

  @ParameterizedTest(name = "[{index}] str: {0}, expected count: {1}")
  @CsvSource({
      "empty, 0",
      "abc, 0",
      "abck, 1",
      "kabcdefkesgkeek, 4",
  })
  void countOfLetterInString(String str, int expectedCount) {
    String srtToTest = str;
    if ("empty".equals(str)) {
      srtToTest = "";
    }
    assertThat(task.countOfLetterInString(srtToTest), equalTo(expectedCount));
  }

  @ParameterizedTest(name = "[{index}] matrix: {0}, expected sum: {1}")
  @MethodSource(value = "rowsSumArgs")
  void rowsSum(int[][] matrix, int expectedSum) {
    assertThat(task.rowsSum(matrix), equalTo(expectedSum));
  }

  static Collection<Arguments> rowsSumArgs() {
    return Arrays.asList(
        Arguments.of(
            new int[][] {
                { 1, 3, 5 },
                { 2, 4, 5 }
            },
            20
        ),
        Arguments.of(
            new int[][] {
                { 1, 3, 5, 6 },
                { 2, 4, 5, 3 },
                { 5, 2, 7, 1 },
                { 6, 5, 2, 8 },
            },
            65
        )
    );
  }
}