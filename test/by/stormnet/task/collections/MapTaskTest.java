package by.stormnet.task.collections;

import static by.stormnet.TestFunctions.mapOf;
import static by.stormnet.TestFunctions.setOf;
import static java.lang.String.format;
import static java.util.HashMap.SimpleEntry;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anEmptyMap;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MapTaskTest {

  private final MapTask task = new MapTask();

  @Test
  void emptyHashMap() {
    assertThat(task.emptyHashMap(), allOf(
        notNullValue(),
        instanceOf(HashMap.class),
        anEmptyMap()));
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "sizeArgs")
  void size(Map<Integer, String> values, int expected) {
    assertThat(task.size(values), equalTo(expected));
  }

  static Collection<Arguments> sizeArgs() {
    return Arrays.asList(
        Arguments.of(mapOf(), 0),
        Arguments.of(mapOf(1, "one"), 1),
        Arguments.of(mapOf(1, "one", 2, "two", 3, "three", 4, "four", 5, "five", 6, "six"), 6),
        Arguments.of(IntStream.range(1, 51).boxed().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))), 50)
    );
  }

  @ParameterizedTest(name = "[{index}] key: {0}, value: {1}, expected: {2}")
  @MethodSource(value = "mapFromSingleValueArgs")
  void mapFromSingleValue(int key, String value, Map<Integer, String> expected) {
    assertThat(task.mapFromSingleValue(key, value), equalTo(expected));
  }

  static Collection<Arguments> mapFromSingleValueArgs() {
    return Arrays.asList(
        Arguments.of(1, "one", mapOf(1, "one")),
        Arguments.of(2, "two", mapOf(2, "two"))
    );
  }

  @ParameterizedTest(name = "[{index}] keys: {0}, values: {1}, expected: {2}")
  @MethodSource(value = "mapFromMultiValuesArgs")
  void mapFromMultiValues(List<Integer> keys, List<String> values, Map<Integer, String> expected) {
    assertThat(task.mapFromMultiValues(keys, values), equalTo(expected));
  }

  static Collection<Arguments> mapFromMultiValuesArgs() {
    final Set<Integer> integers = IntStream.range(1, 21).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(Collections.singletonList(1), Collections.singletonList("one"), mapOf(1, "one")),
        Arguments.of(Arrays.asList(1, 2), Arrays.asList("one", "two"), mapOf(1, "one", 2, "two")),
        Arguments.of(
            new ArrayList<>(integers),
            integers.stream().map(i -> format("%s%s", i, i)).collect(Collectors.toList()),
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i)))
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, expected: {1}")
  @MethodSource(value = "keysArgs")
  void keys(Map<Integer, String> map, Set<Integer> expected) {
    assertThat(task.keys(map), equalTo(expected));
  }

  static Collection<Arguments> keysArgs() {
    final Set<Integer> integers = IntStream.range(1, 16).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), setOf(1)),
        Arguments.of(mapOf(1, "one", 2, "two"), setOf(1, 2)),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            integers
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, expected: {1}")
  @MethodSource(value = "valuesArgs")
  void values(Map<Integer, String> map, List<String> expected) {
    assertThat(task.values(map), equalTo(expected));
  }

  static Collection<Arguments> valuesArgs() {
    final Set<Integer> integers = IntStream.range(1, 19).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), Collections.singletonList("one")),
        Arguments.of(mapOf(1, "one", 2, "two"), Arrays.asList("one", "two")),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            integers.stream().map(i -> format("%s%s", i, i)).collect(Collectors.toList())
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, expected: {1}")
  @MethodSource(value = "entriesArgs")
  void entries(Map<Integer, String> map, Set<Map.Entry<Integer, String>> expected) {
    assertThat(task.entries(map), equalTo(expected));
  }

  static Collection<Arguments> entriesArgs() {
    final Set<Integer> integers = IntStream.range(1, 14).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), setOf(new SimpleEntry<>(1, "one"))),
        Arguments.of(mapOf(1, "one", 2, "two"), setOf(new SimpleEntry<>(1, "one"), new SimpleEntry<>(2, "two"))),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            integers.stream().map(i -> new SimpleEntry<>(i, format("%s%s", i, i))).collect(Collectors.toSet())
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, key: {1}, expected: {2}")
  @MethodSource(value = "valueArgs")
  void value(Map<Integer, String> map, Integer key, String expected) {
    final String value = task.value(map, key);
    if (expected == null) {
      assertThat(value, nullValue());
    } else {
      assertThat(value, equalTo(expected));
    }
  }

  static Collection<Arguments> valueArgs() {
    final int bound = 11;
    final int randomI = Math.max(1, new Random().nextInt(bound));
    final Set<Integer> integers = IntStream.range(1, bound).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), 2, null),
        Arguments.of(mapOf(1, "one"), 1, "one"),
        Arguments.of(mapOf(1, "one", 2, "two"), 1, "one"),
        Arguments.of(mapOf(1, "one", 2, "two"), 2, "two"),
        Arguments.of(mapOf(1, "one", 2, "two"), 3, null),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            randomI,
            format("%s%s", randomI, randomI)
        )
    );
  }

  @ParameterizedTest(name = "[{index}] entry: {0}, expected: {1}")
  @MethodSource(value = "keyFromEntryArgs")
  void keyFromEntry(Map.Entry<Integer, String> entry, Integer expected) {
    assertThat(task.keyFromEntry(entry), equalTo(expected));
  }

  static Collection<Arguments> keyFromEntryArgs() {
    final int i = new Random().nextInt(1235);
    return Arrays.asList(
        Arguments.of(new SimpleEntry<>(1, "one"), 1),
        Arguments.of(new SimpleEntry<>(2, "two"), 2),
        Arguments.of(new SimpleEntry<>(3, "three"), 3),
        Arguments.of(new SimpleEntry<>(i, String.valueOf(i)), i)
    );
  }

  @ParameterizedTest(name = "[{index}] entry: {0}, expected: {1}")
  @MethodSource(value = "valueFromEntryArgs")
  void valueFromEntry(Map.Entry<Integer, String> entry, String expected) {
    assertThat(task.valueFromEntry(entry), equalTo(expected));
  }

  static Collection<Arguments> valueFromEntryArgs() {
    final int i = new Random().nextInt(123);
    return Arrays.asList(
        Arguments.of(new SimpleEntry<>(1, "one"), "one"),
        Arguments.of(new SimpleEntry<>(2, "two"), "two"),
        Arguments.of(new SimpleEntry<>(3, "three"), "three"),
        Arguments.of(new SimpleEntry<>(i, String.valueOf(i)), String.valueOf(i))
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, expected: {1}")
  @MethodSource(value = "switchKeyValueArgs")
  void switchKeyValue(Map<Integer, String> map, Map<String, Integer> expected) {
    assertThat(task.switchKeyValue(map), equalTo(expected));
  }

  static Collection<Arguments> switchKeyValueArgs() {
    final Set<Integer> integers = IntStream.range(1, 12).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), mapOf("one", 1)),
        Arguments.of(mapOf(1, "one", 2, "two"), mapOf("one", 1, "two", 2)),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            integers.stream().collect(Collectors.toMap(i -> format("%s%s", i, i), i -> i))
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, keys: {1}, expected: {2}")
  @MethodSource(value = "valuesByKeysArgs")
  void valuesByKeys(Map<Integer, String> map, Set<Integer> keys, List<String> expected) {
    assertThat(task.valuesByKeys(map, keys), equalTo(expected));
  }

  static Collection<Arguments> valuesByKeysArgs() {
    final Set<Integer> integers = IntStream.range(1, 12).boxed().collect(Collectors.toSet());
    final Set<Integer> keys = IntStream.range(1, new Random().nextInt(7) + 2).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), setOf(1, 2), Arrays.asList("one", null)),
        Arguments.of(mapOf(1, "one"), setOf(1), Collections.singletonList("one")),
        Arguments.of(mapOf(1, "one"), setOf(2), Collections.singletonList(null)),
        Arguments.of(mapOf(1, "one", 2, "two"), setOf(1, 2), Arrays.asList("one", "two")),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            keys,
            keys.stream().map(i -> format("%s%s", i, i)).collect(Collectors.toList())
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, key: {1}, expected: {2}")
  @MethodSource(value = "removeArgs")
  void remove(Map<Integer, String> map, Integer key, Map<Integer, String> expected) {
    task.remove(map, key);
    assertThat(map, equalTo(expected));
  }

  static Collection<Arguments> removeArgs() {
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), 1, mapOf()),
        Arguments.of(mapOf(1, "one"), 2, mapOf(1, "one")),
        Arguments.of(mapOf(1, "one", 2, "two"), 1, mapOf(2, "two"))
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, key: {1}, expected: {2}")
  @MethodSource(value = "containsKeyArgs")
  void containsKey(Map<Integer, String> map, Integer key, boolean expected) {
    assertThat(task.containsKey(map, key), equalTo(expected));
  }

  static Collection<Arguments> containsKeyArgs() {
    final Set<Integer> integers = IntStream.range(1, 12).boxed().collect(Collectors.toSet());
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), 2, false),
        Arguments.of(mapOf(1, "one"), 1, true),
        Arguments.of(mapOf(1, "one", 2, "two"), 1, true),
        Arguments.of(mapOf(1, "one", 2, "two"), 2, true),
        Arguments.of(mapOf(1, "one", 2, "two"), 3, false),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            new Random().nextInt(7) + 2,
            true
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, value: {1}, expected: {2}")
  @MethodSource(value = "containsValueArgs")
  void containsValue(Map<Integer, String> map, String value, boolean expected) {
    assertThat(task.containsValue(map, value), equalTo(expected));
  }

  static Collection<Arguments> containsValueArgs() {
    final Set<Integer> integers = IntStream.range(1, 11).boxed().collect(Collectors.toSet());
    final int randomKey = new Random().nextInt(7) + 2;
    return Arrays.asList(
        Arguments.of(mapOf(1, "one"), "two", false),
        Arguments.of(mapOf(1, "one"), "one", true),
        Arguments.of(mapOf(1, "one", 2, "two"), "one", true),
        Arguments.of(mapOf(1, "one", 2, "two"), "two", true),
        Arguments.of(mapOf(1, "one", 2, "two"), "three", false),
        Arguments.of(
            integers.stream().collect(Collectors.toMap(i -> i, i -> format("%s%s", i, i))),
            format("%s%s", randomKey, randomKey),
            true
        )
    );
  }

  @ParameterizedTest(name = "[{index}] map: {0}, expected: {1}")
  @MethodSource(value = "isEmptyArgs")
  void isEmpty(Map<Integer, String> map, boolean expected) {
    assertThat(task.isEmpty(map), equalTo(expected));
  }

  static Collection<Arguments> isEmptyArgs() {
    return Arrays.asList(
        Arguments.of(mapOf(), true),
        Arguments.of(mapOf(1, "one"), false),
        Arguments.of(mapOf(1, "one", 2, "two"), false)
    );
  }
}