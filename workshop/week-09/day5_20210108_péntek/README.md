cd ..
## 2021.01.08. Pének

## Mondd el saját szavaiddal, hogy:

### Mik azok a tárolók vagy storage-ok általánosságban és hol jelenhetnek meg egy vállalatnál?
#### Tárolók adattárolásra alkalmas eszközök (doboz, amiben diszkek vannak).


### Mi az a DAS (Direct Attached Storage)? Próbáld meg az előnyeit, hátrányait, a közvetítő közegét és szolgáltatott tárhely típusát meghatározni!
#### Közvetlenül csatolt tárolók (pl. USB-s diszkek).
#### Előny: olcsó és nem kell hozzá szakértelem.
#### Hátrány: kis távolság (3-4 m)
#### Közvetítő közeg: SCSI kábel

### Mi az a NAS (Network Attached Storage)? Próbáld meg az előnyeit, hátrányait, a közvetítő közegét és szolgáltatott tárhely típusát saját szavaiddal meghatározni!

#### Diszkekkel teli dolog, ami ethernet alapú TCP/IP hálózaton keresztül kapcsolódik a szerverhez.
#### Előny: egyszerű kezelés, központi management, viszonylag olcsóbb
#### Hátrány: belassulhat hálózaton (nagyobb méretű eszköz mentése)
#### Közvetítő közeg: FTP, NFS (Network File System), SAMBA, SMB, WebDAV 
#### szolgáltatott tárhely típusa: távoli NAS-unkba láthatunk bele, könnyen integrálható vállalati környezetbe.


### Mi az a SAN (Storage Area Network)? Próbáld meg az előnyeit, hátrányait, a közvetítő közegét és szolgáltatott tárhely típusát saját szavaiddal meghatározni!

#### Rendszer, ami saját címzéssel rendelkezik (WWN – World Wide Name) sávszélességi értékek: 1, 24, 8, 16, 32 Gbit/s, Fiber Channel (üvegszálas
#### Előny: gyors, nagy sávszélesség, nagy távolság, redundáns kialakítás
#### Hátrány: drága, spec. kábelek, kártyák, üvegszál sérülékeny, fontos a hűtés, mert erősen melegszenek.
#### Közvetítő közeg: üvegszál 
#### szolgáltatott tárhely típusa: nyers diszkek, logikai egységek (LUN)


### Mi jelent a RAID (Redundant Array of Independent Disks) betűszó?

#### Redundáns (egymást helyettesítő) tömbök különálló diszkekből.

### Mi jelent az iSCSI (Internet Small Computer Systems Interface) rövidítés?
#### Azaz SCSI protokol az IP felett. Segítségével a szerverek képesek lesznek nagy távolságokból is elérni a háttértárakat, így növelhető a megbízhatóság és a katasztrófahelyzetek kezelésének hatékonysága. 
#### Az iSCSI lehetővé teszi a klienseknek (initiator)[szerver], hogy normál TCP/IP hálózaton keresztül SCSI parancsokat küldjenek adattároló eszközöknek (target)[storage]. A kliens és a szerver között nem kell  speciális és ezért meglehetősen költséges SAN hálózatot építeni. Az initiator és a target is lehet hardveres) vagy szoftveres. Hardveres initiator nem más mint egy iSCSI Host Bus Adapter hártya.



### Milyen sebességekre, illetve tároló méretekre emlékszel?
#### 10-15 TB –os diszkeket említettünk.
#### Egy SATA3-as sebessége 6Gbps = 750MB/s
