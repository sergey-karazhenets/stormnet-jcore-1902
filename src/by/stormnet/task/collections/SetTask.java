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
    Set<Integer> in= new HashSet<>();
    return in;
  }

  /**
   * Создать пустой HashSet, в котором можно хранить String значения.
   */
  Set<String> emptyStringHashSet() {
    Set<String> hn= new HashSet<>();
    return hn;
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
    throw new TaskNotImplementedException();
  }

  /**
   * Преобразовать список values в HashSet.
   */
  Set<Integer> intSetFromArrayList(List<Integer> values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Преобразовать множество values в ArrayList.
   */
  List<Integer> intSetToArrayList(Set<Integer> values) {
    List<Integer> nb= new ArrayList<>();
    nb.addAll(values);
    return nb;
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
    throw new TaskNotImplementedException();
  }

  /**
   * Объединить три множества set1, set2, set3 в одно множество.
   */
  Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
    throw new TaskNotImplementedException();
  }

  /**
   * Определить пустое ли множество.
   */
  boolean isEmpty(Set<Integer> values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Проверить равны ли два множества между собой.
   */
  boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
    throw new TaskNotImplementedException();
  }
}
