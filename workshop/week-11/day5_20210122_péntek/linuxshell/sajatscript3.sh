#!/bin/bash

#végtelen ciklus

while true  
do
    read -p "Írjon be egy sort:" line
    #ha nem üres a beolvasott sor, kilépek a ciklusból
    if [ -n "$line" ]
    then
    logger "napló bejegyzés"
        break
    fi
done