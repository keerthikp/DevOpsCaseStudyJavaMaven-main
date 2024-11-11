package com.helloworld;

import javax.servlet.http.*;
import java.io.*;

public class TestHello extends HttpServlet 
{
  public void service( HttpServletRequest req, HttpServletResponse res ) throws IOException {
    PrintWriter out = res.getWriter();
    out.println( "Hello, World!" );
    out.close();
  }
}
