#!/bin/bash

COMPILE_OUT="compile-out"

rm -rf $COMPILE_OUT
mkdir $COMPILE_OUT

for sourceSet in "src" "test"; do
  javac \
    -classpath "$(find lib -name \*.jar | tr "\n" ":")$COMPILE_OUT" \
    -d $COMPILE_OUT \
    $(find $sourceSet -name \*.java)
done

java \
  -jar lib/junit-platform-console-standalone-1.4.0.jar \
  --class-path $COMPILE_OUT \
  --include-engine=junit-jupiter \
  --exclude-engine=junit-vintage \
  @tests.txt