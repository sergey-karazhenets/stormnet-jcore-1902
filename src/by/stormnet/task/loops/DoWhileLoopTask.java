package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

    /**
     * Используя цикл do-while напишие код, который вернет
     * сумму чисел от 1 до 57 (не включительно).
     */
    int calculateSum() {
        int x = 0;
        int summ = 0;
        do {
            for (x = 1; x < 57; x++) {
                summ += x;
            }
            return summ;
        } while (x < 57);
    }

    /**
     * Используя цикл do-while напишие код, который вернет
     * сумму чисел от x до y (не включительно).
     * Учитывайте, что:
     * - если x равно y, то нужно вернуть 0
     * - если x меньше y, то значения x будут возрастать на каждой итерации
     * - если x больше y, то значения x будут убывать на каждой итерации
     */
    int calculateSum(int x, int y) {
        int summ = 0;
        do {
            for (; x != y; ) {
                summ += x;
                if (x < y) {
                    x++;
                }
                else if (x > y) {
                    x--;
                }
               else if (x == y) {
                    summ = 0;
                }
            }
            return summ;
        } while (x != y);
    }

    /**
     * Используя цикл do-while напишие код, который вернет
     * разность чисел от x до y (включительно).
     * Учитывайте, что:
     * - если x меньше y, то значения x будут возрастать на каждой итерации
     * - если x больше y, то значения x будут убывать на каждой итерации
     */
    int calculateSub(int x, int y) {
        int summ = 0;
                do {
                    if (x < y) {
                            x++;
                            summ-=x;
                            break;
                        }
                       else if (x > y) {
                           summ-=x;
                           x--;
                           break;
                        }
                       if (x>y||y>x){
                           summ-=x;
                       break;}
                }while (x<=y);
        return summ;
        }


    /**
     * Используя цикл do-while напишие код, который вернет
     * произведение только четных чисел от 1 до 42 (не включительно).
     */
    long calculateEvenMultiply() {
        long summ = 1;
        long i = 1;
        do {
            if ((i % 2) == 0) {
                summ*=i;
            }
            i++;
        } while (i < 42);
        return summ;
    }
}
