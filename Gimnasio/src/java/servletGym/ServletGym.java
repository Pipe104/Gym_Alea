/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servletGym;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.cliente.Cliente;
import logic.cliente.ClienteNormal;
import logic.cliente.ClientePremium;
import logic.rutina.Rutina;
import logic.rutina.RutinaBajar;
import logic.rutina.RutinaMantenerse;
import logic.rutina.RutinaSubir;

/**
 *
 * @author laver
 */
public class ServletGym extends HttpServlet {
    
    public static Cliente ani1;
    public static void liskov(Cliente a, String b, String c, float p, float m, int e, int d, String entrenador, String tel){
        a.setNombre(b);
        a.setSexo(c);
        a.setPeso(p);
        a.setEstatura(m);
        a.setEdad(e);
        a.asignarCosto(d);
        a.setAsignarEntrenador(entrenador);
        a.setTelEntrenador(tel);
        ani1 = a;
    }
    
    public static Rutina ani;
    public static void asignarRutina(Rutina a){
        ani=a;
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String sexo = request.getParameter("sexo");
        float peso = Float.parseFloat(request.getParameter("peso"));
        float estatura = Float.parseFloat(request.getParameter("estatura"));
        int edad = Integer.parseInt(request.getParameter("edad"));
        int dias = Integer.parseInt(request.getParameter("dias"));
        
        
        switch(request.getParameter("tipo")){
            case "Premium" ->{
                ClientePremium premium = new ClientePremium();
                liskov(premium, nombre, sexo, peso, estatura, edad, dias, "Luis Fernando", "3022481290");
            }
            case "Normal" -> {
                ClienteNormal normal = new ClienteNormal();
                liskov(normal, nombre, sexo, peso, estatura, edad, dias, "Entrenador de turno", "+57 1 601 2345");
            }
        }
        
        switch(request.getParameter("objetivo")){
            case "Subir" ->{
                RutinaSubir rutinaSubir = new RutinaSubir(peso);  
                asignarRutina(rutinaSubir); 
            }
            
            case "Bajar" ->{
                RutinaBajar rutinaBajar = new RutinaBajar(peso);
                asignarRutina(rutinaBajar);
            }
            
            case "Mantenerse" ->{
                RutinaMantenerse rutinaMantenerse = new RutinaMantenerse(peso);
                asignarRutina(rutinaMantenerse);
            }
        }   
        
        
        
                
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                out.println("<head>");
                    out.println("<script type=\"module\" src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.esm.js\"></script>");
                    out.println("<script nomodule src=\"https://unpkg.com/ionicons@7.1.0/dist/ionicons/ionicons.js\"></script>");
                    out.println("<title>Servlet ServletGym</title>");
                    out.println("<link rel='stylesheet' href='estilos2.css'/>");
                    out.println("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">");
                    out.println("<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>");
                    out.println("<link href=\"https://fonts.googleapis.com/css2?family=Work+Sans:ital,wght@0,100..900;1,100..900&display=swap\" rel=\"stylesheet\">");
                out.println("</head>");
                out.println("<body>");
                    out.println("<header class='header'>");
                        out.println("<div class='content'>");
                            out.println("<p class='icon'><ion-icon name=\"search-outline\"   ></ion-icon></p>");
                            out.println("<p class='nombre-text'>" + ani1.getNombre() + "</p>");
                        out.println("</div>");
                    out.println("</header>");
                    out.println("<main>");
                        out.println("<div class='content-info'>");
                        out.println("<p> Sexo: "+ ani1.getSexo() +"</p>");
                        out.println("<p> Edad: "+ ani1.getEdad()+"</p>");
                        out.println("<p> Peso: " + ani1.getPeso() + "</p>");
                        out.println("<p> Estatura: " + ani1.getEstatura() + "</p>");
                        out.println("<p>"+ ani1.asignarCosto(dias)+ "</p>");
                        out.println("<p> Entrenador: " + ani1.getAsignarEntrenador() + "</p>");
                        out.println("<p> Telefono del entrenador: " + ani1.getTelEntrenador() + "</p>");
                        out.println("<br>");
                        out.println("</div>");
                            out.println("<div class=flex-container wrap>");
                                out.println("<div class=flex-item>");
                                    out.println("<p>" + ani.hacerRutina() + "</p>");
                                out.println("</div>");
                            out.println("</div>");
                    out.println("</main>");
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
