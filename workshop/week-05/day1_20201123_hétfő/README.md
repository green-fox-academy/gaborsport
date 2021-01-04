## Workshop 20201123hétfő
#### Telepítsünk fel egy VMware Workstation Player-t a Windows-os gépünkre

#### Keress utána, hogy milyen gépterem besorolási szintek vannak! Készíts összehasonlító táblázatot!


 | Szint / Réteg        | Elvárások | Elérhetőség |
 |----------------------|-----------|-------------|
 | Első szint (Tier 1)   | Alapvető infrastruktúra 99,671% várható rendelkezésre állással - Nem redundáns | 28 óra 49 perc kiesés |
 | Második szint (Tier 2) | Eléri és meghaladja az első szintet - redundáns - 99,741% rend. állás | 22 óra 41 perc kiesés |
 | Harmadik szint (Tier 3) | Eléri és meghaladja a második szintet - több független hálózati kapcsolat - két független áramforrás - 99,982% rendelkezésre állás | 1 óra 34 perc kiesés |
 | Negyedik szint (Tier 4) | Eléri és meghaladja a harmadik szint - Minden hűtőberendezés két független áramforrásról működik, beleértvea hűtőberendezéseket, ventillátorokat, légkondicionálást - 99,995% rendelkezésre állás | 26,28 perc kiesés |
 
#### Mi a különbség egy Tier 3 és Tier 4 besorolású gépterem között?
 - Tier 4 meghaladja a Tier 3 szintjét.
 - Tier 4 bármely elem hibája esetén is képes ellátni az összes eszközt
  
#### Keress Tier 3 és Tier 4 géptermeket Budapesten!
 - Synergon Informatika 1191 BUdapest, VAk Bottyán u. 75.
 - Invitech Solutions , Kozma u.
 - T-system Data Center, Asztalos S. u. 
 - H1 Systems Mérnöki Szolgáltatások Kft. 1117 Budapest, Budafoki út 64.
#### Lehet-e gépteremben vízzel oltani? Indokold!
 TŰZVÉDELEM
 A szerverhelyiségekben is fennállhat a tűzveszély lehetősége, a H1 System megvédi a gépeket, az épületet, a környezetet. Egyedi megoldásokkal a cég a tűzvédelmi piac több szegmensében is ellát feladatokat. Bízzon a szakértelmünkben.
 AUTOMATA TŰZJELZŐ- ÉS OLTÓ RENDSZEREK
 eletvedelem_kiskepAnnak érdekében, hogy egy épületben a magas fokú rendelkezésre állást biztosítani lehessen, a tűzvédelemnek különös jelentőséget kell tulajdonítani. Ezek nem kizárólag az életvédelem szempontjából fontos követelmények, mivel gyakran a berendezésben nem a tűz okozza a károkat, hanem az égési füstgázok, amelyek behatolnak a készülék részeibe és károsodást okoznak, a technika üzemmegszakadásához vezetnek.

 A tűzjelző és oltórendszerek telepítése kapcsán az alábbi szabályok alkalmazása szükséges:
 
 OTSZ szabály a 2014/54 (XII.5.) törvénynek megfelelően
 MSZ EN sztenderdek
 Gyártói specifikációk
 Biztosítási követelmények
 Az automata oltórendszerek típusai:
 
 OLTÓ VIZES RENDSZEREK
  - nedves sprinkler (csak fűtött helységekben)
 - száraz sprinkler (fűtés nélküli helységekben)
 - vízköd (HI-FOG), a vízpára kisebb mint 0,1mm
 - OLTÓ GÁZAS RENDSZEREK
 - inert gas (O2 displacement): N2,CO2, Ar
 - katalitikus gáz (kémiai reakció): CaO2 – potassium-oxide (FirePro)
 - OLTÓ HABOS RENDSZEREK
 - OLTÓ POROS RENDSZEREK
      
      
