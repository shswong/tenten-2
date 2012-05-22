package com.dvliman.tenten;

import java.io.IOException;
import javax.servlet.http.*;

import com.dvliman.tenten.model.User;
import com.dvliman.tenten.service.UserService;

@SuppressWarnings("serial")
public class TentenServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    resp.setContentType("text/plain");
    
    User user = new User();
    user.setKey(null);
    user.setName("david Liman");
    UserService uc = new UserService();
    uc.save(user);
    
    resp.getWriter().println("I am done writing to the database");
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) {
     
  }
}
