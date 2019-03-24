package by.stormnet.task.loops;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int p = 1;
    int sum = 0;
    do {
      sum += p;
    } while (p < 57);

    return sum;
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
    int i = x;
    int sum = 0;
    if (x == y) {
      return sum;
    }
    if (i < y) {
      do {
        sum += x;
        i++;
      }
      while (x < y);
    }
    if (i > y) {
      do {
        sum += x;
        x--;
      } while (x > y);
    }
      return sum;

  }




  /**
   * Используя цикл do-while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   * - если x меньше y, то значения x будут возрастать на каждой итерации
   * - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
      int res = x;
      if (x == y) {
        res -= x;
      } else if (x < y) {
        ++x;
        for (; x <= y; x++) {
          res -= x;
        }
      } else {
        --x;
        for (; x >= y; x--) {
          res -= x;
        }
      }
      return res;
    }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long i = 2;
    long result = 1;
      do {
        if ( i % 2 == 1 )
        result *= i;
        i++;
      }
      while (i > 1 && i < 42);
    return result;
  }
}


