package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class IncrementDecrementOperatorsTask {

  /**
   * Increment value using prefix form.
   */
  int incrementPrefixForm(int val) {
    int a = ++val;
    return a;
  }

  /**
   * Increment value using postfix form.
   */
  int incrementPostfixForm(int val) {
    int a = val++;
    return a;
  }

  /**
   * Decrement value using prefix form.
   */
  int decrementPrefixForm(int val) {
    int a = --val;
    return a;
  }

  /**
   * Decrement value using postfix form.
   */
  int decrementPostfixForm(int val) {
    int a = val--;
    return a;
  }
}
