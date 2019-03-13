package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class FloatBasicsTaskTest {

  private final FloatBasicsTask task = new FloatBasicsTask();

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
    assertThat(task.minValue(), equalTo(Float.MIN_VALUE));
  }

  @Test
  void maxValue() {
    assertThat(task.maxValue(), equalTo(Float.MAX_VALUE));
  }

  @Test
  void positiveInfinity() {
    assertThat(task.positiveInfinity(), equalTo(Float.POSITIVE_INFINITY));
  }

  @Test
  void negativeInfinity() {
    assertThat(task.negativeInfinity(), equalTo(Float.NEGATIVE_INFINITY));
  }

  @Test
  void nan() {
    assertThat(Float.isNaN(task.nan()), equalTo(true));
  }
}