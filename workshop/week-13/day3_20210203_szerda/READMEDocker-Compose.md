## Tananyag áttekintés

### Mi az a Docker Compose és milyen problémát old meg?
#### Sok mikroszerviz összessége
#### A compose egy karmester, ami összehangol!


### Mi az a YAML?
#### #### Yet Another Markup Language
#### speciális tulajdonsága, hogy nem szereti a tab-okat, nem tudja értelmezni a tab által értelmezett karaktereket.

### Hogyan lehet új Docker Compose konfigurációt összeállítani?
#### docker-compose-yml

### Mi az a Docker Compose szolgáltatás (service)?
#### docker-compose.yml konfigurációs fájlt, amely meghatározza a virtuális gépen futtatandó Docker-tárolókat. A fájl meghatározza az egyes tárolókban futtatandó rendszerképet, a szükséges környezeti változókat, a függőségeket, a portokat és a tárolók közötti kapcsolatokat. 
### Hogyan lehet hálózati csatlakozásokat kialakítani?
#### portokkal
### Hogyan tudja egyik szervíz látni a másikat?
#### portokon keresztül látják egymást

### Hogyan lehet tárolókat (volume) megadni Docker Compose segítségével?
#### https://devopsheaven.com/docker/docker-compose/volumes/2018/01/16/volumes-in-docker-compose.html 
### Hogyan lehet környezeti változókat megadni Docker Compose segítségével?
#### például
#### enviroment: 
####   MYSQL_ROOT_PASSWORD: password
####   MYSQL_USER: ca
####   MYSQL_PASSWORD: password
####   MYSQL_DATABASE: CA_DB
#### enviroment alatt konfigurálni tudunk system beállításokat, amikre szükségünk van.

### Mi az a Docker Swarm és/vagy Kubernetes?

#### docker (image) - 1 db konténer
#### docker-compose - több konténer
#### docker-swarm - nagyon sok konténer
#### kubernetes - 100+ konténer
#### https://flyonthecloud.com/hu/blog/kubernetes-docker-swarm/ 
#### Azon vállalkozások életében, amelyek fő hajtóereje egy alkalmazás vagy egy informatikai rendszer, a skálázhatóság, a stabilitás és a megvalósítás gyorsasága hatalmas szerepet játszik. Emiatt egyre több vállalat fordul a konténerezés felé. A konténerezés az alkalmazáselemek (folyamatai, függőségei, könyvtárai, konfigurációs fájljai vagy helyi adatbázisai) dinamikusan kezelt tárolókba történő elhelyezéséről szól. 
     
     
#### A konténerezésnek számos előnye van. Az egyik az áthelyezhetőség, ami azt jelenti, hogy az egyszer megírt rendszer különféle környezetekben futtatható. Ennek köszönhetően a fejlesztők új funkciók létrehozására fordíthatják az idejüket, ahelyett, hogy a rendszert az infrastruktúra követelményeihez igazítanák. Maga a megvalósítási folyamat is egyszerűbb, gyorsabb és biztonságosabb.
     
#### Egy ezer vagy millió konténerből álló, kiterjedt rendszer esetén azonban a kezeléshez szükségünk van egy alkalmazáskezelő (ang. ún. orchestration) platformra. Az „orchestration” lehetővé teszi az automatizálás, a csoportmenedzsment, a fejlett folyamatfigyelés, a változásszabályozás vagy -felderítés és a hibák automatikus javításának bevezetését.
     
 #### A legnépszerűbb alkalmazáskezelő platformok közé tartozik a Kubernetes és a Docker Swarm.