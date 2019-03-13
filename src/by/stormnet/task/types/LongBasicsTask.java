package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class LongBasicsTask {

  /**
   * How many bits in the memory is long occupy?
   */
  int bitsInMemory() {
    return 64;
  }

  /**
   * How many bytes in the memory is long occupy?
   */
  int bytesInMemory() {
    return 8;
  }

  /**
   * What is minimum value can hold long?
   */
  long minValue() {
    return Long.MIN_VALUE;
  }

  /**
   * What is maximum value can hold long?
   */
  long maxValue() {
    return Long.MAX_VALUE;
  }
}
