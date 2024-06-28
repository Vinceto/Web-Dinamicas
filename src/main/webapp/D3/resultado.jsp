<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1/css/pico.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<main class="container">
    <h1>Resultado para el número <%= request.getAttribute("num") %></h1>
    <p>Factorial: <%= request.getAttribute("factorial") %></p>
    <p>El número es <%= request.getAttribute("parImpar") %></p>
    <p>Fibonacci: <%= request.getAttribute("fibonacci") %></p>
    <a href="D3/index.jsp">Volver</a>
</main>
</body>
</html>
