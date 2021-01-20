@echo off
chcp 65001

choice /C:FL -M "Fiú vagy vagy lány?"

if errorlevel 2 goto lany
echo Szervusz, fiú...
goto end


:lany
echo Szervusz, lány ;)

:end