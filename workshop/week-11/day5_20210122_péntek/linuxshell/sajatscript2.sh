#!/bin/bash

echo -n "Gyümölcs: "
read a 

if [[ "$a" = "alma" ]]; then
    echo "Ár 500"
elif [[ "Sa" = "szilva" ]]; then
    echo "Ár 650"
fi