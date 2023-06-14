<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Accueil</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.13/css/select2.min.css" />
   
   
   <link rel="stylesheet" href="sup/style.css">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>


</head>
<body>

<%@ include file="/WEB-INF/menu.jsp" %>




  <!--
   <style>
    #image2 {
      max-width: 1000px; /* Définir la largeur maximale souhaitée */
      /* max-height: 500px; /* Définir la hauteur maximale souhaitée */
       object-fit: cover; /* Recadrer l'image pour remplir le conteneur */
    }
  </style>
-->


<div id="carouselExample" class="carousel slide">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <div class="d-block w-100 position-relative">
        <img src="sup/avion4.jpg" id="image1" class="carousel-image" alt="...">
        <div class="form-overlay">
          <form>
            <input type="text" name="input1" placeholder="Ville de départ">
            <input type="text" name="input2" placeholder="Ville d'arrive">
            <input type="text" name="input3" placeholder="Jour de Vol">
            <input type="submit" value="Voir les vols disponible">
          </form>
  <div class="carousel-caption">
    <h5>Nos vols</h5>
    <p> Nos vols offre un grand pannele et se reperteris sur plusieur pays, yen a tout le temps , ....</p>
      		
      		<form>
                <input type="submit" value="voir nos vols">
          </form>
  
  </div>
        </div>
      </div>
    </div>
    <div class="carousel-item">
  <img src="sup/guichet.jpg" id="image2" class="d-block w-100" alt="...">
  <div class="carousel-caption">
    <h5>réservation</h5>
    <p> Pour nos client,  ya il y a des réduction , des class A, de l'espace , ...</p>
    
    		<form>
                <input type="submit" value="reserver">
          </form>
  </div>
</div>
  </div> 
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>







</body>
</html>