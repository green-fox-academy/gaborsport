@echo off

chcp 65001

:ujrafitten 
echo Helló Belló

echo Kérjük adja meg a magasságát?
set /P magasság= 

echo Kérjük adja meg a testsúlyát?
set /P testsúly=

set /A Bmi= %testsúly%*10000/%magasság%/%magasság%
echo %Bmi% 

choice  /C:IN /M (I/N)
if errorlevel 2 goto N
goto ujrafitten
:N