package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    for (int i = 1; i < values.length; i++) {
      for (int j = values.length - 1; j >= i; j--) {
        if (values[j] < values[j - 1]) {
          int a = values[j];
          values[j] = values[j - 1];
          values[j - 1] = a;
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
    for (int i = 1; i < values.length; i++) {
      for (int j = values.length - 1; j >= i; j--) {
        if (values[j - 1] < values[j]) {
          int a = values[j];
          values[j] = values[j - 1];
          values[j - 1] = a;
        }
      }
    }
    return values;
  }
}

