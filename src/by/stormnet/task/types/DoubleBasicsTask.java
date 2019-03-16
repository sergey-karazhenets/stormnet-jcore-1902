package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class DoubleBasicsTask {

    /**
     * Сколько бит в памяти занимает значение типа double?
     */
    int bitsInMemory() {
        return 64;
    }

    /**
     * Сколько байт в памяти занимает значение типа double?
     */
    int bytesInMemory() {
        return 8;
    }

    /**
     * Какое минимальное число можно присвоить переменной с типом double?
     */
    double minValue() {
        return 0x0.0000000000001P-1022;
    }

    /**
     * Какое максимальное число можно присвоить переменной с типом double?
     */
    double maxValue() {
        return 0x1.fffffffffffffP+1023;
    }

    /**
     * Значение double, которое описывает положительную бесконечность.
     */
    double positiveInfinity() {
        return 1.0 / 0.0;
    }

    /**
     * Значение double, которое описывает отрицательную бесконечность.
     */
    double negativeInfinity() {
        return -1.0 / 0.0;
    }

    /**
     * Значение double, которое описывает не число (NaN).
     */
    double nan() {
        return 0.0d / 0.0;
    }
}
