foreach($nombre in $(Get-Content -Path .\lista_nombres)) {
	Write-Output "El nombre es $nombre"
	if ($nombre -eq "Juan"){
		Write-Output "Encontre a $nombre"
	}else {
		$otrosNombres++
	}
	$gender = Invoke-RestMethod -Method Get -Uri https://api.genderize.io/?name=$nombre | Select-Object -ExpandProperty Gender
	$country = Invoke-RestMethod -Method Get -Uri https://api.nationalize.io/?name=$nombre | Select-Object -ExpandProperty Country | Select-Object -First 1 -Property country_id
	
	Write-Output "El género de $nombre es: $gender"
	Write-Output "El país de $nombre es: $($country.country_id)"
}


Write-Output "CON A"
$nombresConA = $req.Content.split("`n") | Where-Object { $_ -like "A*" }

1..5 | ForEach-Object {
	$random = Get-Random -Minimum 0 -Maximum $($nombresConA.count-1)
	$nombresConA[$random]
	$gender = Invoke-RestMethod -Method Get -Uri https://api.genderize.io/?name=$nombre | Select-Object -ExpandProperty Gender
	$country = Invoke-RestMethod -Method Get -Uri https://api.nationalize.io/?name=$nombre | Select-Object -ExpandProperty Country | Select-Object -First 1 -Property country_id
}

Write-Output "CON L"
$nombresConL = $req.Content.split("`n") | Where-Object { $_ -like "L*" }

1..5 | ForEach-Object {
	$random = Get-Random -Minimum 0 -Maximum $($nombresConL.count-1)
	$nombresConL[$random]
	$gender = Invoke-RestMethod -Method Get -Uri https://api.genderize.io/?name=$nombre | Select-Object -ExpandProperty Gender
	$country = Invoke-RestMethod -Method Get -Uri https://api.nationalize.io/?name=$nombre | Select-Object -ExpandProperty Country | Select-Object -First 1 -Property country_id
}

Write-Output "Sin A y Sin L"
$nombresSinAyL = $req.Content.split("`n") | Where-Object { $_ -notlike "A*" -and $_ -notlike "L*" }

1..5 | ForEach-Object {
	$random = Get-Random -Minimum 0 -Maximum $($nombresSinAyL.count-1)
	$nombresSinAyL[$random]
	$gender = Invoke-RestMethod -Method Get -Uri https://api.genderize.io/?name=$nombre | Select-Object -ExpandProperty Gender
	$country = Invoke-RestMethod -Method Get -Uri https://api.nationalize.io/?name=$nombre | Select-Object -ExpandProperty Country | Select-Object -First 1 -Property country_id
}