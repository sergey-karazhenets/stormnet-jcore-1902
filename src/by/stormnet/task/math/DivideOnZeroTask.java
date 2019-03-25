package by.stormnet.task.math;

import by.stormnet.task.TaskNotImplementedException;

class DivideOnZeroTask {

  /**
   * Выполнитие деление чисел x на y типа float.
   * Если результат от деления равен:
   * - положительный бесконечности, то в качестве ответа верните 1.
   * - отрицательной бесконечности, то в качестве ответа верните -1.
   * - не числу (NaN), то в качестве ответа верните 0.
   * - иначе верните получившийся результат от деления.
   */
  float floatDivide(float x, float y) {
    float i = x / y;
    if (i == Float.POSITIVE_INFINITY) {
      return 1;
    } else if (i == Float.NEGATIVE_INFINITY) {
      return -1;
    } else if (Float.isNaN(i)) {
      return 0;
    } else {
      return i;
    }
  }


  /**
   * Выполнитие деление чисел x на y типа double.
   * Если результат от деления равен:
   * - положительный бесконечности, то в качестве ответа верните 1.
   * - отрицательной бесконечности, то в качестве ответа верните -1.
   * - не числу (NaN), то в качестве ответа верните 0.
   * - иначе верните получившийся результат от деления.
   */
  double doubleDivide(double x, double y) {
    double i = x / y;
    if (i == Double.POSITIVE_INFINITY) {
      return 1;
    } else if (i == Double.NEGATIVE_INFINITY) {
      return -1;
    } else if (Double.isNaN(i)) {
      return 0;
    } else {
      return i;
    }
  }
}
