package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int result=0;
    int x=0;
    while (x<57) {result+=x; x++;}
    return result;
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
    int result=0;
    if (x>y){while (x>y) {result+=x; x--;} }
    else if (x<y) {while (x<y) {result+=x; x++;} }
    else result=0;
    return result;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int result=x*2;  //не сегодня
    if (x>y){
      while (x>=y) {result-=x; x--;}}
    else if (x<y) { while (x<=y) {result-=x; x++;}}
    else result=0;
    return result;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    int x=2;
    long result=1;
    while (x<42) {result*=x; x+=2;}
    return result;
  }
}
