package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class ForLoopTask {

    /**
     * Используя цикл for напишие код, который вернет
     * сумму чисел от 1 до 57 (не включительно).
     */
    int calculateSum() {
        int sum = 0;
        for (int i = 1; i < 57; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * Используя цикл for напишие код, который вернет
     * сумму чисел от x до y (не включительно).
     * Учитывайте, что:
     * - если x равно y, то нужно вернуть 0
     * - если x меньше y, то значения x будут возрастать на каждой итерации
     * - если x больше y, то значения x будут убывать на каждой итерации
     */
    int calculateSum(int x, int y) {
        int sum = 0;
        for (; x != y; ) {
            if (x == y) {
                return 0;
            } else if (x < y) {
                sum += x;
                x++;
            } else if (x > y) {
                sum += x;
                x--;
            }
        }
        return sum;
    }

    /**
     * Используя цикл for напишие код, который вернет
     * разность чисел от x до y (включительно).
     * Учитывайте, что:
     * - если x меньше y, то значения x будут возрастать на каждой итерации
     * - если x больше y, то значения x будут убывать на каждой итерации
     */
    int calculateSub(int x, int y) {
        if (x == y){
            return 0;
        }
        int res = x;
        for (; x != y; ) {
            if (x < y) {
                x++;
                res -= x;
            } else if (x > y) {
                x--;
                res -= x;
            }
        }
        return res;
    }

    /**
     * Используя цикл for напишие код, который вернет
     * произведение только четных чисел от 1 до 42 (не включительно).
     */
    long calculateEvenMultiply() {
        long res = 1;
        long a = 1;
        for (;a<42;) {
            if (a % 2 == 0) {
                res *= a;
            }
            a++;
        }
        return res;
    }

    /**
     * Используя цикл for напишие код, который будет считать
     * всю таблицу умножения и суммировать результаты умножения.
     * <p>
     * К примеру, считаем таблицу умножения:
     * 1 * 1 = 0
     * 1 * 2 = 2
     * 1 * 9 = 9
     * ...
     * 9 * 1 = 9
     * 9 * 2 = 18
     * <p>
     * Суммируем результаты: 0 + 2 + 9 + ... + 9 + 18
     */
    int sumOfMultiplicationTable() {
        int sum=0;
        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                if (i!=10&&j!=10){
                    sum+=i*j;
                }
            }
        }
            return sum;
    }
}


