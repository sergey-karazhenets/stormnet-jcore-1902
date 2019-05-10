package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class SetTask {

  /**
   * Создать пустой HashSet, в котором можно хранить int значения.
   */
  Set<Integer> emptyIntHashSet() {
    Set<Integer> empty = new HashSet<>();
    return empty;
  }

  /**
   * Создать пустой HashSet, в котором можно хранить String значения.
   */
  Set<String> emptyStringHashSet() {
    Set<String> emptyS = new HashSet<>();
    return emptyS;
  }

  /**
   * Определить размер множества.
   */
  int size(Set<Integer> values) {
    return values.size();
  }

  /**
   * Создайть HashSet и заполнить его значениями из массива values.
   */
  Set<Integer> intSetFromArray(int... values) {
    Set<Integer> setFromArray = new HashSet<>();
    for (Integer value: values) {
      setFromArray.add(value);
    }
    return setFromArray;
  }

  /**
   * Преобразовать список values в HashSet.
   */
  Set<Integer> intSetFromArrayList(List<Integer> values) {
       Set<Integer> mySet = values.stream().collect(Collectors.toSet());
       return mySet;
  }

  /**
   * Преобразовать множество values в ArrayList.
   */
  List<Integer> intSetToArrayList(Set<Integer> values) {
    List<Integer> myList = values.stream().collect(Collectors.toList());
    return myList;
  }

  /**
   * Удалить из множества values значение value.
   */
  void removeValue(Set<Integer> values, int value) {
    values.remove(value);
  }

  /**
   * Проверить есть ли во множестве values значение value.
   */
  boolean hasElement(Set<Integer> values, int value) {
    if (values.contains(value)) {
      return true;
    } else return false;
  }

  /**
   * Объединить три множества set1, set2, set3 в одно множество.
   */
  Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
    Set<Integer> myMergeSet = Stream.of(set1, set2, set3).flatMap(Collection::stream).collect(Collectors.toSet());
    return myMergeSet;
  }

  /**
   * Определить пустое ли множество.
   */
  boolean isEmpty(Set<Integer> values) {
    if (values.isEmpty()) {
      return true;
    } else return false;
  }

  /**
   * Проверить равны ли два множества между собой.
   */
  boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
    if (set1.equals(set2)) {
      return true;
    } else return false;
  }
}
