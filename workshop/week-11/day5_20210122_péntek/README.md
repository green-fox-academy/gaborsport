### Milyen kezdősorral érdemes kezdeni a bash szkriptjeinket, hogy a megfelelő parancsértelmező alatt induljon el?
#### UNIX-okon több féle shell / parancsértelmező létezik és ennek megfelelően sokféle shell-ben írhatjuk meg szkriptjeinket. Ennek ellenére nem kell zavarba jönnünk a bőségtől, ugyanis bash (sh, ksh)-ban érdemes manapság írni scriptjeinket, ha megakarjuk másokkal is osztani, hogy olyan UNIX-okon is fussanak ahol esetleg csak ez környezet elérhető.
     
 #### A továbbiakban alapvetően a Bourne Again Shell programozását fogjuk taglalni, és minden szkriptfájl elején a:
     
     #!/usr/bin/bash
 #### sorral jelezzük ezt. Ez a technika a UNIX alapú rendszerek minden fajta szöveges szkript kezelésére jellemző.
     
### Mi az a parancs amivel a képernyőre tudunk írni UNIX shell szriptben?
#### A szokásos korábbi Hello World! szkript hogyan néz ki UNIX shell-ben:
     
     #!/usr/bin/bash  
     echo Hello World! 
     
### Hogyan kell használni a változóneveket bash programozáskor?
#### Egy változónak a következőképpen adhatsz érteket (sh, ksh, bash, zsh):
     
     valtozo=ertek
     
#### A változó értekét mindegyik shell-ben ugyanúgy nyerheted ki, mégpedig a dollárjellel:
     
     echo $valtozo 