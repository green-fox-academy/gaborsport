
## Workshop

#### Készítsünk egy domain controllert

#### Telepítsünk DHCP-t_ezt elég kedden megcsinálni

#### Telepítsünk DNS-t_ezt elég kedden megcsinálni

#### Milyen porton kommunikál a DNS szerver?
A DNS szerverek az 53-as porton, UDP protokollon kommunikálnak egymással.
#### Mik az FSMO szerepkörök? Melyek a tartományi és melyek az erdőszintű szerepkörök? Keressük meg grafikus felületen az öt szerepkört! Hogyan tudjuk lekérdezni parancssorból?
•	Schema master: A schemát vezérli. A Schema az az Active Directory komponens, ami definiálja az összes objektumot és azok lehetséges tulajdonságait a címtárban. Erdő szintű szerep.

•	Domain Naming Master: Ez biztosítja, hogy a domainben minden név egyedi. Erdő szintű szerep.

•	Primary Domain Controller Emulator: A Windows Server 2003 domainben a Windows NT szerverek működhetnek backup domain controllerként. Ekkor a PDC Emulator szerverek a Windows NT szerverek számára PDC-ként működnek. Domain szintű szerep. Csak egy PDC Emulator lehet egy domainban.

•	RID Master: RID: Relative Identifier. Az RID teszi egyedivé az objektumokat a domainben. Az RID Master felelős az egyedi RID-k kiosztásáért. Domain szintű szerep. Csak egy RID Master lehet egy domainban.

•	Infrastructure Master: Az Active Directory alapvetően azokat az objektumokat tárolja, amik az adott domainben vannak, de tartalmazhat hivatkozásokat a más domainekben levő objektumokra is. Ha egy ilyen hivatkozásban történik változás, annak a replikákódásáért az Infrastructure Master a felelős. Domain szintű szerep. Csak egy Infrastructure Master lehet egy domainban.

#### Server Manager: Tools - AD Users and Computers - Operation Masters
#### netdom query fsmo
### Mit tudunk konfigurálni a DNS Forwaders fülön? Keressünk itt használható DNS szervereket (IP címeket)
#### Ha a helyi DNS nem tudja az IP címet, akkoride küldi. 
### DHCP szerveren hogyan tudunk a kiosztandó IP címtartományból kizárni kiadható IP-ket? Milyen esetekben célszerű használni ezt a lehetőséget?
####reservation-nal.
#### Akkor, ha szeretnénk lefoglalni pl. nyomtatóknk IP cím tartományokat.
### Kérdezzük le egy tetszőleges domain SOA, A és MX rekordját

### Mi a Globális katalógus?
#### Tartományvezérlői szerepkör. A GC a saját tartományán kívül erdő szinten tárolja a címtár összes objektumának alapadatait, elérhetőségének információit.

### Miket tárol a SYSVOL mappa? Ha több DC-nk is van melyiken találjuk meg?
#### A Global Catalog információkat szolgáltat a forest bármelyik objektumáról az egy hálózaton belüli DC részére, attól függetlenül hogy a DC azonos domainben van az objektummal vagy sem.

### Mi az RODC?Mikor telepíthetjük egy hálózatba?
#### Read Only Domain Controller, ami egy csak olvasható másolat az AD-ről, valamint válaszol a biztonsági azonosítási kérésekre
####Ha a hálózat sávszélessége nagyon alacsony a fióktelep és az AD erdőszintű elsődleges tartományvezérlő között, és csak felhasználók authentikációjára használjuk a fióktelepen és nem kell időről időre frissítéseket futtatni hardvert karbantartani, felhasználói adatokat módosítani.

### Mi a DSRM és mikor használjuk? -Mi az Organizational Unit?
#### Directory Services Restore Mode (DSRM) egy funkció, amivel át tudjuk kapcsolni az AD-t vészhelyzeti karbantartásra, részleges adatbázis visszaállításra.

### Mi a Multimaster replikáció?
#### Az adatbázismásolatok készítésének olyan módszere, ami lehetővé teszi, hogy számítógépek egy adott csoportja úgy tárolja ugyanazt az adathalmazt, hogy bármelyiken történő változtatás esetén, a változtatás a csoport minden másik tagján is megtörténjen. A rendszer feladatai közé tartozik az adatok szinkronizálása a gépek között, illetve az esetlegesen keletkező konfliktusok kezelése (ilyen konfliktus például, amikor két különböző gépen ugyanazt az adatot más-más értékre módosítják).

### Mi a séma?
#### Olyan objektum tulajdonságokat leíró gyűjtemény, amely meghatározza a címtárban lévő összes objektum (pl. felhasználói fiókok, szervezeti egységek, nyomtatók stb.) és attribútumok osztályát, az ezekre vonatkozó szabályokat és korlátokat, valamint az elnevezés formátumát.
#### 