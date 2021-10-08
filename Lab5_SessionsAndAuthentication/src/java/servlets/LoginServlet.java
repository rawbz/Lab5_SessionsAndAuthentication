
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

/**
 *
 * @author rmjba
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        //capture user input 
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        
       if(username == null || username.equals("") || password == null || password.equals("")){
        
            String errorMessage = "Invalid login";

            request.setAttribute("message", errorMessage);

            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
            return;
   
       } 

        //create a new user object
        User user = new User(username, password);

        //creat a new service object to call login method
        AccountService service = new AccountService();

        user = service.login(username, password);
        
        if(user == null){
            String errorMessage = "Invalid login";
            request.setAttribute("message", errorMessage);
            
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
            return;
        }
        
        
    
        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

    }
}
