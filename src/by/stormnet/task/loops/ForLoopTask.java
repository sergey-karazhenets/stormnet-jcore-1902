package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class ForLoopTask {

  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int sum = 0;
    for (int i = 0; i < 57; i++) {
      sum += i;
    }
    return sum;
  }


  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   * - если x равно y, то нужно вернуть 0
   * - если x меньше y, то значения x будут возрастать на каждой итерации
   * - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int i = 0;
    int sum = 0;
    for (i = 1; i < y; i++)
      if (x == y) {
        sum = 0;
      }
    if (x < y) {
      do {
        sum++;
        i++;
      } while (x < y);
      {
        sum = sum + i;
      }
      if (x > y) {
        do {
          sum++;
          i--;
        } while (x > y);
      }
    }
    return sum;
  }


  /**
   * Используя цикл for напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   * - если x меньше y, то значения x будут возрастать на каждой итерации
   * - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int i = 0;
    int sub = 0;
    for (i = 1; i <= y; i++)

      if (x < y) {
        do {
          sub--;
          i++;
        } while (x <= y);
        {
          sub = sub + i;
        }
        if (x > y) {
          do {
            sub--;
            i--;
          } while (x > y);
        }
      }
    return sub;
  }

  /**
   * Используя цикл for напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long mul = 1;
    for (int z = 0; z <= 42; z++) {
        if( z%2==1);
        mul *=z;
      }
    return mul;
  }

  /**
   * Используя цикл for напишие код, который будет считать
   * всю таблицу умножения и суммировать результаты умножения.
   * <p>
   * К примеру, считаем таблицу умножения:
   * 1 * 1 = 0
   * 1 * 2 = 2
   * 1 * 9 = 9
   * ...
   * 9 * 1 = 9
   * 9 * 2 = 18
   * <p>
   * Суммируем результаты: 0 + 2 + 9 + ... + 9 + 18
   */
  int sumOfMultiplicationTable() {
    int sum =0;
    for (int z = 0; z < 10; z++) {
      for (int q = 1; q < 10; q++) {
        int result = z * q;
        sum += result;

      }
    }
    return sum;
  }
}


