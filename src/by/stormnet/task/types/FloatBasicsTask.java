package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class FloatBasicsTask {

    /**
     * Сколько бит в памяти занимает значение типа float?
     */
    int bitsInMemory() {
        return 32;
    }

    /**
     * Сколько байт в памяти занимает значение типа float?
     */
    int bytesInMemory() {
        return 4;
    }

    /**
     * Какое минимальное число можно присвоить переменной с типом float?
     */
    float minValue() {
        return 0x0.000002P-126f;
    }

    /**
     * Какое максимальное число можно присвоить переменной с типом float?
     */
    float maxValue() {
        return 0x1.fffffeP+127f;
    }

    /**
     * Значение float, которое описывает положительную бесконечность.
     */
    float positiveInfinity() {
        return 1.0f / 0.0f;
    }

    /**
     * Значение float, которое описывает отрицательную бесконечность.
     */
    float negativeInfinity() {
        return -1.0f / 0.0f;
    }

    /**
     * Значение float, которое описывает не число (NaN).
     */
    float nan() {
        return 0.0f / 0.0f;
    }
}
