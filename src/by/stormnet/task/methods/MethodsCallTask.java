package by.stormnet.task.methods;

import by.stormnet.task.TaskNotImplementedException;

class MethodsCallTask {

  /**
   * В этом классе есть метод doNothingLogic.
   * Сделайте вызов метода doNothingLogic из текущего метода.
   */
  void doNothing() {

    doNothingLogic();
  }

  void doNothingLogic() {
    // do nothing
  }

  /**
   * В этом классе есть метод concatStringsLogic, который на вход принимает две строки.
   * Реализуйте в методе concatStringsLogic логику конкатенации двух строк.
   *
   * Затем из текущего метода сделайте вызов метода concatStringsLogic и в качестве
   * ответа на задание верните результат работы метода concatStringsLogic.
   */
  String concatStrings(String str1, String str2) {

   String b =concatStringsLogic(str1, str2);
   return b;
  }

  String concatStringsLogic(String str1, String str2) {
    String b = str1+str2;
    return b;
  }

  /**
   * На вход в метод приходит объект типа MethodsCallTaskLogic.
   * У него есть метод doNothing.
   *
   * Из текущего метода сделайте вызов метода doNothing из класса MethodsCallTaskLogic.
   */
  void doNothingFromAnotherClass(MethodsCallTaskLogic logic) {
    logic.doNothing();
  }

  /**
   * На вход в метод приходит объект типа MethodsCallTaskLogic.
   * У него есть метод concatStrings.
   * Реализуйте метод concatStrings в классе MethodsCallTaskLogic, чтобы
   * метод возвращал результат конкатенации двух строк.
   *
   * В текущем методе сделайте вызов метода concatStrings из класса MethodsCallTaskLogic
   * и в качестве ответа на задание верните результат вызова метода.
   */
  String concatStringsFromAnotherClass(MethodsCallTaskLogic logic, String str1, String str2) {
   String b= logic.concatStrings(str1, str2);
   return b;
  }
}
