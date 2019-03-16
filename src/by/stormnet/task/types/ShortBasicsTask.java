package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class ShortBasicsTask {

    /**
     * Сколько бит в памяти занимает значение типа short?
     */
    int bitsInMemory() {
        return 16;
    }

    /**
     * Сколько байт в памяти занимает значение типа short?
     */
    int bytesInMemory() {
        return 2;
    }

    /**
     * Какое минимальное число можно присвоить переменной с типом short?
     */
    short minValue() {
        return -32768;
    }

    /**
     * Какое максимальное число можно присвоить переменной с типом short?
     */
    short maxValue() {
        return 32767;
    }
}
