## Workshop20201124_kedd

#### Nézzünk utána mi a különbség az ADSL és a bérelt vonal között? Melyiket használják enterprise környezetben és miért?
Az ADSL (Asymmetric Digital Subscriber Line – vagyis „aszimmetrikus digitális előfizetői vonal”) egy kommunikációs technológia, ami a hagyományos modemeknél gyorsabb digitális adatátvitelt tesz lehetővé a csavart rézérpárú telefonkábelen.

Az ADSL jellemzője a DSL megoldásokon belül, hogy a letöltési és a feltöltési sávszélesség aránya nem egyenlő (vagyis a vonal aszimmetrikus), amely az otthoni felhasználóknak kedvezve a letöltés sebességét helyezi előnybe a feltöltéssel szemben, általában 8:1 arányban.

Technikailag a bérelt vonal egy szimmetrikus adatkapcsolatot jelent, amelynek fix sávszélessége van. 
A bérelt vonal legfontosabb előnyei
1. Nagyobb sebesség. A hagyományos internetkapcsolat esetén a sebességet több tényező is befolyásolja, például az, hányan használják egyszerre a vonalat, illetve az általuk le- és feltöltött adatok mérete és típusa. Ezért van az, hogy csúcsidőben az internet lelassul. Bérelt vonal esetén azonban egészen más a helyzet!

2. Megbízhatóság. A bérelt vonali kapcsolatokhoz általában optikai kábeleket használnak, amelyek nem hajlamosak az elektromos interferenciára, fizikailag erősebbek és gyorsabb adatátvitelt biztosítanak.

3. Biztonság. A bérelt vonalak sokkal nagyobb biztonságot nyújtanak, mint szélessávú társaik. Mivel az adatkapcsolat a vállalkozás által ellenőrzött különböző pontok között létesül, Ön valójában nem osztja meg az adatokat egy nyilvános adathálózaton.

4. Távoli munkavégzés. A bérelt vonalak egyik hatalmas előnye, hogy lehetővé teszik az alkalmazottak számára az otthoni számítógépeikhez való biztonságos csatlakozást. Ez a megnövekedett rugalmasság segítheti a vállalkozásokat olyan rugalmas munkahelyi környezet kialakításában, amelyet az alkalmazottak felértékelnek.

#### Kérdezzük le az otthoni gépünk IP beállításait. Milyen osztályú IP címmel rendelkezünk?
Ipv4, C oszt. IP cím , 24-es subnetmask (prefix)
#### Milyen parancsokkal tudjuk felszabadítni, majd új IP címet igényelni a gépünk számára?
 Windows:
 - ipconfig /release ( hálózati kártya felszabadítás)
 - ipconfig /flushdns (DNS címek felszabadítása)
 - ipconfig /renew (IP cím megújítás)

Linux:
 - To release the current IP address:
 - $ sudo dhclient -r
 - To obtain a fresh lease:
 - $ sudo dhclient 
#### Kérdezzük le az otthoni gépünk ARP tábláját
arp -a paranccsal

ARP protokoll feladata: a hálózati rétegbeli cím alapján az adatkapocslati rétegbeli cím felderítése. Azaz az IP cím segítségével visszaadja a MAC címet. Minden csomópont egy táblázatban (ARP táblázat) tartja nyilván a hálózati címekhez tartozó fizikai címeket. A táblázat új bejegyzéseit emberi beavatkozás nélkül kell létrehozni:

ARP kérdés: Ki tudja az X hálózati cím fizikai címét?

A kérdés keretét üzenetszórásos küldéssel az alhálózat valamennyi csomópontja megkapja és feldolgozza.

Ha valamely csomópont “magára ismer“ az X hálózati címben, akkor a saját fizikai címével megválaszolja az ARP kérdést.
#### Mit mutat az MX rekord és hogyan tudjuk lekérdezni?
Az MX (mail exchanger) rekordok a Domain Name System részei, feladatuk az adott domain e-mailjeit kezelő szervereinek azonosítása. Egy domainnek több MX rekordja is lehet, mely rekordok közt egy sorszám állít fel prioritási rangsort. Mindig a kisebb számmal rendelkező MX-rekord az elsődleges szerver. Fontos, hogy címre (A rekord), vagy CNAME rekordra mutató host megadása nem engedett.

How do I check my MX record?
1. To use NSLOOKUP to view MX records:
2. Open a command prompt.
3. Type "nslookup" then press Enter. You will see the following: Default Server: <FQDN of your server> ...
4. Type "set type=mx" then press Enter.
5. Type the domain name that you want to look up, then press Enter. The MX records of that domain will appear.
#### Milyen paranccsal kérdeznéd le, hogy a géped milyen TCP/UDP portokon figyel éppen (aktív kapcsolatok)?
 Forgalom „lehetőségét” biztosító lekérdezés, mely megmutatja, hogy milyen listener-ek vannak a rendszerben (listener = olyan szerver szolgáltatás, amely vár a kliens kapcsolatfelvételére) és/vagy milyen hálózati kapcsolatok.
 
 Két alapvető listát szoktunk lekérni:
 - netstat -lntup (kilistázza a listenereket)
 - netstat -antup (kilistázza a listenereket és az összes kapcsolatot)

#### Milyen parancsot használnál, ha csak! a géped MAC címét szeretnéd kiiratni (Windows parancssorban)
getmac -v
#### Mire szolgál a tracert parancs? Mikor és mire használnád?
A tracert egy windows parancssori program. Feladata egy cél eszköz elérésének diagnosztizálása a közben érintett állomásokkal együtt. Ez utóbbi tulajdonsága miatt kifinomultabb mint a ping parancs. Hálózatos eszközökön traceroute néven ismert.

tracert Ip_cím

Ahol az Ip_cím a cél eszköz Ip címe, amely helyett a cél Dns nevét is használhatjuk.
#### Hálózatunkon nincs engedélyezve a 3389-es port. Milyen szolgáltás nem fog működni?
Remote Desktop Protocol (RDP) is a Microsoft proprietary protocol that enables remote connections to other computers, typically over TCP port 3389.