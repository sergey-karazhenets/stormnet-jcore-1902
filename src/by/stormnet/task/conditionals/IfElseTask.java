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
    int value = 0;
    int res = x * y;
    int res1 = x - y;
    if (res > 10) {
      value = 42;
    }
    if (res <= 10) {
      value = x - y;
    }
    return value;
  }

  /**
   * Используя блок if/else if, напишите код, который вернет целую часть
   * от результата деления x на y умноженную:
   *   - на 2, если x меньше 10;
   *   - на 3, если x больше либо равно 10 и x меньше 15;
   *   - на 4, если x больше либо равно 15 и y больше 15.
   */
  int ifElseIf(float x, float y) {
    float res = x / y;
    int value = (int) res;
    int res1 = (int) res * 2;
    int res2 = (int) res * 3;
    int res3 = (int) res * 4;
    if (x < 10) {
     return res1 = (int) res * 2;
    }
    if (x >= 10 & x < 15) {
      return res2 = (int) res * 3;
    }
    if (x >= 15 & y > 15) {
      return res3 = (int) res * 4;
    }
    return value;
  }

  /**
   * Используя блок if/else if/else, напишите код, который вернет
   * x умноженный:
   *   - на 2, если x четное число;
   *   - на 3, если x без остатка делится на 3.
   * Если не выполняется ни одно из условий, то нужно вернуть исходное значение x.
   */
  int ifElseIfElse(int x) {
    int value = x;
    int res = x * 2;
    int res1 = x * 3;
    if (x % 2 == 0) {
      return res;
    }
    if (x % 3 == 0) {
      return res1;
    }
    if (x % 2 != 0 & x % 3 != 0){
      return x;}
      return value;}
}
