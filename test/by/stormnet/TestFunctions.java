package by.stormnet;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.notNullValue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFunctions {

  public static List<String> splitByComma(String str) {
    assertThat(str, notNullValue());
    assertThat("String is empty", str.length(), greaterThan(0));
    return stream(str.split(","))
        .map(String::trim)
        .filter(s -> s.length() > 0)
        .collect(toList());
  }

  @SafeVarargs
  public static <T> List<T> mutableListOf(T... values) {
    return Stream.of(values).collect(Collectors.toList());
  }

  @SafeVarargs
  public static <T> Set<T> setOf(T... values) {
    if (values.length == 0) {
      return new HashSet<>(0);
    }
    return new HashSet<>(Arrays.asList(values));
  }

  @SuppressWarnings("unchecked")
  public static <K, V> Map<K, V> mapOf(Object... pairs) {
    if (pairs.length == 0) {
      return new HashMap<>(0);
    }
    if (pairs.length % 2 != 0) {
      throw new IllegalStateException("Not all pairs is set: " + Arrays.asList(pairs));
    }
    final Map<K, V> map = new HashMap<>();
    for (int i = 0; i < pairs.length; i += 2) {
      map.put((K) pairs[i], (V) pairs[i + 1]);
    }
    return map;
  }
}
