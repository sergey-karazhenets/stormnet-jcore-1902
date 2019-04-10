package by.stormnet.task.recursion;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RecursionTaskTest {

  private final RecursionTask task = new RecursionTask();

  @ParameterizedTest(name = "[{index}] x: {0}, expected: {1}")
  @CsvSource({
      "1, 1",
      "2, 2",
      "3, 6",
      "4, 24",
      "5, 120",
      "17, 355687428096000",
      "20, 2432902008176640000"
  })
  void factorial(int x, long expected) {
    assertThat(task.factorial(x), equalTo(expected));
  }
}