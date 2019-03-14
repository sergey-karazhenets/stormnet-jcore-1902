package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class ShortBasicsTask {

  /**
   * How many bits in the memory is short occupy?
   */
  int bitsInMemory() {
    return 2*8;
  }

  /**
   * How many bytes in the memory is short occupy?
   */
  int bytesInMemory() {
    return 2;
  }

  /**
   * What is minimum value can hold short?
   */
  short minValue() {
    return  Short.MIN_VALUE;
  }

  /**
   * What is maximum value can hold short?
   */
  short maxValue() {
    return Short.MAX_VALUE;
  }
}
