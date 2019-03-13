package by.stormnet;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class VerifyLauncherTest {

  @ParameterizedTest
  @CsvSource({
      "1, 1",
      "-1, -1"
  })
  void verify(int a, int b) {
    assertThat(a, equalTo(b));
  }
}
