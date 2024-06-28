package servlets.D2;

import utiles.UtilesGeneral;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ObtenerEfemerides")
public class ObtenerEfemerides extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ObtenerEfemerides() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mes = Integer.parseInt(request.getParameter("mes"));
        UtilesGeneral utiles = new UtilesGeneral();
        String nombreMes = utiles.getNombreMes(mes);
        String efemerides = utiles.getEfemeridesMes(mes);

        request.setAttribute("nombreMes", nombreMes);
        request.setAttribute("efemerides", efemerides);
        request.getRequestDispatcher("/D2/resultado.jsp").forward(request, response);
    }
}