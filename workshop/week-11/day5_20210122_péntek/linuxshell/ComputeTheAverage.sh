#!/bin/bash

#read a
#set ossz = 0
#for i in { 1..$[a+1] }
#    do 
#        read b 
#        let "ossz=ossz+b"
#    done
#let " c=ossz/a"
#printf "%.3f\n" $(echo "scale=3;$c" | bc -l)
# ez még nem működik

#read n
#sum=0
#for ((i=0;i<$n;i++))
#do
#    read temp
#    sum=$(($sum+$temp))
#done
#printf "%.3f\n" $(bc -l <<< "$sum/$n")
# ez működik!

sum=0
read N

for i in $(seq 1 $N); do
    read number
    sum=$(( $sum + $number ))
done

printf "%.3f\n" `echo "$sum / $N" | bc -l`

