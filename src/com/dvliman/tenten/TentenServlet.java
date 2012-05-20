package com.dvliman.tenten;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class TentenServlet extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    resp.setContentType("text/plain");
    resp.getWriter().println("Hello, world");
  }
  
  public void doPost(HttpServletRequest request, HttpServletResponse response) {
    
   
  }
}
