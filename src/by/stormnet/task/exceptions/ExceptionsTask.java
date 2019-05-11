package by.stormnet.task.exceptions;

import by.stormnet.task.TaskNotImplementedException;

class ExceptionsTask {

  /**
   * На вход в метод приходит объект типа ExceptionsTaskLogic.
   * У него есть методы calculateIntValue и recover1.
   * <p>
   * Сделайте вызов метода calculateIntValue и верните полученное значение в качестве ответа на задание.
   * <p>
   * При этом учтите, что метод calculateIntValue может выбрасывать исключение IllegalStateException.
   * <p>
   * Поэтому дополнительно нужно сделать обработку исключения, и в случае, если оно возникает, то
   * следует вызвать метод recover1 и результат вернуть в качестве ответа на задание.
   */
  int handleException(ExceptionsTaskLogic logic) {
    int res;
    try {
      res = logic.calculateIntValue();
    } catch (IllegalStateException ex) {
      res = logic.recover1();
    }
    return res;
  }




  /**
   * На вход в метод приходит объект типа ExceptionsTaskLogic.
   * У него есть методы calculateIntValue, recover1 и recover2.
   *
   * Сделайте вызов метода calculateIntValue и верните полученное значение в качестве ответа на задание.
   *
   * При этом учтите, что метод calculateIntValue может выбрасывать одно из исключений:
   * IllegalStateException или IllegalArgumentException.
   *
   * Поэтому дополнительно нужно сделать обработку обоих исключений.
   * В случае, если возникает исключение:
   *  - IllegalStateException, то следует вызвать метод recover1 и результат вернуть в качестве ответа на задание.
   *  - IllegalArgumentException, то следует вызвать метод recover2 и результат вернуть в качестве ответа на задание.
   */
  int handleManyExceptions(ExceptionsTaskLogic logic) {
    int res;
    try {
      res = logic.calculateIntValue();
    } catch (IllegalStateException ex){
      res = logic.recover1();
    } catch (IllegalArgumentException ex){
      res = logic.recover2();
    }
    return res;
  }

  /**
   * На вход в метод приходит объект типа ExceptionsTaskLogic.
   * У него есть методы calculateIntValue, recover1 и recover2.
   *
   * Сделайте вызов метода calculateIntValue и верните полученное значение в качестве ответа на задание.
   *
   * При этом учтите, что метод calculateIntValue может выбрасывать одно из исключений:
   * IllegalStateException или IllegalArgumentException.
   *
   * Поэтому дополнительно нужно сделать обработку обоих исключений.
   * При возникновении любого из исключений в качестве ответа на задание
   * нужно вернуть сумму результатов вызова методов recover1 и recover2.
   *
   * Для обработки обоих исключений используйте только один блок catch.
   */
  int handleManyExceptions1(ExceptionsTaskLogic logic) {
    int res;
    try {
      res = logic.calculateIntValue();
    } catch (IllegalStateException | IllegalArgumentException ex) {
      res = logic.recover1() + logic.recover2();
    }
    return res;
  }

  /**
   * На вход в метод приходит объект типа ExceptionsTaskLogic.
   * У него есть методы calculateIntValue, recover1 и doFinally.
   *
   * Сделайте вызов метода calculateIntValue и верните полученное значение в качестве ответа на задание.
   *
   * При этом учтите, что метод calculateIntValue может выбрасывать исключение IllegalStateException.
   *
   * Поэтому дополнительно нужно сделать обработку исключения, и в случае, если оно возникает, то
   * следует вызвать метод recover1 и результат вернуть в качестве ответа на задание.
   *
   * Также в независимости от того возникло исключение или нет нужно делать вызов метода doFinally.
   */
  int handleExceptionWithFinally(ExceptionsTaskLogic logic) {
    int res;
    try {
      res = logic.calculateIntValue();
    } catch (IllegalStateException ex){
      res = logic.recover1();
    } finally {
      logic.doFinally();
    }
    return res;
  }

  /**
   * Напишите код так что:
   *  - если x больше нуля, то должно быть сгенерировано исключение IllegalArgumentException,
   *  - иначе следует вернуть значение x в качестве ответа на задание.
   */
  int throwException(int x) {
       if (x > 0) {
      throw new IllegalArgumentException();
    } else return x;
  }

  /**
   * Напишите код так что:
   *  - если x больше нуля, то должно быть сгенерировано исключение IllegalArgumentException
   *    с сообщением об ошибке "Invalid value",
   *  - иначе следует вернуть значение x в качестве ответа на задание.
   */
  int throwExceptionWithMessage(int x) {
    if (x > 0) {
      throw new IllegalArgumentException("Invalid value");
    } else return x;
  }
}
