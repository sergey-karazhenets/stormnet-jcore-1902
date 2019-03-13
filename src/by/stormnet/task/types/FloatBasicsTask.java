package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class FloatBasicsTask {

  /**
   * How many bits in the memory is float occupy?
   */
  int bitsInMemory() {
    return 32;
  }

  /**
   * How many bytes in the memory is float occupy?
   */
  int bytesInMemory() {
    return 4;
  }

  /**
   * What is minimum value can hold float?
   */
  float minValue() {
    return Float.MIN_VALUE;
  }

  /**
   * What is maximum value can hold float?
   */
  float maxValue() {
    return Float.MAX_VALUE;
  }

  /**
   * Return positive infinity represented by float number.
   */
  float positiveInfinity() {
    return Float.POSITIVE_INFINITY;
  }

  /**
   * Return negative infinity represented by float number.
   */
  float negativeInfinity() {
    return Float.NEGATIVE_INFINITY;
  }

  /**
   * Return non a number (NaN) represented by float number.
   */
  float nan() {
    return Float.NaN;
  }
}
