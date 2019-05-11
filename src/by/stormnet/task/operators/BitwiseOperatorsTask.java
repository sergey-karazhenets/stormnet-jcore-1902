package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class BitwiseOperatorsTask {

  /**
   * Bitwise operators separated by the comma.
   */
  String operators() {
    return "&, |, ^, ~, >>, <<, >>>";
  }

  /**
   * Set the third bit of the byte to zero using 'and' operator.
   * Bits count starts from 0.
   */
  int setThirdBitToZeroUsingAnd(byte b) {
    return b&~(1<<3);
  }

  /**
   * Set the third bit of the byte to one using 'or' operator.
   * Bits count starts from 0.
   */
  int setThirdBitToOneUsingOr(byte b) {
    return b|=(1<<3);
  }

  /**
   * Invert of the third bit of the byte using 'xor' operator.
   * Bits count starts from 0.
   */
  int invertThirdBitUsingXor(byte b) {
    return b^(1<<3);
  }

  /**
   * Invert all bits of the byte using 'not' operator.
   */
  int invertAllBitsUsingNot(byte b) {
    return ~b;
  }

  /**
   * Shift zero bit of the byte on the 4 positions left
   * using 'left shift' operator.
   */
  int shiftZeroBit4Left(byte b) {
    return b<<4;
  }
}
