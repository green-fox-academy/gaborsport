#!/bin/bash

read number1
read number2
read number3

if [[ $number1 = $number2 ]] && [[ $number2 = $number3 ]]
then
echo "EQUILATERAL"
elif [[ $number1 = $number2 ]] || [[ $number2 = $number3 ]] || [[ $number3 = $number1 ]]
then 
echo "ISOSCELES"
else 
echo "SCALENE"

fi