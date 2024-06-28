package servlets.D3;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/procesarNumero")
public class ProcesarNumero extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ProcesarNumero() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int num = Integer.parseInt(request.getParameter("num"));
        int factorial = factorial(num);
        String parImpar = esParOImpar(num);
        int fibonacci = fibonacci(num);

        // Establecer atributos para la solicitud
        request.setAttribute("num", num);
        request.setAttribute("factorial", factorial);
        request.setAttribute("parImpar", parImpar);
        request.setAttribute("fibonacci", fibonacci);

        // Redirigir a la vista JSP de resultados
        request.getRequestDispatcher("/D3/resultado.jsp").forward(request, response);
    }
    // Calcular factorial
    private int factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    //par o impar
    private String esParOImpar(int n){
       return (n % 2 == 0) ? "par" : "impar";
    }
    // Calcular fibonacci segun posicion
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
