package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class LongBasicsTask {

  /**
   * Сколько бит в памяти занимает значение типа long?
   */
  int bitsInMemory() {
    return 64;
  }

  /**
   * Сколько байт в памяти занимает значение типа long?
   */
  int bytesInMemory() {
    return 8;
  }

  /**
   * Какое минимальное число можно присвоить переменной с типом long?
   */
  long minValue() {
    return Long.MIN_VALUE;
  }

  /**
   * Какое максимальное число можно присвоить переменной с типом long?
   */
  long maxValue() {
    return Long.MAX_VALUE;
  }
}
