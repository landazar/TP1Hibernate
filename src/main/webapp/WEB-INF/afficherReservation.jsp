<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>liste des réservations</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" 
crossorigin="anonymous">
</head>
<body>
<%@ include file="/WEB-INF/menu.jsp" %>

<table class="table">
  <thead>
    <tr>
      <th scope="col">id de réservation</th>
      <th scope="col">numero de reservation</th>
      <th scope="col">date de réservation</th>
      <th scope="col">numéro de vol</th>
      <th scope="col">numéro de client</th>
      <th scope="col">nom</th>
      <th scope="col">prenom</th>
      <th scope="col">action</th>
    </tr>
  </thead>
  
 <c:forEach items="${ listeReservations }" var="reservation">
	  <tbody class="table-group-divider">
	    <tr>
	      <th scope="row"><c:out value="${ reservation.idReservation }"></c:out></th>
	      <td><c:out value="${ reservation.numero }"></c:out></td>
	      <td><c:out value="${ reservation.date }"></c:out></td>
	      <td><c:out value="${ reservation.getVol().idVol}"></c:out></td>
	      <td><c:out value="${ reservation.getClient().idClient}"></c:out></td>
	      <td><c:out value="${ reservation.getClient().nom}"></c:out></td>
	      <td><c:out value="${ reservation.getClient().prenom}"></c:out></td>
	      <td><a href="supprimerReservation?idReservation=${ reservation.idReservation }"><button type="button" class="btn btn-danger">Supprimer</button></a></td>
	    </tr>
	  </tbody>
	  </c:forEach>
</table>



</body>
</html>