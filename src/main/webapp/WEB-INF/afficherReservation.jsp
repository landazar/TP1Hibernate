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
      <th scope="col">numéro de réservation</th>
      <th scope="col">date de réservation</th>
      <th scope="col">numéro de vol</th>
      <th scope="col">numéro de client</th>
      <th scope="col">nom</th>
      <th scope="col">prenom</th>
    </tr>
  </thead>
  
 
	  <tbody class="table-group-divider">
	<c:forEach items="listeReservation" var="reservation">
	    <tr>
	      <th scope="row">1</th>
	      <td><c:out value="${ reservation.idReservation }"></c:out></td>
	      <td><c:out value="${ reservation.date }"></c:out></td>
	      <td><c:out value="${ reservation.date }"></c:out></td>
	      <td><c:out value="${ reservation.date }"></c:out></td>
	      <td><c:out value="${ reservation.date }"></c:out></td>
	      <td><c:out value="${ reservation.date }"></c:out></td>
	      <td><a href="supprimerReservation?idReservation= ${ reservation.idReservation }"><button type="button" class="btn btn-danger">Supprimer</button></a></td>
	    </tr>
	</c:forEach>
	  </tbody>
</table>



</body>
</html>