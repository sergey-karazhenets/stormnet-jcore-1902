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
    return "byte, short, int, long, boolean, float, char, double";
  }

  /**
   * Названия всех запакованых примитивных типов, разделенные запятой.
   */
  String boxedPrimitiveTypes(){
    return "Byte, Short, Integer, Long, Boolean, Float, Character, Double ";
  }

  /**
   * Названия всех числовых и целочисленных примитивных типов, разделенные запятой.
   */
  String numericPrimitiveTypes() {
    return "byte, short, int, long, float, char";
  }

  /**
   * Названия всех вещественных примитивных типов, разделенные запятой.
   */
  String floatingPointNumericPrimitiveTypes() {
    return "byte, char, int, long, short";
  }

  /**
   * Название логического типа.
   */
  String logicalType() {
    return "boolean ";
  }

  /**
   * Название запакованного логического типа.
   */
  String boxedLogicalType() {
    return "Boolean";
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
    return "Void";
  }
}
