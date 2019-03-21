package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int x=0;
    int sum=0;
    while(x<57){
      sum+=x;
      x++;
    }
    return sum;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int sum = 0;
    while(x!=y){
      sum += x;
      if(x == y){
        return 0;
      }
      if(x < y){
        x++;
      }
      if(x>y){
        x--;
      }
    }
    return sum;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int sub = x;
    if (x < y){
      sub += x;
    while(x<=y){
      sub -= x;
      x++;
    }
    return sub;
    }
    if (x > y){
      sub += x;
      while (x >= y) {
        sub -= x;
        x--;
      }
      return sub;
    }
    if (x==y){
      sub -= y;
      return sub;
    }
    return sub;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    int x = 1;
    long even = 1;
    while (x<42){
      if (x%2==0){
        even *= x;

      }
      x++;
    }
    return even;
  }
}
