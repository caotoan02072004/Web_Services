package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import entities.Computer;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;

/**
 * Servlet implementation class DeleteComputer
 */
@WebServlet("/DeleteComputer")
public class DeleteComputer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteComputer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String comId = request.getParameter("comId");
		String api = "http://localhost:8080/Web_API/rest/computer-service";
		
		Client client = Client.create();
		WebResource webResource = client.resource(api+"/"+comId);
		ClientResponse clientResponse = webResource.delete(ClientResponse.class);
		String result = clientResponse.getEntity(String.class);
		
		Gson son = new Gson();
		boolean blDelete = son.fromJson(result, Boolean.class);
		if(blDelete) {
			request.setAttribute("success", "Delete successfully!");
		}else {
			request.setAttribute("error", "Delete failed!");
		}
		
		webResource = client.resource(api);
		String result1 = webResource.get(String.class);
		
		GenericType<List<Computer>> listType = new GenericType<List<Computer>>() {};		
		List<Computer> list = son.fromJson(result1, listType.getType());
		
		request.setAttribute("list", list);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
