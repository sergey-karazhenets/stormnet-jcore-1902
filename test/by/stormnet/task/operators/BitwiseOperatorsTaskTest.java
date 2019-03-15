package by.stormnet.task.operators;

import static by.stormnet.TestFunctions.splitByComma;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;

import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BitwiseOperatorsTaskTest {

  private final BitwiseOperatorsTask task = new BitwiseOperatorsTask();

  @Test
  @SuppressWarnings("unchecked")
  void operators() {
    final List<String> operators = splitByComma(task.operators());
    assertThat(operators, hasSize(7));
    assertThat(operators, allOf(
        hasItem("&"),
        hasItem("|"),
        hasItem("^"),
        hasItem("~"),
        hasItem(">>"),
        hasItem("<<"),
        hasItem(">>>")
    ));
  }

  @ParameterizedTest(name = "[{index}] b: {0}, expected: {1}")
  @CsvSource({
      "00100001, 00100001",
      "00101001, 00100001"
  })
  void setThirdBitToZeroUsingAnd(String b, String expected) {
    callAndAssert(task::setThirdBitToZeroUsingAnd, b, expected);
  }

  @ParameterizedTest(name = "[{index}] b: {0}, expected: {1}")
  @CsvSource({
      "00100001, 00101001",
      "00101001, 00101001"
  })
  void setThirdBitToOneUsingOr(String b, String expected) {
    callAndAssert(task::setThirdBitToOneUsingOr, b, expected);
  }

  @ParameterizedTest(name = "[{index}] b: {0}, expected: {1}")
  @CsvSource({
      "00100001, 00101001",
      "00101001, 00100001"
  })
  void invertThirdBitUsingXor(String b, String expected) {
    callAndAssert(task::invertThirdBitUsingXor, b, expected);
  }

  @ParameterizedTest(name = "[{index}] b: {0}, expected: {1}")
  @CsvSource({
      "00100001, 11011110",
      "00101001, 11010110"
  })
  void invertAllBitsUsingNot(String b, String expected) {
    callAndAssert(task::invertAllBitsUsingNot, b, expected);
  }

  @ParameterizedTest(name = "[{index}] b: {0}, expected: {1}")
  @CsvSource({
      "00100001, 00010000",
      "00101010, 10100000"
  })
  void shiftZeroBit4Left(String b, String expected) {
    callAndAssert(task::shiftZeroBit4Left, b, expected);
  }

  private void callAndAssert(Function<Byte, Integer> func, String incoming, String expected) {
    String actual = Integer.toBinaryString(func.apply(Byte.parseByte(incoming, 2)));
    if (actual.length() > 8) {
      actual = reverse(reverse(actual).substring(0, 8));
    }
    actual = "00000000".substring(actual.length()) + actual; // add leading zero
    final String reason = String.format("Incoming: %s; expected: %s, but was: %s", incoming, expected, actual);
    assertThat(reason, actual, equalTo(expected));
  }

  private String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }
}