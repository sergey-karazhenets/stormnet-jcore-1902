package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class IntBasicsTask {

  /**
   * Сколько бит в памяти занимает значение типа int?
   */
  int bitsInMemory() {
    return 4*8;
  }

  /**
   * Сколько байт в памяти занимает значение типа int?
   */
  int bytesInMemory() {
    return 4;
  }

  /**
   * Какое минимальное число можно присвоить переменной с типом int?
   */
  int minValue() {
    return Integer.MIN_VALUE;
  }

  /**
   * Какое максимальное число можно присвоить переменной с типом int?
   */
  int maxValue() {
    return Integer.MAX_VALUE;
  }
}
