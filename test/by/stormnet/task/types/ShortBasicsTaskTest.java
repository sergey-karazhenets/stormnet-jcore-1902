package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class ShortBasicsTaskTest {

  private final ShortBasicsTask task = new ShortBasicsTask();

  @Test
  void bitsInMemory() {
    assertThat(task.bitsInMemory(), equalTo(2 * 8));
  }

  @Test
  void bytesInMemory() {
    assertThat(task.bytesInMemory(), equalTo(2));
  }

  @Test
  void minValue() {
    assertThat(task.minValue(), equalTo(Short.MIN_VALUE));
  }

  @Test
  void maxValue() {
    assertThat(task.maxValue(), equalTo(Short.MAX_VALUE));
  }
}