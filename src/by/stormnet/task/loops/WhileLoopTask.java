package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int x = 1;
    int y = 1;
    int i = x + y;
    while (i < 57) {
      return i;
    }
    return 0;
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
    while ( x==y ){
      return 0;
    } while (x<y){
      return x++;
    }while (x>y){
      return x--;
    }
    return x+y;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    while(x<y){
      return x++;
    }while (x>y){
      return x--;
    }
    return x-=y;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    int res = 0;
    for (int i = 0; i < 10; i++) {
      for (int a = 0; a < 10; a++) {
        res += i * a;
      }
    }
    return res;
  }
}
