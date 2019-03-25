package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class ForLoopTask {

  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int result = 0;
    for (int i = 1; i < 57; i++) {
      result += i;
    }
    System.out.println(result);
    return result;
  }

  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int result = 0;
    if (x == y) {
      System.out.println("x = y => возвращаем 0!");
      return 0;
    } else if (x < y) {
      for (int i = x; i < y; i++) {
        result += i;
        System.out.println("Результат равен: " + result);
      }return result;
    } else if (x > y) {
      for (int i = x; i > y; i--) {
        result += i;
        System.out.println("Результат равен: " + result);
      } return result;
    } else {
      System.out.println();
    }
    return result;
  }

  /**
   * Используя цикл for напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int result = x * 2;
    if (x < y) {
      for (; x <= y; x++) {
        result -= x;
      } return result;
    } else if (x > y) {
      for (; x >= y; x--) {
        result -= x;
      } return result;
    } else {
      return x - y;
    }

  }

  /**
   * Используя цикл for напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long result = 1;
    for (long i = 1; i < 42; i++) {
        if (i % 2 == 0) {
          result *= i;
        } else {
          System.out.println("Нечётное число: " + i);
        }
      }
    System.out.println(result);
    return result;
  }

  /**
   * Используя цикл for напишие код, который будет считать
   * всю таблицу умножения и суммировать результаты умножения.
   *
   * К примеру, считаем таблицу умножения:
   *  1 * 1 = 0
   *  1 * 2 = 2
   *  1 * 9 = 9
   *  ...
   *  9 * 1 = 9
   *  9 * 2 = 18
   *
   * Суммируем результаты: 0 + 2 + 9 + ... + 9 + 18
   */
  int sumOfMultiplicationTable() {
    int sum = 0;
    for (int a = 0; a <= 9; a++) {
      for (int b = 0; b <= 9; b++) {
        int proizv = a*b;
        sum += proizv;
      }
    } System.out.println(sum);
    return sum;
  }
}
