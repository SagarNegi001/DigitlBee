

import com.snb.model.BasicInfo;
import com.snb.model.DatabasePage;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginPage extends HttpServlet {

    private BasicInfo bi;

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        bi=new BasicInfo();
         response.setContentType("text/html");
         PrintWriter out=response.getWriter();
         System.out.println("test==="+request.getParameter("email"));
         bi.setEmail(request.getParameter("email"));
         bi.setPassword(request.getParameter("password"));
         System.out.println("===> "+bi);
         System.out.println(bi.getEmail() + ", " + bi.getPassword());
       
        boolean status= DatabasePage.use(bi);
        if(status==true){
        out.print("<p>Record saved successfully!</p>");  
            response.sendRedirect("noticeboard.html");
        }
        else{
        out.print("<p>Record not saved successfully!</p>");
        }
    }

}
