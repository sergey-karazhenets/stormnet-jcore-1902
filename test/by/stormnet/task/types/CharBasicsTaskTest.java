package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

class CharBasicsTaskTest {

  private final CharBasicsTask task = new CharBasicsTask();

  @Test
  void bitsInMemory() {
    assertThat(task.bitsInMemory(), equalTo(2 * 8));
  }

  @Test
  void bytesInMemory() {
    assertThat(task.bytesInMemory(), equalTo(2));
  }
}