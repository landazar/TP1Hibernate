<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Confirmation de réservation</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
    <script src="script.js"></script>
</head>
<body>
    <h1>Confirmation de réservation</h1>
    
    <h2>Votre réservation a été confirmée avec succès !</h2>
    
    <p>Numéro de réservation : ${idRes}</p>
    
    <p>Merci pour votre réservation.</p>
    
    <form action="index.jsp">
        <button type="submit">Retour à la page d'accueil</button>
    </form>
    
</body>
</html>
