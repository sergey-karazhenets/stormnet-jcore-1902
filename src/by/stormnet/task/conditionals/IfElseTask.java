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
    int b = 0;
    if (result > 10) {
      return b = 42;

    } else {
      return b = x - y;

    }

  }



  /**
   * Используя блок if/else if, напишите код, который вернет целую часть
   * от результата деления x на y умноженную:
   *   - на 2, если x меньше 10;
   *   - на 3, если x больше либо равно 10 и x меньше 15;
   *   - на 4, если x больше либо равно 15 и y больше 15.
   */
  int ifElseIf(float x, float y) {

    float val;
    float res = x/y;
    int value = (int)res;

    int b =(int)res*2;
    if (x<10) {
      return b ;

    }
    int a = (int)res*3;
    if (x>=10&x<15) {
      return a;

    }
    int c = (int) res*4;
    if (x>=15&y>15) {
      return c;
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

      int a = x % 2;
      int b = x % 3;
      if (a == 0) {
        return x = x * 2;


      } else if (b == 0) {
        return x = x * 3;
      }
      return x = x;
    }
  }



