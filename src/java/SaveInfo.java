import com.snb.model.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SaveInfo extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
     
       String name=request.getParameter("name");
       String email=request.getParameter("email");
       String mobile_no=request.getParameter("mobile_no");
       String gender=request.getParameter("gender");
       String user=request.getParameter("user");
       String password=request.getParameter("password");
       
       BasicInfo bi=new BasicInfo(0, name, email, mobile_no, gender, user, password);
   /*   bi.setName(name);
       bi.setEmail(email);
       bi.setMobile_no(mobile_no);
       bi.setGender(gender);
       bi.setUser(user);
       bi.setPassword(password);*/
        int status= DatabasePage.save(bi);
               
        if(status>0){  
           out.print("<p>Record saved successfully!</p>");  
            response.sendRedirect("home.html");
       }else{  
          out.println("Sorry! unable to save record");  
       }
    }

}
