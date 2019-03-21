package by.stormnet.task.loops;

import by.stormnet.task.TaskNotImplementedException;

class ForLoopTask {

  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от 1 до 57 (не включительно).
   */
  int calculateSum() {
int sum = 0;
    for (int i = 1; i < 57; i++) {
      sum +=i;
    }

    return sum; }





  /**
   * Используя цикл for напишие код, который вернет
   * сумму чисел от x до y (не включительно).
   * Учитывайте, что:
   *  - если x равно y, то нужно вернуть 0
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSum(int x, int y) {

    int res = 0;


      if (x == y) {
        return 0;
      }
      if (x<y){
        for(int i = x; i<y; i++ ){
          res+=i;
        }
      } else if (x>y) {
        for(int i = x; i>y; i--) {
          res+=i;




        }
      }
    return res;
  }


  /**
   * Используя цикл for напишие код, который вернет
   * разность чисел от x до y (включительно).
   * Учитывайте, что:
   *  - если x меньше y, то значения x будут возрастать на каждой итерации
   *  - если x больше y, то значения x будут убывать на каждой итерации
   */
  int calculateSub(int x, int y) {

    int res = 0;
    if (x<y){
    for (int i =x; i<=y; i++){
      res-=i;
    } if (x>y) {
      for (int i = x; i>=y; i--) {
        res-=i;
      }
      }

    }return res;  }

  /**
   * Используя цикл for напишие код, который вернет
   * произведение только четных чисел от 1 до 42 (не включительно).
   */
  long calculateEvenMultiply() {

    long res = 1;
    for (int i = 1; i<42; i++) {


   if (i%2==0) {
     res*=i;
   }

   }
    return res;
  }

  /**
   * Используя цикл for напишие код, который будет считать
   * всю тaблицу умножения и суммировать результаты умножения.
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

     int res = 1;
     int sum = 0;
    for (int i = 1; i <10; i++) {
      for (int k = 1; k < 10; k++) {
        res = i*k;
        sum+=res;


              }}


  return sum;
  } }





