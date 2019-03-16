package by.stormnet.task.conditionals;

import by.stormnet.task.TaskNotImplementedException;

class SwitchTask {

  /**
   * Напишите калькулятор, используя блок switch.
   *
   * x и y это значения, над которыми нужно будет делать
   * операцию, заданную в переменной operator.
   *
   * operator может принимать одно из следующих значений:
   *    "+", "-", "*", "/", "%", "range_sum".
   * Если на вход пришел оператор, не описанный выше,
   * то нужно вернуть результат умножения x на 10.
   *
   * Оператор "range_sum" обозначает то, что нужно вычислить
   * сумму чисел от x до y (не включительно).
   *
   * К примеру,
   *  -> operator = "-", тогда нужно посчитать разность между x и y
   *  -> operator = "%", тогда нужно посчитать остаток от деления x на y
   *  123
   */
  float calculator(int x, int y, String operator) {
    float res = 0;
    float x1=(float)x;
    float y1=(float)y;
    switch(operator){
      case "+":
        res=x1+y1;
        break;
      case "-":
        res=x1-y1;
        break;
      case "*":
        res=x1*y1;
        break;
      case "/":
        if (y1!=0){
        res=x1/y1;}
        else res=Float.POSITIVE_INFINITY;
        break;
      case "%":
        if (y1!=0){res=x1%y1;}
        else res=Float.POSITIVE_INFINITY;
        break;
      case "range_sum":
        for (;x1<y1;x1++){
          res+=x1;
        }
        break;
      default:
        res=x1*10;}
    return res;
  }
}
