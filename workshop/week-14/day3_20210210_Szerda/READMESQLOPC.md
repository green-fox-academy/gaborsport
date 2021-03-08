## Tananyag áttekintés

### Mi az adat?

#### Az adat elemi ismeret. Az adat tények, fogalmak olyan megjelenési formája, amely alkalmas emberi eszközökkel történő értelmezésre, feldolgozásra, továbbításra. Az adatokból gondolkodás vagy gépi feldolgozás útján információkat, azaz új ismereteket nyerünk.
#### Az informatikában a programok bizonyos adatokkal végeznek különböző műveleteket. Egy adattípus definiálása annyit jelent, hogy megadjuk hogy mi az értékkészlet (értelmezési tartomány) és milyen műveleteket végezhetünk velük, mely művelet mit jelent.
#### Az adattípusok segítségével definiálhatunk aztán változókat (program futása során változik az értéke) és konstansokat (program futása során az értéke változatlan, állandó.)

### Mi az adatbázis?
#### Az adatbázis (DB - Database) olyan adathalmaz, amely az adatokon kívül a köztük lévő kapcsolatokat (reláció) és a rájuk vonatkozó információkat is tárolja

####Mi a Strukturált lekérdező nyelv (Structured Query Language)?

#### Lekérdező nyelv relációkban tárolt információk visszanyerésére, minimális adatbeviteli és módosítási lehetőségekkel

#### Nem algoritmikus

#### Parancsnyelv jellegű, megfogalmazhatjuk, mit akarunk csinálni, de a megoldási algoritmust nem kell megadni. Nincsenek benne ciklusok, feltételes elágazások, stb.

#### Mintaillesztéses, halmazorientált: A táblákat mint a sorok (rekordok) halmazát tekintjük. Az adott utasításban megfogalmazott feltételnek eleget tevő összes sor részt vesz a műveletben

#### Szabványos: Illeszkedik az SQL szabványhoz. A szabványban van egy SQL utasításcsoport, amelyet minden SQL alapú szoftver implementációnak meg kell valósítani, de mindegyik implementáció plusz lehetőséget is nyújt a standard SQL-hez képest, felülről kompatibilis a szabvánnyal

### Mi a relációs adatbázis?

#### A relációs adatbázis az adatokat relációkban (kapcsolatokban) tárolja, amelyek a felhasználó számára táblák formájában jelennek meg. A táblában egy sort rekordnak neveznek, a rekord mezőkből áll össze.

#### Relációs adatmodell - alapfogalmak:

#### Tábla - reláció: rekordokban tárolja az adatokat

#### Oszlop - attribútum: táblán belül egyedi névvel kell rendelkeznie és azonos típusú adatokat tartalmaz.

#### Sor - rekord: összetartozó adatokat tartalmaz

#### Mező: az oszlop és sor keresztmetszete, egyedi adatokat tartalmaz

### Mi az a tábla?
#### Másnéven attribútum. Egy táblán belül egyedi névvel rendelkezik és azonos típusú adatokat tartalmaz. Különböző táblák tartalmazhatnak azonos nevű oszlopokat. Az oszlopok sorrendje lényegtelen.

### Milyen adattípusokat tudunk tárolni egy oszlopban?
#### Az adattípus a meghatározására szolgál az oszlop, melyet az oszlop létrehozásakor kell megadni. Az adattípusok lehetnek: numerikus, karakterek / szöveg, dátum vagy bináris.

### Milyen típusú tábla relációk léteznek?
#### A relációs adatbázis az adatokat relációkban (kapcsolatokban) tárolja, amelyek a felhasználó számára táblák formájában jelennek meg. A táblában egy sort rekordnak neveznek, a rekord mezőkből áll össze: tábla, mező, rekord, kulcsok, nézettábla, kapcsolatok.

### Mi az elsődleges kulcs (primary key)? Miért fontos?
##### Elsődleges kulcs: a tábla rekordjainak egyértelmű azonosítója, értéke egyedi.
#### egyedi azonosítója a sornak (egész rekordot meghatározza)
#### esetek 95%-ban van elsődleges kulcs
#### szokásos elnevezés: pk_tablanev

### Mi az idegen kulcs (foreign key)? Miért fontos?
#### Idegen kulcs: olyan azonosító, amelynek segítségével egy másik tábla elsődleges kulcsára hivatkozhatunk.

#### Idegen kulcsokat kétféleképpen deklarálhatjuk:
#### Az idegen kulcs egy attribútumra vonatkozik
    REFERENCES <tábla>(<attribútum>)
#### A CREATE TABLE utasítás végén deklaráljuk
     FOREIGN KEY <attibútum(ok)>
     REFERENCES <tábla>(<attribútum(ok)>)

### Mit jelent a CRUD?

#### A CRUD mozaikszó a Create (létrehoz), Read (olvas), Update (módosít) és Delete (töröl) szavak kezdőbetűiből tevődik össze és meghatározza az adatokon végezhető alapműveleteket.

#### Ebben az esetben az objektumokra és az objektumok attribútumaira vonatkoztatjuk az alapműveleteket. Az alapműveleteket úgy képzeljük el, mint olyan műveletcsoportok, amelyek több lehetőséget foglalnak magukba. Például a Read (olvas) művelet alatt az adat kinyerésének minden olyan formáját értjük, amely nem töröl, módosít vagy hoz létre új adatot. Így, a keres, listáz, lekérdez műveletek is az olvas csoportba tartoznak.

