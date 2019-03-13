package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class IntBasicsTask {

  /**
   * How many bits in the memory is int occupy?
   */
  int bitsInMemory() {
    return 32;
  }

  /**
   * How many bytes in the memory is int occupy?
   */
  int bytesInMemory() {
    return 4;
  }

  /**
   * What is minimum value can hold int?
   */
  int minValue() {
    return Integer.MIN_VALUE;
  }

  /**
   * What is maximum value can hold int?
   */
  int maxValue() {
    return Integer.MAX_VALUE;
  }
}
