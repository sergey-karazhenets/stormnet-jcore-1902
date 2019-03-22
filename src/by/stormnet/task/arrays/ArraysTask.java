package by.stormnet.task.arrays;

import by.stormnet.task.TaskNotImplementedException;

class ArraysTask {

  /**
   * Получить длину массива.
   */
  int arrayLength(int[] values) {

    int c = values.length;
    return c;
  }

  /**
   * Получить первый элемент массива.
   */
  int firstElement(int[] values) {

    int b = values[0];
    return b;
  }

  /**
   * Получить последний элемент массива.
   */
  int lastElement(int[] values) {
    int c = values.length;
    int last = --c;
    return values[last];
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
   return values[3] +values[4]+values[5]+values[6]+values[7];
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {

   int c = values[3];
   int a = values [5];
   int b = values [6];
   int h = values [7];
    int[] mass = new int[]{c,a,b,h};


     return mass;
    }


  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
      char[] values = str.toCharArray();

int sum = 0;
      for (int res : values) {
          if (res == 'k') {
              sum++;
          }}
          return sum;
      }






  /**Посчитать сумму чисел в каждой строке матрицы,
   * затем вычислить сумму полученных сумм со строк.
   * К примеру,
   *
   *  1 3 5
   *  2 4 5
   *
   * Сумма чисел первой строки: 1 + 3 + 5 = 9
   * Сумма чисел второй строки: 2 + 4 + 5 = 11
   * Сумма полученных сумм со строк: 9 + 10 = 20
   */
  int rowsSum(int[][] matrix) {


    int sum = 0;
    for (int i = 0; i<matrix.length; i++) {
        for (int v =0; v<matrix[i].length; v++){
            sum+=matrix[i][v];
        }

    }

    return sum;
  }
}
