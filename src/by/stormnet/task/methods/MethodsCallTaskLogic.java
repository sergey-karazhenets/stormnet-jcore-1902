package by.stormnet.task.methods;

import by.stormnet.task.TaskNotImplementedException;

class MethodsCallTaskLogic {

  void doNothing() {
   // System.out.println(1);
  }

  String concatStrings(String str1, String str2) {
    String res = str1.concat(str2);
    return res;
  }
}
