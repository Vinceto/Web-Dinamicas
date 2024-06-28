<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Resultado Efemérides</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1/css/pico.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<main class="container">
    <h1>Efemérides del Mes de <%= request.getAttribute("nombreMes") %></h1>
    <p><%= request.getAttribute("efemerides") %></p>
    <a href="D2/index.jsp">Volver</a>
    <div class="row">
        <div>
            <a href="../ObtieneDiasMes?mes=<%= request.getParameter("mes") %>">Obtener Días del Mes</a>
        </div>
        <div>
            <a href="../ObtieneCantidadFeriadosMes?mes=<%= request.getParameter("mes") %>">Obtener Días Feriados del Mes</a>
        </div>
    </div>
</main>
</body>
</html>
