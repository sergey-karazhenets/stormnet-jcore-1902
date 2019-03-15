package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class BooleanBasicsTask {

  /**
   * Как много значений может хранить/представлять тип boolean?
   */
  int possibleValuesCount() {
    return  2;
  }

  /**
   * Верните значение false.
   */
  boolean returnFalse() {
    return (1>2);
  }

  /**
   * Верните значение true.
   */
  boolean returnTrue() {
    return (1<2);
  }
}
