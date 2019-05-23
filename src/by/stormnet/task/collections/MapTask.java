package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.*;

class MapTask {

    /**
     * Создать пустую HashMap.
     */
    Map<Integer, String> emptyHashMap() {
        Map<Integer, String> map = new HashMap<>();
        return map;
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
        Map<Integer, String> map = new HashMap<>();
        map.put(key, value);
        return map;
    }

    /**
     * Создать HashMap, где для каждого ключа из списка keys
     * будет ассоциировано значение с таким же индексом из списка values.
     * Пример:
     * keys: [1, 2, 3]
     * values: ["v1", "v2", "v3"]
     * Ожидаемый результат: {1=v1, 2=v2, 3=v3}.
     */
    Map<Integer, String> mapFromMultiValues(List<Integer> keys, List<String> values) {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }
        return map;
    }

    /**
     * Получить множество ключей из map.
     */
    Set<Integer> keys(Map<Integer, String> map) {
        Set<Integer> set = map.keySet();
        return set;
    }

    /**
     * Получить список значений из map.
     */
    List<String> values(Map<Integer, String> map) {
        Collection<String> coll = map.values();
        List<String> list = new ArrayList<>();
        list.addAll(coll);
        return list;
    }

    /**
     * Получить множество всех записей из map.
     */
    Set<Map.Entry<Integer, String>> entries(Map<Integer, String> map) {
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        return entries;
    }

    /**
     * Получить из map значение, которое соответсвует ключу key.
     */
    String value(Map<Integer, String> map, Integer key) {
        return map.get(key);
    }

    /**
     * Получить ключ из записи.
     */
    Integer keyFromEntry(Map.Entry<Integer, String> entry) {
        return entry.getKey();
    }

    /**
     * Получить значение из записи.
     */
    String valueFromEntry(Map.Entry<Integer, String> entry) {
        return entry.getValue();
    }

    /**
     * Поменять местами ключи и значения в map.
     * Значение должно стать ключом, а ключ -- значением.
     */
    Map<String, Integer> switchKeyValue(Map<Integer, String> map) {
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        return newMap;
    }

    /**
     * Получить список значений из map для всех ключей из множества keys.
     */
    List<String> valuesByKeys(Map<Integer, String> map, Set<Integer> keys) {
        List<String> list = new ArrayList<>();
        for (Integer key : keys){
            list.add(map.get(key));
        }
        return list;
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