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
    Set<Integer> set = new HashSet<>();
    return set;
  }

  /**
   * Создать пустой HashSet, в котором можно хранить String значения.
   */
  Set<String> emptyStringHashSet() {
    Set<String> sett = new HashSet<>();
    return sett;
  }

  /**
   * Определить размер множества.
   */
  int size(Set<Integer> values) {
    Set<Integer> hashSet = new HashSet<>(values);
   return hashSet.size();
  }

  /**
   * Создайть HashSet и заполнить его значениями из массива values.
   */
  Set<Integer> intSetFromArray(int... values) {
    Set<Integer> setH = new HashSet<>();
    for(int i=0; i<values.length;i++){
      setH.add(values[i]);
    }return setH;
  }

  /**
   * Преобразовать список values в HashSet.
   */
  Set<Integer> intSetFromArrayList(List<Integer> values) {
    Set<Integer> set2 = new HashSet<>();
    set2.addAll(values);
    return set2;
  }

  /**
   * Преобразовать множество values в ArrayList.
   */
  List<Integer> intSetToArrayList(Set<Integer> values) {
    List<Integer> arrList = new ArrayList<>();
    arrList.addAll(values);
    return arrList;
  }

  /**
   * Удалить из множества values значение value.
   */
  void removeValue(Set<Integer> values, int value) {
    Set<Integer> set  = new HashSet<>();
    values.remove(value);
  }

  /**
   * Проверить есть ли во множестве values значение value.
   */
  boolean hasElement(Set<Integer> values, int value) {
    if(values.contains(value)){
      return true;
    }else  return false;

  }

  /**
   * Объединить три множества set1, set2, set3 в одно множество.
   */
  Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
    Set<Integer> set = new HashSet<>();
    set.addAll(set1);
    set.addAll(set2);
    set.addAll(set3);
    return set;
  }

  /**
   * Определить пустое ли множество.
   */
  boolean isEmpty(Set<Integer> values) {
   if(values.size()==0){
     return true;
   }
   else  return false;
  }

  /**
   * Проверить равны ли два множества между собой.
   */
  boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
    boolean set = set1.equals(set2);
    return set;
  }
}
