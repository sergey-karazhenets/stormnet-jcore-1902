package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class CharBasicsTask {

  /**
   * Сколько бит в памяти занимает значение типа char?
   */
  int bitsInMemory() {
    return 16;
  }

  /**
   * Сколько байт в памяти занимает значение типа char?
   */
  int bytesInMemory() {
    return 2;
  }
}
