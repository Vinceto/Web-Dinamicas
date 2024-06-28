package servlets.D2;

import utiles.UtilesGeneral;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ObtieneCantidadFeriadosMes")
public class ObtieneCantidadFeriadosMes extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ObtieneCantidadFeriadosMes() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mes = Integer.parseInt(request.getParameter("mes"));
        UtilesGeneral utiles = new UtilesGeneral();
        int feriadosMes = utiles.getCantidadFeriadosMes(mes);

        request.setAttribute("feriadosMes", feriadosMes);
        request.getRequestDispatcher("/D2/resultadoFeriados.jsp").forward(request, response);
    }
}