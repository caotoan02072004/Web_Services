package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.MediaType;

import entities.Computer;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Servlet implementation class InsertComputer
 */
@WebServlet("/InsertComputer")
public class InsertComputer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertComputer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String comName = request.getParameter("comName");
		String producer = request.getParameter("producer");
		Boolean status = Boolean.parseBoolean(request.getParameter("status"));
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String yearMakinggg = request.getParameter("yearMaking");
		Date yearMaking = null;
		try {
			yearMaking = sf.parse(yearMakinggg);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String expireDateee = request.getParameter("expireDate");
		Date expireDate = null;
		try {
			expireDate = sf.parse(expireDateee);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Float price = Float.parseFloat(request.getParameter("price"));
		
		Computer c = new Computer();
		c.setComName(comName);
		c.setProducer(producer);
		c.setStatus(status);
		c.setYearMaking(yearMaking);
		c.setExpireDate(expireDate);
		c.setPrice(price);
		
		Gson son = new Gson();
		String jsonComputer = son.toJson(c);
		
		String api = "http://localhost:8080/Web_API/rest/computer-service";
		Client client = Client.create();
		WebResource webResource = client.resource(api);
		
		ClientResponse clientResponse = webResource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, jsonComputer);
		String result = clientResponse.getEntity(String.class);
		
//		 System.out.println(jsonComputer);
		
		boolean blInsert = son.fromJson(result, Boolean.class);
		
		if(blInsert) {
			request.getRequestDispatcher("LoadComputer").forward(request, response);
		}else {
			request.setAttribute("error", "Insert failed!");
			request.getRequestDispatcher("insert.jsp").forward(request, response);
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
