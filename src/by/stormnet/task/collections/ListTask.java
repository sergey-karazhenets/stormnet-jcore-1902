package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.ArrayList;
import java.util.List;

class ListTask {

  /**
   * Создать пустой ArrayList, в котором можно хранить int значения.
   */
  List<Integer> emptyIntArrayList() {
   ArrayList<Integer> arrayList = new ArrayList();
    return arrayList;
  }

  /**
   * Создать пустой ArrayList, в котором можно хранить String значения.
   */
  List<String> emptyStringArrayList() {
   ArrayList<String> list = new ArrayList();
    return list;
  }

  /**
   * Определить размер списка.
   */
  int listSize(List<Integer> values) { ArrayList<Integer> arr = new ArrayList<>(values);
  return arr.size();
  }

  /**
   * Создайть ArrayList и заполнить его значениями из массива values.
   */
  List<Integer> intList(int... values) {
 ArrayList<Integer> arr1 = new ArrayList<>();
 for (int i=0; i<values.length; i++){
   arr1.add(values[i]);
 }
 return arr1;
  }

  /**
   * Получить элемент c индексом index из списка строк.
   */
  String elementAtIndex(List<String> strings, int index) {
    String element = strings.get(index);
    return element;
  }

  /**
   * Добавить значение value в позицию index в списке values.
   */
  void addAtIndex(List<Long> values, int index, long value) {
    values.add(index,value);
  }

  /**
   * Заменить в списке values значение в позиции index новым значением value.
   */
  void updateAtIndex(List<Long> values, int index, long value) {
    values.remove(index);
    values.add(index,value);
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
    if(strings.contains(str)){
      return true;
    }else
      return false;
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
    for(int i=0; i<values.size();i++){
      if(values.get(i)==null||values.get(i)<0) {
        values.remove(i);
        i--;
      }
    }
  }

  /**
   * Объединить три списка values1, values2 и values3 в один список.
   */
  List<Integer> mergeLists(List<Integer> values1, List<Integer> values2, List<Integer> values3) {
     List<Integer>arrList = new ArrayList<>();
     arrList.addAll(values1);
     arrList.addAll(values2);
     arrList.addAll(values3);
     return arrList;
  }

  /**
   * Определить пустой ли список.
   */
  boolean isEmpty(List<String> strings) {
    if(strings.size()==0){
        return true;
    }
    else return false;
  }
}
