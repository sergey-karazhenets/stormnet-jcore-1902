package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class ByteBasicsTask {

  /**
   * How many bits in the memory is byte occupy?
   */
  int bitsInMemory() {
    return 8;
  }

  /**
   * How many bytes in the memory is byte occupy?
   */
  int bytesInMemory() {
    return 1;
  }

  /**
   * What is minimum value can hold 1 byte?
   */
  byte minValue() {
    return -128;
  }

  /**
   * What is maximum value can hold 1 byte?
   */
  byte maxValue() {
    return 127;
  }
}
