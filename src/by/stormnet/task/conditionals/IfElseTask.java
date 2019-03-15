package by.stormnet.task.conditionals;

import by.stormnet.task.TaskNotImplementedException;

class IfElseTask {

  /**
   * Используя блок if/else, напишите код, который вернет
   * значение 42, если результат умножения x на y больше 10.
   * Если результат умножения x на у меньше или равен 10,
   * то следует вернуть разность между x и y.
   */
  int ifElse(int x, int y) {
    int result = x * y;
    if (result > 10) {
      result = 42;
    } else {
      result = x - y;
    }
    return result;
  }

  /**
   * Используя блок if/else if, напишите код, который вернет целую часть
   * от результата деления x на y умноженную:
   *   - на 2, если x меньше 10;
   *   - на 3, если x больше либо равно 10 и x меньше 15;
   *   - на 4, если x больше либо равно 15 и y больше 15.
   */
  int ifElseIf(float x, float y) {
    int a = (int) x;
    int b = (int) y;
    int result = a / b;
    if (a < 10) {
      result = result * 2;
    } else if (a >= 10 && a < 15) {
      result *= 3;
    } else if (a >= 15 && b > 15) {
      result *= 4;
    }
    return result;
  }

  /**
   * Используя блок if/else if/else, напишите код, который вернет
   * x умноженный:
   *   - на 2, если x четное число;
   *   - на 3, если x без остатка делится на 3.
   * Если не выполняется ни одно из условий, то нужно вернуть исходное значение x.
   */
  int ifElseIfElse(int x) {
    int result = x;
    if (x % 2 == 0) {
      System.out.println("Число " + x + " чётное!");
      int result1 = x * 2;
      return result1;
      } else {
      System.out.println("Число " + x + " нечётное! Проверяем следующее условие!");
    }
    if (x % 3 == 0) {
      System.out.println("Число " + x + " делится на три, без остатка!");
      int result2 = x * 3;
      return result2;
    }  else {
      System.out.println("Ни одно из условий не выполняется!");
    }
    System.out.println("Исходное значение x: " + x);
    return x;
    }
}
