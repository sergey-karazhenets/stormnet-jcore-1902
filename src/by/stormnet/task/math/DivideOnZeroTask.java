package by.stormnet.task.math;

import by.stormnet.task.TaskNotImplementedException;

class DivideOnZeroTask {

  /**
   * Выполнитие деление чисел x на y типа float.
   * Если результат от деления равен:
   *  - положительный бесконечности, то в качестве ответа верните 1.
   *  - отрицательной бесконечности, то в качестве ответа верните -1.
   *  - не числу (NaN), то в качестве ответа верните 0.
   *  - иначе верните получившийся результат от деления.
   */
  float floatDivide(float x, float y) {
    float d = x / y;
    if (d == Float.POSITIVE_INFINITY) {
      return 1;
    } else if (d == Float.NEGATIVE_INFINITY) {
      return -1;
    } else if (d != Float.NaN) {
      return 0;
    } else {
      return d;
    }
  }

  /**
   * Выполнитие деление чисел x на y типа double.
   * Если результат от деления равен:
   *  - положительный бесконечности, то в качестве ответа верните 1.
   *  - отрицательной бесконечности, то в качестве ответа верните -1.
   *  - не числу (NaN), то в качестве ответа верните 0.
   *  - иначе верните получившийся результат от деления.
   */
  double doubleDivide(double x, double y) {
    double v = x / y;
    if (v == Double.POSITIVE_INFINITY) {
      return 1;
    } else if (v == Double.NEGATIVE_INFINITY) {
      return -1;
    } else if (v != Double.NaN) {
      return 0;
    } else {
      return v;
    }
  }
}