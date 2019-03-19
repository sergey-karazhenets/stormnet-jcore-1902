package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

import java.sql.Array;
import java.util.Arrays;

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
    int a = values[0];
    return a;
  }

  /**
   * Получить последний элемент массива.
   */
  int lastElement(int[] values) {
    int a = values[values.length - 1];
    return a;
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int res = 0;
    for (int x = 3; x < 8; x++) {
      res += values[x];
    }
    return res;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int b = values[3];
    int c = values[5];
    int d = values[6];
    int i = values[7];
    int[] a = new int[]{b, c, d, i};
    return a;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
    int count = 0;
    for (char a : str.toCharArray()) {
      if (a == 'k') {
        count++;
      }
    }
    return count;
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
  int rowsSum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        sum += matrix[i][j];
      }
    }
    return sum;
  }
}
