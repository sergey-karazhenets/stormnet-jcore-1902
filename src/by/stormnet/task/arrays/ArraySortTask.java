package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    boolean sort = false;
    int bub=0;
    while(!sort){
      sort = true;
      for(int i = 0; i < values.length - 1; i++){
        if (values[i] > values [i+1]){
          sort = false;
          bub = values[i];
          values[i] = values[i+1];
          values[i+1] = bub;
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
    boolean sort = false;
    int bub=0;
    while(!sort){
      sort = true;
      for(int i = 0; i < values.length - 1; i++){
        if (values[i] < values [i+1]){
          sort = false;
          bub = values[i];
          values[i] = values[i+1];
          values[i+1] = bub;
        }
      }
    }
    return values;
  }
}
