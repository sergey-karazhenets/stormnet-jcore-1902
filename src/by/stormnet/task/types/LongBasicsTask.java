package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class LongBasicsTask {

    /**
     * Сколько бит в памяти занимает значение типа long?
     */
    int bitsInMemory() {
        return 64;
    }

    /**
     * Сколько байт в памяти занимает значение типа long?
     */
    int bytesInMemory() {
        return 8;
    }

    /**
     * Какое минимальное число можно присвоить переменной с типом long?
     */
    long minValue() {
        return 0x8000000000000000L;
    }

    /**
     * Какое максимальное число можно присвоить переменной с типом long?
     */
    long maxValue() {
        return 0x7fffffffffffffffL;
    }
}
