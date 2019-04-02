package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class ByteBasicsTask {

  /**
   * Сколько бит в памяти занимает один байт?
   */
  int bitsInMemory() {
    return 8;
  }

  /**
   * Сколько байт в памяти занимает один байт?
   */
  int bytesInMemory() {
    return 1;
  }

  /**
   * Какое минимальное число можно присвоить перменной с типом byte?
   */
  byte minValue() {
    return -128;
  }

  /**
   * Какое максимальное число можно присвоить перменной с типом byte?
   */
  byte maxValue() {
    return 127;
  }
}
