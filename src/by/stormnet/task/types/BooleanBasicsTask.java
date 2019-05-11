package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class BooleanBasicsTask {

  /**
   * Как много значений может хранить/представлять тип boolean?
   */
  int possibleValuesCount() {
    return 2;
  }

  /**
   * Верните значение false.
   */
  boolean returnFalse() {
    return false;
  }

  /**
   * Верните значение true.
   */
  boolean returnTrue() {
    return true;
  }
}
