#!/usr/bin/env bash

_SELF="${0##*/}"

if [[ ! -d "docs" ]]; then
  echo "error: You are executing the script from wrong directory."
  echo "Move to the root project directory and use the following command: ./${_SELF}"
  exit 1
fi

# commands description: https://hub.docker.com/r/asciidoctor/docker-asciidoctor

for format in html pdf; do
  echo "Generating docs in ${format}..."
  cmd="asciidoctor" # for html format
  if [[ "${format}" == "pdf" ]]; then
    cmd="asciidoctor-pdf"
  fi
  docker run --rm \
    -v $(pwd)/docs:/documents/ \
    asciidoctor/docker-asciidoctor \
    ${cmd} index.adoc
done