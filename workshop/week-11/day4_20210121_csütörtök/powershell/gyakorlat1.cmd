@echo off
chcp 65001

echo Helló Belló

echo Kérjük adja meg a magasságát?
set /P magassag = 

echo Kérjük adja meg a testsúlyát?
set /P testsuly = 

set /A Bmi= %testsuly%*10000/%magassag%/%magassag%

echo %Bmi% 

rem set /A Bmi = %testsúly% * 10000/(%magasság:.=%*%magasság:.=%)
