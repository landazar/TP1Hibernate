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
	
	var villeE = document.createElement("input");
	villeE.type = "text";
	villeE.name = "villeE";
	villeE.placeholder = "Ville d'escale";
	
	type.appendChild(villeE);
	
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