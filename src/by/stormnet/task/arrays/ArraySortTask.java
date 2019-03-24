package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    int a;
    boolean isSorted = false;
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < values.length-1; i++) {
        if (values[i] > values[i+1]) {
          isSorted = false;
          a = values[i];
          values[i] = values[i+1];
          values[i+1] = a;
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
    int a;
    boolean isSorted = false;
    while (!isSorted) {
      isSorted = true;
      for (int i = 0; i < values.length-1; i++) {
        if (values[i] < values[i+1]) {
          isSorted = false;
          a = values[i];
          values[i] = values[i+1];
          values[i+1] = a;
        }
      }
    }
    return values;
  }
}
