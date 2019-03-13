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
    if (x * y > 10) {
     return 42;
    } else if (x*y<=10){
      return x - y;
    }
      return 0;
  }


  /**
   * Используя блок if/else if, напишите код, который вернет целую часть
   * от результата деления x на y умноженную:
   *   - на 2, если x меньше 10;
   *   - на 3, если x больше либо равно 10 и x меньше 15;
   *   - на 4, если x больше либо равно 15 и y больше 15.
   */
  float ifElseIf(float x, float y) {
      float  b=x/y;
   if (x<10){
       return  b*2;
   }else if (x>=10 && x<15){
       return b*3;
      }else if (x>=15 && y>15){
       return b*4;
      }
      return 0;
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
