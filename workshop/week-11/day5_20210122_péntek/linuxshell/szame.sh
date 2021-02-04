

read -rp "adj meg barmit es ellenorzom hogy szam vagy sem:" cucc

if [ "$cucc" = "0"  ] || ( [ ! "$(echo $cucc | grep ^0)" ]  &&  [ ! "$(echo $cucc | tr -d [:digit:])" ] ) || ([ ! "$(echo $cucc | grep ^- | cut -d"-" -f2- | tr -d [:digit:])" ] && [ $(echo $cucc | grep ^-[1-9]) ]);then 
echo "$cucc az egeszen biztosan valamilyen egesz szam vagy pozitiv vagy negativ vagy 0";else 
echo "$cucc szabvanyos decimalis szamkent nem ertelmezheto";fi




