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
    float a = x / y;
    float res;
    if (a == Float.POSITIVE_INFINITY) {
      res = 1;
    } else if (a == Float.NEGATIVE_INFINITY) {
      res = -1;
    } else if (Float.isNaN(a)) {
      res = 0;
    } else {
      res = a;
    }
      return res;
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
    double b = x / y;
    double res;
    if (b == Double.POSITIVE_INFINITY) {
      res = 1;
    } else if (b == Double.NEGATIVE_INFINITY) {
      res = -1;
    } else if (Double.isNaN(b)) {
      res = 0;
    } else {
      res = b;
    }
    return res;
  }
}
