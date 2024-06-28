package servlets.D2;

import utiles.UtilesGeneral;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ObtieneDiasMes")
public class ObtieneDiasMes extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ObtieneDiasMes() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mes = Integer.parseInt(request.getParameter("mes"));
        UtilesGeneral utiles = new UtilesGeneral();
        int diasMes = utiles.getDiasMes(mes);

        request.setAttribute("diasMes", diasMes);
        request.getRequestDispatcher("/D2/resultadoDias.jsp").forward(request, response);
    }
}