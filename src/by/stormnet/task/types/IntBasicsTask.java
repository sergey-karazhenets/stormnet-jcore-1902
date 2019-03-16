package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class IntBasicsTask {

    /**
     * Сколько бит в памяти занимает значение типа int?
     */
    int bitsInMemory() {
        return 32;
    }

    /**
     * Сколько байт в памяти занимает значение типа int?
     */
    int bytesInMemory() {
        return 4;
    }

    /**
     * Какое минимальное число можно присвоить переменной с типом int?
     */
    int minValue() {
        return -2147483648;
    }

    /**
     * Какое максимальное число можно присвоить переменной с типом int?
     */
    int maxValue() {
        return 2147483647;
    }
}
