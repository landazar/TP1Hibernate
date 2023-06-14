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

<!--  faut rajouter au menu la possibilité de revenir ici. -->
<!--  et étoffé la page.   et mettre mieu que id = conttttt1-->

  <div class="container"  id="conttttt1">
    <img src="sup/avion4.jpg" class="background-image" id="conttttt2" alt="Background Image">
    <div class="form-container" id="conttttt3">
      <form method="post" action="com/inti/servlet/RechercherVols">
        <div class="row mb-3">
          <div class="col">
            <label for="departure">Ville de départ</label>
            <input type="text" class="form-control input_index" id="departure" name="dep" placeholder="Entrez la ville de départ" required>
          </div>
          <div class="col">
            <label for="arrival">Ville d'arrivée</label>
            <input type="text" class="form-control input_index" id="arrival" name="arr" placeholder="Entrez la ville d'arrivée" required>
          </div>
        </div>
        <div class="row mb-3">
          <div class="col">
            <label for="date">Date de vol</label>
            <input type="date" class="form-control input_index" name="date" id="date" required>
          </div>
          <div class="col">
          <br>
            <button type="submit" class="btn btn-primary input_index">Rechercher les vols</button>
          </div>
        </div>
      </form>
    </div>
  </div>


</body>
</html>