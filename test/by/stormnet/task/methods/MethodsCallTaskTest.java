package by.stormnet.task.methods;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MethodsCallTaskTest {

  private final MethodsCallTask task = new MethodsCallTask();

  @Test
  void doNothing() {
    final MethodsCallTask taskSpy = spy(task);
    taskSpy.doNothing();
    verify(taskSpy, times(1)).doNothingLogic();
  }

  @ParameterizedTest(name = "[{index}] str1: {0}, str2: {1}, expected: {2}")
  @CsvSource(value = {
      "The best is |yet to come|The best is yet to come"
  }, delimiter = '|')
  void concatStrings(String str1, String str2, String expected) {
    final MethodsCallTask taskSpy = spy(task);
    str1 += " ";
    assertThat(taskSpy.concatStrings(str1, str2), equalTo(expected));
    verify(taskSpy, times(1)).concatStringsLogic(eq(str1), eq(str2));
  }

  @Test
  void doNothingFromAnotherClass() {
    final MethodsCallTask taskSpy = spy(task);
    final MethodsCallTaskLogic logicSpy = spy(MethodsCallTaskLogic.class);
    taskSpy.doNothingFromAnotherClass(logicSpy);
    verify(taskSpy, times(0)).doNothing();
    verify(logicSpy, times(1)).doNothing();
  }

  @ParameterizedTest(name = "[{index}] str1: {0}, str2: {1}, expected: {2}")
  @CsvSource(value = {
      "I tried so hard and got so far, |but in the end it doesn't even matter|"
          + "I tried so hard and got so far, but in the end it doesn't even matter"
  }, delimiter = '|')
  void concatStringsFromAnotherClass(String str1, String str2, String expected) {
    final MethodsCallTask taskSpy = spy(task);
    final MethodsCallTaskLogic logicSpy = spy(MethodsCallTaskLogic.class);
    str1 += " ";
    assertThat(taskSpy.concatStringsFromAnotherClass(logicSpy, str1, str2), equalTo(expected));
    verify(taskSpy, times(0)).concatStrings(eq(str1), eq(str2));
    verify(logicSpy, times(1)).concatStrings(eq(str1), eq(str2));
  }
}