#### Milyen oltórendszerek/készülékek használhatók gépteremben?
Az automatikus oltás nitrogénalapú gázzal történik, amely nem káros sem a környezetre, sem a helyiségekben elhelyezett eszközökre. 

      
#### Mi a különbség egy „rack mounted” és egy „blade” szerver között?
Megfigyelhető, hogy mivel a gépterem kialakítása, üzemeltetése vagy bérlése magas költségekkel jár, ezért a cél a rendelkezésre álló hely minél hatékonyabb kihasználása. Mivel a rack szekrények száma egy adott területen véges, valamint a rack szekrények magasság is kötött, ezért csak a gép „sűrűség” növelésével lehet a költségnövekedést elkerülni. Történelmileg így alakult át a tower szerverek rack mounted szerverekké, majd lettek egyre „alacsonyabbak” a szerverek. Egy adott szint alá (1U) azonban ez nem csökkenthető. Így a szerverek számának növeléséhez adott U helyen más módon kellett megoldani (fizikai szintű). Ez az igény hozta létre a blade technológiát.

Blade technológia esetén a rack szekrénybe beépítésre kerül egy blade keret (enclosure vagy frame). Ez 10U magas. A blade keretbe speciális szerverek: pengék építhetők be 12 db. Ez azt jelenti, hogy 10U helyre 12U helyigényű szerverparkot helyeztünk el. Ennek a megoldásnak a lényege, hogy a szerverek egyes alkatrészeit átintegráljuk a keretbe.
      
#### Mi a különbség egy desktop gép és egy szerver között?
 - Szerverek
 
      Felmerül a kérdés, hogy: Mi különböztet meg egy munkaállomást és egy szervert? A következő alfejezetekben ezt a kérdéskört járjuk körbe.
      
      A kérdés megválaszolásához az tervezett funkcionalitás irányából érdemes közelíteni, hogy könnyebben megértsük, felépítés szempontjából mi miért történik. Minden informatikai eszköz kialakításánál fontos szempont a költséghatékonyság. A munkaállomások felépítésénél arra kell felkészülni, hogy egy adott időpillanatban egy személy használja, munkanapokon, 6-10 órában. Ezzel szemben egy szervernek a hét minden napján, napi 24 órában kell működnie. Továbbá egy munkaállomás nem tervezett karbantartása egy ember munkáját akadályozza, míg egy szerver esetében ez több (akár ezres nagyságrendben) ember munkáját is akadályozhatja. Ebből adódik, hogy más prioritások kerülnek a kialakítás során előtérbe ahhoz, hogy optimális megoldást adjunk. Munkaállomások tervezése költség centrikus (minél olcsóbb), mivel nagy számban kerül felhasználásra a cégeknél, és egyszerre csak egy ember munkájának a kiesését okozza.
      
      Munkaállomás, mint szerver
      Munkaállomások esetében alapvetően hiányoznak a redundáns kiépítések, azaz a gépbe 1 CPU, 1 táp, több disk de azok nem RAID-be szervezve kerülnek beépítésre. Alaplap hőterhelésre való tervezése sem a fokozott igénybevételre van kialakítva. Valamint az egyes fő alkatrészek hibatűrése is alacsonyabb szintű. Ennek megfelelően egy alkatrész meghibásodása azonnali kiesést eredményez.
      
 - Munkaállomások 
 
      hardware szinten nem rendelkeznek olyan mélységű szenzorokon alapú monitoring rendszerrel, amelyek képesek lehetnek (ha nem is minden esetben) előre jelezni a közel jövőben fellépő meghibásodásokat.
      
      Továbbá, munkaállomás nem tartalmaz olyan management modult (HPE: iLO; DELL: iDRAC; IBM: IMM), amivel a távoli menedzsmentje megoldható lenne (az operációs rendszertől függetlenül). Azaz a gép csak akkor érhető el távolról, ha az operációs rendszer elindult, funkcionalitásának a távoli elérést biztosító része fut. Amennyiben nem elérhető OS-en keresztül a gép, akkor azt csak fizikailag a konzolról lehet újra üzemképes állapotba hozni.
      
      Ezen felül a ház méretileg kisebb és anyagában sem jelent olyan komoly fizikai védelmet, mint egy szerver kivitel esetében elvárt.
#### Oktató anyag a HPE blade technológián keresztül mutatta be blade rendszer felépítését. Keresd meg ennek a megfelelőjét a DELL esetében!
 - https://serverelite.hu/hasznalt-dell-szerverek-79/blade-szerverek-84
 - https://www.interbolt.eu/spd/009654/Dell-PowerEdge-R430-2x-Xeon-8Core-E5-2630v3-24GHz                
                    