
## Workshop 20201126csütörtök
#### Milyen gyártói előírások vannak CentOS 8 esetében a hardware-re vonatkozóan (minimal requirements és compatibility)?
 - rendszer: 64 bites
 - tárhely: min 10 GB
 - 	RAM: 2 GB
#### Töltsd le a CentOS 8.2.2004 install médiát
 - Első lépésben WEB böngészőben nyissuk meg a következő URL-t: (https://www.centos.org/download)
 - 	x86_64 verzió
 - CentOS 8.2.2004 Linux verzióhoz tartozó médiák listájából válasszuk ki a CentOS-8.2.2004x86_64-dvd1.iso file-t, és töltsük le, mert ez tartalmazza az OS-t, valamint több később szükséges tool-t is.
#### Készíts boot-olható CentOS 8.2.2004 operációs rendszer installációs pendrive-ot!
 - (https://wiki.centos.org/HowTos/InstallFromUSBkey)
 - http://www.pchogyan.net/wp/hogyan-keszitsunk-bootolhato-linux-usb-flash-meghajtot/
 - https://logout.hu/bejegyzes/doky586/live_linux_pendrive_egyszeruen.html
#### Mi a különbség a "yum" és az "rpm" paramncsokkal való installálások között?
 - rpm (Red Hat Package Manager) nem telepíti a függőségeket
 - yum maga tölti és telepíti a csomagot
#### Keresd ki, hogy mennyibe kerülne egy 2x16 core-os Intel Xeon processzoros gépre RedHat Enterprise Linux operációs rendszer vásárlása 1 év support-tal
 | Subscription	| type	| Price |
 | ------------ | ----- |----- |
 | Self-support	| (1 year)	| $349 |
 | Standard	| (1 year)	| $799 |
 |Premium	| (1 year)	| $1,299 |
 
#### Mi a feltétele annak, hogy DHCP-s IP cím beállítást használjunk a Linux szerverünk installálása során?
DHCP szerver
#### Miért térjünk át statikus IP cím használatára?
Biztonság szempontjából jobb, ha aszerver mindig ugyanazon az IP címen érhető el.
 - Támogatja a névfeloldást a Wide Area Network (WAN) hálózatokon. Ennek köszönhetően a készülékek megbízható módon elérhetőek hosztnevük alapján.
 - Jobb védelmet biztost a hálózati biztonsági problémákkal szemben otthoni hálózatán.
 - Ha statikus IP címeket használ otthoni hálózatán, elkerülhet minden IP cím ütközést.
 - Pontosabb földrajzi lokalizáció, mint a dinamikus IP címekkel.
 - A le- és feltöltési sebességek általában gyorsabbak, mint a dinamikus IP címek esetében.
#### Installálás során miért nem kérünk NTP-n keresztüli időszinkronizálást, miért kell kézzel beállítani a dátumot és a pontos időt?
Mert ilyenkor még nincs hálózat, ami elérhető.
#### Milyen megszorítások vannak Linux operációs rendszert használó gép esetén a host nevére?
Each element of the hostname must be from 1 to 63 characters long and the entire hostname, including the dots, can be at most 253 characters long. Valid characters for hostnames are ASCII(7) letters from a to z, the digits from 0 to 9, and the hyphen (-). A hostname may not start with a hyphen.
#### Lehet-e LVM disk területen a /boot és /boot/efi?
Nem lehet. (only standard partition)
#### Lehet-e swap partíció LVM disk területen?
Elvileg igen https://www.2daygeek.com/how-to-create-extend-swap-partition-in-linux-using-lvm/
#### Milyen file rendszereket használhatunk és használunk?
Btrfs, ext2, ext3, ext4, JFS, NTFS, Reiser4, XFS archlinux
