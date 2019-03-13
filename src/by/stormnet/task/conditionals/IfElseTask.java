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
    int res = x*y;
    int res1 = x-y;
      if (res>10){
        value = 42;
      }
      if (res<=10) { value = x - y;}
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
    float del = x/y;
    float res = del*2;
    int res1
  }
    if (x<10){;
  }

  /**
   * Используя блок if/else if/else, напишите код, который вернет
   * x умноженный:
   *   - на 2, если x четное число;
   *   - на 3, если x без остатка делится на 3.
   * Если не выполняется ни одно из условий, то нужно вернуть исходное значение x.
   */
  int ifElseIfElse(int x) {
    throw new TaskNotImplementedException();
  }
}
