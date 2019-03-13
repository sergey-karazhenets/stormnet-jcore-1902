package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class IntBasicsTaskTest {

  private final IntBasicsTask task = new IntBasicsTask();

  @Test
  void bitsInMemory() {
    assertThat(task.bitsInMemory(), equalTo(4 * 8));
  }

  @Test
  void bytesInMemory() {
    assertThat(task.bytesInMemory(), equalTo(4));
  }

  @Test
  void minValue() {
    assertThat(task.minValue(), equalTo(Integer.MIN_VALUE));
  }

  @Test
  void maxValue() {
    assertThat(task.maxValue(), equalTo(Integer.MAX_VALUE));
  }
}