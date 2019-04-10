package by.stormnet.task.exceptions;

import java.util.function.Supplier;

class ExceptionsTask {

  /**
   * В этой строке {@code return logic.get();} может возникнуть исключение IllegalStateException.
   * Сделайте обработку этого исключения таким образом, что:
   *  - если исключение не возникает, то возвращается результат вызова {@code logic.get()}.
   *  - если исключение возникает, то нужно возвратить число 0.
   */
  int handleException(Supplier<Integer> logic) {
    return logic.get();
  }

  /**
   * В этой строке {@code return logic.get();} может возникнуть
   * два исключения: IllegalStateException или IllegalArgumentException.
   * Сделайте обработку этих исключений таким образом, что:
   *  - если не возникает ни одного исключения, то возвращается результат вызова {@code logic.get()}.
   *  - если возникает IllegalStateException, то нужно возвратить число 0.
   *  - если возникает IllegalArgumentException, то нужно возвратить число 1.
   */
  int handleManyExceptions(Supplier<Integer> logic) {
    return logic.get();
  }

  /**
   * В этой строке {@code return logic.get();} может возникнуть
   * два исключения: IllegalStateException или IllegalArgumentException.
   * Сделайте обработку этих исключений таким образом, что:
   *  - если не возникает ни одного исключения, то возвращается результат вызова {@code logic.get()}.
   *  - если возникает IllegalStateException или IllegalArgumentException, то нужно возвратить число 0.
   */
  int handleManyExceptions1(Supplier<Integer> logic) {
    return logic.get();
  }

  /**
   * В этой строке {@code return logic.get();} может возникнуть исключение IllegalStateException.
   * Используя блок try/catch/finally, сделайте обработку этого исключения таким образом, что:
   *  - если исключение не возникает, то возвращается результат вызова {@code logic.get()}.
   *  - если исключение возникает, то нужно возвратить число 0.
   *  - в независимости от того возникло исключение или нет должен быть вызван метод {@code finallyLogic.run()}.
   */
  int tryCatchFinally(Supplier<Integer> logic, Runnable finallyLogic) {
    return logic.get();
  }

  /**
   * Напишите код так что:
   *  - если x больше нуля, то должно быть сгенерировано исключение IllegalArgumentException.
   *  - если x меньше либо равно нулю, то следует вернуть значение x.
   */
  int throwException(int x) {
    return 0;
  }
}
