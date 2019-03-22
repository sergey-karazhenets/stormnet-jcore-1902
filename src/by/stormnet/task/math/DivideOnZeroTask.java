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
        if (x/y==Float.POSITIVE_INFINITY){
      return 1;
    }else if (x/y==Float.NEGATIVE_INFINITY){
      return -1;
    }else if (Float.isNaN(x/y)){
      return 0;
    }else return x/y;

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
    if (x/y==Double.POSITIVE_INFINITY){
      return 1;
    }else if (x/y==Double.NEGATIVE_INFINITY){
      return -1;
    }else if (Double.isNaN(x/y)){
      return 0;
    }else return x/y;
  }
}
