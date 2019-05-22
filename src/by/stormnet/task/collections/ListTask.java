package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.ArrayList;
import java.util.List;

class ListTask {

    /**
     * Создать пустой ArrayList, в котором можно хранить int значения.
     */
    List<Integer> emptyIntArrayList() {
        List<Integer> integer = new ArrayList<>();
        return integer;
    }

    /**
     * Создать пустой ArrayList, в котором можно хранить String значения.
     */
    List<String> emptyStringArrayList() {
        List<String> strings = new ArrayList<>();
        return strings;
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
        List<Integer> value = new ArrayList<>();
        value.add(25);
        value.add(96);
        value.add(87);
        return value;
    }

    /**
     * Получить элемент c индексом index из списка строк.
     */
    String elementAtIndex(List<String> strings, int index) {
        String n = strings.get(index);
        return n;
    }

    /**
     * Добавить значение value в позицию index в списке values.
     */
    void addAtIndex(List<Long> values, int index, long value) {
        values.add(index, value);
    }

    /**
     * Заменить в списке values значение в позиции index новым значением value.
     */
    void updateAtIndex(List<Long> values, int index, long value) {
        values.remove(index);
        values.add(index, value);
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
        throw new TaskNotImplementedException();
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
        if (strings.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
