package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int result = 0;
    int i = 1;
    do {
      result += i;
      i++;
    } while (i < 57);
    return result;
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
    int result = 0;
    if (x == y) {
      System.out.println("x равно y!");
      return result;
    } else if (x < y) {
      do {
        result += x;
        x++;
      } while (x < y);
      return result;
    } else if (x > y) {
      do {
        result += x;
        x--;
      } while (x > y);
      return result;
    }
    return result;
  }
  /**
   * Используя цикл do-while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int result = x;
    if ( x < y) {
      result += x;
      do {
        result -= x;
        x++;
      } while (x <= y);
      return result;
    } else if (x > y) {
      result += x;
      do {
        result -= x;
        x--;
      } while (x >= y);
      return result;
    } else if (x == y) {
      result -= y;
      return result;
    }
    return result;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    throw new TaskNotImplementedException();
  }
}
