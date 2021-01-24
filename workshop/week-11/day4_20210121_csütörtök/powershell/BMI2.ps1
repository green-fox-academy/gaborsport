# public class Bmi {
  # public static void main(String[] args) {
    # double massInKg = 81.2;
    # double heightInM = 1.78;

    #// Számíttasd és írasd ki a testtömeg-indexet (BMI)
    #// a változókat használva
  #}
#}

##### Java #####


 # @echo off

# chcp 65001

# :ujrafitten 
# echo Helló Belló

# echo Kérjük adja meg a magasságát?
# set /P magasság= 

# echo Kérjük adja meg a testsúlyát?
# set /P testsúly=

#set /A Bmi= %testsúly%*10000/%magasság%/%magasság%
# echo %Bmi% 

# choice  /C:IN /M (I/N)
# if errorlevel 2 goto N
 # :N

##### Batch #####

clear-host 
Write-Host "" 
Write-Host "--------------------------------------------------------" -for cyan 
Write-Host "---------------------Testtömeg index--------------------" -for cyan 
Write-Host "------------------------Kalkulátor----------------------" -for cyan
Write-Host "--------------------------------------------------------" -for cyan 
Write-Host "" 
Write-Host " Kérlek nyomj egy entert a folytatáshoz."
Write-Host "" 
Write-Host "--------------------------------------------------------" -for cyan 
Write-Host "--------------Kérlek add meg a testsúlyodat-------------" -for cyan 
Write-Host "--------------------------------------------------------" -for cyan 
[double]$bodymass = Read-Host 
Write-Host "A testsúlyod $bodymass kg"
Write-Host "" 
Write-Host "--------------------------------------------------------" -for cyan 
Write-Host "--------------Kérlek add meg a magasságodat-------------" -for cyan 
Write-Host "--------------------------------------------------------" -for cyan 
[double]$heigth = Read-Host
Write-Host "A testsúlyod $heigth cm"
[double]$bmiCalculation = $bodymass*10000/($heigth * $heigth)
[double]$BMI = [math]::Round($bmiCalculation,1)
Write-Host "" 
Write-Host "--------------------------------------------------------" -for cyan 
Write-Host "----------------A te testtömeg indexed $BMI---------------" -for cyan 
Write-Host "--------------------------------------------------------" -for cyan 
if ($BMI -lt 18) {
    Write-Host "--------------------------------------------------------" -for cyan 
    Write-Host "------------Az egészségesnél voványabb vagy.------------" -for cyan 
    Write-Host "--------------------------------------------------------" -for cyan 
}
elseif ($BMI -gt 18 -and $BMI -lt 25) {
    Write-Host "--------------------------------------------------------" -for cyan 
    Write-Host "--------------A testtömeg indexed normális.-------------" -for cyan 
    Write-Host "--------------------------------------------------------" -for cyan 
}
elseif ($BMI -gt 25 -and $BMI -lt 30) {
    Write-Host "--------------------------------------------------------" -for cyan 
    Write-Host "-----------------Kissé túlsúlyos vagy.------------------" -for cyan 
    Write-Host "--------------------------------------------------------" -for cyan 
}
elseif ($BMI -gt 30) {
    Write-Host "--------------------------------------------------------" -for cyan 
    Write-Host "----------------Erősen túlsúlyos vagy.------------------" -for cyan 
    Write-Host "--------------------------------------------------------" -for cyan 
}


