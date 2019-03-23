package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int summ = 0;
    int x = 1;
    while (x < 57) {
      summ += x;
      x++;
    }
    return summ;
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
    int summ = 0;
    while (x != y) {
      summ += x;
      if (x < y) {
        x++;
      } else if (x > y) {
        x--;
      } else if (x == y) {
        summ = 0;
        break;
      }
    }
    return summ;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   * - если x меньше y, то значения x будут возрастать на каждой итерации
   * - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int sum =x*2;
    if (x < y) {
      while (x <= y) {
        sum -= x;
        x++;
      }
    } else if (x > y) {
      while (x >= y) {
        sum -= x;
        x--;
      }
    } else {
      return 0;
    }return sum;
  }





  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long summ=1;
    long x=1;
    while (x<42){
      if((x%2)==0){
      summ*=x;}
          x++;
    }return summ;
  }
}
