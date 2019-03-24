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
    int value = values[values.length - 1];
    return value;
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int value = values[3] + values[4] + values[5] + values[6]+ values[7];
    return value;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {

    int a = values[3];
    int b = values[5];
    int c = values[6];
    int d = values[7];
    int[] value1 = new int[]{a,b,c,d};
    return values;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
    char[] values = str.toCharArray();
    int count1 = 0;
    for (char i : str.toCharArray()) {
      if (i == 'k')
        count1++;
    }
    return count1;
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
   * Сумма полученных сумм со строк: 9 + 10 = 20
   */
  int rowsSum(int[][] matrix) {
    int sum = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int e = 0; e < matrix[i].length; e++) {
        sum += matrix[i][e];
      }
    }
    return sum;
  }
}

