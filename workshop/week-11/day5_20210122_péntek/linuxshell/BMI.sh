#!/bin/bash


echo "BMI count"

echo "Your weight (cm): "
read magassag
echo "Your weight (kg): "
read suly

BMI=$((suly*10000/magassag/magassag))
echo "BMI:" $BMI