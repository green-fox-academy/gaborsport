@echo off

set i=1

setlocal    ENABLEDELAYEDEXPANSION

for %%a in (*.cmd) do (
    echo !i!
    set /A i+=1
    echo %%a
)
