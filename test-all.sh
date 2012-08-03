#!/bin/sh
DATABASES="mysql postgresql h2 hsql oracle"
for d in $DATABASES; do
    mvn clean test -P $d
done