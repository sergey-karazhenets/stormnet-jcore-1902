package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class DoubleBasicsTask {

  /**
   * Сколько бит в памяти занимает значение типа double?
   */
  int bitsInMemory() {
    return 64;
  }

  /**
   * Сколько байт в памяти занимает значение типа double?
   */
  int bytesInMemory() {
    return 8;
  }

  /**
   * Какое минимальное число можно присвоить переменной с типом double?
   */
  double minValue() {
    return Double.MIN_VALUE;
  }

  /**
   * Какое максимальное число можно присвоить переменной с типом double?
   */
  double maxValue() {
    return Double.MAX_VALUE;
  }

  /**
   * Значение double, которое описывает положительную бесконечность.
   */
  double positiveInfinity() {
    return Double.POSITIVE_INFINITY;
  }

  /**
   * Значение double, которое описывает отрицательную бесконечность.
   */
  double negativeInfinity() {
    return Double.NEGATIVE_INFINITY;
  }

  /**
   * Значение double, которое описывает не число (NaN).
   */
  double nan() {
    return Double.NaN;

  }
}
