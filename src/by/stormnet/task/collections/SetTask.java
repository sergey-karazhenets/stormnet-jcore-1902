package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    int n =values.size();
    return n;
  }

  /**
   * Создайть HashSet и заполнить его значениями из массива values.
   */
  Set<Integer> intSetFromArray(int... values) {
    Set<Integer> set1 = new HashSet<>();
    for(int a: values){
      set1.add(a);

    }
    return set1;

  }

  /**
   * Преобразовать список values в HashSet.
   */
  Set<Integer> intSetFromArrayList(List<Integer> values) {

    Set<Integer> set = new HashSet<>(values);
    return set;
  }

  /**
   * Преобразовать множество values в ArrayList.
   */
  List<Integer> intSetToArrayList(Set<Integer> values) {

    List<Integer> list = new ArrayList<>(values);
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

    boolean b =values.contains(value);
    return b;
  }

  /**
   * Объединить три множества set1, set2, set3 в одно множество.
   */
  Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
  Set<Integer> n = new HashSet<>();
  n.addAll(set1);
  n.addAll(set2);
  n.addAll(set3);
  return n;
  }

  /**
   * Определить пустое ли множество.
   */
  boolean isEmpty(Set<Integer> values) {

    boolean b = values.isEmpty();
    return b;
  }

  /**
   * Проверить равны ли два множества между собой.
   */
  boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
    boolean n = set1.equals(set2);
    return n;
  }
}
