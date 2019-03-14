#!/bin/bash

_SELF="${0##*/}"

LAUNCHER_DIR="launcher"

if [[ ! -d "src" && ! -d "test" ]]; then
  echo "error: You are executing the launcher script from wrong directory."
  echo "Move to the root project directory and use the following command: ./${LAUNCHER_DIR}/${_SELF}"
  exit 1
fi

echo "Environment:"
echo "- javac" && javac -J-Xmx32m -version && echo
echo "- jvm" && java -Xmx32m -version && echo

COMPILE_OUT_DIR="compile-out"
LIB_DIR="lib"

rm -rf "${COMPILE_OUT_DIR}"
mkdir "${COMPILE_OUT_DIR}"

CLASSPATH="$(find "${LIB_DIR}" -name \*.jar | tr "\n" ":")${COMPILE_OUT_DIR}"

for sourceSet in src test; do
  javac \
    -classpath "${CLASSPATH}" \
    -d "${COMPILE_OUT_DIR}" \
    $(find "${sourceSet}" -name \*.java)
done

java \
  -jar "${LIB_DIR}/junit-platform-console-standalone-1.4.0.jar" \
  --class-path "${CLASSPATH}" \
  --disable-banner \
  --include-engine=junit-jupiter \
  --exclude-engine=junit-vintage \
  "@${LAUNCHER_DIR}/tests.txt"