## Workshop
### Mik azok a tárolók vagy storage-ok?
#### A tároló vagy storage egyszerűen kifejezve egy „doboz ,amiben diszkek vannak”. Ezt teljesen egyszerűen és tökéletesen azonosítja a tárolókat, mint ahogy a neve is ezt sugallja, de természetesen azért ez nem lesz a végére ilyen egyszerű, mert bár kinézetre egy általában rack szekrénybe szerelt téglalap alakú dobozról vagy dobozokról beszélünk kinézetre, de funkcionalitásan azért sokkal komolyabb eszközről beszélünk igazándiból. A tároló eszközök feladata, hogy egy teljesen szeparált módon és az esetekben nagy százalékában centralizált módon és központosított menedzsmenttel, adminisztrációval biztosítsa más szervereknek, vagy klienseknek a diszk típusú tárterületet. Ezen felül egy jó tárolórendszernek ezt úgy kell tennie, hogy közben könnyen skálázható is legyen azaz minden oldalról könnyen bővíthetőnek is kell lennie mind kapacitásban (ezt általában leállás nélkül kell tudniuk teljesíteni), mind pedig teljesítményben. Ha fokozni akarjuk a tárolókkal szemben támasztott igényeinket, akkor itt még érdemes megemlíteni azt, hogy a tárolt adatokat pedig valamilyen szintű biztonsággal szeretnénk ezekben a "dobozokban" tárolni.


### Milyen három tároló kategóriát ismertünk meg?
#### DAS (Direct Attach Storage)
#### NAS (Network Attached Storage)
#### SAN (Storage Area Network)

### Milyen hálózatot használnak a NAS (Network Attached Storage) tárolók?
#### Ahogy az már nevéből is azonnal látszik ez a tároló fajta nem más, mint az a diszkekkel teli "doboz", ami tipikusan egyszerű ethernet alapú TCP/IP hálózaton keresztül kapcsolódik a szerverhez és / vagy más ilyen tárolókhoz. Ez azt jelenti, hogy a gépünk számára elég csak hálózati csatlakozást biztosítanunk, hogy össze tudjuk kapcsolni őket. Ezek után a forgalom TCP/IP alapon fog már közlekedni, tehát mind a NAS-nak, mind pedig a szervernek szüksége van egy-egy IP címre. Mivel a TCP/IP hálózat az eltelt idők során már minden háztartás része lett, ezért az ilyen típusú eszközök már bárhol lehetnek akár egy otthonban is és nem kell ezeket az eszközöket csak géptermekben elképzelni.

