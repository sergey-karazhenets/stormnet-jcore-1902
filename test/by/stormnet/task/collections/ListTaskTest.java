package by.stormnet.task.collections;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ListTaskTest {

  private final ListTask task = new ListTask();

  @Test
  void emptyIntArrayList() {
    assertThat(task.emptyIntArrayList(), allOf(
        notNullValue(),
        instanceOf(ArrayList.class),
        emptyCollectionOf(Integer.class)));
  }

  @Test
  void emptyStringArrayList() {
    assertThat(task.emptyStringArrayList(), allOf(
        notNullValue(),
        instanceOf(ArrayList.class),
        emptyCollectionOf(String.class)));
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expectedSize: {1}")
  @MethodSource(value = "listSizeArgs")
  void listSize(List<Integer> values, int expectedSize) {
    assertThat(task.listSize(values), equalTo(expectedSize));
  }

  static Collection<Arguments> listSizeArgs() {
    return Arrays.asList(
        Arguments.of(Collections.emptyList(), 0),
        Arguments.of(Collections.singletonList(1), 1),
        Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), 6),
        Arguments.of(IntStream.range(1, 51).boxed().collect(Collectors.toList()), 50)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}")
  @MethodSource(value = "intListArgs")
  void intList(int[] values) {
    if (values.length == 0) {
      assertThat(task.intList(values), empty());
    } else {
      final Integer[] integers = Arrays.stream(values).boxed().toArray(Integer[]::new);
      assertThat(task.intList(values), contains(integers));
    }
  }

  static Collection<Arguments> intListArgs() {
    return Arrays.asList(
        Arguments.of((Object) new int[0]),
        Arguments.of((Object) new int[] { 1 }),
        Arguments.of((Object) new int[] { 1, 2, 3, 4, 5, 6 })
    );
  }

  @ParameterizedTest(name = "[{index}] strings: {0}, index: {1}, expected: {2}")
  @MethodSource(value = "elementAtIndexArgs")
  void elementAtIndex(List<String> strings, int index, String expected) {
    assertThat(task.elementAtIndex(strings, index), equalTo(expected));
  }

  static Collection<Arguments> elementAtIndexArgs() {
    List<String> words = Arrays.asList("Forever", "trusting", "who", "we", "are", "And", "nothing", "else", "matters");
    return Arrays.asList(
        Arguments.of(words, 0, "Forever"),
        Arguments.of(words, 1, "trusting"),
        Arguments.of(words, 3, "we"),
        Arguments.of(words, 6, "nothing")
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, index: {1}, value: {2}, expected: {3}")
  @MethodSource(value = "addAtIndexArgs")
  void addAtIndex(List<Long> values, int index, long value, List<Long> expected) {
    task.addAtIndex(values, index, value);
    assertThat(values, equalTo(expected));
  }

  static Collection<Arguments> addAtIndexArgs() {
    return Arrays.asList(
        Arguments.of(modifiableList(1L, 2L), 0, 0L, Arrays.asList(0L, 1L, 2L)),
        Arguments.of(modifiableList(1L, 2L), 1, 0L, Arrays.asList(1L, 0L, 2L)),
        Arguments.of(modifiableList(1L, 2L), 2, 0L, Arrays.asList(1L, 2L, 0L))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, index: {1}, value: {2}, expected: {3}")
  @MethodSource(value = "updateAtIndexArgs")
  void updateAtIndex(List<Long> values, int index, long value, List<Long> expected) {
    task.updateAtIndex(values, index, value);
    assertThat(values, equalTo(expected));
  }

  static Collection<Arguments> updateAtIndexArgs() {
    return Arrays.asList(
        Arguments.of(modifiableList(1L, 2L), 0, 0L, Arrays.asList(0L, 2L)),
        Arguments.of(modifiableList(1L, 2L), 1, 0L, Arrays.asList(1L, 0L)),
        Arguments.of(modifiableList(1L, 2L, 3L, 4L), 3, 0L, Arrays.asList(1L, 2L, 3L, 0L))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, index: {1}, expected: {2}")
  @MethodSource(value = "removeAtIndexArgs")
  void removeAtIndex(List<Long> values, int index, List<Long> expected) {
    task.removeAtIndex(values, index);
    assertThat(values, equalTo(expected));
  }

  static Collection<Arguments> removeAtIndexArgs() {
    return Arrays.asList(
        Arguments.of(modifiableList(1L, 2L, 3L), 0, Arrays.asList(2L, 3L)),
        Arguments.of(modifiableList(1L, 2L, 3L), 1, Arrays.asList(1L, 3L)),
        Arguments.of(modifiableList(1L, 2L, 3L, 4L), 2, Arrays.asList(1L, 2L, 4L))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, value: {1}, expected: {2}")
  @MethodSource(value = "removeValueArgs")
  void removeValue(List<Long> values, long value, List<Long> expected) {
    task.removeValue(values, value);
    assertThat(values, equalTo(expected));
  }

  static Collection<Arguments> removeValueArgs() {
    return Arrays.asList(
        Arguments.of(modifiableList(1L, 2L, 3L), 1L, Arrays.asList(2L, 3L)),
        Arguments.of(modifiableList(1L, 2L, 3L), 2L, Arrays.asList(1L, 3L)),
        Arguments.of(modifiableList(1L, 2L, 3L, 4L), 3L, Arrays.asList(1L, 2L, 4L))
    );
  }

  @ParameterizedTest(name = "[{index}] strings: {0}, str: {1}, hasElement: {2}")
  @MethodSource(value = "hasElementArgs")
  void hasElement(List<String> strings, String str, boolean hasElement) {
    assertThat(task.hasElement(strings, str), equalTo(hasElement));
  }

  static Collection<Arguments> hasElementArgs() {
    List<String> words = Arrays.asList("I", "never", "opened", "myself", "this", "way",
        "Life", "is", "ours", "we", "live", "it", "our", "way");
    return Arrays.asList(
        Arguments.of(words, "never", true),
        Arguments.of(words, "this", true),
        Arguments.of(words, "nothing", false),
        Arguments.of(words, "else", false),
        Arguments.of(words, "matters", false)
    );
  }

  @ParameterizedTest(name = "[{index}] strings: {0}, str: {1}, expected: {2}")
  @MethodSource(value = "indexOfArgs")
  void indexOf(List<String> strings, String str, int expected) {
    assertThat(task.indexOf(strings, str), equalTo(expected));
  }

  static Collection<Arguments> indexOfArgs() {
    List<String> words = Arrays.asList("I", "never", "opened", "myself", "this", "way",
        "Life", "is", "ours", "we", "live", "it", "our", "way");
    return Arrays.asList(
        Arguments.of(words, "never", 1),
        Arguments.of(words, "way", 5),
        Arguments.of(words, "nothing", -1),
        Arguments.of(words, "live", 10)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {2}")
  @MethodSource(value = "removeAllNullOrNegativeValuesArgs")
  void removeAllNullOrNegativeValues(List<Integer> values, List<Integer> expected) {
    task.removeAllNullOrNegativeValues(values);
    assertThat(values, equalTo(expected));
  }

  static Collection<Arguments> removeAllNullOrNegativeValuesArgs() {
    return Arrays.asList(
        Arguments.of(modifiableList(), Collections.emptyList()),
        Arguments.of(modifiableList(1, 2, 3), Arrays.asList(1, 2, 3)),
        Arguments.of(modifiableList(1, null, 3), Arrays.asList(1, 3)),
        Arguments.of(modifiableList(1, null, null, 4, null, 6), Arrays.asList(1, 4, 6)),
        Arguments.of(modifiableList(1, -4, 2, 5, -1), Arrays.asList(1, 2, 5)),
        Arguments.of(modifiableList(1, -4, 2, null, 1, null, -2, 5), Arrays.asList(1, 2, 1, 5))
    );
  }

  @ParameterizedTest(name = "[{index}] values1: {0}, values2: {1}, values3: {2}, expected: {3}")
  @MethodSource(value = "mergeListsArgs")
  void mergeLists(List<Integer> values1, List<Integer> values2, List<Integer> values3, List<Integer> expected) {
    assertThat(task.mergeLists(values1, values2, values3), equalTo(expected));
  }

  static Collection<Arguments> mergeListsArgs() {
    return Arrays.asList(
        Arguments.of(
            Collections.emptyList(), Collections.emptyList(), Collections.emptyList(),
            Collections.emptyList()
        ),
        Arguments.of(
            Collections.singletonList(1), Arrays.asList(3, 4), Arrays.asList(5, 6),
            Arrays.asList(1, 3, 4, 5, 6)
        ),
        Arguments.of(
            Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6, 7),
            Arrays.asList(1, 2, 3, 4, 5, 6, 7)
        )
    );
  }

  @ParameterizedTest(name = "[{index}] strings: {0}, expected: {1}")
  @MethodSource(value = "isEmptyArgs")
  void isEmpty(List<String> strings, boolean expected) {
    assertThat(task.isEmpty(strings), equalTo(expected));
  }

  static Collection<Arguments> isEmptyArgs() {
    return Arrays.asList(
        Arguments.of(Collections.emptyList(), true),
        Arguments.of(Collections.singletonList("str"), false),
        Arguments.of(Collections.singletonList(null), false),
        Arguments.of(Arrays.asList("str1", "str2"), false)
    );
  }

  @SafeVarargs
  private static <T> List<T> modifiableList(T... values) {
    return Stream.of(values).collect(Collectors.toList());
  }
}