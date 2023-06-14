function afficherEscale()
{
	var type = document.getElementById("type");
	while (type.firstChild) {
	  type.removeChild(type.firstChild);
	}
	
	var aeroportE = document.createElement("input");
	aeroportE.type = "text";
	aeroportE.name = "aeroportE";
	aeroportE.placeholder = "Aéroport d'escale";
	
	type.appendChild(aeroportE);
	
	var heureD = document.createElement("input");
	heureD.type = "text";
	heureD.placeholder = "Heure de départ";
	heureD.name = "heureD";
	
	type.appendChild(heureD);
	
	var heureA = document.createElement("input");
	heureA.type = "text";
	heureA.name = "heureA";
	heureA.placeholder = "Heure d'arrivée";
	
	type.appendChild(heureA);
}

function afficherSansEscale()
{
	var type = document.getElementById("type");
	while (type.firstChild) {
	  type.removeChild(type.firstChild);
	}
	

}