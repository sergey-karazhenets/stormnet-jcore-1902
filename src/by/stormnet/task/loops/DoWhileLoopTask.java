package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int sum = 0;
    int i = 1;
    do {
      sum += i;
      i++;
    } while (i < 57);

    return sum;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int sum = 0;
    int i = x;
    if (x == y) {
      return 0;
    }
    do {
      if (x < y) {
        sum += i;
        i++;
      } }
      while (i < y) ;


      do {
        if (x > y) {
          sum += i;
          i--;
        }
      }
      while (i > y);

      return sum;
    }



  /**
   * Используя цикл do-while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    throw new TaskNotImplementedException();
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    int i = 1;
    long sum = 1;

      do { if (i % 2 == 0) {


        sum *= i;}
        i++;

      } while(i < 42);


    return sum;
  }}



