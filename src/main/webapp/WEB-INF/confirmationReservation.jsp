<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Confirmation de réservation</title>
    <link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM"
	crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script src="script.js"></script>
</head>
<body>
    <!-- Page pour confirmer la réservation -->
    
    <%@ include file="/WEB-INF/menu.jsp"%>

    <h1>Confirmation de réservation</h1>
    
    <h2>Votre réservation a été confirmée avec succès !</h2>
    
    <p>Numéro de réservation : ${idRes}</p>
    
    <p>Merci pour votre réservation.</p>
    
    <form action="index.jsp">
        <button type="submit">Retour à la page d'accueil</button>
    </form>
    
</body>
</html>
