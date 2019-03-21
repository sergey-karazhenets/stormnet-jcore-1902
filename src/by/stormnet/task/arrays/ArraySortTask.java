package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    for(int i=0;i<values.length;i++){
      for(int j=values.length-1;j>0;j--){
        if(values[j]<values[j-1]){
          int buf=values[j];
          values[j]=values[j-1];
          values[j-1]=buf;
        }
      }
    }
    return values;
  }

  /**
   * Отсортировать числа в массиве в порядке их убывания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortDesc(int[] values) {
    for(int i=0;i<values.length;i++){
      for(int j=values.length-1;j>0;j--){
        if(values[j]>values[j-1]){
          int buf=values[j];
          values[j]=values[j-1];
          values[j-1]=buf;
        }
      }
    }
    return values;
  }
}
