package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class ArithmeticOperatorsTask {

  /**
   * Arithmetic operators separated by the comma.
   */
  String operators() {
    return "+,-,*,/,%";
  }

  /**
   * Short form of all arithmetic operators separated by the comma.
   */
  String operatorsShortForm() {
    return "+=,-=,/=,%=,*=";
  }

  /**
   * Sum numbers.
   */
  int plus(int a, int b) {
    return a+b;
  }

  /**
   * Sum numbers.
   */
  int plus(int a, int b, int c) {
    return a+b+c;
  }

  /**
   * Sum numbers using short form operator.
   */
  int plusShortForm(int a, int b) {
    return a+=b;
  }

  /**
   * Subtract numbers.
   */
  int minus(int a, int b) {
    return a-b;
  }

  /**
   * Subtract numbers.
   */
  int minus(int a, int b, int c) {
    return a-b-c;
  }

  /**
   * Subtract numbers using short form operator.
   */
  int minusShortForm(int a, int b) {
    return a-=b;
  }

  /**
   * Multiply numbers.
   */
  int multiply(int a, int b) {
    return a*b;
  }

  /**
   * Multiply numbers.
   */
  int multiply(int a, int b, int c) {
    return a*b*c;
  }

  /**
   * Multiply numbers using short form operator.
   */
  int multiplyShortForm(int a, int b) {
    return a*b;
  }

  /**
   * Divide numbers.
   */
  int divide(int a, int b) {
    return a/b;
  }

  /**
   * Divide numbers.
   */
  int divide(int a, int b, int c) {
    return a/b/c;
  }

  /**
   * Divide numbers using short form operator.
   */
  int divideShortForm(int a, int b) {
    return a/=b;
  }

  /**
   * Calculate modulus of the numbers division.
   */
  int modulus(int a, int b) {
    return a%b;
  }

  /**
   * Calculate modulus of the numbers division using short form operator.
   */
  int modulusShortForm(int a, int b) {
    return a%=b;
  }
}