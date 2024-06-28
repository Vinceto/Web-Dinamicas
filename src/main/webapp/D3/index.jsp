<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Seleccionar Número</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1/css/pico.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<main class="container">
    <h1>Seleccionar Número</h1>
    <ul>
        <% for (int i = 1; i <= 10; i++) { %>
        <li><a href="../procesarNumero?num=<%= i %>">Número <%= i %></a></li>
        <% } %>
    </ul>
</main>
</body>
</html>
