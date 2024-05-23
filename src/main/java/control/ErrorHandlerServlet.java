package control;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error-handler")
public class ErrorHandlerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        String errorMessage = "Ci dispiace, si è verificato un errore interno.";
        response.setContentType("text/html");
        response.getWriter().write("<html><head><title>Errore interno</title></head><body>");
        response.getWriter().write("<h1>Errore interno del server</h1>");
        response.getWriter().write("<p>" + errorMessage + "</p>");
        response.getWriter().write("</body></html>");
    }
}
