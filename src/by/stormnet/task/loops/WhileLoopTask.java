package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int result = 0;
    int i = 1;
    while (i < 57) {
      result += i;
      System.out.println("Результат равено: " + result);
      i++;
    }
    System.out.println("Итоговый результат: " + result);
    return result;
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
    int sum = 0;
    if (x < y) {
      while (x < y) {
        sum += x;
        x++;
      }
      return sum;
    } else if (x > y) {
      while (x > y) {
        sum += x;
        x--;
      }
      return sum;
    } else {
      return sum;
    }
  }

  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   * - если x меньше y, то значения x будут возрастать на каждой итерации
   * - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int result = x * 2;
    if (x < y) {
      while (x <= y) {
        result -= x;
        x++;
      }
      return result;
    } else if (x > y) {
      while (x >= y) {
        result -= x;
        x--;
      }
      return result;
    } else {
      return x - y;
    }

  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long i = 1;
    long result = 1;
    while (i < 42) {
      if (i % 2 == 0 && i > 1) {
        result *= i;
        i++;
      } else {
        i++;
      }
    }
    System.out.println(result);
    return result;
  }
}
