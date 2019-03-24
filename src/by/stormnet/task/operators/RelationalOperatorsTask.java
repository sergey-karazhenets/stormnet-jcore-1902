package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class RelationalOperatorsTask {

  /**
   * Relational operators separated by the comma.
   */
  String operators() {
    return "==,!=,>,<,>=,<=";
  }

  /**
   * Test that two numbers are equal using 'equal' relational operator.
   */
  boolean testEqual(int a, int b) {
    return a == b;
  }

  /**
   * Test that two numbers aren't equal using 'not equal' relational operator.
   */
  boolean testNotEqual(int a, int b) {
    return a != b;
  }

  /**
   * Test that {@code a} number is less than {@code b} number.
   */
  boolean testLessThan(int a, int b) {
    return a < b;
  }

  /**
   * Test that {@code a} number is greater than {@code b} number.
   */
  boolean testGreaterThan(int a, int b) {
    return a > b;
  }

  /**
   * Test that {@code a} number is less or equal to {@code b} number.
   */
  boolean testLessOrEqualThan(int a, int b) {
    return a <= b;
  }

  /**
   * Test that {@code a} number is greater or equal to {@code b} number.
   */
  boolean testGreaterOrEqualThan(int a, int b) {
    return a >= b;
  }
}
