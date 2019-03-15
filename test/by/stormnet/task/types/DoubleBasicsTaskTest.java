package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class DoubleBasicsTaskTest {

  private final DoubleBasicsTask task = new DoubleBasicsTask();

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
    assertThat(task.minValue(), equalTo(Double.MIN_VALUE));
  }

  @Test
  void maxValue() {
    assertThat(task.maxValue(), equalTo(Double.MAX_VALUE));
  }

  @Test
  void positiveInfinity() {
    assertThat(task.positiveInfinity(), equalTo(Double.POSITIVE_INFINITY));
  }

  @Test
  void negativeInfinity() {
    assertThat(task.negativeInfinity(), equalTo(Double.NEGATIVE_INFINITY));
  }

  @Test
  void nan() {
    assertThat(Double.isNaN(task.nan()), equalTo(true));
  }
}