### Milyen operációs rendszerek támogatják a Microsoft PowerShell-t?
#### A jelenleg támogatott Microsoft Windows verziók, így az aktuális Microsoft Windows 10 verziója is alapértelmezésben tartalmazza a Microsoft PowerShell-t.
#### A PowerShell-ben megírt scriptek pedig használhatóak bármelyik Microsoft Windows rendszeren (sőt manapság már a Linux és macOS operációs környezetekben is).
     
#### A korábbi és folyamatos fejlesztések miatt több verziója is elérhető.
     
#### A jelenlegi legfrissebb verziója: 7.1 (2020/11/11) [3]

### Mit kell beírni a Microsoft Windows keresőjébe, hogy elindítsuk a PowerShell-t?
#### A Microsoft Windows PowerShell parancsértelmezőjét többféleképpen is elindíthatjuk, de talán a legegyszerűben úgy tehetjük ezt meg, ha a start menü keresőjébe beírjuk a powershell parancsot:

### Mi az a parancs amivel a képernyőre tudunk írni Microsoft PowerShell-ben?
     Write-Host "Hello World!"
#### vagy csak egyszerűen gépeljük be, hogy:
     
     "Hello World!"
### Obejktum orientált nyelv-e a Microsoft PowerShell?
#### igen. A Microsoft PowerShell .Net objektumokat használ, ezért mindaddig objektumokkal dolgozik, amíg valamit ki nem kell véglegesen írnia a képernyőre.


### Milyen billentyú segíti a parancsok beírását / automatikus kiegészítés a PowerShell-ben?
#### Nagyban meggyorsíthatja munkánkat, ha ismerjük azokat a gyorsbillentyűket, amelyek elérhetőek a PowerShell ablakban.
     
####A sok billentyűkombináció közül a legfontosabb a:
     
     TAB 
#### automatikus kiegészítés, további TAB további találatokat ad
     Shift + TAB 
#### visszalép az előző találatra
     
#### Ezekkel a billentyűkombinációkkal nagyban megkönnyíthetjük a hiba mentes parancsok begépelését.

### Lehet-e parancs alias-okat használni Microsoft PowerShell-ben?
#### Igen.
### Használhatóak-e a csővezetés, átcsövezés, átirányítás, pipe technikák a szkriptyelvekben?
#### Igen.

### Hogyan kell használni a változóneveket Microsoft PowerShell programozáskor?
#### A Microsoft PowerShell-ben is természetesen lehet használni változókat.
     
#### Jelölésük:
     
     $valtozonev
     
#### Mint ahogy megszokhattuk más programozási nyelvekben a változóknak tudunk értéket is adni, valamint itt a Microsoft PowerShell-ben akár egy teljes parancs eredményét is eltárolhatjuk akár egy változóban.
     
#### Például:
     
     $x = Get-Childitem
     
#### Ekkor az $x változóban el lesz tárolva a Get-ChildItem eredménye. Ahhoz, hogy a változóból kinyerjük az értéket egyszerűen írjuk be a parancssorba a változó nevét: $x, és a képernyőn megjelenik a benne tárolt érték, mintha a parancsot magát futtattuk volna le, de természetesen a korábban eltárolt állapotot, amikor a parancsot ténylegesen lefuttattuk:
     
### Hogyan lehet kommentelni PowerShell-ben?
#### A Microsoft PowerShell v1-es verziója óta a megjegzéseket vagy kommenteket a következő képpen tehetjük meg:
     
     # Ez egy megjegyzés sor a Microsoft PowerShell-ben
#### Lehet-e PowerShell-t használni a Google Cloud konténerekben?
#### akár az ingyenes GMail fiókokhoz is ingyen járó Google Cloud szolgáltatásban is minden GMail felhasználónak elérhető egy felhős Microsoft PowerShell szolgáltatás, ahol tesztelhetünk:
     
     https://cloud.google.com/shell
     
     https://shell.cloud.google.com/?show=ide%2Cterminal
     
### Van-e grafikus szerkesztőfelülete a Microsoft PowerShell-nek?
#### Érdemes megemlíteni, hogy a Microsoft PowerShell Microsoft Windows környezeteken beépítetten rendelkezik egy grafikus (GUI) felülettel is, ami mindenképpen segítségére lehet a kezdő PowerShell-el ismerkedő adminisztrátoroknak. 
#### Ebben a grafikus felületben minden modern eszközt megkapunk, amit a Microsoft PowerShell fejlesztések igényelnek.
#### Microsoft Windows PowerShell ISE 