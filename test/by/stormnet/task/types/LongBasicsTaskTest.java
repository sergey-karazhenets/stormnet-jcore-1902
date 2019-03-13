package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class LongBasicsTaskTest {

  private final LongBasicsTask task = new LongBasicsTask();

  @Test
  void bitsInMemory() {
    assertThat(task.bitsInMemory(), equalTo(8 * 8));
  }

  @Test
  void bytesInMemory() {
    assertThat(task.bytesInMemory(), equalTo(8));
  }

  @Test
  void minValue() {
    assertThat(task.minValue(), equalTo(Long.MIN_VALUE));
  }

  @Test
  void maxValue() {
    assertThat(task.maxValue(), equalTo(Long.MAX_VALUE));
  }
}