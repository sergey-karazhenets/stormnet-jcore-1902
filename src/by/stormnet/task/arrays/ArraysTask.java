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
    int x;
    x=values.length;
    return values[x-1];
  }

  /**
   * Получить сумму 3 - 7 элементов массива.
   */
  int elementsSum(int[] values) {
    int x=0;
    for(int i=0;i<values.length;i++){
      if(i>=3&&i<=7){
        x+=values[i];
      }
    }
    return x;
  }

  /**
   * Получить новый массив, в котором будут 3, 5 - 7 элементы из исходного массива.
   */
  int[] selectElements(int[] values) {
    int[] arr=new int[4];
    for(int i=0,k=0;i<values.length;i++){
      if(i==3 || i>=5 && i<=7){
        arr[k]=values[i];
        k++;
      }
    }
    return arr;
  }

  /**
   * Посчитать количество букв k в строке, используя цикл foreach.
   */
  int countOfLetterInString(String str) {
    int count=0;
    for(char i: str.toCharArray()){
      if(i=='k'){
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
    int sumstr=0;
    int sumStrok=0;
    for(int i=0;i<matrix.length;i++){
      for(int j=0;j<matrix[i].length;j++){
        sumstr+=matrix[i][j];
      }
      sumStrok+=sumstr;
      sumstr=0;
    }
    return sumStrok;
  }
}
