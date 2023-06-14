<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Créer une réservation</title>
     <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha2/css/bootstrap.min.css">
   
</head>
<body>

	<%@ include file="/WEB-INF/menu.jsp"%>

    <h1>Créer une réservation</h1>

    <form method="post">


        <div class="mb-3">
            <label for="prenom" class="form-label">Prénom :</label>
            <input type="text" class="form-control" id="prenom" name="prenom" required>
        </div>

        <div class="mb-3">
            <label for="nom" class="form-label">Nom :</label>
            <input type="text" class="form-control" id="nom" name="nom" required>
        </div>

        <div class="mb-3">
            <label for="adresse" class="form-label">Adresse :</label>
            <input type="text" class="form-control" id="adresse" name="adresse" required>
        </div>

        <div class="mb-3">
            <label for="telephone" class="form-label">Téléphone :</label>
            <input type="text" class="form-control" id="telephone" name="telephone" required>
        </div>

        <div class="mb-3">
            <label for="email" class="form-label">Email :</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        
          <div class="mb-3">
            <input type="text" class="form-control" id="vol" name="vol" hidden="true" value="${ param.idVol }">
        </div>
        
  

        <button type="submit" class="btn btn-primary">Valider</button>
    </form>

    <script src="https://stackpath.bootstrapcdn.com/bootstrap/5.0.0-alpha2/js/bootstrap.min.js"></script>
</body>
</html>
