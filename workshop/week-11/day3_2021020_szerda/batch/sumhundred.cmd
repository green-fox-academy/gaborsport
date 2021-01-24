@echo off

chcp 65001

set /a sum=0

for /l %%i in (1,1,100) do (

set /a sum+=%%i

)
echo Számok ősszege 1-től 100-ig: %sum%

pause