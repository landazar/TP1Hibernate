<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Créer une nouvelle réservation</title>
</head>
<body>

<form>
  <div class="mb-3">
    <label name="nom" class="form-label">Nom</label>
    <input type="text" class="form-control" id="nom">
    <div class="form-text"></div>
  </div>
  <div class="mb-3">
    <label name="email" class="form-label">Email</label>
    <input type="email" class="form-control" id="email">
  </div>
  <div class="mb-3">
    <label name="tel" class="form-label">Téléphone</label>
    <input type="tel" class="form-control" id="tel">
  </div>
    <div class="mb-3">
    <label name="départ" class="form-label">Ville de départ</label>
    <input type="text" class="form-control" id="départ">
  </div>
    <div class="mb-3">
    <label name="arrivée" class="form-label">Ville d'arrivée</label>
    <input type="text" class="form-control" id="arrivée">
  </div>
    <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">First class</label>
  </div>
    <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Economy</label>
  </div>
    <div class="mb-3 form-check">
    <input type="checkbox" class="form-check-input" id="exampleCheck1">
    <label class="form-check-label" for="exampleCheck1">Business</label>
  </div>
  
  <button type="submit" class="btn btn-primary">Soumettre</button>
    <button type="submit" class="btn btn-red">Annuler</button>
</form>

</body>
</html>