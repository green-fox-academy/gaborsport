### Hogy hívjuk azt a programozási módszert / nyelvet, amikor a parancsok begépelése helyett szövegállományba írjuk a parancsokat és később ezt a szövegállományt futtatjuk?
#### A batch programozás a neve annak a programozási eljárásnak, amelynek során a gép által végrehajtandó utasításokat nem közvetlenül gépeljük be a parancsértelmezőnek (más néven parancssori értelmező vagy angolul command line interpreter, cli, shell), hanem a parancsok egymásutánját egy szövegfájlban (az úgynevezett kötegeltfájlba ill. parancsfájlba, szkript fájlba idegen szóval: batch-fájlba, script file) írjuk le.
### Milyen batch / szkripnyelvekkel ismerkedtünk meg?
#### Más operációs rendszerek alatt (pl. Unix, Linux, macOS) ezeket inkább már shell szkripteknek hívják, és ma is nagyon fontos szerepet töltenek be az adott operációs rendszer működésével kapcsolatban. A UNIX világban legelterjedtebb shell talán a Bourne Again Shell (bash). Ám léteznek más shellek is: pl. sh, tcsh, ksh, zsh és ezek munka közben cserélhetők, sőt felváltva is használhatók a UNIX-ok alatt.

### Sorolj fel néhány egyéb szkriptnyelvet!
#### Legnépszerűbb modern szkript nyelvek még a shell szkriptek mellett a következők lehetnek csak a példa kedvéért:
     
     ruby, python, perl, awk, javascript, Go, TypeScript, PHP, ...
     
     internet fontosságának megemlítése, github, gist, gitlab, ...
     
### Hogyan lehet MS-DOS BATCH fájlokat legegyszerűbben egy mai modern Microsoft Windows operációs rendszer elindítani?
#### MS-DOS BATCH fájlokat legegyszerűbben egy mai modern Microsoft Windows operációs rendszert futtató számítógépen a parancssori ablak (Command Prompt, cmd.exe) elindításával tehetjük meg:

### Milyen egyszerű programot szoktak manapság minden programozási nyelv bevezetésekor bemutatni?
#### Egy bizonyos idő óta már divatossá vált a minden programozási nyelv bevezetésekor bemutatni, hogy hogyan lehet az aktuális nyelven elkészíteni a "Hello World!" egyszerű alkalmazást, programot, ami csak annyit tesz, hogy kiírja valahova, hogy "Hello World!" (Helló Világ!)

### Mi az a parancs amivel a képernyőre tudunk írni Microsoft Batch-ben?
#### echo

### Microsoft Batch brogramozásban mi az a parancs ami egy billentyűre vár?
#### A pause parancs hatására a képernyőn megjelenik a “Press any key to continue...” szöveg és a program futása megáll mindaddig, míg a felhasználó meg nem nyom egy billentyűt.

### Hogyan kell használni a változóneveket Microsoft Batch programozáskor?
#### A BATCH programok az MS-DOS környezeti változóit használják a következő formában történő:
     
   %változónév%
     
   jelöléssel hivatkozva rájuk.
     
   Egy változónak értéket pedig a set paranccsal tudunk adni.
     
   Egy egyszerű példa a változók használatára:
     
   valtozo.bat
     
     @echo off  
     set ALMA=Alma  
     echo %ALMA%
     
### Címke definiálása BATCH-ben?
#### Címke definiálása BATCH-ben a ":" jellel történik, szintakszisa:
     
     :címkenév
     
   #### A goto parancs segítségével pedig egy adott címkére tudnk ugrani.
     
  ####  Amennyiben feltételes ugrásra van szükségünk, értelemszerűen az if szerkezetet kell a goto utasítással kombinálni.
     
### Hogan lehet kommentelni BATCH-ben?
#### A szkriptünkben található, REM-mel kezdődő sorok nem kerülnek végrehajtásra; ezen sorokat megjegyzés soroknak tekintjük. 

Az elkészlült gyakorlatokról mindenki küldjön valami eredményt!

Ha vannak Microsoft BATCH-beb megoldandó feladatötletek, akkor küldd majd be!

A korábbi programozási feladatokból (tanfolyam eleje) mindenki vegyen át néhány olyan példát, amit BATCH-ben is meg lehet oldalni és próbálja meg elkészíteni. Az eredményeket ossza meg!

