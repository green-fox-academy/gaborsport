#!/bin/bash

#DATUM=$(date +%F)
#mkdir -p /tanf/${DATUM}webserver
#ls -l /tanf

if [ $1 -lt 0 ]   #(test $1 -lt 0)
then
    echo "A megadott paraméter negatív"
    exit 0
elif [ $1 -gt 0 ]; then
    echo "A megadott paraméter pozitív"
    exit 0
else    
    echo "A megadott paraméter 0"
    exit 0
fi
exit 0

