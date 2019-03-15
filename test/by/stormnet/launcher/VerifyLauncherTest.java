package by.stormnet.launcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class VerifyLauncherTest {

  @Test
  void verify() {
    assertThat(1 + 1, equalTo(2));
  }

  @ParameterizedTest
  @ValueSource(ints = { 1 })
  void parameterizedVerify(int value) {
    assertThat(value, equalTo(1));
  }
}
