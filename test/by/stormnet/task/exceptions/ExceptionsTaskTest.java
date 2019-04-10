package by.stormnet.task.exceptions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ExceptionsTaskTest {

  private final ExceptionsTask task = new ExceptionsTask();

  @ParameterizedTest(name = "[{index}] expected: {1}")
  @MethodSource(value = "handleExceptionArgs")
  void handleException(Supplier<Integer> logic, int expected) {
    assertThat(task.handleException(logic), equalTo(expected));
  }

  static Collection<Arguments> handleExceptionArgs() {
    return Arrays.asList(
        Arguments.of((Supplier<Integer>) () -> 0, 0),
        Arguments.of((Supplier<Integer>) () -> 1, 1),
        Arguments.of((Supplier<Integer>) () -> 125, 125),
        Arguments.of((Supplier<Integer>) () -> { throw new IllegalStateException(); }, 0)
    );
  }

  @ParameterizedTest(name = "[{index}] expected: {1}")
  @MethodSource(value = "handleManyExceptionsArgs")
  void handleManyExceptions(Supplier<Integer> logic, int expected) {
    assertThat(task.handleManyExceptions(logic), equalTo(expected));
  }

  static Collection<Arguments> handleManyExceptionsArgs() {
    return Arrays.asList(
        Arguments.of((Supplier<Integer>) () -> 0, 0),
        Arguments.of((Supplier<Integer>) () -> 1, 1),
        Arguments.of((Supplier<Integer>) () -> 125, 125),
        Arguments.of((Supplier<Integer>) () -> { throw new IllegalStateException(); }, 0),
        Arguments.of((Supplier<Integer>) () -> { throw new IllegalArgumentException(); }, 1)
    );
  }

  @ParameterizedTest(name = "[{index}] expected: {1}")
  @MethodSource(value = "handleManyExceptions1Args")
  void handleManyExceptions1(Supplier<Integer> logic, int expected) {
    assertThat(task.handleManyExceptions1(logic), equalTo(expected));
  }

  static Collection<Arguments> handleManyExceptions1Args() {
    return Arrays.asList(
        Arguments.of((Supplier<Integer>) () -> 0, 0),
        Arguments.of((Supplier<Integer>) () -> 1, 1),
        Arguments.of((Supplier<Integer>) () -> 125, 125),
        Arguments.of((Supplier<Integer>) () -> { throw new IllegalStateException(); }, 0),
        Arguments.of((Supplier<Integer>) () -> { throw new IllegalArgumentException(); }, 0)
    );
  }

  @ParameterizedTest(name = "[{index}] expected: {1}")
  @MethodSource(value = "tryCatchFinallyArgs")
  void tryCatchFinally(Supplier<Integer> logic, int expected) {
    final Runnable finallyLogic = mock(Runnable.class);
    assertThat(task.tryCatchFinally(logic, finallyLogic), equalTo(expected));
    verify(finallyLogic, times(1)).run();
  }

  static Collection<Arguments> tryCatchFinallyArgs() {
    return Arrays.asList(
        Arguments.of((Supplier<Integer>) () -> 0, 0),
        Arguments.of((Supplier<Integer>) () -> 1, 1),
        Arguments.of((Supplier<Integer>) () -> 125, 125),
        Arguments.of((Supplier<Integer>) () -> { throw new IllegalStateException(); }, 0)
    );
  }

  @Test
  void throwException() {
    assertThat(task.throwException(0), equalTo(0));
    assertThrows(IllegalArgumentException.class, () -> task.throwException(1));
  }
}