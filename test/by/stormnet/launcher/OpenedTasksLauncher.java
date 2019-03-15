package by.stormnet.launcher;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.Stream;
import org.junit.platform.console.ConsoleLauncher;
import org.junit.platform.console.ConsoleLauncherExecutionResult;

public class OpenedTasksLauncher {

  public static void main(String[] args) {
    final List<String> launcherArgs = Stream.of(
        "--disable-banner",
        "--include-engine=junit-jupiter",
        "--exclude-engine=junit-vintage"
    ).collect(toList());

    OpenedTasks.classes.stream()
        .map(Class::getCanonicalName)
        .map(className -> "--select-class=" + className)
        .forEach(launcherArgs::add);

    OpenedTasks.packages.stream()
        .map(pkg -> "--select-package=" + pkg)
        .forEach(launcherArgs::add);

    System.out.println("Launcher args: " + launcherArgs);

    final ConsoleLauncherExecutionResult executionResult = ConsoleLauncher
        .execute(System.out, System.err, launcherArgs.toArray(new String[0]));
    System.exit(executionResult.getExitCode());
  }
}
