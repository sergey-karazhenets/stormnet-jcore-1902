package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    for (int i = 0; i < values.length; i++) {
      for (int j = i + 1; j < values.length; j++) {
        if (values[i] > values[j]) {
         int result = values[i];
          values[i] = values[j];
          values[j] = result;
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
    for (int i = 0; i < values.length; i++) {
      for (int j = i + 1; j < values.length; j++) {
        if (values[i] < values[j]) {
          int result = values[i];
          values[i] = values[j];
          values[j] = result;
        }
      }
    }
    return values;
  }
}
