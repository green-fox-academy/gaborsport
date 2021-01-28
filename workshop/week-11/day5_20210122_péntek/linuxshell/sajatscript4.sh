#!/bin/bash

echo "[O]lvas"
echo "[H]ozzáfűz"
echo "[S]zerkeszt"

read menupont

case "$menupont" in
    "O" | "o" )
echo "Olvasási műveletek"
    ;;
    "H" | "h" )
echo "Hozzáfűzési műveletek"
for i in alma körte dió eper
do  
    echo $i
done
    ;;
    "S" | "s" )
echo "Szerkesztési műveletek"
setlocal EnableDelayedExpansion
for i in seq 1 10
do  
    echo $i
done
    ;;
esac







