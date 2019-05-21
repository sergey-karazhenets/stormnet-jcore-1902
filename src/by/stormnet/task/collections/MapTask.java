package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MapTask {

  /**
   * Создать пустую HashMap.
   */
  Map<Integer, String> emptyHashMap() {
    throw new TaskNotImplementedException();
  }

  /**
   * Определить размер коллекции.
   */
  int size(Map<Integer, String> values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Создать HashMap с одной записью, где с ключом key будет ассоциировано value.
   */
  Map<Integer, String> mapFromSingleValue(int key, String value) {
    throw new TaskNotImplementedException();
  }

  /**
   * Создать HashMap, где для каждого ключа из списка keys
   * будет ассоциировано значение с таким же индексом из списка values.
   * Пример:
   *  keys: [1, 2, 3]
   *  values: ["v1", "v2", "v3"]
   * Ожидаемый результат: {1=v1, 2=v2, 3=v3}.
   */
  Map<Integer, String> mapFromMultiValues(List<Integer> keys, List<String> values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить множество ключей из map.
   */
  Set<Integer> keys(Map<Integer, String> map) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить список значений из map.
   */
  List<String> values(Map<Integer, String> map) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить множество всех записей из map.
   */
  Set<Map.Entry<Integer, String>> entries(Map<Integer, String> map) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить из map значение, которое соответсвует ключу key.
   */
  String value(Map<Integer, String> map, Integer key) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить ключ из записи.
   */
  Integer keyFromEntry(Map.Entry<Integer, String> entry) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить значение из записи.
   */
  String valueFromEntry(Map.Entry<Integer, String> entry) {
    throw new TaskNotImplementedException();
  }

  /**
   * Поменять местами ключи и значения в map.
   * Значение должно стать ключом, а ключ -- значением.
   */
  Map<String, Integer> switchKeyValue(Map<Integer, String> map) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить список значений из map для всех ключей из множества keys.
   */
  List<String> valuesByKeys(Map<Integer, String> map, Set<Integer> keys) {
    throw new TaskNotImplementedException();
  }

  /**
   * Удалить из map запись с ключом key.
   */
  void remove(Map<Integer, String> map, Integer key) {
    throw new TaskNotImplementedException();
  }

  /**
   * Проверить есть ли в map запись с ключом key.
   */
  boolean containsKey(Map<Integer, String> map, Integer key) {
    throw new TaskNotImplementedException();
  }

  /**
   * Проверить есть ли в map запись со значением value.
   */
  boolean containsValue(Map<Integer, String> map, String value) {
    throw new TaskNotImplementedException();
  }

  /**
   * Определить есть ли записи в map.
   */
  boolean isEmpty(Map<Integer, String> map) {
    throw new TaskNotImplementedException();
  }
}