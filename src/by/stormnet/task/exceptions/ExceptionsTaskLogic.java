package by.stormnet.task.exceptions;

import java.util.function.Supplier;

/**
 * Здесь не нужно ничего редактировать.
 * Смотрите задания в {@link ExceptionsTask}.
 */
class ExceptionsTaskLogic {

  private final Supplier<Integer> intValueSupplier;
  private final Supplier<Integer> recover1ValueSupplier;
  private final Supplier<Integer> recover2ValueSupplier;

  ExceptionsTaskLogic(
      Supplier<Integer> intValueSupplier,
      Supplier<Integer> recover1ValueSupplier,
      Supplier<Integer> recover2ValueSupplier) {
    this.intValueSupplier = intValueSupplier;
    this.recover1ValueSupplier = recover1ValueSupplier;
    this.recover2ValueSupplier = recover2ValueSupplier;
  }

  int calculateIntValue() {
    return intValueSupplier.get();
  }

  int recover1() {
    return recover1ValueSupplier.get();
  }

  int recover2() {
    return recover2ValueSupplier.get();
  }

  void doFinally() {
    // do nothing
  }
}
