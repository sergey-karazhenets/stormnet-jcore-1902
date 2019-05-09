package by.stormnet.task.collections;

import by.stormnet.task.TaskNotImplementedException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ListTask {

  /**
   * Создать пустой ArrayList, в котором можно хранить int значения.
   */
  List<Integer> emptyIntArrayList() {
List<Integer> list = new ArrayList<>();
return list;
  }

  /**
   * Создать пустой ArrayList, в котором можно хранить String значения.
   */
  List<String> emptyStringArrayList() {

    List<String> list1 = new ArrayList<>();
    return list1;
  }

  /**
   * Определить размер списка.
   */
  int listSize(List<Integer> values) {

    int a =values.size();
    return a;
  }

  /**
   * Создайть ArrayList и заполнить его значениями из массива values.
   */
  List<Integer> intList(int... values) {
    List<Integer> list = new ArrayList<>();
    for(int a: values){
      list.add(a);
    }
    return list;
  }

  /**
   * Получить элемент c индексом index из списка строк.
   */
  String elementAtIndex(List<String> strings, int index) {
   String a =strings.get(index);
   return a;
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

    values.set(index,value);
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
  boolean hasElement(List<String> strings, String str){
    boolean a =strings.contains(str);
    return a;
  }

  /**
   * Получить индекс элемента str в списке строк strings.
   */
  int indexOf(List<String> strings, String str) {

    int j =strings.indexOf(str);
    return j;
  }

  /**
   * Удалить из списка все отрицательные значения и все элементы равные null.
   */
  void removeAllNullOrNegativeValues(List<Integer> values) {
    Iterator<Integer> it = values.iterator();
    while (it.hasNext()){

      if (it.next()==null){
        it.remove();
      }}
    Iterator<Integer> it1 = values.iterator();
    while(it1.hasNext()){
      int next = it1.next();
      if(next<0){
        it1.remove();
      }


    }
    }


  /**
   * Объединить три списка values1, values2 и values3 в один список.
   */
  List<Integer> mergeLists(List<Integer> values1, List<Integer> values2, List<Integer> values3) {
   List<Integer> list = new ArrayList<>();
   list.addAll(values1);
   list.addAll(values2);
   list.addAll(values3);
   return list;
  }

  /**
   * Определить пустой ли список.
   */
  boolean isEmpty(List<String> strings) {
    boolean n =strings.isEmpty();
    return n;
  }
}
