/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletCal;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 794456
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */


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
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        int f;
        int s;
        int r=0;
       String msg="";
        String strFirst = request.getParameter("first");
        String strSecond = request.getParameter("second");
      
            
       
       try{
         
         f=Integer.parseInt(strFirst);
         s=Integer.parseInt(strSecond);
            
        request.setAttribute("f", strFirst);
        request.setAttribute("s", strSecond);
           
     //  String button_param = request.getParameter("submit");
       //RequestDispatcher rd = null;
       
       String add=request.getParameter("add");
       String sub=request.getParameter("sub");
       String mul=request.getParameter("mul");
       String mod=request.getParameter("mod");
       
       if(add !=null){
           r=f+s;
             msg=r+"";
          
       }else if(sub !=null){
           r=f-s;
             msg=r+"";
       }else if(mul!=null){
           r=f*s;
             msg=r+"";
       }else if( mod != null){
           r=f%s;
             msg=r+"";
       }else if(strFirst.equals("") || strSecond.equals("")){
            msg="Inalid";
            
      
       }else {
         
           msg="Invalid";
           
       }
  
        System.out.println(msg);
            request.setAttribute("msg", msg);
            request.setAttribute("f", f);
            request.setAttribute("s", s);
        }catch (Exception e)
        {e.printStackTrace(); }
      
            
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
     //  getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
//        processRequest(request, response);
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
