package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.*;

class SetTask {

  /**
   * Создать пустой HashSet, в котором можно хранить int значения.
   */
  Set<Integer> emptyIntHashSet() {
    Set<Integer> set = new HashSet<>();
    return set;
  }

  /**
   * Создать пустой HashSet, в котором можно хранить String значения.
   */
  Set<String> emptyStringHashSet() {
    Set<String> set = new HashSet<>();
    return set;
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
    Set<Integer> set = new HashSet<>();
    for (int i : values){
    set.add(i);
    }
    return set;
  }

  /**
   * Преобразовать список values в HashSet.
   */
  Set<Integer> intSetFromArrayList(List<Integer> values) {
    Set<Integer> set = new HashSet<>();
    set.addAll(values);
    return set;
  }

  /**
   * Преобразовать множество values в ArrayList.
   */
  List<Integer> intSetToArrayList(Set<Integer> values) {
    List<Integer> list = new ArrayList<>();
    list.addAll(values);
    return list;

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

    return values.contains(value);
  }

  /**
   * Объединить три множества set1, set2, set3 в одно множество.
   */
  Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
    Set<Integer> set = new HashSet<>();
    set.addAll(set1);
    set.addAll(set2);
    set.addAll(set3);
    return set;
  }

  /**
   * Определить пустое ли множество.
   */
  boolean isEmpty(Set<Integer> values) {
    return values.isEmpty();
  }

  /**
   * Проверить равны ли два множества между собой.
   */
  boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
    return set1.containsAll(set2);
  }
}
