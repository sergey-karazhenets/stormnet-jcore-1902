package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class DoWhileLoopTask {

  /**
   * Используя цикл do-while напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int i=1;
    int sum=0;
    do{
      sum+=i;
      i++;
    }while(i<57);
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
      sum+=x;
      if(x<y){
        x++;
      }else if(x>y){
        x--;
      }else if(x==y){
        sum=0;
        break;
      }
    }while(x!=y);
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
    int sub=x;
    if(x<y){
        sub+=x;
        do{
            sub-=x;
            x++;
        }while (x<=y);
    }else if(x>y){
        sub+=x;
        do{
            sub-=x;
            x--;
        }while (x>=y);
    }else if(x==y){
        sub-=x;
    }
    return sub;
  }

  /**
   * Используя цикл do-while напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long i=1;
    long pr=1;
    do{
      if(i%2==0){
        pr*=i;
      }
      i++;
    }while(i<42);
    return pr;
  }
}
