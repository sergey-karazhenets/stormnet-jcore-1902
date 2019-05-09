package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ListTask {

  /**
   * Создать пустой ArrayList, в котором можно хранить int значения.
   */
  List<Integer> emptyIntArrayList() {
    List<Integer> emptyIntArrayList = new ArrayList<>();
    return emptyIntArrayList;
  }

  /**
   * Создать пустой ArrayList, в котором можно хранить String значения.
   */
  List<String> emptyStringArrayList() {
    List<String> emptyStringArrayList = new ArrayList<>();
    return emptyStringArrayList;
  }

  /**
   * Определить размер списка.
   */
  int listSize(List<Integer> values) {
    return values.size();
  }

  /**
   * Создайть ArrayList и заполнить его значениями из массива values.
   */
  List<Integer> intList(int... values) {
    List<Integer> il = new ArrayList<>();
    for (Integer value:values) {
      il.add(value);
    }
    return il;
  }

  /**
   * Получить элемент c индексом index из списка строк.
   */
  String elementAtIndex(List<String> strings, int index) {
    return strings.get(index);
  }

  /**
   * Добавить значение value в позицию index в списке values.
   */
  void addAtIndex(List<Long> values, int index, long value) {
    values.add(index, value);
    return;
  }

  /**
   * Заменить в списке values значение в позиции index новым значением value.
   */
  void updateAtIndex(List<Long> values, int index, long value) {
    values.set(index, value);
    return;
  }

  /**
   * Удалить из списка values значение в позиции index.
   */
  void removeAtIndex(List<Long> values, int index) {
    values.remove(index);
  }

  /**
   * Удалить из списка values значение value.
   */
  void removeValue(List<Long> values, long value) {
    values.remove(value);
  }

  /**
   * Проверить есть ли в списке строк strings строка str.
   */
  boolean hasElement(List<String> strings, String str) {
    if (strings.contains(str)) {
      return true;
    } else return false;
  }

  /**
   * Получить индекс элемента str в списке строк strings.
   */
  int indexOf(List<String> strings, String str) {
    return strings.indexOf(str);
  }

  /**
   * Удалить из списка все отрицательные значения и все элементы равные null.
   */
  void removeAllNullOrNegativeValues(List<Integer> values) {
      Iterator<Integer> itr = values.iterator();
      while (itr.hasNext()) {
        if (itr.next() == null) {
          itr.remove();
        }
      }
    values.removeIf(i-> (i < 0 ));
  }

  /**
   * Объединить три списка values1, values2 и values3 в один список.
   */
  List<Integer> mergeLists(List<Integer> values1, List<Integer> values2, List<Integer> values3) {
    List<Integer> newList = Stream.of(values1, values2, values3).flatMap(Collection::stream).collect(Collectors.toList());
    return newList;
  }

  /**
   * Определить пустой ли список.
   */
  boolean isEmpty(List<String> strings) {
    if (strings.isEmpty()) {
      return true;
    } else return false;
  }
}
