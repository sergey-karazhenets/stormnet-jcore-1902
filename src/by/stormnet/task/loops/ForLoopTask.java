package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class ForLoopTask {

  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
    int sum=0;
    for (int i=1;i<57;i++){
      sum+=i;
    }
    return sum;
  }

  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {
    int sum=0;
    if (x==y){
        sum=0;
      }else if (x<y){
      for (int i=x;i<y;i++){
        sum+=i;
      }
      }else if (x>y){
      for (int i=x;i>y;i--){
        sum+=i;
      }
    }
    return sum;
  }

  /**
   * Используя цикл for напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {
    int sub=0;
     if (x<y){
       sub=x;
      for (int i=x+1;i<=y;i++){
        sub-=i;
      }
    }else if (x>y){
       sub=x;
      for (int i=x-1;i>=y;i--){
        sub-=i;
      }
    }
    return sub;
  }

  /**
   * Используя цикл for напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {
    long multiply=1;
    for (int i=1;i<42;i++){
      if (i%2==0){
        multiply*=i;
      }
    }
    return (long) multiply;
  }

  /**
   * Используя цикл for напишие код, который будет считать
   * всю таблицу умножения и суммировать результаты умножения.
   *
   * К примеру, считаем таблицу умножения:
   *  1 * 1 = 0
   *  1 * 2 = 2
   *  1 * 9 = 9
   *  ...
   *  9 * 1 = 9
   *  9 * 2 = 18
   *
   * Суммируем результаты: 0 + 2 + 9 + ... + 9 + 18
   */
  int sumOfMultiplicationTable() {
    int sum=0;
    for (int i=1;i<10;i++){
      for (int j=1;j<10;j++){
        sum+=i*j;
      }
    }
    return sum;
  }
}
