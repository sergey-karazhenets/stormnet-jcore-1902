package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int sum=0;
    int x = 1;
    do{
      sum+=x;

      x++;
    }
    while(x<57);
    return sum;
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
    int sum=0;
    do{
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
    while( x!=y);
    return sum;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int min = x;
   if(x<y){
     min+=x;
     do{
       min-=x;
     x++;
     }
     while(x<=y);
     return min;
   }
   if(x>y){
     min +=x;
     do{
       min-=x;
       x--;
     }
     while(x>=y);
     return min;
   }
   if(x==y){
     min-=y;
     return min;
   }
    return min;
    }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long sum = 1;
    int i = 1;
    do{
        if(i%2==0) {
          sum *= i;
        }
      i++;
    }
    while(i<42);
    return sum;
  }
}
