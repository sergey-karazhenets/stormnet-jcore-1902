package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraysTask {

  /**
   * Получить длину массива.
   */
  int arrayLength(int[] values) {
    return values.length;
  }

  /**
   * Получить первый элемент массива.
   */
  int firstElement(int[] values) {
    return values[0];
  }

  /**
   * Получить последний элемент массива.
   */
  int lastElement(int[] values) {
    return values[values.length - 1];
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int sum = 0;
    for (int i = 3; i < 8; i++) {
      sum = sum + values[i];
    }
    return sum;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int[] array = new int[4];
    int x = 0;
    for (int i = 0; i < values.length; i++) {
      if (i == 3 || i == 5 || i == 6 || i == 7) {
        array[x] = values[i];
        x++;
      }
    }
    return array;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
    int res = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'k') {
        res++;
      }
    }
    return res;
  }

  /**
   * Посчитать сумму чисел в каждой строке матрицы,
   * затем вычислить сумму полученных сумм со строк.
   * К примеру,
   * 1 3 5
   * 2 4 5
   * <p>
   * Сумма чисел первой строки: 1 + 3 + 5 = 9
   * Сумма чисел второй строки: 2 + 4 + 5 = 11
   * Сумма полученных сумм со строк: 9 + 11 = 20
   */
  int rowsSum(int[][] matrix) {
    int sum = 0;
    int sum1 = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        sum1 = sum1 + matrix[i][j];
      }
      sum+=sum1;
      sum1=0;
    }
    return sum;
  }
}