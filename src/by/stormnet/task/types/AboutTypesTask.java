package by.stormnet.task.types;

import by.stormnet.task.TaskNotImplementedException;

class AboutTypesTask {

  /**
   * How many primitive types exist in Java?
   */
  int primitiveTypesCount() {
    return 8;
  }

  /**
   * Names of all primitive types separated by the comma.
   */
  String primitiveTypes() {
    return "int,double,char,float,byte,short,long,boolean";
  }

  /**
   * Names of all boxed primitive types separated by the comma.
   */
  String boxedPrimitiveTypes() {
    return "java.lang.Integer,java.lang.Double,java.lang.Character,java.lang.Float,java.lang.Byte,java.lang.Short,java.lang.Long,java.lang.Boolean";
  }

  /**
   * Names of all numeric primitive types separated by the comma.
   */
  String numericPrimitiveTypes() {
    return "short,int,long,byte,char";
  }

  /**
   * Names of all floating-point numeric primitive types separated by the comma.
   */
  String floatingPointNumericPrimitiveTypes() {
    return "float,double";
  }

  /**
   * Name of the logical type.
   */
  String logicalType() {
    return "boolean";
  }

  /**
   * Name of the boxed logical type.
   */
  String boxedLogicalType() {
    return "java.lang.Boolean";
  }

  /**
   * What's the name of the type which represents nothing?
   */
  String nothingType() {
    return "void";
  }

  /**
   * What's the name of the boxed type which represents nothing?
   */
  String boxedNothingType() {
    return "java.lang.Void";
  }
}
