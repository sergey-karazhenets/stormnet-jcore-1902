package by.stormnet.task.arrays;

class ArraySortTask {

  /**
   * Отсортировать числа в массиве в порядке их возрастания,
   * используя алгоритм сортировки пузырьком.
   */
  int[] bubbleSortAsc(int[] values) {
for (int i = values.length-1; i>0; i--){
  for (int j = 0; j<i; j++){
    if(values[j]>values[j+1]){
      int tmp = values[j];
      values[j]= values[j+1];
      values[j+1]=tmp;
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
    for (int i = values.length-1; i>0; i--){
      for (int j = 0; j<i; j++){
        if(values[j]<values[j+1]){
          int tmp = values[j];
          values[j]= values[j+1];
          values[j+1]=tmp;
        }
      }
    }
    return values;
  }
}
