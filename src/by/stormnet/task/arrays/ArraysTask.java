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
    return values[values.length-1];
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int sum=0;
    for (int i=3;i<=7;i++){
      sum+=values[i];
    }
    return sum;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int[] arr=new int[4];
    for (int i=0,j=1;i<values.length;i++){
      if (i==3){
        arr[0]=values[i];
      } else if (i>=5&i<=7){
        arr[j]=values[i];
        j++;
      }
    }
    return arr;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {

    int sum=0;
    for ( int i=0; i<str.length(); i++ ) {
      if (str.charAt(i)=='k'){
        sum++;
      }
    }
    return sum;

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

    int sum=0;
    for (int[] x : matrix){
      for (int i: x ) {
        sum+= i;
      }
    }
    return sum;
  }
}
