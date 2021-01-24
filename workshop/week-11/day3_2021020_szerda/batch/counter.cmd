@echo off

set counter=0  
  
:loop

ping -n 2 127.0.0.1 > nul  
set /a counter+=1  
echo %counter%

goto :loop