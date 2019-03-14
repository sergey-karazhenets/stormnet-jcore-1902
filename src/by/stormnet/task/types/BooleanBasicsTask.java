package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class BooleanBasicsTask {

  /**
   * How many values can represent boolean type?
   */
  int possibleValuesCount() {
    return  2;
  }

  /**
   * Should return {@code false} value.
   */
  boolean returnFalse() {
    return (1>2);
  }

  /**
   * Should return {@code true} value.
   */
  boolean returnTrue() {
    return (1<2);
  }
}
