package by.stormnet.task.types;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static by.stormnet.TestFunctions.splitByComma;

import java.util.List;
import org.junit.jupiter.api.Test;

class AboutTypesTaskTest {

  private final AboutTypesTask task = new AboutTypesTask();

  @Test
  void primitiveTypesCount() {
    assertThat(task.primitiveTypesCount(), equalTo(8));
  }

  @Test
  @SuppressWarnings("unchecked")
  void primitiveTypes() {
    final List<String> types = splitByComma(task.primitiveTypes());
    assertThat(types, hasSize(8));
    assertThat(types, allOf(
        hasItem("boolean"),
        hasItem("byte"),
        hasItem("char"),
        hasItem("short"),
        hasItem("int"),
        hasItem("long"),
        hasItem("float"),
        hasItem("double")
    ));
  }

  @Test
  @SuppressWarnings("unchecked")
  void boxedPrimitiveTypes() {
    final List<String> types = splitByComma(task.boxedPrimitiveTypes());
    assertThat(types, hasSize(8));
    assertThat(types, allOf(
        hasItem(Boolean.class.getCanonicalName()),
        hasItem(Byte.class.getCanonicalName()),
        hasItem(Character.class.getCanonicalName()),
        hasItem(Short.class.getCanonicalName()),
        hasItem(Integer.class.getCanonicalName()),
        hasItem(Long.class.getCanonicalName()),
        hasItem(Float.class.getCanonicalName()),
        hasItem(Double.class.getCanonicalName())
    ));
  }

  @Test
  void numericPrimitiveTypes() {
    final List<String> types = splitByComma(task.numericPrimitiveTypes());
    assertThat(types, hasSize(5));
    assertThat(types, allOf(
        hasItem("byte"),
        hasItem("char"),
        hasItem("short"),
        hasItem("int"),
        hasItem("long")
    ));
  }

  @Test
  void floatingPointNumericPrimitiveTypes() {
    final List<String> types = splitByComma(task.floatingPointNumericPrimitiveTypes());
    assertThat(types, hasSize(2));
    assertThat(types, allOf(
        hasItem("float"),
        hasItem("double")
    ));
  }

  @Test
  void logicalType() {
    final String type = task.logicalType();
    assertThat(type, notNullValue());
    assertThat(type.trim(), equalTo("boolean"));
  }

  @Test
  void boxedLogicalType() {
    final String type = task.boxedLogicalType();
    assertThat(type, notNullValue());
    assertThat(type.trim(), equalTo(Boolean.class.getCanonicalName()));
  }

  @Test
  void nothingType() {
    final String type = task.nothingType();
    assertThat(type, notNullValue());
    assertThat(type.trim(), equalTo("void"));
  }

  @Test
  void boxedNothingType() {
    final String type = task.boxedNothingType();
    assertThat(type, notNullValue());
    assertThat(type.trim(), equalTo(Void.class.getCanonicalName()));
  }
}