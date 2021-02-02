Privát, publikus, hibrid felhő
Szolgáltatási modellek: Iaas,PaaS,Saas
Azure régiók
Rendelkezésre állási zónák
Azure szolgáltatások
### Mi a különbség az Iaas és a Saas között?
#### IaaS: hardwer szintig a szolgáltató felelőssége (hálózat, magas rendelkezésre állás, szerverek storage-ok karbantartása, operációs rendszerek, géptermi funkciók biztosítása, virtualizációs környezet biztosítása)
#### SaaS: Online szolgáltatások (gmail, facebook, O365), bármikor, bárhonnan online elérhető és használható.
#### Minden lehetséges probléma a szolgálató feladata (akik használhatják: startup cégek, rövid távú projektek)
### PaaS esetén meddig terjed a szolgáltató felelőssége?
#### PaaS esetén a felhőszolgáltató rendelkezésünkre bocsájtja az infrastruktúrája fölött működő platform réteget, amin alkalmazásokat üzemeltethetünk, illetve adatokat tárolhatunk és kezekhetünk.
#### A szolgáltató feladatai és felelőssége kiterjed:
#### operációs rendszer karbantartása
#### a köztes szoftverek és futtatókörnyezetek felügyelete
#### A mentés és az alkalmazások kezelése a mi feladatunk.
### Mi a GDPR?
#### General Data Protection Regulation -Általános Adatvédelmi Rendelet, At EU adatvédelmi törvénye 2018.május 25-től
#### A GDPR új szabályok betartását teszi kötelezővé olyan cégek, közigazgatási intézmények, non-profit és más szervezetek számára, amelyek árukat és szolgáltatásokat kínálnak az Európai Unió (EU) területén lévő embereknek, vagy amelyek EU-lakosokhoz kapcsolódó adatokat gyűjtenek és elemeznek. A GDPR attól függetlenül érvényes, hogy hol tartózkodunk.

### Mi a Rendelkezésre állási zóna?
#### Ahhoz, hogy az információk meghibásodás esetén is biztonságban maradjanak, gondoskodnia kell a szolgáltatások és az adatok redundanciájáról. 
#### Ennek érdekében az infrastruktúra üzembe helyezésekor duplikált hardverkörnyezetet kell létrehozni. 
#### Az Azure ún. rendelkezésre állási zónák segítségével biztosíthatja az alkalmazás magas rendelkezésre állását.
####  rendelkezésre állási zónák fizikailag elkülönített adatközpontokat jelentenek egy régión belül.
#### Az egyes rendelkezésre állási zónák egy vagy több, önálló áramellátással, hűtéssel, és hálózattal rendelkező adatközpontból állnak.
#### Forgalomelkülönítési határokként szolgálnak. Ha az egyik zóna leáll, a másik továbbra is működőképes marad. 
#### A rendelkezésre állási zónákat nagysebességű száloptikás magánhálózatok kötik össze.

### Mi a régió?
#### A régió olyan földrajzi terület, amely legalább egy, de potenciálisan akár több egymáshoz közel fekvő, alacsony késleltetésű hálózati kapcsolatba kötött adatközpontot tartalmaz. Az Azure az erőforrások intelligens hozzárendelésével és szabályozásával biztosítja a számítási feladatok megfelelő kiegyensúlyozottságát az egyes régiókban.
#### A régiókra néhány példa az USA nyugati régiója , Közép-Kanada , Nyugat-Európa , Ausztrália keleti régiója , és a Nyugat-Japán régió.

### Találunk-e Magyarországon Azure datacentert?
#### Nem.

### Mikor érdemes Azure-ben virtuális gépet használni?
#### A kezdő vállalkozások számára a felhő alapú infrastruktúra lehetővé teszi, hogy nagyon alacsony költségekkel induljon, és gyorsan skálázhasson, miközben ügyfeleket szerez. Például egy új virtuális gép létrehozása - vagy akár több új virtuális gépé - nem emészt fel hatalmas költésgeket és rugalmasan skálázható,így ez remek választás lehet például startup cégeknek.

### Milyen típusú file-okat tárolnál Blob storage-on?
#### A Blob Storage: ezt a szolgáltatás egy masszív fájlszerverként képzeljük el. Elsősorban nagyméretű objektumok,fileok (BLOB-ok) például videófájlok, bitképek tárolására alklamas.
 