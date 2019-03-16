package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class WhileLoopTask {

  /**
   * Используя цикл while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int i=1;
    int sum=0;
    while(i!=57){
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
    while(x!=y){
      sum+=x;
      if(x==y){
        sum=0;
        break;
      }else if(x<y){
        x++;
      }else if(x>y){
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
    boolean bool=false;
    int sub=0;
    while(bool!=true){
      sub-=x;
      if(x<y){
        x++;
      }else if(x>y){
        x--;
      }
      if(x==y){
        continue;
      }
    }
    return sub;
  }

  /**
   * Используя цикл while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    int i=1;
    long pr=1;
    while(i!=42){
      if(i%2==0){
        pr*=i;
      }
      i++;
    }
    return pr;
  }
}
