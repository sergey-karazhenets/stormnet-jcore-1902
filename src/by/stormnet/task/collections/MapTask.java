package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

class MapTask {

  /**
   * Создать пустую HashMap.
   */
  Map<Integer, String> emptyHashMap() {
    Map<Integer,String> omnomnom = new HashMap<>();
    return omnomnom;
  }

  /**
   * Определить размер коллекции.
   */
  int size(Map<Integer, String> values) {
    return values.size();
  }
  /**
   * Создать HashMap с одной записью, где с ключом key будет ассоциировано value.
   */
  Map<Integer, String> mapFromSingleValue(int key, String value) {
    Map<Integer,String> yo = new HashMap<>();
    yo.put(key,value);
    return yo;
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
    Map<Integer, String> mapFromMultiValues = new HashMap<>();

    for (int key : keys) {
      String value = values.get(keys.indexOf(key));
      mapFromMultiValues.put(key, value);
    }
    return mapFromMultiValues;
  }

  /**
   * Получить множество ключей из map.
   */
  Set<Integer> keys(Map<Integer, String> map) {
    return map.keySet();
  }

  /**
   * Получить список значений из map.
   */
  List<String> values(Map<Integer, String> map) {
    Collection<String> collection= map.values();
    List<String> list= new ArrayList<>();
    list.addAll(collection);
    return list;
  }

  /**
   * Получить множество всех записей из map.
   */
  Set<Map.Entry<Integer, String>> entries(Map<Integer, String> map) {
    Set<Map.Entry<Integer, String>> entries= map.entrySet();
    return entries;
  }

  /**
   * Получить из map значение, которое соответсвует ключу key.
   */
  String value(Map<Integer, String> map, Integer key) {
    String value = map.get(key);
    return value;
  }

  /**
   * Получить ключ из записи.
   */
  Integer keyFromEntry(Map.Entry<Integer, String> entry) {
    Integer key = entry.getKey();
    return key;
  }

  /**
   * Получить значение из записи.
   */
  String valueFromEntry(Map.Entry<Integer, String> entry) {
    String value= entry.getValue();
    return value;
  }

  /**
   * Поменять местами ключи и значения в map.
   * Значение должно стать ключом, а ключ -- значением.
   */
  Map<String, Integer> switchKeyValue(Map<Integer, String> map) {
    Map<String, Integer> mapInversed = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    return mapInversed;
  }

  /**
   * Получить список значений из map для всех ключей из множества keys.
   */
  List<String> valuesByKeys(Map<Integer, String> map, Set<Integer> keys) {
    List<String> listKeys = new ArrayList<>();
    for (Integer i : keys) {
      listKeys.add(map.get(i));
    }
    return listKeys;
  }

  /**
   * Удалить из map запись с ключом key.
   */
  void remove(Map<Integer, String> map, Integer key) {
    map.remove(key);
  }

  /**
   * Проверить есть ли в map запись с ключом key.
   */
  boolean containsKey(Map<Integer, String> map, Integer key) {
   return map.containsKey(key);
  }

  /**
   * Проверить есть ли в map запись со значением value.
   */
  boolean containsValue(Map<Integer, String> map, String value) {
    return map.containsValue(value);
  }

  /**
   * Определить есть ли записи в map.
   */
  boolean isEmpty(Map<Integer, String> map) {
    return map.isEmpty();
  }
}