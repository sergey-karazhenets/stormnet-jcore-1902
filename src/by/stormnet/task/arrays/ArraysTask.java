package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraysTask {

  /**
   * Получить длину массива.
   */
  int arrayLength(int[] values) {

    System.out.println(values.length);
    return 0;
  }


  /**
   * Получить первый элемент массива.
   */
  int firstElement(int[] values) {
    int[] arr = new int[]{2, 3, 5, 6};
    int a = arr[0];
    System.out.println(a);
    return a;
  }

  /**
   * Получить последний элемент массива.
   */
  int lastElement(int[] values) {
    int last = values[values.length - 1];
    System.out.println(last);
    return last;
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int[] arr = new int[]{2, 5, 7, 8, 9, 4, 5};
    int k = arr[3] + arr[7];
    return k;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int[] value = new int[8];
    value [3] = 18;
    value [5] = 52;
    value [6] = 87;
    value [7] = 69;
    for (int i = 0; i < 8; i++) {
      System.out.println(values[i]);
    }
    return value;
  }


  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
      int count = 0;
      for (char i : str.toCharArray()) {
          if (i == 'k') {
              count++;
          }
          return count;
      }
      return 0;
  }

      /**
       * Посчитать сумму чисел в каждой строке матрицы,
       * затем вычислить сумму полученных сумм со строк.
       * К примеру,
       *  1 3 5
       *  2 4 5
       *
       * Сумма чисел первой строки: 1 + 3 + 5 = 9
       * Сумма чисел второй строки: 2 + 4 + 5 = 11
       * Сумма полученных сумм со строк: 9 + 10 = 20
       */
      int rowsSum (int[][] matrix){
          int[] arrays = {1, 12, 15, 16};
          int[] myArrays = {2, 5, 7, 9};
          int sum = 0;
          for (int i = 0; i < arrays.length; i++) {
              sum = sum + arrays[i];
              System.out.println(sum);
          }
          int sum1 = 0;
          for (int i = 0; i < myArrays.length; i++) {
              sum1 = sum1 + myArrays[i];
              System.out.println(sum1);
          }
          return sum + sum1;
      }
  }

