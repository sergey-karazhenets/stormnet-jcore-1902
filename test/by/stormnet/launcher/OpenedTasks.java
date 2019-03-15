package by.stormnet.launcher;

import by.stormnet.task.arrays.ArraysTaskTest;
import by.stormnet.task.conditionals.IfElseTaskTest;
import by.stormnet.task.conditionals.SwitchTaskTest;
import by.stormnet.task.loops.DoWhileLoopTaskTest;
import by.stormnet.task.loops.ForLoopTaskTest;
import by.stormnet.task.loops.WhileLoopTaskTest;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface OpenedTasks {

  List<Class> classes = Stream.of(
      IfElseTaskTest.class,
      SwitchTaskTest.class,
      DoWhileLoopTaskTest.class,
      ForLoopTaskTest.class,
      WhileLoopTaskTest.class,
      ArraysTaskTest.class
  ).collect(Collectors.toList());
  
  List<String> packages = Collections.emptyList();
}
