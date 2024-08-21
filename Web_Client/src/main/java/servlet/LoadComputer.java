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

import com.sun.jersey.api.client.GenericType;

/**
 * Servlet implementation class LoadComputer
 */
@WebServlet("/LoadComputer")
public class LoadComputer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadComputer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String api = "http://localhost:8080/Web_API/rest/computer-service";
		Client client = Client.create();
		WebResource webResource = client.resource(api);
		String result = webResource.get(String.class);

		GenericType<List<Computer>> listType = new GenericType<List<Computer>>() {
		};
		Gson son = new Gson();
		List<Computer> list = son.fromJson(result, listType.getType());

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
