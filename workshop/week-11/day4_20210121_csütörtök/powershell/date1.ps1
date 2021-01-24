Get-Date -DisplayHint DateTime
# Get the current date and time
Get-Date
#Get elements of the current date and time
Get-Date -Format "dddd MM/dd/yyyy HH:mm:ss K"
# In this example, a .NET format specifier is used to customize the output's format. The output is a String object.
#
#Specifier	Definition
#dddd	Day of the week - full name
#MM	Month number
#dd	Day of the month - 2 digits
#yyyy	Year in 4-digit format
#HH:mm	Time in 24-hour format - with seconds
#K	Time zone offset from Universal Time Coordinate (UTC)