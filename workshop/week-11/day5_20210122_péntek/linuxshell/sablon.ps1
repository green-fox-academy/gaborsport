# Name: sablon.ps1  
# Author: Mézga Aladár  
# Date: 2011.11.11.  
# Desc: Sablon Microsoft PowerShell szkriptekhez  
# Params: $hello - string to write out  
  
param(  
[string] $hello = $(throw "Supply the string!")  
)  
  
Write-Output $hello