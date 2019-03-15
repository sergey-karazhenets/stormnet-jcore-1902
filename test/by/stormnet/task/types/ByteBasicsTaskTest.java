package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class ByteBasicsTaskTest {

  private final ByteBasicsTask task = new ByteBasicsTask();

  @Test
  void bitsInMemory() {
    assertThat(task.bitsInMemory(), equalTo(8));
  }

  @Test
  void bytesInMemory() {
    assertThat(task.bytesInMemory(), equalTo(1));
  }

  @Test
  void minValue() {
    assertThat(task.minValue(), equalTo(Byte.MIN_VALUE));
  }

  @Test
  void maxValue() {
    assertThat(task.maxValue(), equalTo(Byte.MAX_VALUE));
  }
}