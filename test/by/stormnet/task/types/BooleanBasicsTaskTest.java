package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class BooleanBasicsTaskTest {

  private final BooleanBasicsTask task = new BooleanBasicsTask();

  @Test
  void possibleValuesCount() {
    assertThat(task.possibleValuesCount(), equalTo(2));
  }

  @Test
  void returnFalse() {
    assertThat(task.returnFalse(), equalTo(false));
  }

  @Test
  void returnTrue() {
    assertThat(task.returnTrue(), equalTo(true));
  }
}