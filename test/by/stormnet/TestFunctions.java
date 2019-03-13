package by.stormnet;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

public class TestFunctions {

  public static List<String> splitByComma(String str) {
    assertThat(str, notNullValue());
    assertThat("String is empty", str.length(), greaterThan(0));
    return stream(str.split(","))
        .map(String::trim)
        .filter(s -> s.length() > 0)
        .collect(toList());
  }
}
