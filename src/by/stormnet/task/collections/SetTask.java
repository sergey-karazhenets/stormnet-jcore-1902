package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;
import java.util.List;
import java.util.Set;

class SetTask {

  /**
   * Создать пустой HashSet, в котором можно хранить int значения.
   */
  Set<Integer> emptyIntHashSet() {
    throw new TaskNotImplementedException();
  }

  /**
   * Создать пустой HashSet, в котором можно хранить String значения.
   */
  Set<String> emptyStringHashSet() {
    throw new TaskNotImplementedException();
  }

  /**
   * Определить размер множества.
   */
  int size(Set<Integer> values) {
    throw new TaskNotImplementedException();
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
    throw new TaskNotImplementedException();
  }

  /**
   * Удалить из множества values значение value.
   */
  void removeValue(Set<Integer> values, int value) {
    throw new TaskNotImplementedException();
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
