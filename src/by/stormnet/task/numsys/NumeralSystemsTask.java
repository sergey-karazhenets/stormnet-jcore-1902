package by.stormnet.task.numsys;

import by.stormnet.task.TaskNotImplementedException;

class NumeralSystemsTask {

  /**
   * What's the base of the decimal numeral system?
   */
  String decimalSystemBase() {
    return "10";
  }

  /**
   * How many digits contains the decimal numeral system?
   */
  int decimalSystemDigitsCount() {
    return 10;
  }

  /**
   * What's the base of the binary numeral system?
   */
  String binarySystemBase() {
    return "2";
  }

  /**
   * How many digits contains the binary numeral system?
   */
  int binarySystemDigitsCount() {
    return 2;
  }

  /**
   * What's the base of the quinary numeral system?
   */
  String quinarySystemBase() {
    return "5";
  }

  /**
   * How many digits contains the quinary numeral system?
   */
  int quinarySystemDigitsCount() {
    return 5;
  }

  /**
   * What's the base of the octal numeral system?
   */
  String octalSystemBase() {
    return "8";
  }

  /**
   * How many digits contains the octal numeral system?
   */
  int octalSystemDigitsCount() {
    return 8;
  }

  /**
   * What's the base of the hexadecimal numeral system?
   */
  String hexadecimalSystemBase() {
    return "16";
  }

  /**
   * How many digits contains the hexadecimal numeral system?
   */
  int hexadecimalSystemDigitsCount() {
    return 16;
  }

  /**
   * How will look the number 9 in the decimal numeral system?
   */
  String decimalSystem9() {
    return "9";
  }

  /**
   * How will look the number 10 in the decimal numeral system?
   */
  String decimalSystem10() {
    return "10";
  }

  /**
   * How will look the number 1 in the binary numeral system?
   */
  String binarySystem1() {
    return "1";
  }

  /**
   * How will look the number 2 in the binary numeral system?
   */
  String binarySystem2() {
    return "10";
  }

  /**
   * How will look the number 7 in the octal numeral system?
   */
  String octalSystem7() {
    return "7";
  }

  /**
   * How will look the number 8 in the octal numeral system?
   */
  String octalSystem8() {
    return "10";
  }

  /**
   * How will look the number 15 in the hexadecimal numeral system?
   */
  String hexadecimalSystem15() {
    return "F";
  }

  /**
   * How will look the number 16 in the hexadecimal numeral system?
   */
  String hexadecimalSystem16() {
    return "10";
  }

  /**
   * How will look the number 434 in the decimal numeral system?
   */
  String decimalSystem434() {
    return "434";
  }

  /**
   * How will look the number 434 in the binary numeral system?
   */
  String binarySystem434() {
    return "110110010";
  }

  /**
   * How will look the number 434 in the octal numeral system?
   */
  String octalSystem434() {
    return "662";
  }

  /**
   *
   */
  String hexadecimalSystem434() {
    return "1B2";
  }

  /**
   * What's number 10011101 in decimal numeral system?
   */
  int binaryToDecimal() {
    return 157;
  }

  /**
   * What's number 4371 in decimal numeral system?
   */
  int octalToDecimal() {
    double x;
    x=4*Math.pow(8,3)+3*Math.pow(8,2)+7*Math.pow(8,1)+1*Math.pow(8,0);
    return (int) x;
  }

  /**
   * What's number 7FE3B in decimal numeral system?
   */
  int hexToDecimal() {
    double x;
    x=7*Math.pow(16,4)+15*Math.pow(16,3)+14*Math.pow(16,2)+3*Math.pow(16,1)+11*Math.pow(16,0);
    return (int) x;
  }
}