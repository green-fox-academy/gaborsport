$title = "Kérem a véleményed!"

$message = "Szereted-e a PowerShellt?"

 

$yes = New-Object System.Management.Automation.Host.ChoiceDescription `

    "&Igen", "Már nagyon szeretem."

 

$no = New-Object System.Management.Automation.Host.ChoiceDescription `

    "&Nemsokára fogom", "Még nem, de hamarosan nagyon fogom szeretni."

 

$maybe = New-Object System.Management.Automation.Host.ChoiceDescription `

    "&Talán", "Még sokat kell tanulnom, de szerintem menni fog."

 

$options = [System.Management.Automation.Host.ChoiceDescription[]](

    $yes, $no, $maybe)

 

$result = $host.ui.PromptForChoice($title, $message, $options, 0)

 

switch ($result)

    {

        0 {"Azt mondtad, hogy szereted!"}

        1 {"Azt mondtad, hogy szeretni fogod."}

        2 {"Azt mondtad, hogy éppen tanulod."}

    }