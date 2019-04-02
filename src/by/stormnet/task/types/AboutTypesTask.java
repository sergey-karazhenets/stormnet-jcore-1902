package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class AboutTypesTask {

  /**
   * Сколько примитивных типов существует в Java?
   */
  int primitiveTypesCount() {
    return 8;
  }

  /**
   * Названия всех примитивных типов, разделенные запятой.
   */
  String primitiveTypes() {
    return "boolean, char, byte, short, int, double, float, long";
  }

  /**
   * Названия всех запакованых примитивных типов, разделенные запятой.
   */
  String boxedPrimitiveTypes() {
    return "java.lang.Integer,java.lang.Double,java.lang.Character,java.lang.Float,java.lang.Byte,java.lang.Short,java.lang.Long,java.lang.Boolean";
  }

  /**
   * Названия всех числовых и целочисленных примитивных типов, разделенные запятой.
   */
  String numericPrimitiveTypes() {
    return "byte, short, int, long, char";
  }

  /**
   * Названия всех вещественных примитивных типов, разделенные запятой.
   */
  String floatingPointNumericPrimitiveTypes() {
    return "double, float";
  }

  /**
   * Название логического типа.
   */
  String logicalType() {
    return "boolean";
  }

  /**
   * Название запакованного логического типа.
   */
  String boxedLogicalType() {
    return "java.lang.Boolean";
  }

  /**
   * Название типа, который не может хранить данные и обозначает, что метод ничего не возвращает.
   */
  String nothingType() {
    return "void";
  }

  /**
   * Название запакованного типа, который не может хранить данные и обозначает, что метод ничего не возвращает.
   */
  String boxedNothingType() {
    return "java.lang.Void";
  }
}
