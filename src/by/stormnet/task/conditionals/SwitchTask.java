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
   */
  float calculator(int x, int y, String operator) {
    float result = 0;
     switch (operator) {
      case "+":
        return(float)x+y;
       case "-":
        return (float)x-y;
      case "*":
        return (float)x*y;
      case "/":
        return (float)x/y;
      case "%":
        return (float)x%y;
      case "range_sum":
        for (; x < y; x++) {
          result +=(float) x;}
        break;
      default:
        result = x * 10;
    }
    return result;
  }
}

