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
    float var = x/y;
      if(var==Float.POSITIVE_INFINITY){
       return var=1;
    }
      if(var==Float.NEGATIVE_INFINITY) {
       return var = -1;
      }
      if(Float.isNaN(var)){
       return var = 0;
    }
      return var;
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
    double var = x/y;
    if(var==Double.POSITIVE_INFINITY){
      return var=1;
    }
    if(var==Double.NEGATIVE_INFINITY) {
      return var = -1;
    }
    if(Double.isNaN(var)) {
      return var = 0;
    }
    return var;
  }
  }

