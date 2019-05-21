package by.stormnet.task.collections;

import static by.stormnet.TestFunctions.setOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class SetTaskTest {

  private final SetTask task = new SetTask();

  @Test
  void emptyIntHashSet() {
    assertThat(task.emptyIntHashSet(), allOf(
        notNullValue(),
        instanceOf(HashSet.class),
        emptyCollectionOf(Integer.class)));
  }

  @Test
  void emptyStringHashSet() {
    assertThat(task.emptyStringHashSet(), allOf(
        notNullValue(),
        instanceOf(HashSet.class),
        emptyCollectionOf(String.class)));
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expectedSize: {1}")
  @MethodSource(value = "sizeArgs")
  void size(Set<Integer> values, int expected) {
    assertThat(task.size(values), equalTo(expected));
  }

  static Collection<Arguments> sizeArgs() {
    return Arrays.asList(
        Arguments.of(setOf(), 0),
        Arguments.of(setOf(1), 1),
        Arguments.of(setOf(1, 2, 3, 4, 5, 6), 6),
        Arguments.of(IntStream.range(1, 51).boxed().collect(Collectors.toSet()), 50)
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "intSetFromArrayArgs")
  void intSetFromArray(int[] values, Set<Integer> expected) {
    if (values.length == 0) {
      assertThat(task.intSetFromArray(values), empty());
    } else {
      assertThat(task.intSetFromArray(values), equalTo(expected));
    }
  }

  static Collection<Arguments> intSetFromArrayArgs() {
    return Arrays.asList(
        Arguments.of(new int[0], setOf()),
        Arguments.of(new int[] { 1 }, setOf(1)),
        Arguments.of(new int[] { 1, 2, 3, 4, 5, 6 }, setOf(1, 2, 3, 4, 5, 6)),
        Arguments.of(new int[] { 1, 1, 2, 3, 4, 4, 5, 6, 6 }, setOf(1, 2, 3, 4, 5, 6))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "intSetFromArrayListArgs")
  void intSetFromArrayList(List<Integer> values, Set<Integer> expected) {
    if (values.isEmpty()) {
      assertThat(task.intSetFromArrayList(values), empty());
    } else {
      assertThat(task.intSetFromArrayList(values), equalTo(expected));
    }
  }

  static Collection<Arguments> intSetFromArrayListArgs() {
    return Arrays.asList(
        Arguments.of(Collections.emptyList(), setOf()),
        Arguments.of(Collections.singletonList(1), setOf(1)),
        Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), setOf(1, 2, 3, 4, 5, 6)),
        Arguments.of(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 6), setOf(1, 2, 3, 4, 5, 6))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "intSetToArrayListArgs")
  void intSetToArrayList(Set<Integer> values, List<Integer> expected) {
    final List<Integer> list = task.intSetToArrayList(values);
    assertThat(list, allOf(notNullValue(), instanceOf(ArrayList.class)));
    if (values.isEmpty()) {
      assertThat(list, empty());
    } else {
      assertThat(list, equalTo(expected));
    }
  }

  static Collection<Arguments> intSetToArrayListArgs() {
    return Arrays.asList(
        Arguments.of(setOf(), Collections.emptyList()),
        Arguments.of(setOf(1), Collections.singletonList(1)),
        Arguments.of(setOf(1, 2, 3, 4, 5, 6), Arrays.asList(1, 2, 3, 4, 5, 6))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, value: {1}, expected: {2}")
  @MethodSource(value = "removeValueArgs")
  void removeValue(Set<Integer> values, int value, Set<Integer> expected) {
    task.removeValue(values, value);
    assertThat(values, equalTo(expected));
  }

  static Collection<Arguments> removeValueArgs() {
    return Arrays.asList(
        Arguments.of(setOf(1), 1, setOf()),
        Arguments.of(setOf(1, 2, 3), 1, setOf(2, 3)),
        Arguments.of(setOf(1, 2, 3), 2, setOf(1, 3)),
        Arguments.of(setOf(1, 2, 3), 3, setOf(1, 2))
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, value: {1}, expected: {2}")
  @MethodSource(value = "hasElementArgs")
  void hasElement(Set<Integer> values, int value, boolean expected) {
    assertThat(task.hasElement(values, value), equalTo(expected));
  }

  static Collection<Arguments> hasElementArgs() {
    return Arrays.asList(
        Arguments.of(setOf(), 0, false),
        Arguments.of(setOf(1), 0, false),
        Arguments.of(setOf(1), 1, true),
        Arguments.of(setOf(1, 2, 3), 2, true)
    );
  }

  @ParameterizedTest(name = "[{index}] set1: {0}, set2: {1}, set3: {2}, expected: {3}")
  @MethodSource(value = "mergeSetsArgs")
  void mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3, Set<Integer> expected) {
    assertThat(task.mergeSets(set1, set2, set3), equalTo(expected));
  }

  static Collection<Arguments> mergeSetsArgs() {
    return Arrays.asList(
        Arguments.of(
            Collections.emptySet(), Collections.emptySet(), Collections.emptySet(),
            Collections.emptySet()
        ),
        Arguments.of(
            Collections.emptySet(), setOf(3, 4), setOf(5, 6, 6),
            setOf(3, 4, 5, 6)
        ),
        Arguments.of(
            setOf(1, 2), setOf(3, 4), setOf(5, 6, 7),
            setOf(1, 2, 3, 4, 5, 6, 7)
        )
    );
  }

  @ParameterizedTest(name = "[{index}] values: {0}, expected: {1}")
  @MethodSource(value = "isEmptyArgs")
  void isEmpty(Set<Integer> values, boolean expected) {
    assertThat(task.isEmpty(values), equalTo(expected));
  }

  static Collection<Arguments> isEmptyArgs() {
    return Arrays.asList(
        Arguments.of(Collections.emptySet(), true),
        Arguments.of(setOf(1), false),
        Arguments.of(setOf(1, null), false),
        Arguments.of(setOf(1, 2), false)
    );
  }

  @ParameterizedTest(name = "[{index}] set1: {0}, set2: {1}, expected: {2}")
  @MethodSource(value = "isEqualsArgs")
  void isEquals(Set<Integer> set1, Set<Integer> set2, boolean expected) {
    assertThat(task.isEquals(set1, set2), equalTo(expected));
  }

  static Collection<Arguments> isEqualsArgs() {
    return Arrays.asList(
        Arguments.of(setOf(), setOf(), true),
        Arguments.of(setOf(0), setOf(1), false),
        Arguments.of(setOf(1), setOf(1), true),
        Arguments.of(setOf(1, 2, 2, 3), setOf(1, 2, 3, 3), true)
    );
  }
}