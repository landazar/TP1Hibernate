<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Creer un vol</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" 
crossorigin="anonymous">
<script type="text/javascript"><%@ include file="/WEB-INF/js/script.js" %></script>
</head>
<body>

 	<%@ include file="/WEB-INF/menu.jsp" %>
 	
	<section class="vh-100" style="background-color: #eee;">
	  <div class="container h-100">
	    <div class="row d-flex justify-content-center align-items-center h-100">
	      <div class="col-lg-12 col-xl-11">
	        <div class="card text-black" style="border-radius: 25px;">
	          <div class="card-body p-md-5">
	            <div class="row justify-content-center">
	              <div class="col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1">
	
	                <p class="text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4">Créer un Vol</p>
	
	                <form class="mx-1 mx-md-4" method="post">
	
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="compagnieA">Compagnie Aérienne</label>
	                    	<input type="text" name="compagnieA" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-lock fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="dateDepart">Date de départ</label>
	                    	<input type="date" name="dateDepart" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="heureDepart">Heure de départ</label>
	                    	<input type="text" name="heureDepart" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                   		<label class="form-label" for="aeroportDepart">Aéroport de Départ</label>
	                    	<input type="text" name="aeroportDepart" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="villeDepart">Ville de départ</label>
	                    	<input type="text" name="villeDepart" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="dateArrivee">Date d'arrivée</label>
	                    	<input type="date" name="dateArrivee" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="heureArrivee">Heure d'arrivée</label>
	                    	<input type="text" name="heureArrivee" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="aeroportArrivee">Aéroport d'arrivée</label>
	                    	<input type="text" name="aeroportArrivee" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="d-flex flex-row align-items-center mb-4">
	                    <i class="fas fa-user fa-lg me-3 fa-fw"></i>
	                    <div class="form-outline flex-fill mb-0">
	                    	<label class="form-label" for="villeArrivee">Ville d'arrivée</label>
	                    	<input type="text" name="villeArrivee" class="form-control" />
	                    </div>
	                  </div>
	                  
	                  <div class="mb-3">
						    <div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="escale" value="Escale" onclick="afficherEscale()">
						  <label class="form-check-label" for="Escale">Escale</label>
						</div>
						<div class="form-check form-check-inline">
						  <input class="form-check-input" type="radio" name="escale" value="Sans escale" onclick="afficherSansEscale()">
						  <label class="form-check-label" for="sansEscale">Sans escale</label>
						</div>
					   </div>
					   
					   <div id="type"></div>
	
	                  <div class="d-flex justify-content-center mx-4 mb-3 mb-lg-4">
	                    <button type="submit" class="btn btn-primary btn-lg">Enregistrer</button>
	                    <button type="reset" class="btn btn-primary btn-lg">Annuler</button>
	                  </div>
	                </form>
	
	              </div>
	              <div class="col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2">
	
	                <img src="https://www.inc-conso.fr/sites/default/files/avion-800_1.png"
	                  class="img-fluid" alt="Sample image">
	    		</div>
	            </div>
	          </div>
	        </div>
	      </div>
	    </div>
	  </div>
	</section>
</body>
</html>