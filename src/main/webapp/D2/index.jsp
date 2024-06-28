<%@ page import="utiles.UtilesGeneral" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Seleccionar Mes</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@picocss/pico@1/css/pico.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<main class="container">
    <h1>Seleccionar Mes</h1>
    <form action="../ObtenerEfemerides" method="post">
        <label for="mes">Elige un mes:</label>
        <select name="mes" id="mes">
            <%
                UtilesGeneral utilesgeneral = new UtilesGeneral();
                for (int x = 1; x <= 12; x++) {
            %>
            <option value="<%= x %>"><%= utilesgeneral.getNombreMes(x) %></option>
            <%
                }
            %>
        </select>
        <button type="submit">Enviar</button>
    </form>
</main>
</body>
</html>