### Hogy néz ki a címzés a SAN hálózati eszköz WWN címével? (Internetet is lehet használni)
#### A Fibre Channel környezet minden résztvevőjének egyedi azonosítója van, amelyet World Wide Name (WWN) néven hívnak. Ez a WWN egy 64 bites cím, és ha két WWN címet teszünk a keret fejlécébe, ez 16 bájt adatot hagy csak a cél- és forráscím azonosítására. Tehát a 64 bites címek befolyásolhatják az útválasztási teljesítményt. Emiatt van egy másik címzési séma, amelyet a Fibre Channel hálózatokban használnak. Ez a séma a kapcsolt szövet portjainak címzésére szolgál. A kapcsolt szövet minden egyes portjának megvan a maga egyedi 24 bites címe. Ezzel a 24 bites címzési sémával kisebb keretfejlécet kapunk, és ez felgyorsíthatja az útválasztási folyamatot. Ezzel a keretfejléccel és útvonalválasztási logikával a Fibre Channel szövetet optimalizálták a keretek nagy sebességű kapcsolására. A 24 bites címzési sémával ez akár 16 millió címet is lehetővé tesz, ami nagyobb, mint a mai világban létező bármilyen gyakorlati SAN-terv. Ezt a 24 bites címet valahogy össze kell kapcsolni a világhálón társított 64 bites címmel és azzal. A 24 bites címséma egyúttal megszünteti a címek kézi kezelésének általános költségeit is, lehetővé téve a topológia számára, hogy címeket rendeljen hozzá. Ez nem olyan, mint a WWN címzés, amelyben a címeket az IEEE szabványbizottság hozzárendeli a gyártókhoz, és beépítéskor beépítik a készülékbe, hasonlóan ahhoz, mint amikor egy gyermeket születéskor elneveznek. Ha a topológia maga hozzárendeli a 24 bites címeket, akkor valakinek felelnie kell a címzési sémáért a WWN címzéstől a port címzésig. A kapcsolt szövet környezetben maga a kapcsoló felel a port címek hozzárendeléséért és karbantartásáért. Amikor az eszköz a WWN-jével egy adott port kapcsolójába jelentkezik be, a kapcsoló hozzárendeli a port címét ahhoz a porthoz, és a kapcsoló fenntartja az összefüggést a port címe és az adott eszköz WWN-címe között. A kapcsoló ezen funkcióját egy névszerver segítségével valósítják meg. A névszerver a fabric operációs rendszer egyik összetevője, amely a kapcsolón belül fut. Lényegében olyan objektumok adatbázisa, amelyben a szövethez kapcsolt eszköz regisztrálja értékeit. A dinamikus címzés megszünteti az emberi hibák potenciális elemét a címek karbantartásában, és nagyobb rugalmasságot biztosít a SAN kiegészítéseiben, áthelyezésében és módosításaiban. A 24 bites portcím három részből áll: Tartomány (bitek 23-tól 16-ig) Terület (bitek 15-től 08-ig) Port vagy választott hurok fizikai címe - AL_PA (bitek 07-től 00-ig) Tartomány: A portcím legjelentősebb bájtja a tartomány. Ez maga a kapcsoló címe. Egy bájt legfeljebb 256 lehetséges címet engedélyez. Mivel ezek egy része fenntartva van (például a műsorszórásé), csak 239 cím áll rendelkezésre. Ez azt jelenti, hogy akár 239 kapcsoló is lehet a SAN környezetében. A tartományszám lehetővé teszi, hogy minden kapcsoló egyedi azonosítóval rendelkezzen, ha a környezetében több összekapcsolt kapcsoló van. Terület: A terület mező 256 címet ad meg. A cím ezen része az egyes FL_Ports támogató hurkok azonosítására szolgál, vagy használható az F_Portok csoportjának azonosítójaként; például egy kártya, amelyen több port található. Ez azt jelenti, hogy minden portcsoportnak külön a területszáma, még akkor is, ha csak egy port van a csoportban. Port: A cím utolsó része 256 címet ad a csatolt N_Portok és NL_Portok azonosításához. A rendelkezésre álló címek számának eléréséhez egy egyszerű számítás szükséges: Tartomány x Terület x Portok Ez azt jelenti, hogy 239 x 256 x 256 = 15 663 104 cím áll rendelkezésre.


### Hogy néz ki a címzés egy iSCSI eszközön?
#### Az iSCSI a TCP-t (általában a 860 és 3260 TCP portokat ) használja a protokollokhoz, a protokollban lévő objektumok címzésére magasabb szintű neveket használnak. A speciális nevek az iSCSI kezdeményezőkre és a célokra egyaránt vonatkoznak. Az iSCSI három névformátumot kínál: iSCSI minősített név (IQN) Formátum: Az iSCSI minősített név az RFC 3720-ban van dokumentálva , további névpéldákkal az RFC 3721-ben . Röviden, a mezők a következők: szó szerinti iqn (iSCSI minősített név) dátum (éééé-hh), amikor a névadó hatóság átvette a domain tulajdonjogát a hatóság fordított tartományneve (pl. org.alpinelinux, com.example, to.yp.cr) Opcionális ":" a névadó hatóság által megadott tárolási célnév előtagja. Az RFC-től: típus . Dátum . Auth. Elnevezése : Karakterláncot az example.com Naming Authority határozza meg iqn . 1992-01 . com.példa : tárolás: diskarrays-sn-a8675309 iqn . 1992-01 . com.példa iqn . 1992-01 . com.példa : tárolás.szalag1.sys1.xyz iqn . 1992-01 . com.példa : storage.disk2.sys1.xyz Kiterjesztett egyedi azonosító (EUI) Formátum: eui. {EUI-64 bites cím} (pl. Eui.02004567A425678D ) T11 hálózati cím hatóság (NAA) Formátum: naa. {NAA 64 vagy 128 bites azonosító} (pl. Naa.52004567BA64678D ) Az IQN formátumú címek fordulnak elő leggyakrabban. Dátum (éééé-hh) minősítéssel rendelkezik, mert a domainnevek lejárhatnak, vagy egy másik entitás megszerezheti őket. Az IEEE regisztrációs hatóság az EUI-t az EUI-64 szabványnak megfelelően biztosítja. Az NAA az OUI része, amelyet az IEEE Regisztrációs Hatóság biztosít. Az RSC 3980- ban NAA névformátumokat adtak az iSCSI-hez , hogy kompatibilisek legyenek a Fibre Channel és a Serial Attached SCSI (SAS) tárolási technológiákban használt névadási konvenciókkal . Általában egy iSCSI résztvevőt három vagy négy mező határozhat meg: Gazdanév vagy IP-cím (pl. "Iscsi.example.com") Port száma (pl. 3260) iSCSI név (pl. az IQN "iqn.2003-01.com.ibm:00.fcd0ab21.shark128") Opcionális CHAP titok (pl. "Titkok újrakezdése") iSCSI - https://hu.qaz.wiki/wiki/ISCSI

