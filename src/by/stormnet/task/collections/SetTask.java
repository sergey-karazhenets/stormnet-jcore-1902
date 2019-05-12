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
    Set<Integer> sets=new HashSet<>();
    return sets;
  }

  /**
   * Создать пустой HashSet, в котором можно хранить String значения.
   */
  Set<String> emptyStringHashSet() {
    Set<String> sets=new HashSet<>();
    return sets;
  }

  /**
   * Определить размер множества.
   */
  int size(Set<Integer> values) {
    int size=values.size();
    return size;
  }

  /**
   * Создайть HashSet и заполнить его значениями из массива values.
   */
  Set<Integer> intSetFromArray(int... values) {
    Set<Integer> sets=new HashSet<>();
    for(int i:values){
      sets.add(i);
    }
    return sets;
  }

  /**
   * Преобразовать список values в HashSet.
   */
  Set<Integer> intSetFromArrayList(List<Integer> values) {
    Set<Integer> sets=new HashSet<>();
    sets.addAll(values);
    return sets;
  }

  /**
   * Преобразовать множество values в ArrayList.
   */
  List<Integer> intSetToArrayList(Set<Integer> values) {
    List<Integer> sets=new ArrayList<>();
    sets.addAll(values);
    return sets;
  }

  /**
   * Удалить из множества values значение value.
   */
  void removeValue(Set<Integer> values, int value) {
    values.remove(value);
  }

  /**
   * Проверить есть ли во множестве values значение value.
   */
  boolean hasElement(Set<Integer> values, int value) {
    boolean bool=values.contains(value);
    return bool;
  }

  /**
   * Объединить три множества set1, set2, set3 в одно множество.
   */
  Set<Integer> mergeSets(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
    Set<Integer> sets = new HashSet<>();
    sets.addAll(set1);
    sets.addAll(set2);
    sets.addAll(set3);
    return sets;
  }

  /**
   * Определить пустое ли множество.
   */
  boolean isEmpty(Set<Integer> values) {
    boolean bool;
    if(values.size()==0){
      bool=true;
    }else{
      bool=false;
    }
    return bool;
  }

  /**
   * Проверить равны ли два множества между собой.
   */
  boolean isEquals(Set<Integer> set1, Set<Integer> set2) {
    boolean bool=set1.equals(set2);
    return bool;
  }
}
