@echo off




set fajlneve=gyakorlat1.cmd

if exist %fajlneve% echo %fajlneve% létezik
rem feltétel:ha létezik a fájl, írja ki, hogy létezik.
set fajlneve=gyakorlat2.cmd

if not exist %fajlneve% echo %fajlneve% nem letezik
rem feltétel:ha nem létezik a fájl, írja ki, hogy letezik.