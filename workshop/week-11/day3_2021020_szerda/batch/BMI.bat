@echo off
chcp 65001 > nul
echo Testsúlyod (kg):
Set /P testsúly=

echo Magasságod (cm):
set /P magasság=

set /A BMI=%testsúly%*10000/(%magasság%*%magasság%)
echo BMI = %BMI%
pause > nul

