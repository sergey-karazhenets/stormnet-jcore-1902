package by.stormnet.task.numsys;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import org.junit.jupiter.api.Test;

public class NumeralSystemsTaskTest {

  private final NumeralSystemsTask task = new NumeralSystemsTask();

  @Test
  void decimalSystemBase() {
    assertThat(task.decimalSystemBase(), equalTo("10"));
  }

  @Test
  void decimalSystemDigitsCount() {
    assertThat(task.decimalSystemDigitsCount(), equalTo(10));
  }

  @Test
  void binarySystemBase() {
    assertThat(task.binarySystemBase(), equalTo("2"));
  }

  @Test
  void binarySystemDigitsCount() {
    assertThat(task.binarySystemDigitsCount(), equalTo(2));
  }

  @Test
  void quinarySystemBase() {
    assertThat(task.quinarySystemBase(), equalTo("5"));
  }

  @Test
  void quinarySystemDigitsCount() {
    assertThat(task.quinarySystemDigitsCount(), equalTo(5));
  }

  @Test
  void octalSystemBase() {
    assertThat(task.octalSystemBase(), equalTo("8"));
  }

  @Test
  void octalSystemDigitsCount() {
    assertThat(task.octalSystemDigitsCount(), equalTo(8));
  }

  @Test
  void hexadecimalSystemBase() {
    assertThat(task.hexadecimalSystemBase(), equalTo("16"));
  }

  @Test
  void hexadecimalSystemDigitsCount() {
    assertThat(task.hexadecimalSystemDigitsCount(), equalTo(16));
  }

  @Test
  void decimalSystem9() {
    assertThat(task.decimalSystem9(), equalTo("9"));
  }

  @Test
  void decimalSystem10() {
    assertThat(task.decimalSystem10(), equalTo("10"));
  }

  @Test
  void binarySystem1() {
    assertThat(task.binarySystem1(), equalTo("1"));
  }

  @Test
  void binarySystem2() {
    assertThat(task.binarySystem2(), equalTo("10"));
  }

  @Test
  void octalSystem7() {
    assertThat(task.octalSystem7(), equalTo("7"));
  }

  @Test
  void octalSystem8() {
    assertThat(task.octalSystem8(), equalTo("10"));
  }

  @Test
  void hexadecimalSystem15() {
    assertThat(task.hexadecimalSystem15(), equalTo("F"));
  }

  @Test
  void hexadecimalSystem16() {
    assertThat(task.hexadecimalSystem16(), equalTo("10"));
  }

  @Test
  void decimalSystem434() {
    assertThat(task.decimalSystem434(), equalTo("434"));
  }

  @Test
  void binarySystem434() {
    assertThat(task.binarySystem434(), equalTo("110110010"));
  }

  @Test
  void octalSystem434() {
    assertThat(task.octalSystem434(), equalTo("662"));
  }

  @Test
  void hexadecimalSystem434() {
    assertThat(task.hexadecimalSystem434(), equalToIgnoringCase("1B2"));
  }

  @Test
  void binaryToDecimal() {
    assertThat(task.binaryToDecimal(), equalTo(157));
  }

  @Test
  void octalToDecimal() {
    assertThat(task.octalToDecimal(), equalTo(2297));
  }

  @Test
  void hexToDecimal() {
    assertThat(task.hexToDecimal(), equalTo(523835));
  }
}