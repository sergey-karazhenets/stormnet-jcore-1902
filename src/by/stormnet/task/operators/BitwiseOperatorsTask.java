package by.stormnet.task.operators;

import by.stormnet.task.TaskNotImplementedException;

class BitwiseOperatorsTask {

    /**
     * Bitwise operators separated by the comma.
     */
    String operators() {
        return "&,^,~,|, <<, >>, >>>";
    }

    /**
     * Set the third bit of the byte to zero using 'and' operator.
     * Bits count starts from 0.
     */
    int setThirdBitToZeroUsingAnd(byte b) {
        int a = b & ~(1 << 3);
        return a;
    }

    /**
     * Set the third bit of the byte to one using 'or' operator.
     * Bits count starts from 0.
     */
    int setThirdBitToOneUsingOr(byte b) {
        int a = b | (1 << 3);
        return a;
    }

    /**
     * Invert of the third bit of the byte using 'xor' operator.
     * Bits count starts from 0.
     */
    int invertThirdBitUsingXor(byte b) {
        int a = b ^ (1 << 3);
        return a;
    }

    /**
     * Invert all bits of the byte using 'not' operator.
     */
    int invertAllBitsUsingNot(byte b) {
        int a = ~b;
        return a;
    }

    /**
     * Shift zero bit of the byte on the 4 positions left
     * using 'left shift' operator.
     */
    int shiftZeroBit4Left(byte b) {
        int a = b << 4;
        return a;
    }
}
