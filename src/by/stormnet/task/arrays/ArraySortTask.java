package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {

    boolean res = false;
    int full;
    for (int j = 0;j<values.length; j++) {
      res = true;
      for (int i = 0; i<values.length; i++) {
        if (values [i]>values[i+1]) {
                res = false;
                full = values[i];
                values[i] = values[i+1];
                values [i+1] = full;
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
    throw new TaskNotImplementedException();
  }
}
