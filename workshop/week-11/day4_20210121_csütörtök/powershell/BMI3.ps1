clear

Write-Host BMI count

$magassag = Read-Host "Your height (cm)"
$suly = Read-Host "Your weight (kg)"

$BMI = [double]$suly * 10000 /$magassag /$magassag
 Write-Host "Your BMI:" $BMI

 if ($BMI -lt 18)
    { Write-Host "Underweight" }

 elseif ($BMI -gt 18 -and $BMI -lt 25)
    { Write-Host "Normal"}

 elseif ($BMI -gt 25)
    { Write-Host "Overweight"}
