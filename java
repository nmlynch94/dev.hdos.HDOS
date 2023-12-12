#!/bin/bash
# Simply remove the --add-opens arg to allow running on java 17. Could also escape properly but this is just a proof of concept"
/app/jre/bin/java.bk $(echo "$@" | sed 's|--add-opens java.desktop/java.awt=ALL-UNNAMED||g')
