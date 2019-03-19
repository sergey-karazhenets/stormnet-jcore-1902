package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
   int result=0;
   int x=0;
   do {result+=x; x++;} while (x<57);
   return result;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
      int result=0;
      if (x>y){
      do {result+=x; x--;} while (x>y);}
      else if (x<y) {do {result+=x; x++;} while (x<y);}
      else result=0;
      return result;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
      int result=x*2;  //костыль, надо бы переписать
      if (x>y){
          do {result-=x; x--;} while (x>=y);}
      else if (x<y) {do {result-=x; x++;} while (x<=y);}
      else result=0;
      return result;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
   int x=2;
   long result=1;
   do {result*=x; x+=2;}
   while (x<42);
   return result;
  }
}
