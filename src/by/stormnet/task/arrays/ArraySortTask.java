package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
    int[] value = {25, 54, 89, 63, 7, 5}; //внешний цикл каждый раз сокращает фрагмент массива так как внутренний цикл массива каждый раз ставит в конец фрагмента максимальный элемент
    for (int i = value.length - 1; i > 0; i--) {//value.length-1 пишем для того чтобы не выйти за пределы массива
      for (int j = 0; j < i; j++) {//сравниваем элементы попарно, если они имеют неправильный порядок, то меняем местами
        if (value[j] > value[j + 1]) {
          int elem = value[j];
          value[j] = value[j + 1];
          value[j + 1] = elem;
        }
      }
    }
    return value;
  }

  /**
   * Отсортировать числа в массиве в порядке их убывания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortDesc(int[] values) {
    for (int i = values.length - 1; i > 0; i--) {
      for (int j = 0; j > i; j++) {
        if (values[j] > values[j + 1]) {
          int elem = values[j];
          values[j] = values[j + 1];
          values[j + 1] = elem;
        }
      }
    }
    return values;
  }
}
