package by.stormnet.task.exceptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

public class ExceptionsTaskTest {

  private final ExceptionsTask task = new ExceptionsTask();

  @ParameterizedTest
  @MethodSource(value = "handleExceptionArgs")
  void handleException(ExceptionsTaskLogic logic, int expected) {
    assertThat(task.handleException(logic), equalTo(expected));
  }

  static Collection<Arguments> handleExceptionArgs() {
    return Arrays.asList(
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 0,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            0
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 1,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            1
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 125,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            125
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> { throw new IllegalStateException(); },
                () -> 323,
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            323
        )
    );
  }

  @ParameterizedTest
  @MethodSource(value = "handleManyExceptionsArgs")
  void handleManyExceptions(ExceptionsTaskLogic logic, int expected) {
    assertThat(task.handleManyExceptions(logic), equalTo(expected));
  }

  static Collection<Arguments> handleManyExceptionsArgs() {
    return Arrays.asList(
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 0,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            0
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 1,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            1
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 125,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            125
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> { throw new IllegalStateException(); },
                () -> 323,
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            323
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> { throw new IllegalArgumentException(); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> 425
            ),
            425
        )
    );
  }

  @ParameterizedTest
  @MethodSource(value = "handleManyExceptions1Args")
  void handleManyExceptions1(ExceptionsTaskLogic logic, int expected) {
    assertThat(task.handleManyExceptions1(logic), equalTo(expected));
  }

  static Collection<Arguments> handleManyExceptions1Args() {
    return Arrays.asList(
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 0,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            0
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 1,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            1
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 125,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            125
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> { throw new IllegalStateException(); },
                () -> 32,
                () -> 34
            ),
            66
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> { throw new IllegalArgumentException(); },
                () -> 32,
                () -> 45
            ),
            77
        )
    );
  }

  @ParameterizedTest
  @MethodSource(value = "handleExceptionWithFinallyArgs")
  void handleExceptionWithFinally(ExceptionsTaskLogic logic, int expected) {
    final ExceptionsTaskLogic logicSpy = spy(logic);
    assertThat(task.handleExceptionWithFinally(logicSpy), equalTo(expected));
    verify(logicSpy, times(1)).doFinally();
  }

  static Collection<Arguments> handleExceptionWithFinallyArgs() {
    return Arrays.asList(
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 0,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            0
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 1,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            1
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> 125,
                () -> { throw new IllegalStateException("Method shouldn't be called"); },
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            125
        ),
        Arguments.of(
            new ExceptionsTaskLogic(
                () -> { throw new IllegalStateException(); },
                () -> 323,
                () -> { throw new IllegalStateException("Method shouldn't be called"); }
            ),
            323
        )
    );
  }

  @ParameterizedTest(name = "[{index}] x: {0}, expected: {1}")
  @CsvSource({
      "0, 0",
      "-1, -1",
      "1, exception"
  })
  void throwException(int x, String expected) {
    if (x > 0) {
      assertThrows(IllegalArgumentException.class, () -> task.throwException(x));
    } else {
      assertThat(task.throwException(x), equalTo(Integer.valueOf(expected)));
    }
  }

  @ParameterizedTest(name = "[{index}] x: {0}, expected: {1}")
  @CsvSource({
      "0, 0",
      "-1, -1",
      "1, exception"
  })
  void throwExceptionWithMessage(int x, String expected) {
    if (x > 0) {
      final IllegalArgumentException thrown = assertThrows(
          IllegalArgumentException.class,
          () -> task.throwExceptionWithMessage(x)
      );
      assertThat(thrown.getMessage(), equalTo("Invalid value"));
    } else {
      assertThat(task.throwExceptionWithMessage(x), equalTo(Integer.valueOf(expected)));
    }
  }
}