@echo off
chcp 65001

for /f %%a in ("%date%") do set d=%%a
echo. Mai dátum   : %date%
echo.d        : %d%
echo.
rem Dátum feldarabolása és változókba helyezése a mezőelválasztó pont mentén
for /f "tokens=1,2,3,4 delims=." %%a in ("%date%") do set wday=%%a&set month=%%b&set day=%%c&set year=%%d
echo.Év     : %wday%
echo.Hónap  : %month%
echo.Nap    : %day%
pause
rem Megoldás a DOS EDIT parancsa: ott kell (át)szerkeszteni...
 