### Keress az interneten az IBM gyártó termékkínálatából SAN tárolókat!
#### https://www.ibm.com/products/?q=SAN%20storage 


### Keress ugyan így más gyártóknál is hasonló termékeket: HPE, Oracle/Sun, NetApp, Synology, QNAP és próbáljuk megkeresni a funkcióikat és esetleg a különbözőségeket!
#### HPE SIMPLIVITY 380 GEN10 ADAT-DEDUPLIKÁCIÓ
#### https://www.oracle.com/downloads/server-storage/san-disk-storage-downloads.html#license-lightbox 

### Nézz utána a Wikipédián, vagy más internetes forrásban, hogy milyen más RAID megoldások léteznek manapság!
#### https://hu.wikipedia.org/wiki/RAID 
#### RAID0, RAID1, RAID2, RAid3, RAID4, RAID5, RAID6, RAID7, RAID01, RAID10, 

### Keress olyan online RAID kalkulátorokat, amikkel könnyen láthatjuk, hogy melyik RAID megoldáshoz milyen diszkek kellenek és azok hogyan használhatók fel. Például:
#### https://www.synology.com/hu-hu/support/RAID_calculator
#### https://www.icc-usa.com/raid-calculator/ 
#### https://www.qnap.com/hu-hu/nas-selector/ 
#### https://www.omnicalculator.com/other/raid 
#### https://wintelguy.com/raidcalc.pl 
#### https://www.grijpink.eu/tools/raid/ 
#### https://www.seagate.com/gb/en/internal-hard-drives/raid-calculator/


### Keress SAN kapcsolatokhoz használható kábeleket, csatlakozókat és modulokat az interneten.
#### Lenovo Flex System FC3171 8Gb SAN Switch and Pass-thru Modules


### Keress az interneten szalagos meghajtókat ne csak az IBM kínálatából!
#### Dell PowerVault LTO-4 120

### Keress VTL (Virtual Tape Library) eszközöket az internet segítségével más gyártók kínálatából.
#### StarWind VTL for AWS and Veeam 

Aki a saját laborkörnyezetében meg tudja oldali a korábbi telepítéseiből, hogy két virtuális gépet is tud futtatni egymás mellett, az megteheti, hogy letölti a fenti link alapján ezt a appliance csomagot és saját maga is telepíti ebbe a környezetbe és ott kipróbáhatja saját maga is a felületet és megpróbálja összekapcsolni a két virtuális gépet iSCSI kapcsolat segítségével.

Bátrabbak megpróbálhatják csomagokból telepíteni a saját Linux környezetükben az mhvtl-t és a hozzá tartozó WEB-es menedzsment GUI felületet is.

Mivel ez a bevezető tanfolyam nem rendelkezik hardver infrastruktúrával a SAN és a tárolóeszközök témához, ezért itt a gyakorlatban nem nagyon tudunk semmit megnézni, de azért pár témát mindenki érinthet még a fő dokumentumab található gyakorlatokból.