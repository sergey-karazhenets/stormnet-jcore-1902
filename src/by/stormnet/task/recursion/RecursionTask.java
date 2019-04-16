package by.stormnet.task.recursion;

import by.stormnet.task.TaskNotImplementedException;

class RecursionTask {

  /**
   * Используя рекурсию, сделайте вычисление значения x!.
   * x! это факториал числа x.
   * Формула для расчета: x! = 1 * 2 * ... * x-1 * x.
   * <p>
   * Например:
   * - 1! = 1
   * - 2! = 1 * 2 = 2
   * - 3! = 1 * 2 * 3 = 6
   * - 5! = 1 * 2 * 3 * 4 * 5 = 120
   */
  long factorial(int x) {
    long res;
    if (x == 1) {
      return 1;
    } else {
      res = factorial(x - 1) * x;
    }
    return res;
  }
}
