package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class LogicalOperatorsTask {

  /**
   * Write an expression for test that {@code a} is not equal to 0
   * and {@code b} is greater than 3.
   */
  boolean testAndOperator(int a, int b) {
    return (a!=0&b>3);
  }

  /**
   * Write an expression for test that {@code a} is equal to 0
   * or {@code b} is not equal to 3.
   */
  boolean testOrOperator(int a, int b) {
    return (a==0|b!=3);
  }

  /**
   * Use ternary operator and write an expression
   * that returns sum of {@code a} and {@code b}
   * if {@code value} is greater or equal to 1,
   * otherwise returns 0.
   */
  int testTernaryOperator(int value, int a, int b) {
    return (value>=1?a+b:0);
  }
}
