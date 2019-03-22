package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    int temp;
    for (int i=0;i<values.length-1;) {
      if (values[i]>values[i+1]) {
        temp=values[i];
        values[i]=values[i+1];
        values[i+1]=temp;
        i=0;} else i++;
      }
      return values;
 }

  /**
   * Отсортировать числа в массиве в порядке их убывания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortDesc(int[] values) {
    int temp;
    for (int i=0;i<values.length-1;) {
      if (values[i]<values[i+1]) {
        temp=values[i];
        values[i]=values[i+1];
        values[i+1]=temp;
        i=0;} else i++;
    }
    return values;
  }
}
