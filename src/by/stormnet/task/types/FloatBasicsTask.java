package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class FloatBasicsTask {

  /**
   * Сколько бит в памяти занимает значение типа float?
   */
  int bitsInMemory() {
    return 4*8;
  }

  /**
   * Сколько байт в памяти занимает значение типа float?
   */
  int bytesInMemory() {
    return 4;
  }

  /**
   * Какое минимальное число можно присвоить переменной с типом float?
   */
  float minValue() {
    return  Float.MIN_VALUE;
  }

  /**
   * Какое максимальное число можно присвоить переменной с типом float?
   */
  float maxValue() {
    return Float.MAX_VALUE;
  }

  /**
   * Значение float, которое описывает положительную бесконечность.
   */
  float positiveInfinity() {
    return Float.POSITIVE_INFINITY;
  }

  /**
   * Значение float, которое описывает отрицательную бесконечность.
   */
  float negativeInfinity() {
    return Float.NEGATIVE_INFINITY;
  }

  /**
   * Значение float, которое описывает не число (NaN).
   */
  float nan() {
    return 0.0f/0.0f;
  }
}
