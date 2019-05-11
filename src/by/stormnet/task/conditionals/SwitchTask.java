package by.stormnet.task.conditionals;

import by.stormnet.task.TaskNotImplementedException;

class SwitchTask {

  /**
   * Напишите калькулятор, используя блок switch.
   * <p>
   * x и y это значения, над которыми нужно будет делать
   * операцию, заданную в переменной operator.
   * <p>
   * operator может принимать одно из следующих значений:
   * "+", "-", "*", "/", "%", "range_sum".
   * Если на вход пришел оператор, не описанный выше,
   * то нужно вернуть результат умножения x на 10.
   * <p>
   * Оператор "range_sum" обозначает то, что нужно вычислить
   * сумму чисел от x до y (не включительно).
   * <p>
   * К примеру,
   *  -> operator = "-", тогда нужно посчитать разность между x и y
   *  -> operator = "%", тогда нужно посчитать остаток от деления x на y
   */
  float calculator(int x, int y, String operator) {
    float value = 0;
    float a = (float) x;
    float b = (float) y;
    switch (operator) {
      case "+":
        return a + b;
      case "-":
        return  a - b;
      case "*":
        return a * b;
        case "/":
        return a / b;
      case "%":
        return a % b;
      case "range_sum":
        for (float i = a; i < b; i++) {
          value += i;
        }
        return value;
        default:
        return a * 10;
    }
  }
  }
