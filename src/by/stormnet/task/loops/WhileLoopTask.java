package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int i = 0;
    int sum = 1;
    while (i < 57) ;
    sum += i;
    return sum;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   * - если x равно y, то нужно вернуть 0
   * - если x меньше y, то значения x будут возрастать на каждой итерации
   * - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int i = x;
    int sum = 0;
    if (x == y) {
      return sum;
    }
    if (x < y) {
      while (i < y) {
        sum += x;
        i++;
      }
    }
    if (x > y) {
      while (i > y) {
        sum += x;
        i--;
      }
    }

    return sum;
  }





  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int i = x;
    int sub = 0;
    if (x <= y) {
    while (i < y) {
      sub -= x;
      i++;
    }
  }
    if (x > y) {
    while (i > y) {
      sub -= x;
      i--;
    }
  }

    return sub;
}


  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long i = 0;
    long result = 1;
     while (i > 1 && i < 42){
      if ( i % 2 == 1)
        result *= i;
      i++;
    }
    return result;
  }
}


