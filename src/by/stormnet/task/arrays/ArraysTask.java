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
    throw new TaskNotImplementedException();
  }

  /**
   * Получить последний элемент массива.
   */
  int lastElement(int[] values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    throw new TaskNotImplementedException();
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
    throw new TaskNotImplementedException();
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
    throw new TaskNotImplementedException();
  }
}
