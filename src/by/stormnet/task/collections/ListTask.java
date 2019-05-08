package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;
import java.util.List;

class ListTask {

  /**
   * Создать пустой ArrayList, в котором можно хранить int значения.
   */
  List<Integer> emptyIntArrayList() {
    throw new TaskNotImplementedException();
  }

  /**
   * Создать пустой ArrayList, в котором можно хранить String значения.
   */
  List<String> emptyStringArrayList() {
    throw new TaskNotImplementedException();
  }

  /**
   * Определить размер списка.
   */
  int listSize(List<Integer> values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Создайть ArrayList и заполнить его значениями из массива values.
   */
  List<Integer> intList(int... values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить элемент c индексом index из списка строк.
   */
  String elementAtIndex(List<String> strings, int index) {
    throw new TaskNotImplementedException();
  }

  /**
   * Добавить значение value в позицию index в списке values.
   */
  void addAtIndex(List<Long> values, int index, long value) {
    throw new TaskNotImplementedException();
  }

  /**
   * Заменить в списке values значение в позиции index новым значением value.
   */
  void updateAtIndex(List<Long> values, int index, long value) {
    throw new TaskNotImplementedException();
  }

  /**
   * Удалить из списка values значение в позиции index.
   */
  void removeAtIndex(List<Long> values, int index) {
    throw new TaskNotImplementedException();
  }

  /**
   * Удалить из списка values значение value.
   */
  void removeValue(List<Long> values, long value) {
    throw new TaskNotImplementedException();
  }

  /**
   * Проверить есть ли в списке строк strings строка str.
   */
  boolean hasElement(List<String> strings, String str) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить индекс элемента str в списке строк strings.
   */
  int indexOf(List<String> strings, String str) {
    throw new TaskNotImplementedException();
  }

  /**
   * Удалить из списка все отрицательные значения и все элементы равные null.
   */
  void removeAllNullOrNegativeValues(List<Integer> values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Объединить три списка values1, values2 и values3 в один список.
   */
  List<Integer> mergeLists(List<Integer> values1, List<Integer> values2, List<Integer> values3) {
    throw new TaskNotImplementedException();
  }

  /**
   * Определить пустой ли список.
   */
  boolean isEmpty(List<String> strings) {
    throw new TaskNotImplementedException();
  }
}
