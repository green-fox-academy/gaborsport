@echo off

 echo | date /t
 echo | time /t
 rem Az első módszer a date és a time utasítás /t kapcsolóval történő használata, 
 rem amikor is az adott utasítás megjeleníti az aktuális dátumot / időt új dátum / idő beállításának lehetősége nélkül.

echo %DATE%  %TIME%
rem A másik lehetőség a %DATE% és a %TIME% környezeti változók használata:
rem Ha egymás mellett szeretnénk látni a dátumot és az időt:


