package by.stormnet.task.conditionals;

import java.util.Random;

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
     * -> operator = "-", тогда нужно посчитать разность между x и y
     * -> operator = "%", тогда нужно посчитать остаток от деления x на y
     */
    float calculator(int x, int y, String operator) {
        String[] operators = new String[]{"+", "-", "*", "/", "range_sum"};
        int index = new Random().nextInt(operators.length);
        String operator1 = operators[index];
        float value = 0;
        for ( x = 0; x < 10; x++)
            for ( y = 0; y < 10; y++) {
                switch (operator) {
                    case "*":
                        value = x * y;
                        break;
                    case "+":
                        value = x + y;
                        break;
                    case "-":
                        value = x - y;
                        break;
                    case "/":
                        value = (float) x / y;
                        break;
                    case "range_sum":
                        int i =1;
                        while (i<y);
                        value +=i;
                        break;
                    case "%":
                        value = (float) x % y;;
                        break;
                    default:
                        value = x * 10;
                }
            }
        return value;
    }
}














