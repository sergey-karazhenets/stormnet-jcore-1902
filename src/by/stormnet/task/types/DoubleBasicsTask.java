package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class DoubleBasicsTask {

  /**
   * How many bits in the memory is double occupy?
   */
  int bitsInMemory() {
    return 8*8;
  }

  /**
   * How many bytes in the memory is double occupy?
   */
  int bytesInMemory() {
    return 8;
  }

  /**
   * What is minimum value can hold double?
   */
  double minValue() {
    return Double.MIN_VALUE;
  }

  /**
   * What is maximum value can hold double?
   */
  double maxValue() {
    return Double.MAX_VALUE;
  }

  /**
   * Return positive infinity represented by double number.
   */
  double positiveInfinity() {
    return Double.POSITIVE_INFINITY;
  }

  /**
   * Return negative infinity represented by double number.
   */
  double negativeInfinity() {
    return Double.NEGATIVE_INFINITY;
  }

  /**
   * Return non a number (NaN) represented by double number.
   */
  double nan() {
    return Double.NaN;
  }
}
