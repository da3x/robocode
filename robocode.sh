#!/bin/sh

pwd=`pwd`
cd "${0%/*}"
java -Xmx512M -cp libs/robocode.jar -XX:+IgnoreUnrecognizedVMOptions "--add-opens=java.base/sun.net.www.protocol.jar=ALL-UNNAMED" "--add-opens=java.base/java.lang.reflect=ALL-UNNAMED" "--add-opens=java.desktop/javax.swing.text=ALL-UNNAMED" "--add-opens=java.desktop/sun.awt=ALL-UNNAMED" robocode.Robocode -battle battles/Standard.battle $*
cd "${pwd}"
