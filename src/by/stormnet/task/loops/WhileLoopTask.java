package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int x=1;
    int res =0;
    while (x<57){
      res +=x;
      x++;
    }
    return res;
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
    int res=0;
    while (x!=y){
      if (x==y){
        return 0;
      }else if (x<y){
        res +=x;
        x++;
      }else if (x>y){
        res+=x;
        x--;
      }
    }
    return res;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int res=x;
    if (x==y){
      res-=x;
    }
    while (x!=y){
      if (x<y){
        x++;
        res -=x;
      }else if (x>y){
        x--;
        res-=x;
      }
    }
    return res;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long res = 1;
    long a = 1;
    while (a < 42){
      if (a % 2 == 0) {
        res *= a;
      }
      a++;
    }
    return res;

  }
}
