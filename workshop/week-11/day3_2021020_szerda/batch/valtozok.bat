@ECHO OFF
SET /A y=42055 + 1001
REM Eredménye: 430056, de nem írja ki, csak ha kérjük
REM kiíratjuk
ECHO %y%
REM eredménye 430056

REM értékadás
SET y=1000
echo %y%
REM növelés eggyel
SET /A y+=1
echo %y%
REM csökkentés eggyel
SET /A y-=1
echo %y% 
REM osztás kettővel
SET /A y/=2
echo %y%
REM szorzás kettővel
SET /A y*=2
echo %y%