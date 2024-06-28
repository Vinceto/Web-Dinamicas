<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado Días Feriados del Mes</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1/css/pico.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<main class="container">
    <h1>Cantidad de Días Feriados del Mes</h1>
    <p>El mes seleccionado tiene <%= request.getAttribute("feriadosMes") %> días feriados.</p>
    <a href="D2/index.jsp">Volver</a>
</main>
</body>
</html>
