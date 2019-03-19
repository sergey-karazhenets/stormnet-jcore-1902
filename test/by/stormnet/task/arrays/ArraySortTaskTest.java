package by.stormnet.task.arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class ArraySortTaskTest {

  private final ArraySortTask task = new ArraySortTask();

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "bubbleSortAscArgs")
  void bubbleSortAsc(int[] values, int[] expected) {
    assertThat(task.bubbleSortAsc(values), equalTo(expected));
  }

  static Collection<Arguments> bubbleSortAscArgs() {
    return Arrays.asList(
        Arguments.of(
            new int[] { },
            new int[] { }
        ),
        Arguments.of(
            new int[] { 0 },
            new int[] { 0 }
        ),
        Arguments.of(
            new int[] { 0, 1 },
            new int[] { 0, 1 }
        ),
        Arguments.of(
            new int[] { 0, 1, 2, 3, 4, 5 },
            new int[] { 0, 1, 2, 3, 4, 5 }
        ),
        Arguments.of(
            new int[] { 1, -2, 7, 9, 3, 5, 11, -9, 0, 3 },
            new int[] { -9, -2, 0, 1, 3, 3, 5, 7, 9, 11 }
        )
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "bubbleSortDescArgs")
  void bubbleSortDesc(int[] values, int[] expected) {
    assertThat(task.bubbleSortDesc(values), equalTo(expected));
  }

  static Collection<Arguments> bubbleSortDescArgs() {
    return Arrays.asList(
        Arguments.of(
            new int[] { },
            new int[] { }
        ),
        Arguments.of(
            new int[] { 0 },
            new int[] { 0 }
        ),
        Arguments.of(
            new int[] { 1, 0 },
            new int[] { 1, 0 }
        ),
        Arguments.of(
            new int[] { 5, 4, 3, 2, 1, 0 },
            new int[] { 5, 4, 3, 2, 1, 0 }
        ),
        Arguments.of(
            new int[] { 1, -2, 7, 9, 3, 5, 11, -9, 0, 3 },
            new int[] { 11, 9, 7, 5, 3, 3, 1, 0, -2, -9 }
        )
    );
  }
}