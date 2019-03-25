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
    int length1 = values.length;
    int result = --length1;
    return values[result];
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int result = values[3] + values[4] + values[5] + values[6] + values[7];
    return result;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int[] result;
    result = new int[] {
            values[3], values[5], values[6], values[7]
    };
    return result;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
    int result = 0;
    char[] arr = str.toCharArray();
    for (int i: arr
         ) {
      if ( i == 'k' ) {
      result++;
    } else {
      System.out.println();
      }
    }
    return result;
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
   int a = matrix.length;
   for (int i = 0; i < a; i++) {
     int b = matrix[i].length;
     for (int j = 0; j < b; j++) {
       int sumStroka = 0;
       if (j < b) {
         sumStroka += matrix[i][j];
         sum += sumStroka;
       }
     }
   }
   System.out.println("Сумма строк: " + sum);
   return sum;
  }
}
