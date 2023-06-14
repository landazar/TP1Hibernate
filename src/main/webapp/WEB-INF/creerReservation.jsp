<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Informations du vol</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script src="script.js"></script>
</head>
<body>
    <h1>Informations du vol</h1>
    
    <table>
        <tr>
            <th>ID du vol</th>
            <th>Date de départ</th>
            <th>Heure de départ</th>
            <th>Date d'arrivée</th>
            <th>Heure d'arrivée</th>
        </tr>
        <tr>
            <td>${vol.idVol}</td>
            <td>${vol.dateDepart}</td>
            <td>${vol.heureDepart}</td>
            <td>${vol.dateArrivee}</td>
            <td>${vol.heureArrivee}</td>
        </tr>
    </table>
    
    <br>
    
    <h2>Compagnies aériennes</h2>
    <ul>
        <c:forEach var="compagnie" items="${vol.listeCompagnie}">
            <li>${compagnie.nom}</li>
        </c:forEach>
    </ul>
    
    <br>
    
    <h2>Aéroport de départ</h2>
    <p>${vol.aeroportDepart.nom}</p>
    
    <br>
    
    <h2>Aéroport d'arrivée</h2>
    <p>${vol.aeroportArrivee.nom}</p>
    
    <br>
    
    <h2>Informations sur les escales</h2>
    <ul>
        <c:forEach var="infoEscale" items="${vol.listeInfos}">
            <li>${infoEscale.description}</li>
        </c:forEach>
    </ul>
    
    <br>
    
    <form action="post">
        <button type="submit">Confirmer la réservation</button>
    </form>
</body>
</html>
