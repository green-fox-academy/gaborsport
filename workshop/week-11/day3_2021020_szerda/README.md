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

Milyen operációs rendszerek támogatják a Microsoft PowerShell-t?

Mit kell beírni a Microsoft Windows keresőjébe, hogy elindítsuk a PowerShell-t?

Mi az a parancs amivel a képernyőre tudunk írni Microsoft PowerShell-ben?

Obejktum orientált nyelv-e a Microsoft PowerShell?

Milyen billentyú segíti a parancsok beírását / automatikus kiegészítés a PowerShell-ben?

Lehet-e parancs alias-okat használni Microsoft PowerShell-ben?

Használhatóak-e a csővezetés, átcsövezés, átirányítás, pipe technikák a szkriptyelvekben?

Hogyan kell használni a változóneveket Microsoft PowerShell programozáskor?

Hogyan lehet kommentelni PowerShell-ben?

Lehet-e PowerShell-t használni a Google Cloud konténerekben?

Van-e grafikus szerkesztűfelülete a Microsoft PowerShell-nek?

Mi a neve a UNIX-ok legnépszerűbb szkriptnyelvének?

Milyen kezdősorral érdemes kezdeni a bash szkriptjeinket, hogy a megfelelő parancsértelmező alatt induljon el?

Mi az a parancs amivel a képernyőre tudunk írni UNIX shell szriptben?

Hogyan kell használni a változóneveket bash programozáskor?

Nap, mint nap magunk is csináljuk végig a napközben bemutatott példákat a saját gépünkön vagy a saját környezetünkön!

Próbáljuk meg ugyan azokat a feladatokat elvégezni az összes most megismert nyelven!

A gyakorlatok elvégzése közben, ha elakadunk, akkor bártan használjuk az internetes keresőket a problémák esetleges megoldásában.

Microsoft BATCH gyakorlatok

Készíts Hello World!-öt saját magunk

Írj ki a mai dátumot, készítsünk belőle BATCH fájlt is

Indíts jegyzettömb alkalmazást egy állandó jegyzetfüzettel

Készíts ehhez az előző szkripthez egy parancsikont a munkaasztalunkra

Adj össze a számokat 1-től 100-ig!

Számolj el végtelenig 1 másodperces szünetekkel

Törölj ki minden fájlt a C:\temp-ből és a D:\temp-ből kérdezés nélkül

Készíts "Kapcsold ki a gépet 1 óra múlva" szkriptet és készítsünk hozzá a mukaasztalunkra egy parancsikont is

Microsoft PowerShell gyakorlatok

Készíts Hello World!-öt saját magunk és állítsuk be a szkript futtatási jogosultságot, ha kell

Írassuk ki a mai dátumot Power Shell szkript segítségével

Készíts interakatív PowerShell szkriptet a fődokumentumban lévő példa alapján

Készíts kis szkriptet ami mindig "visszaugrat", visszavisz mindek a home könyvtárunkba

Nézd meg hogyan működik a Test-Path cmdlet és készítsünk az Microsoft BATCH fájlos példához hasonló "vírusirtó", törlő kis szkriptet

Nézz és próbálj meg néhány paraméterkezelő lehetőséget Microsoft PowerShell-ben

Próbálj ki néhány sztring kezelő, helyettesítő lehetőséget saját magad is

Nézz és készíts példákat a kiértékelés kikényszerítése Microsoft PowerShell

Próbálj ki néhány más példát is a kiválasztás, szűrés, rendezés lehetőségekre

Nézz példát az összesítés kiszámolására és oszd meg velünk a megoldásodat

Készíts saját szkript sablont a Microsoft PowerShell-hez a példához hazonlóan

Készíts "Gép kikapcsoló" szkriptet és készítsünk hozzá a mukaasztalunkra egy parancsikont is. Ha tudod, akkor készíts hozzá valami log-ot is.

HALADÓ feladat: nézz utána, hogy hogyan lehetne mondjuk Microsoft Windows környezetben Microsoft Excel-be Microsoft PowerShell-ből adatot beküldeni! Aki utánanézett és vannak eredményei az a hét ásodik felében valamelyik alaklommal ossza meg a tapasztalatait!

Shell szkript gyakorlatok

Készíts Hello World! szkriptet

Írja ki a szkript a mai dátumot

Írj scriptet, mely megadja, hogy az argumentumban megadott állomány létezik és írható-e

Írj scriptet, mely megadja, hogy az argumentumban megadott két karakterlánc azonos-e

Írj scriptet, mely megadja, hogy az argumentumban megadott két szám közül melyik a nagyobb (első, vagy második) és írja is ki

Írj scriptet, mely kivonja az argumentumban megadott második számból az elsőt

Írj scriptet, mely az argumentumban megadott fájlok közül kiírja, hogy melyikben van több karakter

Írj scriptet, mely összeadja az argumentumban megadott számokat

Két fájlt kap parancssori argumentumban a script, írja ki annak a fájlnak a nevét, amelyben több karakter van

Két paramétert kap a script, az egyik egy fájl neve, a másik egy karakterminta. Számolja ki, hogy a fájl hány ilyen karaktermintát tartalmaz

Írj olyan szkriptet, ami a megadott első paraméter szerint köszönt és ha a második paraméter egy nem létező fájl, akkor abba is beleírja a köszöntést

Általános feledatok:

A korábbi feladatokat vagy az általunk kitalált saját feladatainkat próbáljuk meg mind a három megismert szkript környezetben is elvégezni legyen az egy nagyon egyszerű feldat vagy akár egy kicsit összetettebb!

Telepítsünk Cygwin-t (https://www.cygwin.com/), ha Micorosft Windows az alap operácisó rendszerünk!

Telepítsünk WSL (Windows Subsystem for Linux)-t (https://docs.microsoft.com/en-us/windows/wsl/install-win10), ha abban szeretnénk a shell szkript feldatokat elvégezni!

Nézzük meg és teszteljünk a Google Cloud-ban is PowerShell, bash szkript példákat, ha van Google felhasználónk!

A csütörtöki és pénteki napokra és / vagy a délutáni alkalmakra készíts prezentációt, amiben összefoglalod az érdekesebb elemeket erről a hétről!

Készíts BATCH nyelven olyan megoldást, ami a logfájl-t úgy készíti le, hogy a fájl nevében benne van a napi dátum és idő és így minden nap új fájlba kerülhetnek a szkript log adatai!

Az ellenőrző, gyakorló feladatok megoldására a fődokumentumban találhatóak segítségek és további gondolatébresztők...