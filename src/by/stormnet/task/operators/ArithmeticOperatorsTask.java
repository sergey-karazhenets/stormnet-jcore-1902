package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class ArithmeticOperatorsTask {

  /**
   * Арифметические операторы, разделенные запятой.
   */
  String operators() {
    return "+" + ",-" + ",/" + ",*" + ",%";
  }

  /**
   * Сокрщенные формы арифметические операторы, разделенные запятой.
   */
  String operatorsShortForm() {
    return "+=,-=,/=,*=,%=";
  }

  /**
   * Сделайте суммирование двух чисел.
   */
  int plus(int a, int b) {
    return a + b;
  }

  /**
   * Сделайте суммирование трех чисел.
   */
  int plus(int a, int b, int c) {
    return a + b + c;
  }

  /**
   * Сделайте суммирование двух чисел, используя сокрщенную форму оператора суммы.
   */
  int plusShortForm(int a, int b) {
    return a += b;
  }

  /**
   * Сделайте вычитание двух чисел.
   */
  int minus(int a, int b) {
    return a - b;
  }

  /**
   * Сделайте вычитание трех чисел.
   */
  int minus(int a, int b, int c) {
    return a - b - c;
  }

  /**
   * Сделайте вычитание двух чисел, используя сокрщенную форму оператора вычитания.
   */
  int minusShortForm(int a, int b) {
    return a -= b;
  }

  /**
   * Сделайте умножение двух чисел.
   */
  int multiply(int a, int b) {
    return a * b;
  }

  /**
   * Сделайте умножение трех чисел.
   */
  int multiply(int a, int b, int c) {
    return  a * b * c;
  }

  /**
   * Сделайте вычитание двух чисел, используя сокрщенную форму оператора умножения.
   */
  int multiplyShortForm(int a, int b) {
    return a *= b;
  }

  /**
   * Сделайте деление двух чисел.
   */
  int divide(int a, int b) {
    return a / b;
  }

  /**
   * Сделайте деление трех чисел.
   */
  int divide(int a, int b, int c) {
    return a / b / c;
  }

  /**
   * Сделайте вычитание двух чисел, используя сокрщенную форму оператора деления.
   */
  int divideShortForm(int a, int b) {
    return a /= b;
  }

  /**
   * Вычислите остаток от деления числа a на b.
   */
  int modulus(int a, int b) {
    return a % b;
  }

  /**
   * Вычислите остаток от деления числа a на b, используя сокращенную форму оператора,
   * который позволяет получить остаток от деления двух чисел.
   */
  int modulusShortForm(int a, int b) {
    return a %= b;
  }
}
