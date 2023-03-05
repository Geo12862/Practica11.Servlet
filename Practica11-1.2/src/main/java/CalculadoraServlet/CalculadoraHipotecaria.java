package CalculadoraServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import CalculadoraService.CalculadoraService;
import CalculadoraService.CantidadCorrectaException;

/**
 * Servlet implementation class HolaServlet
 */
public class CalculadoraHipotecaria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculadoraHipotecaria() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String capital, interes, plazo;
		
		try {
			capital = request.getParameter("capital");
			interes = request.getParameter("interes");
			plazo = request.getParameter("plazo");
			
			CalculadoraService calcular = new CalculadoraService(capital, interes, plazo);
			String cuota =""+ calcular.getCuota();
			
			out.println("<!DOCTYPE html>");
		      out.println("<html>");
		      out.println("<head>");
		      out.println("<title>Calculadora Hipotecaria</title>");
		      out.println("<meta charset=\"UTF-8\">");
		      out.println("</head>");
		      out.println("<body>");
		      out.println("<h1>Calculadora Hipotecaria</h1>");
		      out.println("<p>Capital: " + capital + " €</p>");
		      out.println("<p>Tasa de Interés: " + interes + " %</p>");
		      out.println("<p>Plazo: " + plazo + " años</p>");
		      out.println("<p>Cuota Mensual: " + cuota + " €/mes</p>");
		      out.println("</body>");
		      out.println("</html>");
			
			
			
		}catch (CantidadCorrectaException e) {
			out.println("Calculo erroneo menor que cero, revisa las cantidades introducidas");
		} finally {
			out.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
