

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       Cookie name =new Cookie("name",request.getParameter("name"))  ;
       Cookie email =new Cookie("Email",request.getParameter("email"))  ;
       Cookie lang =new Cookie("Language",request.getParameter("TAMIL"))  ;
       response.addCookie(name);
       response.addCookie(email);
       response.addCookie(lang);
       try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            if(lang.getValue().equalsIgnoreCase("ENGLISH"))
                //response.sendRedirect("https://www.tandem.net/blog/20-greetings-in-english");
                    out.println("<h1>welcome</h1>");
                    
            else if(lang.getValue().equalsIgnoreCase("HINDI"))
                 out.println("<h1>नमस्ते</h1>");
                   //response.sendRedirect("https://www.rocketlanguages.com/hindi/salutations/greetings-in-hindi");
                     else if(lang.getValue().equalsIgnoreCase("TELUGU"))
                          out.println("<h1>namaskaaramu</h1>");
                     //response.sendRedirect("https://omniglot.com/language/phrases/telugu.php");
                     else
                          out.println("<h1>नमस्कार</h1>");
                         //response.sendRedirect("https://omniglot.com/language/phrases/marathi.php");
            
            
                
            
            out.println("<h1>" + name.getValue()+ "<br>"+email.getValue()+"<br>" + "</h1>");
            out.println("<a href='index.xhtml'>change preference</a>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
