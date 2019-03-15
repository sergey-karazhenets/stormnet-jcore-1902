package by.stormnet.launcher;

import java.util.Collections;
import java.util.List;

public interface OpenedTasks {

  List<Class> classes = Collections.emptyList();
  List<String> packages = Collections.singletonList("by.stormnet.task.types");
}
