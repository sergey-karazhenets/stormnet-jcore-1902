package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class IncrementDecrementOperatorsTask {

  /**
   * Increment value using prefix form.
   */
  int incrementPrefixForm(int val) {
    return ++val;
  }

  /**
   * Increment value using postfix form.
   */
  int incrementPostfixForm(int val) {
    return val++;
  }

  /**
   * Decrement value using prefix form.
   */
  int decrementPrefixForm(int val) {
    return --val;
  }

  /**
   * Decrement value using postfix form.
   */
  int decrementPostfixForm(int val) {
    return val--;
  }
}
