## Tananyag áttekintés
### Mik azok a környezeti változók és hogyan lehet beállítani őket?
#### A konténerizációt úgy kell elképzelni mint egy virtuális gépet azzal a kivétellel, hogy nem kell számára előre erőforrást dedikálni. Emellett egy build tartalmazza az összes szükséges dependenciát, így könnyen átmozgatható egy másik kliensre.

Telepítsd a Docker Community verzióját a gépedre:

Windows: Docker Desktop for Windows /

https://docs.docker.com/docker-for-windows/install/

Installáláshoz:

sudo apt install -y docker.io

apt install curl – ez célszerű, hogy fent legyen docker telepítés előtt.

curl -fsSL https://get.docker.com/ -o get-docker.sh

sh get-docker.sh

docker (ezzel tudom meg, hogy van-e docker az UBUNTU már a gépünkön és ki is írja, hogy mivel kell telepíteni)

sudo systemctl enable --now docker

sudo usermod -aG docker $USER

sudo apt-get update

sudo reboot now

Centos

(https://phoenixnap.com/kb/how-to-install-docker-on-centos-8)

Become a root

sudo su
Use DNF to add and enable the official Docker CE repository.

sudo dnf config-manager --add-repo=https://download.docker.com/linux/centos/docker-ce.repo
Install containerd.io

sudo dnf install https://download.docker.com/linux/centos/7/x86_64/stable/Packages/containerd.io-1.2.10-3.2.el7.x86_64.rpm
Install the latest version of docker-ce

sudo dnf install docker-ce -y --allowerasing

Enable Docker

sudo systemctl enable --now docker

Check docker is active and running

systemctl status docker

Add your user to the docker group with the following command:

sudo usermod -aG docker $USER

id $USER

Disable firewalld on CentOS 8

sudo systemctl disable firewalld

At this point, it is recommended to reboot your system for the change to take effect.

Testing Docker Installation by Pulling Test Container Image

docker pull alpine

Check if the image is available:

docker images

Initiate Alpine Container Image

docker run -it --rm alpine /bin/sh

/# apk update

You have successfully installed and configured Docker on CentOS 8.
### Mi az a konténerizáció?
#### a számítógépen belüli zárt rendszer, lehetővé teszi az alkalmazásokelkülönítését az infrastruktúrától úgy, hogy egy konténernek nevezett, lazánizolált környezetbe csomagolja be és abban futtatja őket.

### Miért jó konténerizálni az alkalmazásainkat?
#### Vegyük a klasszikus példát, a feladat több alkalmazás hosztolása on-premise vagy felhős infrastruktúrán. Mára a virtuális gépek (VM) használata rutinnak számít ilyen feladatokra, tehát viszonylag egyszerűen indíthatunk akár 3-4 virtuális gépet az alkalmazásainknak. 
#### Ez esetben minden virtuális gép saját operációs rendszert (OS) futtat, jelentős erőforrásokat lekötve, és éppen a VM-en futó operációs rendszer nehézkessége miatt az elindulás minimum pár percet igénybe vesz.
####  A virtuális gépek kapacitásának becslése sem egyszerű a megfelelő CPU, RAM méretezésre nézve, ha átlagos 50%-os kihasználtságot elérünk, már elégedettek lehetünk, nem beszélve a VM I/O overhead-ről, amely ugyancsak fontos paraméter és számolnunk illik vele.

#### Ezzel szemben nézzük meg a konténerek erőforrás igényeit: egy közös OS kernelen futnak (ez lehet egy VM operációs rendszere is), és a Docker engine ez alatt futtatja a konténereket, amik adott esetben meg tudják osztani a library-ket egymással, azonban a processzek, memória területek teljesen szeparáltak egymástól. 
#### Ez a gyakorlatban azt jelenti, hogy egy üres konténer jellemzően 1 másodperc alatt elindul, szemben egy üres operációs rendszer 2-5 percével. A szerveren belül az erőforrásokat is hatékonyabban lehet kihasználni, hiszen könnyen lehet, hogy egy erőforrás igényesebb "App A" mellé egy kis igényű "App B" instancia is megférne, amíg a kapacitás rendelkezésre áll, majd mozgathatóak tovább más felhasználatlan szerver kapacitásokhoz. 
#### Itt érdemes megjegyezni, hogy a fenti megállapítások, értékek jellemzően Linux-on futó konténerekre vonatkoznak, mivel a Windows-on a Docker a Hyper-V virtualizációs réteget használja - szemben a Linux cgroups és namespace kernel szintű megvalósításával.
#### Egy másik nyomós érv a konténerek mellett a hordozhatóság. Számtalan olyan hibát látni hagyományos környezetekben, amikor egy új production release előállítása nem sikerül a futtató környezetek különbözősége miatt. Más lesz az operációs rendszer verzió, más library-k, engedélyezett dependency-k, stb. az éles rendszerben, mint teszten, és rendszerint mindig más, mint a fejlesztői rendszereken. Ezt a problémát a konténerek nagyon egyszerű módon orvosolják: mivel a konténerek teljesen izoláltan futnak az OS-től, előre definiált, hogy milyen lib-ek, dependency-ket használjon a konténer futtató környezet, magyarul minden olyasmit, ami az alkalmazásunk futtatásához szükséges. Ezek a definíciók szkriptekként vagy leíró fájlokban vannak meghatározva, tehát verziózhatók és automatikusan telepítenek minden szükséges komponenst. Ezzel a megoldással a környezetek különbözőségének ki is húzták a méregfogát, a konténer képet (Image) egyszer kell összeállítani (Build), majd a fejlesztők, a tesztelők és az éles rendszer is ugyanazt a környezetet használhatja (Ship&Deploy).


### Mi az a Docker?
#### a docker egy olyan platform, amely alkalmazások konténerekben való fejlesztésére, szállítására és futtatására szolgál. A platform felhasználható alkalmazások létrehozására, tesztelésére és terjesztésére, szabványos egységekben, úgynevezett konténerekben történő gyűjtésével foglalkozik. A Docker konténerek elkülönített környezetek, ahol az alkalmazások más folyamatok beavatkozása nélkül futtathatók. Hasonlóan a virtuális gépek környezetéhez, az egyes konténerekhez specifikus számítási erõforrásokat allokálhatnak. A virtuális gépekkel ellentétben a Docker nem igényel hardveres emulációt, hanem minden gazdagép fizikai hardverét használja.
     
#### Az erőforrás-hatékonyság és a továbbfejlesztett rendszer-teljesítmény előállítása érdekében a tárolást a virtualizáció természetes fejlődésének tekinthetjük. Sőt, mivel rendelkeznek az alkalmazások - beleértve a könyvtárakat, a rendszer eszközöket és a kódokat is - helyes végrehajtásához szükséges eszközökkel, a konténerek egyszerűsítik az alkalmazások telepítését anélkül, hogy aggódnunk kellene a futási környezet konfigurációja miatt.
     
### Hogyan tudok új konténert indítani?
#### docker run -d (háttérben való futtatás is egyben) [image name]

### Mi az a konténer képfájl?
#### A konténerek image-ekből készülnek. Alapértelmezés szerint ezeket az image-fájlokat letöltik a Docker Hubból, a Docker által biztosított hivatalos nyilvántartásból.
#### Bárki tárolhatja az image-fájljait a Docker Hub-on. Ez lehetővé teszi az előrecsomagolt image-k használatát az alkalmazások alapjaként.

### Honnan és hogyan tudok képfájlokat letölteni?
#### https://hub.docker.com/
#### docker pull [imagename]
### ogyan tudom listázni a letöltött képfájlokat?

#### docker images 

### Hogyan tudom listázni a futó konténereket?

#### docker ps 

### Hogyan tudom leállítani és törölni a konténereket?

#### docker stop [imagename or ID]
#### docker rm [imagename or ID]


### Hogyan tudok konténer hálózati portokat elérhetővé tenni a külvilág számára?

#### docker run -p <hostPort>:<containerPort> imageName 
### Hogyan tudok belépni egy már futó konténerbe a parancssor segítségével?
#### docker exec -it konténer ID vagy konténer név bash