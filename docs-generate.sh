#!/usr/bin/env bash

# commands description: https://hub.docker.com/r/asciidoctor/docker-asciidoctor

for format in html pdf; do
  echo "Generating docs in ${format}..."
  cmd="asciidoctor" # for html format
  if [[ "${format}" == "pdf" ]]; then
    cmd="asciidoctor-pdf"
  fi
  docker run --rm \
    -v $(pwd):/documents/ \
    asciidoctor/docker-asciidoctor \
    ${cmd} index.adoc
done