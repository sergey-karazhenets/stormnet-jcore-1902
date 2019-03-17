package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int sum=0;
    int i=1;
    while (i<57){
      sum+=i;
      i++;
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
    int sum=0;
    if (x<y){
      while (x<y){
        sum+=x;
        x++;
      }
    }else if (x>y){
      while (x>y){
        sum+=x;
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
    int sub=0;
    if (x<y){
      sub=x;
      while (x<y){
        x++;
        sub-=x;

      }
    }else if (x>y){
      sub=x;
      while (x>y){
        x--;
        sub-=x;
      }
    }
    return sub;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long multiply=1;
    int i=1;
    while (i<42){
      if (i%2==0){
        multiply*=i;
      }
      i++;
    }
    return (long)multiply;
  }
}