#### A CRUD mátrix egy táblázat, amelynek oszlopainak címében a használati esetek nevei, sorainak a címében az osztályok nevei szerepelnek. A táblázat cellái a CRUD műveleteket tartalmazzák, akár részletezve vagy csupán a C, R, U, D betűkkel megadva a vonatkozó műveleteket.

#### A CRUD mátrix elkészítésekor a következő kérdéseket tegyük fel:
     Create - A használati eset létrehoz objektumot
     Read - A használati eset hozzáfér az objektumhoz, annak érdekében, hogy egy vagy több attribútumát olvassa
     Update - A használati eset megváltoztatja az objektum attribútumainak értékét
     Delete - A használati eset törli az objektumot

#### Ezek a tartós tárolás négy alapvető funkciói. A read helyett néha a retrieve, az update helyett a modify, és a delete helyett a destroy angol szavak használatosak.

#### Az egyes nyelvekben (lekérdező, jelölő, programozási) lehetnek ezeknek szinonímái:

### Hogy készíthetünk egy adatbázist?
    Táblák létrehozásával, jogosultságok definiálásával.
    Elsődleges és másodlagos kulcsok megadásával.
    Adatok feltöltésével.
    stb.

### Hogy válthatunk az adatbázisok között?

### Hogy készíthetünk egy táblát?

#### CREATE TABLE table_name (column1 datatype, column2 datatype, column3 datatype, .... );

### Hogy nézhetjük meg a már létező táblákat?
#### Egy táblát 2 féle nézetben lehet használni, ill. megtekinteni:
    Tervező nézet - Ebben a nézetben van lehetőségünk kialakítani és módosítani a tábla szerkezetét, vagyis azt, hogy milyen mezőket tartalmazzon és azok a mezők milyen tulajdonságokkal rendelkezzenek.
    Adatlap nézet - Ebben a nézetben tudjuk az adatokat felvinni, módosítani, ill. törölni a táblából.

### Hogy nézhetjük meg a jelenlegi tábla tulajdonságait?
#### MS SQL-ben pl. SELECT * FROM sys.tables

### Hogy kérhetjük le az összes adatot egy táblából?
#### SELECT * FROM table;

### Hogy kérhetjük le bizonyos oszlopok összes adatát egy táblából?
#### SELECT oszlopnév from table

### Hogy kérhetjük le bizonyos adatokat egy táblából?
#### WHERE feltételek beállításával.

### Milyen műveletek vannak?
    Matematikai: +, -, *, /, %
    Bit: &, |, ^
    Összehasonlító: =, <, >, <>, <=, >=
    Értékadó: +=, -=, *=, /=, %=, &=, ^-=, |*=
    Logikai: ALL, ANY, AND, BETWEEN, EXISTS, IN, LIKE, NOT, OR, SOME

### Hogy tudunk adatot hozzáadni egy táblához?
#### INSERT INTO table_name (column1, column2, column3, ...) VALUES (value1, value2, value3, ...);

### Hogy tudunk adatot módosítani egy táblában?
#### UPDATE table_name SET column1 = value1, column2 = value2, … WHERE condition;

### Hogy tudunk adatot törölni egy táblából?
#### DELETE FROM table_name WHERE condition;

### Hogy tudod csak a különböző értékeket lekérdezni?
#### SELECT DISTINCT column1, column2, … FROM table_name;

### Hogy tudod befolyásolni az eredmény sorrendjét?
#### SELECT column1, column2, … FROM table_name ORDER BY column1, column2, ... ASC|DESC;

### Mik a gyakori aggregáló függvények?
    COUNT – megadja a tábla sorainak számát.
    SUM – megadja a paraméterében szereplő oszlop adatainak az összegét az összes sorra. Csak numerikus attribútumra alkalmazható.
    AVG – megadja a paraméterében szereplő oszlop adatainak az átlagát az összes sorra. Csak numerikus attribútumra alkalmazható.
    MIN – megadja a paraméterében szereplő oszlop adatainak a minimumát az összes sorra. Csak numerikus attribútumra alkalmazható.
    MAX – megadja a paraméterében szereplő oszlop adatainak a maximumát az összes sorra. Csak numerikus attribútumra alkalmazható.

### Hogy tudunk lekérdezni egyszerre több táblából?
#### Ha két táblából szeretnénk egyszerre lekérdezni, akkor a táblákat össze kell kapcsolnunk. Erre szolgál a JOIN kulcsszó. Három fajtája van:
    INNER JOIN (kereszt)
    LEFT JOIN (bal)
    RIGHT JOIN (jobb)

#### Tudnunk kell azt is hogy az összekapcsoláskor megadhatunk az ON paraméter után egy feltételt is, ami alapján összeválogatja a sorokat. Ha viszont nem adunk meg ilyen feltételt, akkor minden sort minden sorral össze fog párosítani, ez két kétsoros táblánál 4 sort, két háromsoros táblánál 9 sort, két négysoros táblánál 16 sort ad vissza. Tehát a sorok száma a két tábla sorainak a számának a szorzatával egyezik meg.